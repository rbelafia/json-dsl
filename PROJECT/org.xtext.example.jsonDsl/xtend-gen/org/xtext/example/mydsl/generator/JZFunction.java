package org.xtext.example.mydsl.generator;

@SuppressWarnings("all")
public interface JZFunction<T extends Object> {
  T evaluate();
  
  String define();
}
