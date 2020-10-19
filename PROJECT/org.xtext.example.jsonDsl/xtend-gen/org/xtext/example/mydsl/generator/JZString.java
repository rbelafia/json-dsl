package org.xtext.example.mydsl.generator;

import java.util.List;
import org.xtext.example.mydsl.generator.JZArray;
import org.xtext.example.mydsl.generator.JZBoolean;
import org.xtext.example.mydsl.generator.JZNull;
import org.xtext.example.mydsl.generator.JZNumber;
import org.xtext.example.mydsl.generator.JZObject;

@SuppressWarnings("all")
public class JZString implements JZObject {
  public String content;
  
  public JZString(final String content) {
    this.content = content;
  }
  
  public static JZString neutral() {
    return new JZString("");
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
    if (object instanceof JZString) {
      _matched=true;
      String _string = ((JZString) object).toString();
      String _plus = (this.content + _string);
      return new JZString(_plus);
    }
    if (!_matched) {
      if (object instanceof JZNumber) {
        _matched=true;
      }
      if (!_matched) {
        if (object instanceof JZBoolean) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (object instanceof JZNull) {
          _matched=true;
        }
      }
      if (_matched) {
        String _string = object.toString();
        String _plus = (this.content + _string);
        return new JZString(_plus);
      }
    }
    if (!_matched) {
      if (object instanceof JZArray) {
        _matched=true;
        JZArray res = new JZArray();
        List<JZObject> _elements = ((JZArray) object).elements();
        for (final JZObject e : _elements) {
          JZString _jZString = new JZString(this.content);
          res.add(_jZString);
        }
        return res.operator_plus(object);
      }
    }
    return null;
  }
  
  @Override
  public JZObject operator_minus(final JZObject object) {
    throw new RuntimeException();
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
    return this.content;
  }
}
