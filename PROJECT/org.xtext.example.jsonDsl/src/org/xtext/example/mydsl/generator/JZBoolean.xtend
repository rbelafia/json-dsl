package org.xtext.example.mydsl.generator

class JZBoolean implements JZObject {
	boolean content
	
	new(boolean content) {
		this.content = content
	}
	
	def static neutral() {
		return new JZBoolean(false)
	}
	
	override operator_or(JZObject object) {
		switch object {
			JZBoolean: return new JZBoolean(content || object.content)
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				for(e : (object as JZArray).elements) res.add(new JZBoolean(content))
				return res || object
			}
		}
	}
	
	override operator_and(JZObject object) {
		switch object {
			JZBoolean: return new JZBoolean(content && object.content)
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				for(e : (object as JZArray).elements) res.add(new JZBoolean(content))
				return res && object
			}
		}
	}
	
	override operator_plus(JZObject object) {
		throw new RuntimeException()
	}
	
	override operator_minus(JZObject object) {
		throw new RuntimeException()
	}
	
	override operator_multiply(JZObject object) {
		throw new RuntimeException()
	}
	
	override operator_divide(JZObject object) {
		throw new RuntimeException()
	}
	
	override operator_modulo(JZObject object) {
		throw new RuntimeException()
	}
	
	override operator_plus() {
		throw new RuntimeException()
	}
	
	override operator_minus() {
		throw new RuntimeException()
	}
	
	override operator_not() {
		return new JZBoolean(!content)
	}
	
	override toString() {
		return content.toString
	}
	
}