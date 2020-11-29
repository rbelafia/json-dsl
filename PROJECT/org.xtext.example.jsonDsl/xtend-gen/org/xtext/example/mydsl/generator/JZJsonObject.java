package org.xtext.example.mydsl.generator;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.example.mydsl.generator.JZArray;
import org.xtext.example.mydsl.generator.JZNull;
import org.xtext.example.mydsl.generator.JZObject;
import org.xtext.example.mydsl.generator.JZString;

@SuppressWarnings("all")
public class JZJsonObject implements JZObject {
  private Map<String, JZObject> fields;
  
  public JZJsonObject() {
    this.fields = CollectionLiterals.<String, JZObject>newLinkedHashMap();
  }
  
  public JZObject addField(final String key, final JZObject value) {
    return this.fields.putIfAbsent(key, value);
  }
  
  public JZJsonObject removeField(final String key) {
    this.fields.remove(key);
    return this;
  }
  
  public Map<String, JZObject> fields() {
    return this.fields;
  }
  
  public Set<String> keys() {
    return this.fields.keySet();
  }
  
  public Collection<JZObject> values() {
    return this.fields.values();
  }
  
  @Override
  public JZObject operator_or(final JZObject object) {
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_and(final JZObject object) {
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_plus(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZJsonObject) {
      _matched=true;
      JZJsonObject res = this;
      Set<Map.Entry<String, JZObject>> _entrySet = ((JZJsonObject)object).fields().entrySet();
      for (final Map.Entry<String, JZObject> entry : _entrySet) {
        res.addField(entry.getKey(), entry.getValue());
      }
      return res;
    }
    if (!_matched) {
      if (object instanceof JZNull) {
        _matched=true;
        return this;
      }
    }
    if (!_matched) {
      if (object instanceof JZArray) {
        _matched=true;
        JZArray res = new JZArray();
        List<JZObject> _elements = ((JZArray) object).elements();
        for (final JZObject e : _elements) {
          res.add(this);
        }
        return res.operator_plus(object);
      }
    }
    return null;
  }
  
  @Override
  public JZObject operator_minus(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZJsonObject) {
      _matched=true;
      JZJsonObject res = this;
      Set<String> _keys = ((JZJsonObject)object).keys();
      for (final String key : _keys) {
        res.removeField(key);
      }
      return res;
    }
    if (!_matched) {
      if (object instanceof JZString) {
        _matched=true;
        return this.removeField(((JZString)object).content);
      }
    }
    if (!_matched) {
      if (object instanceof JZNull) {
        _matched=true;
        return this;
      }
    }
    if (!_matched) {
      if (object instanceof JZArray) {
        _matched=true;
        JZArray res = new JZArray();
        List<JZObject> _elements = ((JZArray) object).elements();
        for (final JZObject e : _elements) {
          res.add(this);
        }
        return res.operator_minus(object);
      }
    }
    return null;
  }
  
  @Override
  public JZObject operator_multiply(final JZObject object) {
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_divide(final JZObject object) {
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_modulo(final JZObject object) {
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_plus() {
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_minus() {
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_not() {
    throw new RuntimeException();
  }
  
  @Override
  public String toString() {
    return this.auxiliarToString(0, this);
  }
  
  public String auxiliarToString(final int nbTab, final JZJsonObject object) {
    String res = "{\n";
    Set<Map.Entry<String, JZObject>> _entrySet = object.fields().entrySet();
    for (final Map.Entry<String, JZObject> entry : _entrySet) {
      {
        for (int i = 0; (i < (nbTab + 1)); i++) {
          String _res = res;
          res = (_res + "  ");
        }
        String _res = res;
        String _key = entry.getKey();
        String _plus = (_key + ": ");
        res = (_res + _plus);
        JZObject _value = entry.getValue();
        boolean _matched = false;
        if (_value instanceof JZJsonObject) {
          _matched=true;
          String _res_1 = res;
          JZObject _value_1 = entry.getValue();
          Object _auxiliarToString = this.auxiliarToString((nbTab + 1), ((JZJsonObject) _value_1));
          res = (_res_1 + _auxiliarToString);
        }
        if (!_matched) {
          String _res_1 = res;
          String _string = entry.getValue().toString();
          String _plus_1 = (_string + ",\n");
          res = (_res_1 + _plus_1);
        }
      }
    }
    for (int i = 0; (i < nbTab); i++) {
      String _res = res;
      res = (_res + "  ");
    }
    String _res = res;
    res = (_res + "},\n");
    return res;
  }
}
