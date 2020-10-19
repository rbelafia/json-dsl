package org.xtext.example.mydsl.generator;

import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.example.mydsl.generator.ConcatFunction;

@SuppressWarnings("all")
public class ConcatFunctionArray extends ConcatFunction<List<Object>> {
  public ConcatFunctionArray(final List<List<Object>> elements) {
    super(elements);
  }
  
  @Override
  public List<Object> evaluate() {
    List<Object> res = CollectionLiterals.<Object>newArrayList();
    for (final List<Object> l : this.elements) {
      res.addAll(l);
    }
    return res;
  }
}
