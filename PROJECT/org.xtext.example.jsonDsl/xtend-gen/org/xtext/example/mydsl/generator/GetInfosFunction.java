package org.xtext.example.mydsl.generator;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xtext.example.mydsl.generator.JZFunction;
import org.xtext.example.mydsl.generator.JZJsonObject;

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
    Set<Map.Entry<String, Object>> _entrySet = obj.fields().entrySet();
    for (final Map.Entry<String, Object> entry : _entrySet) {
      Object _value = entry.getValue();
      boolean _matched = false;
      if (_value instanceof Integer) {
        _matched=true;
        res.addField(entry.getKey(), "Number");
      }
      if (!_matched) {
        if (_value instanceof Double) {
          _matched=true;
          res.addField(entry.getKey(), "Number");
        }
      }
      if (!_matched) {
        if (_value instanceof String) {
          _matched=true;
          res.addField(entry.getKey(), "String");
        }
      }
      if (!_matched) {
        if (_value instanceof Boolean) {
          _matched=true;
          res.addField(entry.getKey(), "Boolean");
        }
      }
      if (!_matched) {
        if (_value instanceof JZJsonObject) {
          _matched=true;
          res.addField(entry.getKey(), this.auxVisit(obj));
        }
      }
      if (!_matched) {
        if (_value instanceof List) {
          _matched=true;
          res.addField(entry.getKey(), "Array");
        }
      }
    }
    return null;
  }
}
