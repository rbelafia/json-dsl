package org.xtext.example.mydsl.generator

import java.io.File
import java.io.FileNotFoundException
import org.json.simple.*
import jdk.nashorn.internal.parser.JSONParser
import java.util.List
import java.util.Map

interface JZFunction<T> {
	def T evaluate()
}

class LoadFunction implements JZFunction<JZJsonObject> {
	String fileName
	
	new(String fileName) {
		this.fileName = fileName
	}
	
	override evaluate() {
		return new JZJsonObject()
	}
}

class StoreFunction implements JZFunction<Boolean> {
	String fileName
	
	new(String fileName) {
		this.fileName = fileName
	}
	
	override evaluate() {
		return true
	}
}

class ExportFunction implements JZFunction<Boolean> {
	String fileName
	
	new(String fileName) {
		this.fileName = fileName
	}
	
	override evaluate() {
		return true
	}
}

class GetDepthFunction implements JZFunction<Integer> {
	JZJsonObject jObject
	
	new(JZJsonObject jObject) {
		this.jObject = jObject
	}
	
	override evaluate() {
		return auxVisit(jObject)
	}
	
	def int auxVisit(JZJsonObject obj) {
		if(obj.values.size == 0) {
			return 0;
			}
		else {
			return obj.values.filter(JZJsonObject).map[jz | jz.auxVisit].max
		}
	}
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
		for (Map.Entry<String, Object> entry : obj.fields().entrySet()) {
			switch entry.value {
				Integer : res.addField(entry.key, "Number")
				Double : res.addField(entry.key, "Number")
				String : res.addField(entry.key, "String")
				Boolean : res.addField(entry.key, "Boolean")
				JZJsonObject : res.addField(entry.key, auxVisit(obj))
				List : res.addField(entry.key, "Array")
			}	
		}
	}
}

class ContainsFunction implements JZFunction<Boolean> {
	String key
	JZJsonObject jObject
	
	new(String key, JZJsonObject jObject) {
		this.key = key
		this.jObject = jObject
	}
	
	override evaluate() {
		return jObject.keys.contains(key)
	}
}

abstract class ConcatFunction<T> implements JZFunction<T> {
	protected List<T> elements
	
	new(List<T> elements) {
		this.elements = newArrayList()
		for(e : elements) this.elements.add(e)
	}
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
			for(Map.Entry<String, Object> entry : j.fields().entrySet()) 
				res.addField(entry.key, entry.value)
		return res
	}
	
}

