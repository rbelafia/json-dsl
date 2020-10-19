package org.xtext.example.mydsl.generator;

import org.xtext.example.mydsl.generator.JZFunction;
import org.xtext.example.mydsl.generator.JZJsonObject;

@SuppressWarnings("all")
public class LoadFunction implements JZFunction<JZJsonObject> {
  private String fileName;
  
  public LoadFunction(final String fileName) {
    this.fileName = fileName;
  }
  
  @Override
  public JZJsonObject evaluate() {
    return new JZJsonObject();
  }
}
