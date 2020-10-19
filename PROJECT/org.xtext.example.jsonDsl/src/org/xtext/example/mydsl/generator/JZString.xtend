package org.xtext.example.mydsl.generator

class JZString implements JZObject {
	public String content
	
	new(String content) {
		this.content = content
	}
	
	def static neutral() {
		return new JZString("")
	}
	
	override operator_or(JZObject object) {
		throw new RuntimeException()
	}
	
	override operator_and(JZObject object) {
		throw new RuntimeException()
	}
	
	override operator_plus(JZObject object) {
		switch object {
			JZString : return new JZString(content + (object as JZString).toString)
			JZNumber, JZBoolean, JZNull : return new JZString(content + object.toString)
			JZArray : {
				var res = new JZArray()
				for(e : (object as JZArray).elements) res.add(new JZString(content))
				return res + object
			}
		}
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
		throw new RuntimeException()
	}
	
	override toString() {
		return content
	}
	
	
}