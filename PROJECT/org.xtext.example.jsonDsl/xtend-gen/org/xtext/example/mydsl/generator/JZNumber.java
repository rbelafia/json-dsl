package org.xtext.example.mydsl.generator;

import java.util.List;
import org.xtext.example.mydsl.generator.JZArray;
import org.xtext.example.mydsl.generator.JZNull;
import org.xtext.example.mydsl.generator.JZObject;
import org.xtext.example.mydsl.generator.JZString;

@SuppressWarnings("all")
public class JZNumber implements JZObject {
  public double content;
  
  public JZNumber(final int content) {
    this.content = content;
  }
  
  public JZNumber(final double content) {
    this.content = content;
  }
  
  public static JZNumber neutral() {
    return new JZNumber(0);
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
    if (object instanceof JZNumber) {
      _matched=true;
      return new JZNumber((this.content + ((JZNumber)object).content));
    }
    if (!_matched) {
      if (object instanceof JZString) {
        _matched=true;
        String _string = Double.valueOf(this.content).toString();
        String _plus = (_string + ((JZString)object).content);
        return new JZString(_plus);
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
          JZNumber _jZNumber = new JZNumber(this.content);
          res.add(_jZNumber);
        }
        return res.operator_plus(object);
      }
    }
    return null;
  }
  
  @Override
  public JZObject operator_minus(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
      return new JZNumber((this.content - ((JZNumber)object).content));
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
          JZNumber _jZNumber = new JZNumber(this.content);
          res.add(_jZNumber);
        }
        return res.operator_plus(object);
      }
    }
    return null;
  }
  
  @Override
  public JZObject operator_multiply(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
      return new JZNumber((this.content * ((JZNumber)object).content));
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
          JZNumber _jZNumber = new JZNumber(this.content);
          res.add(_jZNumber);
        }
        return res.operator_multiply(object);
      }
    }
    return null;
  }
  
  @Override
  public JZObject operator_divide(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
      return new JZNumber((this.content / ((JZNumber)object).content));
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
          JZNumber _jZNumber = new JZNumber(this.content);
          res.add(_jZNumber);
        }
        return res.operator_divide(object);
      }
    }
    return null;
  }
  
  @Override
  public JZObject operator_modulo(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
      return new JZNumber((this.content % ((JZNumber)object).content));
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
          JZNumber _jZNumber = new JZNumber(this.content);
          res.add(_jZNumber);
        }
        return res.operator_modulo(object);
      }
    }
    return null;
  }
  
  @Override
  public JZObject operator_plus() {
    return this;
  }
  
  @Override
  public JZObject operator_minus() {
    return new JZNumber((-this.content));
  }
  
  @Override
  public JZObject operator_not() {
    throw new RuntimeException();
  }
  
  @Override
  public String toString() {
    return Double.valueOf(this.content).toString();
  }
}
