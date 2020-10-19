package org.xtext.example.mydsl.generator;

import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xtext.example.mydsl.generator.ConcatFunction;
import org.xtext.example.mydsl.generator.JZJsonObject;

@SuppressWarnings("all")
public class ConcatFunctionJsonObject extends ConcatFunction<JZJsonObject> {
  public ConcatFunctionJsonObject(final List<JZJsonObject> elements) {
    super(elements);
  }
  
  @Override
  public JZJsonObject evaluate() {
    JZJsonObject res = new JZJsonObject();
    for (final JZJsonObject j : this.elements) {
      Set<Map.Entry<String, Object>> _entrySet = j.fields().entrySet();
      for (final Map.Entry<String, Object> entry : _entrySet) {
        res.addField(entry.getKey(), entry.getValue());
      }
    }
    return res;
  }
}
