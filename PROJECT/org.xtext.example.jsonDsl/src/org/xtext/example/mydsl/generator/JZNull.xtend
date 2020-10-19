package org.xtext.example.mydsl.generator

class JZNull implements JZObject {
	new() {
		
	}
	
	def static neutral() {
		return new JZNull
	}
	
	override operator_or(JZObject object) {
		switch object {
			JZBoolean, JZArray : return object
			default : throw new RuntimeException
		}
	}
	
	override operator_and(JZObject object) {
		switch object {
			JZBoolean, JZArray : return object
			default : throw new RuntimeException
		}
	}
	
	override operator_plus(JZObject object) {
		switch object {
			JZNumber, JZString, JZArray : return object
			default : throw new RuntimeException
		}
	}
	
	override operator_minus(JZObject object) {
		switch object {
			JZNumber, JZArray : return object
			default : throw new RuntimeException
		}
	}
	
	override operator_multiply(JZObject object) {
		switch object {
			JZNumber, JZArray : return object
			default : throw new RuntimeException
		}
	}
	
	override operator_divide(JZObject object) {
		switch object {
			JZNumber, JZArray : return object
			default : throw new RuntimeException
		}
	}
	
	override operator_modulo(JZObject object) {
		switch object {
			JZNumber, JZArray : return object
			default : throw new RuntimeException
		}
	}
	
	override operator_plus() {
		return this
	}
	
	override operator_minus() {
		return this
	}
	
	override operator_not() {
		return this
	}
	
	
}