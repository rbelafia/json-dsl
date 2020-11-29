package org.xtext.example.mydsl.generator;

import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.generator.JZFunction;
import org.xtext.example.mydsl.generator.JZJsonObject;
import org.xtext.example.mydsl.generator.JZNumber;

@SuppressWarnings("all")
public class GetDepthFunction implements JZFunction<JZNumber> {
  private JZJsonObject jObject;
  
  public GetDepthFunction(final JZJsonObject jObject) {
    this.jObject = jObject;
  }
  
  @Override
  public JZNumber evaluate() {
    double _auxVisit = this.auxVisit(this.jObject);
    return new JZNumber(_auxVisit);
  }
  
  public double auxVisit(final JZJsonObject obj) {
    int _size = obj.values().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return 0;
    } else {
      boolean _matched = false;
      if (obj instanceof JZJsonObject) {
        _matched=true;
        final Function1<JZJsonObject, Double> _function = (JZJsonObject jz) -> {
          return Double.valueOf(this.auxVisit(jz));
        };
        final List<Double> visited = IterableExtensions.<Double>toList(IterableExtensions.<JZJsonObject, Double>map(Iterables.<JZJsonObject>filter(obj.values(), JZJsonObject.class), _function));
        boolean _isEmpty = visited.isEmpty();
        if (_isEmpty) {
          return 1;
        } else {
          Double _max = IterableExtensions.<Double>max(visited);
          return (1 + (_max).doubleValue());
        }
      }
      return 1;
    }
  }
  
  @Override
  public String define() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("def depth_json(obj: dict):");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("rec = []");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for v in obj.values():");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if isinstance(v, dict):");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("rec.append(1 + depth_json(v))");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if len(rec) == 0:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return 1");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("else:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return max(rec)");
    _builder.newLine();
    return _builder.toString();
  }
}
