package oliv.form.xtext.interpreter

/*******************************************************************************
 * Copyright (c) 2015, 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
import oliv.form.xtext.dsl.Div
import oliv.form.xtext.dsl.Expression
import oliv.form.xtext.dsl.Minus
import oliv.form.xtext.dsl.Multi
import oliv.form.xtext.dsl.NumberLiteral
import oliv.form.xtext.dsl.Plus
import oliv.form.xtext.dsl.Variable
import oliv.form.xtext.dsl.VariableCalcule
import oliv.form.xtext.dsl.VariableDirect
import oliv.form.xtext.dsl.VariableExpression

/**
 * an interpreter for instances of EClasses of the {@link ArithmeticsPackage}.
 * It internally uses a polymorphic dispatcher to dispatch between the implementations for the different EClasses.
 */
class CalculatorDirect {
	def double evaluate(Variable obj) {
		switch d : obj {
			VariableDirect: {
				return d.alpha
			}
			VariableCalcule: {
				return evaluate(d.expression)
			}
			default :
				return 0.0		
		}
	}

	def double evaluate(Expression obj) {
		return internalEvaluate(obj)
	}

	def dispatch protected double internalEvaluate(NumberLiteral e) {
		return e.value
	}
	def dispatch protected double internalEvaluate(VariableExpression obj) {
		switch d : obj.value {
			VariableDirect: {
				return d.alpha
			}
			VariableCalcule: {
				return evaluate(d.expression)
			}
			default :
				return 0.0		
		}
	}

	def dispatch protected double internalEvaluate(Plus plus) {
		return evaluate(plus.left) + evaluate(plus.right)
	}

	def dispatch protected double internalEvaluate(Minus minus) {
		return evaluate(minus.left) - evaluate(minus.right)
	}

	def dispatch protected double internalEvaluate(Div div) {
		return evaluate(div.left) / evaluate(div.right)
	}

	def dispatch protected double internalEvaluate(Multi multi) {
		return evaluate(multi.left) * evaluate(multi.right)
	}
}
