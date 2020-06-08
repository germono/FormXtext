/*
 * generated by Xtext 2.21.0
 */
package oliv.form.xtext.fix.serializer;

import com.google.inject.Inject;
import java.util.Set;
import oliv.form.xtext.fix.fix.Courbe;
import oliv.form.xtext.fix.fix.FixPackage;
import oliv.form.xtext.fix.fix.Ligne;
import oliv.form.xtext.fix.fix.Model;
import oliv.form.xtext.fix.services.FixGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class FixSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FixGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FixPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FixPackage.COURBE:
				sequence_Courbe(context, (Courbe) semanticObject); 
				return; 
			case FixPackage.LIGNE:
				sequence_Ligne(context, (Ligne) semanticObject); 
				return; 
			case FixPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Courbe returns Courbe
	 *
	 * Constraint:
	 *     (name=ID lignes+=Ligne*)
	 */
	protected void sequence_Courbe(ISerializationContext context, Courbe semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Ligne returns Ligne
	 *
	 * Constraint:
	 *     (x=NOMBRE y=NOMBRE)
	 */
	protected void sequence_Ligne(ISerializationContext context, Ligne semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FixPackage.Literals.LIGNE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FixPackage.Literals.LIGNE__X));
			if (transientValues.isValueTransient(semanticObject, FixPackage.Literals.LIGNE__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FixPackage.Literals.LIGNE__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLigneAccess().getXNOMBRETerminalRuleCall_0_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getLigneAccess().getYNOMBRETerminalRuleCall_1_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     Courbes+=Courbe+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}