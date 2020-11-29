package org.xtext.example.mydsl.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
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
  
  @Override
  public String define() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import csv");
    _builder.newLine();
    _builder.append("def export_csv(obj: list, path):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("with open(path, \'w\') as output_file:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("output = csv.writer(output_file)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("output.writerow(obj[0].keys())");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for row in obj:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("output.writerow(row.values())");
    _builder.newLine();
    return _builder.toString();
  }
}
