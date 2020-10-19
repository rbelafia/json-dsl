package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.generator.JZFunction;
import org.xtext.example.mydsl.generator.JZJsonObject;

@SuppressWarnings("all")
public class GetDepthFunction implements JZFunction<Integer> {
  private JZJsonObject jObject;
  
  public GetDepthFunction(final JZJsonObject jObject) {
    this.jObject = jObject;
  }
  
  @Override
  public Integer evaluate() {
    return Integer.valueOf(this.auxVisit(this.jObject));
  }
  
  public int auxVisit(final JZJsonObject obj) {
    int _size = obj.values().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return 0;
    } else {
      final Function1<JZJsonObject, Integer> _function = (JZJsonObject jz) -> {
        return Integer.valueOf(this.auxVisit(jz));
      };
      return (int) IterableExtensions.<Integer>max(IterableExtensions.<JZJsonObject, Integer>map(Iterables.<JZJsonObject>filter(obj.values(), JZJsonObject.class), _function));
    }
  }
}
