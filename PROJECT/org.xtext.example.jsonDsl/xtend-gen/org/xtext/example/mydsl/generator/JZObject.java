package org.xtext.example.mydsl.generator;

@SuppressWarnings("all")
public interface JZObject {
  JZObject operator_or(final JZObject object);
  
  JZObject operator_and(final JZObject object);
  
  JZObject operator_plus(final JZObject object);
  
  JZObject operator_minus(final JZObject object);
  
  JZObject operator_multiply(final JZObject object);
  
  JZObject operator_divide(final JZObject object);
  
  JZObject operator_modulo(final JZObject object);
  
  JZObject operator_plus();
  
  JZObject operator_minus();
  
  JZObject operator_not();
}
