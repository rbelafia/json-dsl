package org.xtext.example.mydsl.generator

class JZNumber implements JZObject {
	double content
	
	new (int content) {
		this.content = content
	}
	
	new (double content) {
		this.content = content
	}
	
	def static neutral() {
		return new JZNumber(0)
	}
	
	override operator_or(JZObject object) {
		throw new RuntimeException()
	}
	
	override operator_and(JZObject object) {
		throw new RuntimeException()
	}
	
	override operator_plus(JZObject object) {
		switch object {
			JZNumber: return new JZNumber(content + object.content)
			JZString: return new JZString(content.toString + object.content)
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				for(e : (object as JZArray).elements) res.add(new JZNumber(content))
				return res + object
			}
		}
	}
	
	override operator_minus(JZObject object) {
		switch object {
			JZNumber: return new JZNumber(content - object.content)
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				for(e : (object as JZArray).elements) res.add(new JZNumber(content))
				return res + object
			}
		}
	}
	
	override operator_multiply(JZObject object) {
		switch object {
			JZNumber: return new JZNumber(content * object.content)
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				for(e : (object as JZArray).elements) res.add(new JZNumber(content))
				return res * object
			}
		}
	}
	
	override operator_divide(JZObject object) {
		switch object {
			JZNumber: return new JZNumber(content / object.content)
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				for(e : (object as JZArray).elements) res.add(new JZNumber(content))
				return res / object
			}
		}
	}
	
	override operator_modulo(JZObject object) {
		switch object {
			JZNumber: return new JZNumber(content % object.content)
			JZNull : return this
			JZArray : {
				var res = new JZArray()
				for(e : (object as JZArray).elements) res.add(new JZNumber(content))
				return res % object
			}
		}
	}
	
	override operator_plus() {
		return this
	}
	
	override operator_minus() {
		return new JZNumber(- content)
	}
	
	override operator_not() {
		throw new RuntimeException()
	}
	
	override toString() {
		return content.toString
	}
	
	
}