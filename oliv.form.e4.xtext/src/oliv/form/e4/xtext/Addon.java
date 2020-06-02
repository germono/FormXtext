package oliv.form.e4.xtext;

import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocumentListener;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

import oliv.form.xtext.dsl.Model;
import oliv.form.xtext.dsl.Variable;
import oliv.form.xtext.ui.EditeurContexte;

public class Addon implements ConstantesUI {
	private IEclipseContext context;
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

	@Inject
	public void select(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Object o) {
		if (o == null)
			return;
		if (o instanceof IStructuredSelection) {
			IStructuredSelection s = (IStructuredSelection) o;
			if (s.size() != 0) {
				EObjectNode ob = (EObjectNode) s.getFirstElement();
				Object objet = doc.readOnly(res->res.getEObject(ob.getEObjectURI().fragment()));
				context.set(ECORE_OBJET_SELECTION,objet);
			}
		}
		if (o instanceof TextSelection) {
			TextSelection t = (TextSelection) o;
			//TODO relier le t au modele?
		}
		

	}

	private void maj() {

		Model nouveauModel = doc
				.readOnly(res -> res.getContents().size() != 0 ? (Model) res.getContents().get(0) : null);
		
		if (nouveauModel == null) {
			context.set(VARIABLES,new ArrayList<Variable>());					
			return;
		}
		context.set(VARIABLES,
				nouveauModel.getVariables().stream().filter(v -> (v instanceof Variable)).collect(Collectors.toList()));
	}
}
