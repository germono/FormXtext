/**
	 * generated by Xtext 2.21.0
*/
package oliv.form.xtext.dsl.impl;

import oliv.form.xtext.dsl.VariableDirect;

// This class overrides the generated class and will be instantiated by factory
public class VariableDirectImpl extends MVariableDirectImpl implements VariableDirect
{
	@Override
	public String getNom() {
		return super.getName();
	}
	@Override
	public double getValeurs() {
		return getAlpha();
	}
}
