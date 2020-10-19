package org.xtext.example.mydsl.generator;

import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.xtext.example.mydsl.generator.JZBoolean;
import org.xtext.example.mydsl.generator.JZJsonObject;
import org.xtext.example.mydsl.generator.JZNull;
import org.xtext.example.mydsl.generator.JZNumber;
import org.xtext.example.mydsl.generator.JZObject;
import org.xtext.example.mydsl.generator.JZString;

@SuppressWarnings("all")
public class JZArray implements JZObject {
  private List<JZObject> elements;
  
  public JZArray() {
    this.elements = CollectionLiterals.<JZObject>newArrayList();
  }
  
  public JZArray(final List<JZObject> elements) {
    this.elements = CollectionLiterals.<JZObject>newArrayList();
    this.elements.addAll(elements);
  }
  
  public List<JZObject> elements() {
    return this.elements;
  }
  
  public int size() {
    return this.elements.size();
  }
  
  public boolean add(final JZObject element) {
    return this.elements.add(element);
  }
  
  public boolean addAll(final List<JZObject> list) {
    return this.elements.addAll(list);
  }
  
  @Override
  public JZObject operator_or(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZBoolean) {
      _matched=true;
      final Function1<JZObject, JZObject> _function = (JZObject e) -> {
        return e.operator_or(object);
      };
      List<JZObject> _map = ListExtensions.<JZObject, JZObject>map(this.elements, _function);
      return new JZArray(_map);
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
        int k = 0;
        for (int i = 0; (i < this.elements.size()); i++, k++) {
          int _size = ((JZArray)object).elements.size();
          boolean _lessThan = (_size < i);
          if (_lessThan) {
            res.add(this.elements.get(i));
          } else {
            JZObject _get = this.elements.get(i);
            JZObject _get_1 = ((JZArray)object).elements.get(i);
            JZObject _or = _get.operator_or(_get_1);
            res.add(_or);
          }
        }
        int _size = ((JZArray)object).elements.size();
        boolean _lessThan = (k < _size);
        if (_lessThan) {
          for (int i = k; (i < ((JZArray)object).elements.size()); i++) {
            res.add(((JZArray)object).elements.get(i));
          }
        }
        return res;
      }
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_and(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZBoolean) {
      _matched=true;
      final Function1<JZObject, JZObject> _function = (JZObject e) -> {
        return e.operator_and(object);
      };
      List<JZObject> _map = ListExtensions.<JZObject, JZObject>map(this.elements, _function);
      return new JZArray(_map);
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
        int k = 0;
        for (int i = 0; (i < this.elements.size()); i++, k++) {
          int _size = ((JZArray)object).elements.size();
          boolean _lessThan = (_size < i);
          if (_lessThan) {
            res.add(this.elements.get(i));
          } else {
            JZObject _get = this.elements.get(i);
            JZObject _get_1 = ((JZArray)object).elements.get(i);
            JZObject _and = _get.operator_and(_get_1);
            res.add(_and);
          }
        }
        int _size = ((JZArray)object).elements.size();
        boolean _lessThan = (k < _size);
        if (_lessThan) {
          for (int i = k; (i < ((JZArray)object).elements.size()); i++) {
            res.add(((JZArray)object).elements.get(i));
          }
        }
        return res;
      }
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
      if (object instanceof JZJsonObject) {
        _matched=true;
      }
    }
    if (_matched) {
      final Function1<JZObject, JZObject> _function = (JZObject e) -> {
        return e.operator_plus(object);
      };
      List<JZObject> _map = ListExtensions.<JZObject, JZObject>map(this.elements, _function);
      return new JZArray(_map);
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
        int k = 0;
        for (int i = 0; (i < this.elements.size()); i++, k++) {
          int _size = ((JZArray)object).elements.size();
          boolean _lessThan = (_size < i);
          if (_lessThan) {
            res.add(this.elements.get(i));
          } else {
            JZObject _get = this.elements.get(i);
            JZObject _get_1 = ((JZArray)object).elements.get(i);
            JZObject _plus = _get.operator_plus(_get_1);
            res.add(_plus);
          }
        }
        int _size = ((JZArray)object).elements.size();
        boolean _lessThan = (k < _size);
        if (_lessThan) {
          for (int i = k; (i < ((JZArray)object).elements.size()); i++) {
            res.add(((JZArray)object).elements.get(i));
          }
        }
        return res;
      }
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
      if (object instanceof JZJsonObject) {
        _matched=true;
      }
    }
    if (_matched) {
      final Function1<JZObject, JZObject> _function = (JZObject e) -> {
        return e.operator_minus(object);
      };
      List<JZObject> _map = ListExtensions.<JZObject, JZObject>map(this.elements, _function);
      return new JZArray(_map);
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
        int k = 0;
        for (int i = 0; (i < this.elements.size()); i++, k++) {
          int _size = ((JZArray)object).elements.size();
          boolean _lessThan = (_size < i);
          if (_lessThan) {
            res.add(this.elements.get(i));
          } else {
            JZObject _get = this.elements.get(i);
            JZObject _get_1 = ((JZArray)object).elements.get(i);
            JZObject _plus = _get.operator_plus(_get_1);
            res.add(_plus);
          }
        }
        int _size = ((JZArray)object).elements.size();
        boolean _lessThan = (k < _size);
        if (_lessThan) {
          for (int i = k; (i < ((JZArray)object).elements.size()); i++) {
            res.add(((JZArray)object).elements.get(i));
          }
        }
        return res;
      }
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_multiply(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
      final Function1<JZObject, JZObject> _function = (JZObject e) -> {
        return e.operator_multiply(object);
      };
      List<JZObject> _map = ListExtensions.<JZObject, JZObject>map(this.elements, _function);
      return new JZArray(_map);
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
        int k = 0;
        for (int i = 0; (i < this.elements.size()); i++, k++) {
          int _size = ((JZArray)object).elements.size();
          boolean _lessThan = (_size < i);
          if (_lessThan) {
            res.add(this.elements.get(i));
          } else {
            JZObject _get = this.elements.get(i);
            JZObject _get_1 = ((JZArray)object).elements.get(i);
            JZObject _multiply = _get.operator_multiply(_get_1);
            res.add(_multiply);
          }
        }
        int _size = ((JZArray)object).elements.size();
        boolean _lessThan = (k < _size);
        if (_lessThan) {
          for (int i = k; (i < ((JZArray)object).elements.size()); i++) {
            res.add(((JZArray)object).elements.get(i));
          }
        }
        return res;
      }
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_divide(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
      final Function1<JZObject, JZObject> _function = (JZObject e) -> {
        return e.operator_divide(object);
      };
      List<JZObject> _map = ListExtensions.<JZObject, JZObject>map(this.elements, _function);
      return new JZArray(_map);
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
        int k = 0;
        for (int i = 0; (i < this.elements.size()); i++, k++) {
          int _size = ((JZArray)object).elements.size();
          boolean _lessThan = (_size < i);
          if (_lessThan) {
            res.add(this.elements.get(i));
          } else {
            JZObject _get = this.elements.get(i);
            JZObject _get_1 = ((JZArray)object).elements.get(i);
            JZObject _divide = _get.operator_divide(_get_1);
            res.add(_divide);
          }
        }
        int _size = ((JZArray)object).elements.size();
        boolean _lessThan = (k < _size);
        if (_lessThan) {
          for (int i = k; (i < ((JZArray)object).elements.size()); i++) {
            res.add(((JZArray)object).elements.get(i));
          }
        }
        return res;
      }
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_modulo(final JZObject object) {
    boolean _matched = false;
    if (object instanceof JZNumber) {
      _matched=true;
      final Function1<JZObject, JZObject> _function = (JZObject e) -> {
        return e.operator_modulo(object);
      };
      List<JZObject> _map = ListExtensions.<JZObject, JZObject>map(this.elements, _function);
      return new JZArray(_map);
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
        int k = 0;
        for (int i = 0; (i < this.elements.size()); i++, k++) {
          int _size = ((JZArray)object).elements.size();
          boolean _lessThan = (_size < i);
          if (_lessThan) {
            res.add(this.elements.get(i));
          } else {
            JZObject _get = this.elements.get(i);
            JZObject _get_1 = ((JZArray)object).elements.get(i);
            JZObject _modulo = _get.operator_modulo(_get_1);
            res.add(_modulo);
          }
        }
        int _size = ((JZArray)object).elements.size();
        boolean _lessThan = (k < _size);
        if (_lessThan) {
          for (int i = k; (i < ((JZArray)object).elements.size()); i++) {
            res.add(((JZArray)object).elements.get(i));
          }
        }
        return res;
      }
    }
    throw new RuntimeException();
  }
  
  @Override
  public JZObject operator_plus() {
    final Function1<JZObject, JZObject> _function = (JZObject element) -> {
      return element.operator_plus();
    };
    List<JZObject> _map = ListExtensions.<JZObject, JZObject>map(this.elements, _function);
    return new JZArray(_map);
  }
  
  @Override
  public JZObject operator_minus() {
    final Function1<JZObject, JZObject> _function = (JZObject element) -> {
      return element.operator_minus();
    };
    List<JZObject> _map = ListExtensions.<JZObject, JZObject>map(this.elements, _function);
    return new JZArray(_map);
  }
  
  @Override
  public JZObject operator_not() {
    final Function1<JZObject, JZObject> _function = (JZObject element) -> {
      return element.operator_not();
    };
    List<JZObject> _map = ListExtensions.<JZObject, JZObject>map(this.elements, _function);
    return new JZArray(_map);
  }
  
  @Override
  public String toString() {
    String res = "[";
    String _res = res;
    JZObject _remove = this.elements.remove(0);
    res = (_res + _remove);
    for (final JZObject e : this.elements) {
      String _res_1 = res;
      String _string = e.toString();
      String _plus = ("," + _string);
      res = (_res_1 + _plus);
    }
    String _res_2 = res;
    res = (_res_2 + "]");
    return res;
  }
}
