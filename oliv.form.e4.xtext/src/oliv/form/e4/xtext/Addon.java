package oliv.form.e4.xtext;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

import oliv.form.xtext.dsl.Model;
import oliv.form.xtext.dsl.Truc;
import oliv.form.xtext.dsl.Variable;
import oliv.form.xtext.dsl.VariableCalcule;
import oliv.form.xtext.dsl.VariableDirect;
import oliv.form.xtext.interpreter.CalculatorDirect;
import oliv.form.xtext.ui.EditeurContexte;


public class Addon implements ConstantesUI{
	private IEclipseContext context;
	private CalculatorDirect calculator = new CalculatorDirect();
	private IXtextDocument doc;

	@PostConstruct
	public void enrichie(IEclipseContext context) {
		this.context = context;
	}
	@Inject
	public void genere(@Optional EditeurContexte editeur) {
		if (editeur != null) {
			doc = editeur.getDocument();
			doc.addDocumentListener(new IDocumentListener() {
				@Override
				public void documentChanged(DocumentEvent event) {
					maj();
				}
				@Override
				public void documentAboutToBeChanged(DocumentEvent event) {
				}
			});
			maj();
		}
	}
	private void maj() {
		
		Model nouveauModel =doc.readOnly(res -> 
		EcoreUtil.copy(
				res.getContents().size()!=0?
					(Model)res.getContents().get(0):
					null));
		if (nouveauModel==null)
				return;
		List<VariableContext> variables = new ArrayList<>();
		for (Truc v :nouveauModel.getVariables()) {
			if(v instanceof Variable)
				variables.add(new VariableContext(((Variable)v).getNom(), ((Variable)v).getValeurs()));
			if(v instanceof VariableCalcule) {
				double valeur;
				try{
					 valeur =calculator.evaluate(((VariableCalcule)v).getExpression());
				}
				catch (IllegalArgumentException e) {
					 valeur =0.0;
				}
				variables.add(new VariableContext(((VariableCalcule)v).getName(), valeur));
			}
		}
		context.set(VARIABLES,variables);
	}
}
