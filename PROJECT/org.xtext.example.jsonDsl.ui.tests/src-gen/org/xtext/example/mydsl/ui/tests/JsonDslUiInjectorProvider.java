/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.jsonDsl.ui.internal.JsonDslActivator;

public class JsonDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return JsonDslActivator.getInstance().getInjector("org.xtext.example.mydsl.JsonDsl");
	}

}
