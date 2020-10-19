package org.xtext.example.mydsl.generator

interface JZObject {
	
	def JZObject ||(JZObject object);
	def JZObject &&(JZObject object);
	def JZObject +(JZObject object);
	def JZObject -(JZObject object);
	def JZObject *(JZObject object);
	def JZObject /(JZObject object);
	def JZObject %(JZObject object);
	def JZObject +();
	def JZObject -();
	def JZObject !();
	
}