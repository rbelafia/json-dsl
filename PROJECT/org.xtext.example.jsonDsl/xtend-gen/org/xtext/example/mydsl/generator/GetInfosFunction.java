package org.xtext.example.mydsl.generator;

import java.util.Map;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.mydsl.generator.JZArray;
import org.xtext.example.mydsl.generator.JZBoolean;
import org.xtext.example.mydsl.generator.JZFunction;
import org.xtext.example.mydsl.generator.JZJsonObject;
import org.xtext.example.mydsl.generator.JZNull;
import org.xtext.example.mydsl.generator.JZNumber;
import org.xtext.example.mydsl.generator.JZObject;
import org.xtext.example.mydsl.generator.JZString;

@SuppressWarnings("all")
public class GetInfosFunction implements JZFunction<JZJsonObject> {
  private JZJsonObject jObject;
  
  public GetInfosFunction(final JZJsonObject jObject) {
    this.jObject = jObject;
  }
  
  @Override
  public JZJsonObject evaluate() {
    return this.auxVisit(this.jObject);
  }
  
  public JZJsonObject auxVisit(final JZJsonObject obj) {
    JZJsonObject res = new JZJsonObject();
    Set<Map.Entry<String, JZObject>> _entrySet = obj.fields().entrySet();
    for (final Map.Entry<String, JZObject> entry : _entrySet) {
      JZObject _value = entry.getValue();
      boolean _matched = false;
      if (_value instanceof JZNumber) {
        _matched=true;
        String _key = entry.getKey();
        JZString _jZString = new JZString("Number");
        res.addField(_key, _jZString);
      }
      if (!_matched) {
        if (_value instanceof JZString) {
          _matched=true;
          String _key = entry.getKey();
          JZString _jZString = new JZString("String");
          res.addField(_key, _jZString);
        }
      }
      if (!_matched) {
        if (_value instanceof JZBoolean) {
          _matched=true;
          String _key = entry.getKey();
          JZString _jZString = new JZString("Boolean");
          res.addField(_key, _jZString);
        }
      }
      if (!_matched) {
        if (_value instanceof JZJsonObject) {
          _matched=true;
          JZObject _value_1 = entry.getValue();
          res.addField(entry.getKey(), this.auxVisit(((JZJsonObject) _value_1)));
        }
      }
      if (!_matched) {
        if (_value instanceof JZArray) {
          _matched=true;
          String _key = entry.getKey();
          JZString _jZString = new JZString("Array");
          res.addField(_key, _jZString);
        }
      }
      if (!_matched) {
        if (_value instanceof JZNull) {
          _matched=true;
          String _key = entry.getKey();
          JZString _jZString = new JZString("Null");
          res.addField(_key, _jZString);
        }
      }
    }
    return res;
  }
  
  @Override
  public String define() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def infos_json(obj: dict):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("res = {}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for key, value in obj.items():");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if isinstance(value, int) or isinstance(value, float):");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("res[key] = \"Number\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("elif isinstance(value, str):");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("res[key] = \"String\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("elif isinstance(value, bool):");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("res[key] = \"Boolean\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("elif value is None:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("res[key] = \"Null\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("elif isinstance(value, list):");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("res[key] = \"Array\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("res[key] = infos_json(value)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return res");
    _builder.newLine();
    return _builder.toString();
  }
}
