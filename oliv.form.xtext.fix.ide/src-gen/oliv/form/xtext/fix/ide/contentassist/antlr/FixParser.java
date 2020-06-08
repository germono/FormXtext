/*
 * generated by Xtext 2.21.0
 */
package oliv.form.xtext.fix.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import oliv.form.xtext.fix.ide.contentassist.antlr.internal.InternalFixParser;
import oliv.form.xtext.fix.services.FixGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class FixParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(FixGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, FixGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCourbeAccess().getGroup(), "rule__Courbe__Group__0");
			builder.put(grammarAccess.getLigneAccess().getGroup(), "rule__Ligne__Group__0");
			builder.put(grammarAccess.getModelAccess().getCourbesAssignment(), "rule__Model__CourbesAssignment");
			builder.put(grammarAccess.getCourbeAccess().getNameAssignment_2(), "rule__Courbe__NameAssignment_2");
			builder.put(grammarAccess.getCourbeAccess().getLignesAssignment_4(), "rule__Courbe__LignesAssignment_4");
			builder.put(grammarAccess.getLigneAccess().getXAssignment_0(), "rule__Ligne__XAssignment_0");
			builder.put(grammarAccess.getLigneAccess().getYAssignment_1(), "rule__Ligne__YAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private FixGrammarAccess grammarAccess;

	@Override
	protected InternalFixParser createParser() {
		InternalFixParser result = new InternalFixParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FixGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FixGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}