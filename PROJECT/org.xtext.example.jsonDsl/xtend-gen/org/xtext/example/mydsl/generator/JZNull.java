package org.xtext.example.mydsl.generator;

import org.xtext.example.mydsl.generator.JZArray;
import org.xtext.example.mydsl.generator.JZBoolean;
import org.xtext.example.mydsl.generator.JZNumber;
import org.xtext.example.mydsl.generator.JZObject;
import org.xtext.example.mydsl.generator.JZString;

@SuppressWarnings("all")
public class JZNull implements JZObject {
  public JZNull() {
  }
  
  public static JZNull neutral() {
    return new JZNull();
  }
  
  @Override
  public JZObject operator_or(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZBoolean) {
      _matched=true;
    }
    if (!_matched) {
      if (object instanceof JZArray) {
        _matched=true;
      }
    }
    if (_matched) {
      return object;
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_and(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZBoolean) {
      _matched=true;
    }
    if (!_matched) {
      if (object instanceof JZArray) {
        _matched=true;
      }
    }
    if (_matched) {
      return object;
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_plus(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
    }
    if (!_matched) {
      if (object instanceof JZString) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (object instanceof JZArray) {
        _matched=true;
      }
    }
    if (_matched) {
      return object;
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_minus(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
    }
    if (!_matched) {
      if (object instanceof JZArray) {
        _matched=true;
      }
    }
    if (_matched) {
      return object;
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_multiply(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
    }
    if (!_matched) {
      if (object instanceof JZArray) {
        _matched=true;
      }
    }
    if (_matched) {
      return object;
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_divide(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
    }
    if (!_matched) {
      if (object instanceof JZArray) {
        _matched=true;
      }
    }
    if (_matched) {
      return object;
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_modulo(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
    }
    if (!_matched) {
      if (object instanceof JZArray) {
        _matched=true;
      }
    }
    if (_matched) {
      return object;
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_plus() {
    return this;
  }
  
  @Override
  public JZObject operator_minus() {
    return this;
  }
  
  @Override
  public JZObject operator_not() {
    return this;
  }
}
