package org.xtext.example.mydsl.generator;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.example.mydsl.generator.JZFunction;

@SuppressWarnings("all")
public abstract class ConcatFunction<T extends Object> implements JZFunction<T> {
  protected List<T> elements;
  
  public ConcatFunction(final List<T> elements) {
    this.elements = CollectionLiterals.<T>newArrayList();
    for (final T e : elements) {
      this.elements.add(e);
    }
  }
  
  @Override
  public String define() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def concat(*obj):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("res = 0");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if isinstance(obj[0], dict):");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("res = {}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for e in obj:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("assert isinstance(e, dict), \"Cannot concat object with \" + str(type(e))");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("res.update(e)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("elif isinstance(obj[0], list):");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("res = []");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for e in obj:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if isinstance(e, list):");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("res = res + e");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("res.append(e)");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return res");
    _builder.newLine();
    return _builder.toString();
  }
}
