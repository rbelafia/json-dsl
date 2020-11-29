package org.xtext.example.mydsl.generator;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.example.mydsl.generator.JZBoolean;
import org.xtext.example.mydsl.generator.JZFunction;
import org.xtext.example.mydsl.generator.JZJsonObject;

@SuppressWarnings("all")
public class ContainsFunction implements JZFunction<JZBoolean> {
  private List<String> keys;
  
  private JZJsonObject jObject;
  
  public ContainsFunction(final List<String> keys, final JZJsonObject jObject) {
    this.keys = CollectionLiterals.<String>newArrayList(((String[])Conversions.unwrapArray(keys, String.class)));
    this.jObject = jObject;
  }
  
  @Override
  public JZBoolean evaluate() {
    boolean _containsAll = this.jObject.keys().containsAll(this.keys);
    return new JZBoolean(_containsAll);
  }
  
  @Override
  public String define() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def contains(obj, *keys):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for k in keys:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if k not in obj:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return False");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return True");
    _builder.newLine();
    return _builder.toString();
  }
}
