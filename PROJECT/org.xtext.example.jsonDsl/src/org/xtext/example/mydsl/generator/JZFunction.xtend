package org.xtext.example.mydsl.generator

import java.io.File
import java.io.FileNotFoundException
import org.json.simple.*
import jdk.nashorn.internal.parser.JSONParser
import java.util.List
import java.util.Map

interface JZFunction<T> {
	def T evaluate()
	
	def String define()
}

class LoadFunction implements JZFunction<JZJsonObject> {
	String fileName
	
	new(String fileName) {
		this.fileName = fileName
	}
	
	override evaluate() {
		return new JZJsonObject()
	}
	
	override define()'''
		def load_json(path):
		    with open(path) as file:
		        return json.load(file)
	'''
}

class StoreFunction implements JZFunction<Boolean> {
	String fileName
	
	new(String fileName) {
		this.fileName = fileName
	}
	
	override evaluate() {
		return true
	}
	
	override define()'''
		def store_json(obj, path):
		    with open(path, 'w') as file:
		        json.dump(obj, file)
	'''
}

class ExportFunction implements JZFunction<Boolean> {
	String fileName
	
	new(String fileName) {
		this.fileName = fileName
	}
	
	override evaluate() {
		return true
	}
	
	override define()'''
		import csv
		def export_csv(obj: list, path):
		    with open(path, 'w') as output_file:
		        output = csv.writer(output_file)
		        output.writerow(obj[0].keys())
		        for row in obj:
		            output.writerow(row.values())
	'''
}

class GetDepthFunction implements JZFunction<JZNumber> {
	JZJsonObject jObject
	
	new(JZJsonObject jObject) {
		this.jObject = jObject
	}
	
	override evaluate() {
		return new JZNumber(auxVisit(jObject))
	}
	
	def double auxVisit(JZJsonObject obj) {
		if(obj.values.size == 0) {
			return 0;
			}
		else {
			switch obj {
				JZJsonObject : {
					val visited = obj.values.filter(JZJsonObject).map[jz | jz.auxVisit].toList
					if(visited.empty) return 1
					else return 1 + visited.max
					}
				default : return 1
			}
		}
	}
	
	override define()'''
		def depth_json(obj: dict):
		    rec = []
		    for v in obj.values():
		        if isinstance(v, dict):
		            rec.append(1 + depth_json(v))
		
		    if len(rec) == 0:
		        return 1
		    else:
		        return max(rec)
	'''
}

class GetInfosFunction implements JZFunction<JZJsonObject> {
	JZJsonObject jObject
	
	new(JZJsonObject jObject) {
		this.jObject = jObject
	}
	
	override evaluate() {
		return auxVisit(jObject)
	}
	
	def JZJsonObject auxVisit(JZJsonObject obj) {
		var JZJsonObject res = new JZJsonObject()
		for (Map.Entry<String, JZObject> entry : obj.fields().entrySet()) {
			switch entry.value {
				JZNumber : res.addField(entry.key, new JZString("Number"))
				JZString : res.addField(entry.key, new JZString("String"))
				JZBoolean : res.addField(entry.key, new JZString("Boolean"))
				JZJsonObject : res.addField(entry.key, auxVisit(entry.value as JZJsonObject))
				JZArray : res.addField(entry.key, new JZString("Array"))
				JZNull : res.addField(entry.key, new JZString("Null"))
			}	
		}
		return res
	}
	
	override define() '''
		def infos_json(obj: dict):
		    res = {}
		    for key, value in obj.items():
		        if isinstance(value, int) or isinstance(value, float):
		            res[key] = "Number"
		        elif isinstance(value, str):
		            res[key] = "String"
		        elif isinstance(value, bool):
		            res[key] = "Boolean"
		        elif value is None:
		            res[key] = "Null"
		        elif isinstance(value, list):
		            res[key] = "Array"
		        else:
		            res[key] = infos_json(value)
		    return res
	'''
}

class ContainsFunction implements JZFunction<JZBoolean> {
	List<String> keys
	JZJsonObject jObject
	
	new (List<String> keys, JZJsonObject jObject) {
		this.keys = newArrayList(keys)
		this.jObject = jObject
	}
	
	override evaluate() {
		return new JZBoolean(jObject.keys.containsAll(keys))
	}
	
	override define()'''
		def contains(obj, *keys):
		    for k in keys:
		        if k not in obj:
		            return False
		    return True
	'''
}

abstract class ConcatFunction<T> implements JZFunction<T> {
	protected List<T> elements
	
	new(List<T> elements) {
		this.elements = newArrayList()
		for(e : elements) this.elements.add(e)
	}
	
	override define()'''
		def concat(*obj):
		    res = 0
		    if isinstance(obj[0], dict):
		        res = {}
		        for e in obj:
		            assert isinstance(e, dict), "Cannot concat object with " + str(type(e))
		            res.update(e)
		
		    elif isinstance(obj[0], list):
		        res = []
		        for e in obj:
		            if isinstance(e, list):
		                res = res + e
		            else:
		                res.append(e)
		
		    return res
	'''
	
	
}

class ConcatFunctionArray extends ConcatFunction<List<Object>> {
	
	new(List<List<Object>> elements) {
		super(elements)
	}
	
	override evaluate() {
		var List<Object> res = newArrayList()
		for (l : elements) res.addAll(l)
		return res
	}
	
}

class ConcatFunctionJsonObject extends ConcatFunction<JZJsonObject> {
	
	new(List<JZJsonObject> elements) {
		super(elements)
	}
	
	override evaluate() {
		var JZJsonObject res = new JZJsonObject()
		for (j : elements)
			for(Map.Entry<String, JZObject> entry : j.fields().entrySet()) 
				res.addField(entry.key, entry.value)
		return res
	}
	
}

