package org.xtext.example.mydsl.generator;

import org.xtext.example.mydsl.generator.JZFunction;

@SuppressWarnings("all")
public class ExportFunction implements JZFunction<Boolean> {
  private String fileName;
  
  public ExportFunction(final String fileName) {
    this.fileName = fileName;
  }
  
  @Override
  public Boolean evaluate() {
    return Boolean.valueOf(true);
  }
}
