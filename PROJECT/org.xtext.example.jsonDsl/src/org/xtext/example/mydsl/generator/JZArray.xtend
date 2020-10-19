package org.xtext.example.mydsl.generator

import java.util.List
import java.lang.reflect.Method
import java.util.function.Function
import com.sun.org.apache.xpath.internal.operations.And
import org.xtext.example.mydsl.generator.JZObject

class JZArray implements JZObject {
	List<JZObject> elements
	
	new() {
		this.elements = newArrayList()
	}
	
	new(List<JZObject> elements) {
		this.elements = newArrayList()
		this.elements.addAll(elements)
	}
	
	def elements() {
		return elements
	}
	
	def size() {
		return elements.size
	}
	
	def add(JZObject element) {
		return elements.add(element)
	}
	
	def addAll(List<JZObject> list) {
		elements.addAll(list)
	}

	
	override operator_or(JZObject object) {
		switch object {
			JZBoolean : return new JZArray(elements.map[e | e || object])
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				var k = 0
				for (var i = 0; i < elements.size; i++, k++) 
	      			if(object.elements.size() < i) res.add(elements.get(i))
	      			else res.add(elements.get(i) || object.elements.get(i))	
	      		
	      		if(k < object.elements.size())
	      			for(var i = k; i < object.elements.size; i++)
	      				res.add(object.elements.get(i))
	      		return res
			}
			default: throw new RuntimeException
		}
    }
	
	override operator_and(JZObject object) {
		switch object {
			JZBoolean : return new JZArray(elements.map[e | e && object])
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				var k = 0
				for (var i = 0; i < elements.size; i++, k++) 
	      			if(object.elements.size() < i) res.add(elements.get(i))
	      			else res.add(elements.get(i) && object.elements.get(i))	
	      		
	      		if(k < object.elements.size())
	      			for(var i = k; i < object.elements.size; i++)
	      				res.add(object.elements.get(i))
	      		return res
			}
			default: throw new RuntimeException
		}
	}
	
	override operator_plus(JZObject object) {
		switch object {
			JZNumber, JZString, JZJsonObject : return new JZArray(elements.map[e | e + object])
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				var k = 0
				for (var i = 0; i < elements.size; i++, k++) 
	      			if(object.elements.size() < i) res.add(elements.get(i))
	      			else res.add(elements.get(i) + object.elements.get(i))	
	      		
	      		if(k < object.elements.size())
	      			for(var i = k; i < object.elements.size; i++)
	      				res.add(object.elements.get(i))
	      		return res
			}
			default: throw new RuntimeException
		}
	}
	
	override operator_minus(JZObject object) {
		switch object {
			JZNumber, JZJsonObject : return new JZArray(elements.map[e | e - object])
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				var k = 0
				for (var i = 0; i < elements.size; i++, k++) 
	      			if(object.elements.size() < i) res.add(elements.get(i))
	      			else res.add(elements.get(i) + object.elements.get(i))	
	      		
	      		if(k < object.elements.size())
	      			for(var i = k; i < object.elements.size; i++)
	      				res.add(object.elements.get(i))
	      		return res
			}
			default: throw new RuntimeException
		}
	}
	
	override operator_multiply(JZObject object) {
		switch object {
			JZNumber : return new JZArray(elements.map[e | e * object])
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				var k = 0
				for (var i = 0; i < elements.size; i++, k++) 
	      			if(object.elements.size() < i) res.add(elements.get(i))
	      			else res.add(elements.get(i) * object.elements.get(i))	
	      		
	      		if(k < object.elements.size())
	      			for(var i = k; i < object.elements.size; i++)
	      				res.add(object.elements.get(i))
	      		return res
			}
			default: throw new RuntimeException
		}
	}
	
	override operator_divide(JZObject object) {
		switch object {
			JZNumber : return new JZArray(elements.map[e | e / object])
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				var k = 0
				for (var i = 0; i < elements.size; i++, k++) 
	      			if(object.elements.size() < i) res.add(elements.get(i))
	      			else res.add(elements.get(i) / object.elements.get(i))	
	      		
	      		if(k < object.elements.size())
	      			for(var i = k; i < object.elements.size; i++)
	      				res.add(object.elements.get(i))
	      		return res
			}
			default: throw new RuntimeException
		}
	}
	
	override operator_modulo(JZObject object) {
		switch object {
			JZNumber : return new JZArray(elements.map[e | e % object])
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				var k = 0
				for (var i = 0; i < elements.size; i++, k++) 
	      			if(object.elements.size() < i) res.add(elements.get(i))
	      			else res.add(elements.get(i) % object.elements.get(i))	
	      		
	      		if(k < object.elements.size())
	      			for(var i = k; i < object.elements.size; i++)
	      				res.add(object.elements.get(i))
	      		return res
			}
			default: throw new RuntimeException
		}
	}
	
	override operator_plus() {
		return new JZArray(elements.map[element | +element])
	}
	
	override operator_minus() {
		return new JZArray(elements.map[element | -element])
	}
	
	override operator_not() {
		return new JZArray(elements.map[element | !element])
	}
	
	override toString() {
		var res = "["
		res += elements.remove(0)
		for (e : elements) res += "," + e.toString
		res+="]"
		return res
	}
	
}