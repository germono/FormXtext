/*
 * generated by Xtext 2.21.0
 */
package oliv.form.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import oliv.form.xtext.ide.contentassist.antlr.internal.InternalDslParser;
import oliv.form.xtext.services.DslGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class DslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTrucAccess().getAlternatives(), "rule__Truc__Alternatives");
			builder.put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
			builder.put(grammarAccess.getAdditionAccess().getAlternatives_1_0(), "rule__Addition__Alternatives_1_0");
			builder.put(grammarAccess.getMultiplicationAccess().getAlternatives_1_0(), "rule__Multiplication__Alternatives_1_0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
			builder.put(grammarAccess.getReelAccess().getAlternatives_1_1(), "rule__Reel__Alternatives_1_1");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getPackageDeclarationAccess().getGroup(), "rule__PackageDeclaration__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getAutreAccess().getGroup(), "rule__Autre__Group__0");
			builder.put(grammarAccess.getVariableDirectAccess().getGroup(), "rule__VariableDirect__Group__0");
			builder.put(grammarAccess.getVariableCalculeAccess().getGroup(), "rule__VariableCalcule__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1(), "rule__Addition__Group_1__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1_0_0(), "rule__Addition__Group_1_0_0__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup_1_0_1(), "rule__Addition__Group_1_0_1__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1(), "rule__Multiplication__Group_1__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1_0_0(), "rule__Multiplication__Group_1_0_0__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup_1_0_1(), "rule__Multiplication__Group_1_0_1__0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getGroup_1(), "rule__PrimaryExpression__Group_1__0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getGroup_2(), "rule__PrimaryExpression__Group_2__0");
			builder.put(grammarAccess.getReelAccess().getGroup(), "rule__Reel__Group__0");
			builder.put(grammarAccess.getReelAccess().getGroup_1(), "rule__Reel__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getPackageAssignment_0(), "rule__Model__PackageAssignment_0");
			builder.put(grammarAccess.getModelAccess().getImportsAssignment_1(), "rule__Model__ImportsAssignment_1");
			builder.put(grammarAccess.getModelAccess().getVariablesAssignment_2(), "rule__Model__VariablesAssignment_2");
			builder.put(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1(), "rule__PackageDeclaration__NameAssignment_1");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getAutreAccess().getBobAssignment_3(), "rule__Autre__BobAssignment_3");
			builder.put(grammarAccess.getVariableDirectAccess().getNameAssignment_1(), "rule__VariableDirect__NameAssignment_1");
			builder.put(grammarAccess.getVariableDirectAccess().getAlphaAssignment_5(), "rule__VariableDirect__AlphaAssignment_5");
			builder.put(grammarAccess.getVariableDirectAccess().getBetaAssignment_8(), "rule__VariableDirect__BetaAssignment_8");
			builder.put(grammarAccess.getVariableCalculeAccess().getNameAssignment_1(), "rule__VariableCalcule__NameAssignment_1");
			builder.put(grammarAccess.getVariableCalculeAccess().getExpressionAssignment_3(), "rule__VariableCalcule__ExpressionAssignment_3");
			builder.put(grammarAccess.getAdditionAccess().getRightAssignment_1_1(), "rule__Addition__RightAssignment_1_1");
			builder.put(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1(), "rule__Multiplication__RightAssignment_1_1");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1(), "rule__PrimaryExpression__ValueAssignment_1_1");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1(), "rule__PrimaryExpression__ValueAssignment_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
