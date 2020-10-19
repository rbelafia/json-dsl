package org.xtext.example.mydsl.generator;

import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.example.mydsl.generator.JZFunction;

@SuppressWarnings("all")
public abstract class ConcatFunction<T extends Object> implements JZFunction<T> {
  protected List<T> elements;
  
  public ConcatFunction(final List<T> elements) {
    this.elements = CollectionLiterals.<T>newArrayList();
    for (final T e : elements) {
      this.elements.add(e);
    }
  }
}
