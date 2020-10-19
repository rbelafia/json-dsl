package org.xtext.example.mydsl.generator

import java.util.Map

class JZJsonObject implements JZObject {
	Map<String, Object> fields;
	
	new() {
		fields = newLinkedHashMap()
	}
	
	def addField(String key, Object value) {
		fields.putIfAbsent(key, value)
	}
	
	def removeField(String key) {
		fields.remove(key)
		return this
	}
	
	def fields() {
		return fields
	}
	
	def keys() {
		return fields.keySet()
	}
	
	def values() {
		return fields.values
	}
	
	override operator_or(JZObject object) {
		throw new RuntimeException
	}
	
	override operator_and(JZObject object) {
		throw new RuntimeException
	}
	
	override operator_plus(JZObject object) {
		switch object {
			JZJsonObject: {
				var res = this
				for(Map.Entry<String, Object> entry : object.fields().entrySet()) 
					res.addField(entry.key, entry.value)
				return res
			}
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				for(e : (object as JZArray).elements) res.add(this)
				return res + object
			}
		}
	}
	
	override operator_minus(JZObject object) {
		switch object {
			JZJsonObject: {
				var res = this
				for(key : object.keys) 
					res.removeField(key)
				return res
			}
			JZString : return this.removeField(object.content)
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				for(e : (object as JZArray).elements) res.add(this)
				return res - object
			}
		}
	}
	
	override operator_multiply(JZObject object) {
		throw new RuntimeException
	}
	
	override operator_divide(JZObject object) {
		throw new RuntimeException
	}
	
	override operator_modulo(JZObject object) {
		throw new RuntimeException
	}
	
	override operator_plus() {
		throw new RuntimeException
	}
	
	override operator_minus() {
		throw new RuntimeException
	}
	
	override operator_not() {
		throw new RuntimeException
	}
	
	override toString() {
		auxiliarToString(0, this)
	}
	
	def auxiliarToString(int nbTab, JZJsonObject object) {
		var res = "{\n"
		for(Map.Entry<String, Object> entry : object.fields().entrySet()) {
			for(var i = 0; i<nbTab+1; i++) res +="  "
			res += entry.key + ": ";
			switch entry.value {
				JZJsonObject: res += auxiliarToString(nbTab + 1, entry.value as JZJsonObject)
				default: res += entry.value.toString() + ",\n"
			}
		}
		for(var i = 0; i<nbTab; i++) res +="  "
		res+= "},\n"
		return res
		
		
	}
	
}