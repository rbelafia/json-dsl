package org.xtext.example.mydsl.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.generator.JZFunction;

@SuppressWarnings("all")
public class StoreFunction implements JZFunction<Boolean> {
  private String fileName;
  
  public StoreFunction(final String fileName) {
    this.fileName = fileName;
  }
  
  @Override
  public Boolean evaluate() {
    return Boolean.valueOf(true);
  }
  
  @Override
  public String define() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def store_json(obj, path):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("with open(path, \'w\') as file:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("json.dump(obj, file)");
    _builder.newLine();
    return _builder.toString();
  }
}
