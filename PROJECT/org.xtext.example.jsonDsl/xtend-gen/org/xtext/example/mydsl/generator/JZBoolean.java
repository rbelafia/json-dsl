package org.xtext.example.mydsl.generator;

import java.util.List;
import org.xtext.example.mydsl.generator.JZArray;
import org.xtext.example.mydsl.generator.JZNull;
import org.xtext.example.mydsl.generator.JZObject;

@SuppressWarnings("all")
public class JZBoolean implements JZObject {
  private boolean content;
  
  public JZBoolean(final boolean content) {
    this.content = content;
  }
  
  public static JZBoolean neutral() {
    return new JZBoolean(false);
  }
  
  @Override
  public JZObject operator_or(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZBoolean) {
      _matched=true;
      return new JZBoolean((this.content || ((JZBoolean)object).content));
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
          JZBoolean _jZBoolean = new JZBoolean(this.content);
          res.add(_jZBoolean);
        }
        return res.operator_or(object);
      }
    }
    return null;
  }
  
  @Override
  public JZObject operator_and(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZBoolean) {
      _matched=true;
      return new JZBoolean((this.content && ((JZBoolean)object).content));
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
          JZBoolean _jZBoolean = new JZBoolean(this.content);
          res.add(_jZBoolean);
        }
        return res.operator_and(object);
      }
    }
    return null;
  }
  
  @Override
  public JZObject operator_plus(final JZObject object) {
    throw new RuntimeException();
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
    return new JZBoolean((!this.content));
  }
  
  @Override
  public String toString() {
    return Boolean.valueOf(this.content).toString();
  }
}
