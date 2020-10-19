package org.xtext.example.mydsl.generator;

import org.xtext.example.mydsl.generator.JZFunction;
import org.xtext.example.mydsl.generator.JZJsonObject;

@SuppressWarnings("all")
public class ContainsFunction implements JZFunction<Boolean> {
  private String key;
  
  private JZJsonObject jObject;
  
  public ContainsFunction(final String key, final JZJsonObject jObject) {
    this.key = key;
    this.jObject = jObject;
  }
  
  @Override
  public Boolean evaluate() {
    return Boolean.valueOf(this.jObject.keys().contains(this.key));
  }
}
