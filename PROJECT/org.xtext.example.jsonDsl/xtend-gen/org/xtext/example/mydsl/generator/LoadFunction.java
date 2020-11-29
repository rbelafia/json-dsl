package org.xtext.example.mydsl.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
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
  
  @Override
  public String define() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def load_json(path):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("with open(path) as file:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return json.load(file)");
    _builder.newLine();
    return _builder.toString();
  }
}
