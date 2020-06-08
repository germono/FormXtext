package oliv.form.xtext.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import oliv.form.xtext.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VariableCalcule", "NomImport", "Variable", "Import", "Alpha", "Autre", "Beta", "Bob", "FullStopAsterisk", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "HyphenMinus", "FullStop", "Solidus", "Colon", "RULE_INT", "RULE_EXT_INT", "RULE_BEGIN", "RULE_END", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=24;
    public static final int Variable=6;
    public static final int Import=7;
    public static final int RULE_BEGIN=23;
    public static final int RULE_STRING=26;
    public static final int Beta=10;
    public static final int RULE_SL_COMMENT=28;
    public static final int HyphenMinus=17;
    public static final int LeftParenthesis=13;
    public static final int Bob=11;
    public static final int Autre=9;
    public static final int Solidus=19;
    public static final int Colon=20;
    public static final int EOF=-1;
    public static final int Asterisk=15;
    public static final int FullStop=18;
    public static final int RULE_ID=25;
    public static final int RULE_WS=29;
    public static final int RULE_EXT_INT=22;
    public static final int RightParenthesis=14;
    public static final int VariableCalcule=4;
    public static final int RULE_ANY_OTHER=30;
    public static final int PlusSign=16;
    public static final int RULE_INT=21;
    public static final int FullStopAsterisk=12;
    public static final int NomImport=5;
    public static final int Alpha=8;
    public static final int RULE_ML_COMMENT=27;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDslParser.g"; }


    	private DslGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("FullStopAsterisk", "'.*'");
    		tokenNameToValue.put("Bob", "'Bob'");
    		tokenNameToValue.put("Beta", "'Beta'");
    		tokenNameToValue.put("Alpha", "'Alpha'");
    		tokenNameToValue.put("Autre", "'Autre'");
    		tokenNameToValue.put("Import", "'import'");
    		tokenNameToValue.put("Variable", "'Variable'");
    		tokenNameToValue.put("NomImport", "'nomImport'");
    		tokenNameToValue.put("VariableCalcule", "'VariableCalcule'");
    	}

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDslParser.g:72:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDslParser.g:73:1: ( ruleModel EOF )
            // InternalDslParser.g:74:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDslParser.g:81:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:85:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDslParser.g:86:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDslParser.g:86:2: ( ( rule__Model__Group__0 ) )
            // InternalDslParser.g:87:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDslParser.g:88:3: ( rule__Model__Group__0 )
            // InternalDslParser.g:88:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalDslParser.g:97:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalDslParser.g:98:1: ( rulePackageDeclaration EOF )
            // InternalDslParser.g:99:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalDslParser.g:106:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:110:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalDslParser.g:111:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalDslParser.g:111:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalDslParser.g:112:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalDslParser.g:113:3: ( rule__PackageDeclaration__Group__0 )
            // InternalDslParser.g:113:4: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleImport"
    // InternalDslParser.g:122:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalDslParser.g:123:1: ( ruleImport EOF )
            // InternalDslParser.g:124:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDslParser.g:131:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:135:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalDslParser.g:136:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalDslParser.g:136:2: ( ( rule__Import__Group__0 ) )
            // InternalDslParser.g:137:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalDslParser.g:138:3: ( rule__Import__Group__0 )
            // InternalDslParser.g:138:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalDslParser.g:147:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalDslParser.g:148:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalDslParser.g:149:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalDslParser.g:156:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:160:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalDslParser.g:161:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalDslParser.g:161:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalDslParser.g:162:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalDslParser.g:163:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalDslParser.g:163:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDslParser.g:172:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalDslParser.g:173:1: ( ruleQualifiedName EOF )
            // InternalDslParser.g:174:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDslParser.g:181:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:185:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalDslParser.g:186:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalDslParser.g:186:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalDslParser.g:187:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalDslParser.g:188:3: ( rule__QualifiedName__Group__0 )
            // InternalDslParser.g:188:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleTruc"
    // InternalDslParser.g:197:1: entryRuleTruc : ruleTruc EOF ;
    public final void entryRuleTruc() throws RecognitionException {
        try {
            // InternalDslParser.g:198:1: ( ruleTruc EOF )
            // InternalDslParser.g:199:1: ruleTruc EOF
            {
             before(grammarAccess.getTrucRule()); 
            pushFollow(FOLLOW_1);
            ruleTruc();

            state._fsp--;

             after(grammarAccess.getTrucRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTruc"


    // $ANTLR start "ruleTruc"
    // InternalDslParser.g:206:1: ruleTruc : ( ( rule__Truc__Alternatives ) ) ;
    public final void ruleTruc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:210:2: ( ( ( rule__Truc__Alternatives ) ) )
            // InternalDslParser.g:211:2: ( ( rule__Truc__Alternatives ) )
            {
            // InternalDslParser.g:211:2: ( ( rule__Truc__Alternatives ) )
            // InternalDslParser.g:212:3: ( rule__Truc__Alternatives )
            {
             before(grammarAccess.getTrucAccess().getAlternatives()); 
            // InternalDslParser.g:213:3: ( rule__Truc__Alternatives )
            // InternalDslParser.g:213:4: rule__Truc__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Truc__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTrucAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTruc"


    // $ANTLR start "entryRuleAutre"
    // InternalDslParser.g:222:1: entryRuleAutre : ruleAutre EOF ;
    public final void entryRuleAutre() throws RecognitionException {
        try {
            // InternalDslParser.g:223:1: ( ruleAutre EOF )
            // InternalDslParser.g:224:1: ruleAutre EOF
            {
             before(grammarAccess.getAutreRule()); 
            pushFollow(FOLLOW_1);
            ruleAutre();

            state._fsp--;

             after(grammarAccess.getAutreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutre"


    // $ANTLR start "ruleAutre"
    // InternalDslParser.g:231:1: ruleAutre : ( ( rule__Autre__Group__0 ) ) ;
    public final void ruleAutre() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:235:2: ( ( ( rule__Autre__Group__0 ) ) )
            // InternalDslParser.g:236:2: ( ( rule__Autre__Group__0 ) )
            {
            // InternalDslParser.g:236:2: ( ( rule__Autre__Group__0 ) )
            // InternalDslParser.g:237:3: ( rule__Autre__Group__0 )
            {
             before(grammarAccess.getAutreAccess().getGroup()); 
            // InternalDslParser.g:238:3: ( rule__Autre__Group__0 )
            // InternalDslParser.g:238:4: rule__Autre__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Autre__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutre"


    // $ANTLR start "entryRuleVariableDirect"
    // InternalDslParser.g:247:1: entryRuleVariableDirect : ruleVariableDirect EOF ;
    public final void entryRuleVariableDirect() throws RecognitionException {
        try {
            // InternalDslParser.g:248:1: ( ruleVariableDirect EOF )
            // InternalDslParser.g:249:1: ruleVariableDirect EOF
            {
             before(grammarAccess.getVariableDirectRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDirect();

            state._fsp--;

             after(grammarAccess.getVariableDirectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDirect"


    // $ANTLR start "ruleVariableDirect"
    // InternalDslParser.g:256:1: ruleVariableDirect : ( ( rule__VariableDirect__Group__0 ) ) ;
    public final void ruleVariableDirect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:260:2: ( ( ( rule__VariableDirect__Group__0 ) ) )
            // InternalDslParser.g:261:2: ( ( rule__VariableDirect__Group__0 ) )
            {
            // InternalDslParser.g:261:2: ( ( rule__VariableDirect__Group__0 ) )
            // InternalDslParser.g:262:3: ( rule__VariableDirect__Group__0 )
            {
             before(grammarAccess.getVariableDirectAccess().getGroup()); 
            // InternalDslParser.g:263:3: ( rule__VariableDirect__Group__0 )
            // InternalDslParser.g:263:4: rule__VariableDirect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDirectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDirect"


    // $ANTLR start "entryRuleVariableCalcule"
    // InternalDslParser.g:272:1: entryRuleVariableCalcule : ruleVariableCalcule EOF ;
    public final void entryRuleVariableCalcule() throws RecognitionException {
        try {
            // InternalDslParser.g:273:1: ( ruleVariableCalcule EOF )
            // InternalDslParser.g:274:1: ruleVariableCalcule EOF
            {
             before(grammarAccess.getVariableCalculeRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableCalcule();

            state._fsp--;

             after(grammarAccess.getVariableCalculeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableCalcule"


    // $ANTLR start "ruleVariableCalcule"
    // InternalDslParser.g:281:1: ruleVariableCalcule : ( ( rule__VariableCalcule__Group__0 ) ) ;
    public final void ruleVariableCalcule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:285:2: ( ( ( rule__VariableCalcule__Group__0 ) ) )
            // InternalDslParser.g:286:2: ( ( rule__VariableCalcule__Group__0 ) )
            {
            // InternalDslParser.g:286:2: ( ( rule__VariableCalcule__Group__0 ) )
            // InternalDslParser.g:287:3: ( rule__VariableCalcule__Group__0 )
            {
             before(grammarAccess.getVariableCalculeAccess().getGroup()); 
            // InternalDslParser.g:288:3: ( rule__VariableCalcule__Group__0 )
            // InternalDslParser.g:288:4: rule__VariableCalcule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableCalcule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableCalculeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableCalcule"


    // $ANTLR start "entryRuleExpression"
    // InternalDslParser.g:297:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDslParser.g:298:1: ( ruleExpression EOF )
            // InternalDslParser.g:299:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDslParser.g:306:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:310:2: ( ( ruleAddition ) )
            // InternalDslParser.g:311:2: ( ruleAddition )
            {
            // InternalDslParser.g:311:2: ( ruleAddition )
            // InternalDslParser.g:312:3: ruleAddition
            {
             before(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAdditionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalDslParser.g:322:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalDslParser.g:323:1: ( ruleAddition EOF )
            // InternalDslParser.g:324:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalDslParser.g:331:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:335:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalDslParser.g:336:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalDslParser.g:336:2: ( ( rule__Addition__Group__0 ) )
            // InternalDslParser.g:337:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalDslParser.g:338:3: ( rule__Addition__Group__0 )
            // InternalDslParser.g:338:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalDslParser.g:347:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalDslParser.g:348:1: ( ruleMultiplication EOF )
            // InternalDslParser.g:349:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalDslParser.g:356:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:360:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalDslParser.g:361:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalDslParser.g:361:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalDslParser.g:362:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalDslParser.g:363:3: ( rule__Multiplication__Group__0 )
            // InternalDslParser.g:363:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalDslParser.g:372:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalDslParser.g:373:1: ( rulePrimaryExpression EOF )
            // InternalDslParser.g:374:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalDslParser.g:381:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:385:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalDslParser.g:386:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalDslParser.g:386:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalDslParser.g:387:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalDslParser.g:388:3: ( rule__PrimaryExpression__Alternatives )
            // InternalDslParser.g:388:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleReel"
    // InternalDslParser.g:397:1: entryRuleReel : ruleReel EOF ;
    public final void entryRuleReel() throws RecognitionException {
        try {
            // InternalDslParser.g:398:1: ( ruleReel EOF )
            // InternalDslParser.g:399:1: ruleReel EOF
            {
             before(grammarAccess.getReelRule()); 
            pushFollow(FOLLOW_1);
            ruleReel();

            state._fsp--;

             after(grammarAccess.getReelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReel"


    // $ANTLR start "ruleReel"
    // InternalDslParser.g:406:1: ruleReel : ( ( rule__Reel__Group__0 ) ) ;
    public final void ruleReel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:410:2: ( ( ( rule__Reel__Group__0 ) ) )
            // InternalDslParser.g:411:2: ( ( rule__Reel__Group__0 ) )
            {
            // InternalDslParser.g:411:2: ( ( rule__Reel__Group__0 ) )
            // InternalDslParser.g:412:3: ( rule__Reel__Group__0 )
            {
             before(grammarAccess.getReelAccess().getGroup()); 
            // InternalDslParser.g:413:3: ( rule__Reel__Group__0 )
            // InternalDslParser.g:413:4: rule__Reel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReel"


    // $ANTLR start "rule__Truc__Alternatives"
    // InternalDslParser.g:421:1: rule__Truc__Alternatives : ( ( ruleVariableDirect ) | ( ruleVariableCalcule ) | ( ruleAutre ) );
    public final void rule__Truc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:425:1: ( ( ruleVariableDirect ) | ( ruleVariableCalcule ) | ( ruleAutre ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case Variable:
                {
                alt1=1;
                }
                break;
            case VariableCalcule:
                {
                alt1=2;
                }
                break;
            case Autre:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDslParser.g:426:2: ( ruleVariableDirect )
                    {
                    // InternalDslParser.g:426:2: ( ruleVariableDirect )
                    // InternalDslParser.g:427:3: ruleVariableDirect
                    {
                     before(grammarAccess.getTrucAccess().getVariableDirectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDirect();

                    state._fsp--;

                     after(grammarAccess.getTrucAccess().getVariableDirectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslParser.g:432:2: ( ruleVariableCalcule )
                    {
                    // InternalDslParser.g:432:2: ( ruleVariableCalcule )
                    // InternalDslParser.g:433:3: ruleVariableCalcule
                    {
                     before(grammarAccess.getTrucAccess().getVariableCalculeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableCalcule();

                    state._fsp--;

                     after(grammarAccess.getTrucAccess().getVariableCalculeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDslParser.g:438:2: ( ruleAutre )
                    {
                    // InternalDslParser.g:438:2: ( ruleAutre )
                    // InternalDslParser.g:439:3: ruleAutre
                    {
                     before(grammarAccess.getTrucAccess().getAutreParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAutre();

                    state._fsp--;

                     after(grammarAccess.getTrucAccess().getAutreParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Truc__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // InternalDslParser.g:448:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:452:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==PlusSign) ) {
                alt2=1;
            }
            else if ( (LA2_0==HyphenMinus) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDslParser.g:453:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalDslParser.g:453:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalDslParser.g:454:3: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // InternalDslParser.g:455:3: ( rule__Addition__Group_1_0_0__0 )
                    // InternalDslParser.g:455:4: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslParser.g:459:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalDslParser.g:459:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalDslParser.g:460:3: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // InternalDslParser.g:461:3: ( rule__Addition__Group_1_0_1__0 )
                    // InternalDslParser.g:461:4: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // InternalDslParser.g:469:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:473:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Asterisk) ) {
                alt3=1;
            }
            else if ( (LA3_0==Solidus) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDslParser.g:474:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // InternalDslParser.g:474:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // InternalDslParser.g:475:3: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // InternalDslParser.g:476:3: ( rule__Multiplication__Group_1_0_0__0 )
                    // InternalDslParser.g:476:4: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslParser.g:480:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // InternalDslParser.g:480:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // InternalDslParser.g:481:3: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // InternalDslParser.g:482:3: ( rule__Multiplication__Group_1_0_1__0 )
                    // InternalDslParser.g:482:4: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalDslParser.g:490:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:494:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDslParser.g:495:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalDslParser.g:495:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalDslParser.g:496:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalDslParser.g:497:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalDslParser.g:497:4: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslParser.g:501:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalDslParser.g:501:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalDslParser.g:502:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalDslParser.g:503:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalDslParser.g:503:4: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDslParser.g:507:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalDslParser.g:507:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalDslParser.g:508:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalDslParser.g:509:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalDslParser.g:509:4: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Reel__Alternatives_1_1"
    // InternalDslParser.g:517:1: rule__Reel__Alternatives_1_1 : ( ( RULE_EXT_INT ) | ( RULE_INT ) );
    public final void rule__Reel__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:521:1: ( ( RULE_EXT_INT ) | ( RULE_INT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_EXT_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDslParser.g:522:2: ( RULE_EXT_INT )
                    {
                    // InternalDslParser.g:522:2: ( RULE_EXT_INT )
                    // InternalDslParser.g:523:3: RULE_EXT_INT
                    {
                     before(grammarAccess.getReelAccess().getEXT_INTTerminalRuleCall_1_1_0()); 
                    match(input,RULE_EXT_INT,FOLLOW_2); 
                     after(grammarAccess.getReelAccess().getEXT_INTTerminalRuleCall_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslParser.g:528:2: ( RULE_INT )
                    {
                    // InternalDslParser.g:528:2: ( RULE_INT )
                    // InternalDslParser.g:529:3: RULE_INT
                    {
                     before(grammarAccess.getReelAccess().getINTTerminalRuleCall_1_1_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getReelAccess().getINTTerminalRuleCall_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reel__Alternatives_1_1"


    // $ANTLR start "rule__Model__Group__0"
    // InternalDslParser.g:538:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:542:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDslParser.g:543:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalDslParser.g:550:1: rule__Model__Group__0__Impl : ( ( rule__Model__PackageAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:554:1: ( ( ( rule__Model__PackageAssignment_0 )? ) )
            // InternalDslParser.g:555:1: ( ( rule__Model__PackageAssignment_0 )? )
            {
            // InternalDslParser.g:555:1: ( ( rule__Model__PackageAssignment_0 )? )
            // InternalDslParser.g:556:2: ( rule__Model__PackageAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getPackageAssignment_0()); 
            // InternalDslParser.g:557:2: ( rule__Model__PackageAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==NomImport) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDslParser.g:557:3: rule__Model__PackageAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__PackageAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getPackageAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalDslParser.g:565:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:569:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDslParser.g:570:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalDslParser.g:577:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:581:1: ( ( ( rule__Model__ImportsAssignment_1 )* ) )
            // InternalDslParser.g:582:1: ( ( rule__Model__ImportsAssignment_1 )* )
            {
            // InternalDslParser.g:582:1: ( ( rule__Model__ImportsAssignment_1 )* )
            // InternalDslParser.g:583:2: ( rule__Model__ImportsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_1()); 
            // InternalDslParser.g:584:2: ( rule__Model__ImportsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Import) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDslParser.g:584:3: rule__Model__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalDslParser.g:592:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:596:1: ( rule__Model__Group__2__Impl )
            // InternalDslParser.g:597:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalDslParser.g:603:1: rule__Model__Group__2__Impl : ( ( rule__Model__VariablesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:607:1: ( ( ( rule__Model__VariablesAssignment_2 )* ) )
            // InternalDslParser.g:608:1: ( ( rule__Model__VariablesAssignment_2 )* )
            {
            // InternalDslParser.g:608:1: ( ( rule__Model__VariablesAssignment_2 )* )
            // InternalDslParser.g:609:2: ( rule__Model__VariablesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getVariablesAssignment_2()); 
            // InternalDslParser.g:610:2: ( rule__Model__VariablesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==VariableCalcule||LA8_0==Variable||LA8_0==Autre) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDslParser.g:610:3: rule__Model__VariablesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__VariablesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVariablesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // InternalDslParser.g:619:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:623:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalDslParser.g:624:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // InternalDslParser.g:631:1: rule__PackageDeclaration__Group__0__Impl : ( NomImport ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:635:1: ( ( NomImport ) )
            // InternalDslParser.g:636:1: ( NomImport )
            {
            // InternalDslParser.g:636:1: ( NomImport )
            // InternalDslParser.g:637:2: NomImport
            {
             before(grammarAccess.getPackageDeclarationAccess().getNomImportKeyword_0()); 
            match(input,NomImport,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getNomImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // InternalDslParser.g:646:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:650:1: ( rule__PackageDeclaration__Group__1__Impl )
            // InternalDslParser.g:651:2: rule__PackageDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // InternalDslParser.g:657:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:661:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalDslParser.g:662:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalDslParser.g:662:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalDslParser.g:663:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalDslParser.g:664:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalDslParser.g:664:3: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalDslParser.g:673:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:677:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDslParser.g:678:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalDslParser.g:685:1: rule__Import__Group__0__Impl : ( Import ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:689:1: ( ( Import ) )
            // InternalDslParser.g:690:1: ( Import )
            {
            // InternalDslParser.g:690:1: ( Import )
            // InternalDslParser.g:691:2: Import
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,Import,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalDslParser.g:700:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:704:1: ( rule__Import__Group__1__Impl )
            // InternalDslParser.g:705:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalDslParser.g:711:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:715:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalDslParser.g:716:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalDslParser.g:716:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalDslParser.g:717:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalDslParser.g:718:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalDslParser.g:718:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalDslParser.g:727:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:731:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalDslParser.g:732:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalDslParser.g:739:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:743:1: ( ( ruleQualifiedName ) )
            // InternalDslParser.g:744:1: ( ruleQualifiedName )
            {
            // InternalDslParser.g:744:1: ( ruleQualifiedName )
            // InternalDslParser.g:745:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalDslParser.g:754:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:758:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalDslParser.g:759:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalDslParser.g:765:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( FullStopAsterisk )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:769:1: ( ( ( FullStopAsterisk )? ) )
            // InternalDslParser.g:770:1: ( ( FullStopAsterisk )? )
            {
            // InternalDslParser.g:770:1: ( ( FullStopAsterisk )? )
            // InternalDslParser.g:771:2: ( FullStopAsterisk )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalDslParser.g:772:2: ( FullStopAsterisk )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FullStopAsterisk) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDslParser.g:772:3: FullStopAsterisk
                    {
                    match(input,FullStopAsterisk,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalDslParser.g:781:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:785:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalDslParser.g:786:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalDslParser.g:793:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:797:1: ( ( RULE_ID ) )
            // InternalDslParser.g:798:1: ( RULE_ID )
            {
            // InternalDslParser.g:798:1: ( RULE_ID )
            // InternalDslParser.g:799:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalDslParser.g:808:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:812:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalDslParser.g:813:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalDslParser.g:819:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:823:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalDslParser.g:824:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalDslParser.g:824:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalDslParser.g:825:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalDslParser.g:826:2: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==FullStop) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDslParser.g:826:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalDslParser.g:835:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:839:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalDslParser.g:840:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalDslParser.g:847:1: rule__QualifiedName__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:851:1: ( ( FullStop ) )
            // InternalDslParser.g:852:1: ( FullStop )
            {
            // InternalDslParser.g:852:1: ( FullStop )
            // InternalDslParser.g:853:2: FullStop
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalDslParser.g:862:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:866:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalDslParser.g:867:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalDslParser.g:873:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:877:1: ( ( RULE_ID ) )
            // InternalDslParser.g:878:1: ( RULE_ID )
            {
            // InternalDslParser.g:878:1: ( RULE_ID )
            // InternalDslParser.g:879:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Autre__Group__0"
    // InternalDslParser.g:889:1: rule__Autre__Group__0 : rule__Autre__Group__0__Impl rule__Autre__Group__1 ;
    public final void rule__Autre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:893:1: ( rule__Autre__Group__0__Impl rule__Autre__Group__1 )
            // InternalDslParser.g:894:2: rule__Autre__Group__0__Impl rule__Autre__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Autre__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autre__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autre__Group__0"


    // $ANTLR start "rule__Autre__Group__0__Impl"
    // InternalDslParser.g:901:1: rule__Autre__Group__0__Impl : ( Autre ) ;
    public final void rule__Autre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:905:1: ( ( Autre ) )
            // InternalDslParser.g:906:1: ( Autre )
            {
            // InternalDslParser.g:906:1: ( Autre )
            // InternalDslParser.g:907:2: Autre
            {
             before(grammarAccess.getAutreAccess().getAutreKeyword_0()); 
            match(input,Autre,FOLLOW_2); 
             after(grammarAccess.getAutreAccess().getAutreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autre__Group__0__Impl"


    // $ANTLR start "rule__Autre__Group__1"
    // InternalDslParser.g:916:1: rule__Autre__Group__1 : rule__Autre__Group__1__Impl rule__Autre__Group__2 ;
    public final void rule__Autre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:920:1: ( rule__Autre__Group__1__Impl rule__Autre__Group__2 )
            // InternalDslParser.g:921:2: rule__Autre__Group__1__Impl rule__Autre__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Autre__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autre__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autre__Group__1"


    // $ANTLR start "rule__Autre__Group__1__Impl"
    // InternalDslParser.g:928:1: rule__Autre__Group__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Autre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:932:1: ( ( RULE_BEGIN ) )
            // InternalDslParser.g:933:1: ( RULE_BEGIN )
            {
            // InternalDslParser.g:933:1: ( RULE_BEGIN )
            // InternalDslParser.g:934:2: RULE_BEGIN
            {
             before(grammarAccess.getAutreAccess().getBEGINTerminalRuleCall_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getAutreAccess().getBEGINTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autre__Group__1__Impl"


    // $ANTLR start "rule__Autre__Group__2"
    // InternalDslParser.g:943:1: rule__Autre__Group__2 : rule__Autre__Group__2__Impl rule__Autre__Group__3 ;
    public final void rule__Autre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:947:1: ( rule__Autre__Group__2__Impl rule__Autre__Group__3 )
            // InternalDslParser.g:948:2: rule__Autre__Group__2__Impl rule__Autre__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Autre__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autre__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autre__Group__2"


    // $ANTLR start "rule__Autre__Group__2__Impl"
    // InternalDslParser.g:955:1: rule__Autre__Group__2__Impl : ( Bob ) ;
    public final void rule__Autre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:959:1: ( ( Bob ) )
            // InternalDslParser.g:960:1: ( Bob )
            {
            // InternalDslParser.g:960:1: ( Bob )
            // InternalDslParser.g:961:2: Bob
            {
             before(grammarAccess.getAutreAccess().getBobKeyword_2()); 
            match(input,Bob,FOLLOW_2); 
             after(grammarAccess.getAutreAccess().getBobKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autre__Group__2__Impl"


    // $ANTLR start "rule__Autre__Group__3"
    // InternalDslParser.g:970:1: rule__Autre__Group__3 : rule__Autre__Group__3__Impl rule__Autre__Group__4 ;
    public final void rule__Autre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:974:1: ( rule__Autre__Group__3__Impl rule__Autre__Group__4 )
            // InternalDslParser.g:975:2: rule__Autre__Group__3__Impl rule__Autre__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Autre__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Autre__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autre__Group__3"


    // $ANTLR start "rule__Autre__Group__3__Impl"
    // InternalDslParser.g:982:1: rule__Autre__Group__3__Impl : ( ( rule__Autre__BobAssignment_3 ) ) ;
    public final void rule__Autre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:986:1: ( ( ( rule__Autre__BobAssignment_3 ) ) )
            // InternalDslParser.g:987:1: ( ( rule__Autre__BobAssignment_3 ) )
            {
            // InternalDslParser.g:987:1: ( ( rule__Autre__BobAssignment_3 ) )
            // InternalDslParser.g:988:2: ( rule__Autre__BobAssignment_3 )
            {
             before(grammarAccess.getAutreAccess().getBobAssignment_3()); 
            // InternalDslParser.g:989:2: ( rule__Autre__BobAssignment_3 )
            // InternalDslParser.g:989:3: rule__Autre__BobAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Autre__BobAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAutreAccess().getBobAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autre__Group__3__Impl"


    // $ANTLR start "rule__Autre__Group__4"
    // InternalDslParser.g:997:1: rule__Autre__Group__4 : rule__Autre__Group__4__Impl ;
    public final void rule__Autre__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1001:1: ( rule__Autre__Group__4__Impl )
            // InternalDslParser.g:1002:2: rule__Autre__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Autre__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autre__Group__4"


    // $ANTLR start "rule__Autre__Group__4__Impl"
    // InternalDslParser.g:1008:1: rule__Autre__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Autre__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1012:1: ( ( RULE_END ) )
            // InternalDslParser.g:1013:1: ( RULE_END )
            {
            // InternalDslParser.g:1013:1: ( RULE_END )
            // InternalDslParser.g:1014:2: RULE_END
            {
             before(grammarAccess.getAutreAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getAutreAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autre__Group__4__Impl"


    // $ANTLR start "rule__VariableDirect__Group__0"
    // InternalDslParser.g:1024:1: rule__VariableDirect__Group__0 : rule__VariableDirect__Group__0__Impl rule__VariableDirect__Group__1 ;
    public final void rule__VariableDirect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1028:1: ( rule__VariableDirect__Group__0__Impl rule__VariableDirect__Group__1 )
            // InternalDslParser.g:1029:2: rule__VariableDirect__Group__0__Impl rule__VariableDirect__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VariableDirect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__0"


    // $ANTLR start "rule__VariableDirect__Group__0__Impl"
    // InternalDslParser.g:1036:1: rule__VariableDirect__Group__0__Impl : ( Variable ) ;
    public final void rule__VariableDirect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1040:1: ( ( Variable ) )
            // InternalDslParser.g:1041:1: ( Variable )
            {
            // InternalDslParser.g:1041:1: ( Variable )
            // InternalDslParser.g:1042:2: Variable
            {
             before(grammarAccess.getVariableDirectAccess().getVariableKeyword_0()); 
            match(input,Variable,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__0__Impl"


    // $ANTLR start "rule__VariableDirect__Group__1"
    // InternalDslParser.g:1051:1: rule__VariableDirect__Group__1 : rule__VariableDirect__Group__1__Impl rule__VariableDirect__Group__2 ;
    public final void rule__VariableDirect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1055:1: ( rule__VariableDirect__Group__1__Impl rule__VariableDirect__Group__2 )
            // InternalDslParser.g:1056:2: rule__VariableDirect__Group__1__Impl rule__VariableDirect__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__VariableDirect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__1"


    // $ANTLR start "rule__VariableDirect__Group__1__Impl"
    // InternalDslParser.g:1063:1: rule__VariableDirect__Group__1__Impl : ( ( rule__VariableDirect__NameAssignment_1 ) ) ;
    public final void rule__VariableDirect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1067:1: ( ( ( rule__VariableDirect__NameAssignment_1 ) ) )
            // InternalDslParser.g:1068:1: ( ( rule__VariableDirect__NameAssignment_1 ) )
            {
            // InternalDslParser.g:1068:1: ( ( rule__VariableDirect__NameAssignment_1 ) )
            // InternalDslParser.g:1069:2: ( rule__VariableDirect__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDirectAccess().getNameAssignment_1()); 
            // InternalDslParser.g:1070:2: ( rule__VariableDirect__NameAssignment_1 )
            // InternalDslParser.g:1070:3: rule__VariableDirect__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDirect__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDirectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__1__Impl"


    // $ANTLR start "rule__VariableDirect__Group__2"
    // InternalDslParser.g:1078:1: rule__VariableDirect__Group__2 : rule__VariableDirect__Group__2__Impl rule__VariableDirect__Group__3 ;
    public final void rule__VariableDirect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1082:1: ( rule__VariableDirect__Group__2__Impl rule__VariableDirect__Group__3 )
            // InternalDslParser.g:1083:2: rule__VariableDirect__Group__2__Impl rule__VariableDirect__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__VariableDirect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__2"


    // $ANTLR start "rule__VariableDirect__Group__2__Impl"
    // InternalDslParser.g:1090:1: rule__VariableDirect__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__VariableDirect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1094:1: ( ( RULE_BEGIN ) )
            // InternalDslParser.g:1095:1: ( RULE_BEGIN )
            {
            // InternalDslParser.g:1095:1: ( RULE_BEGIN )
            // InternalDslParser.g:1096:2: RULE_BEGIN
            {
             before(grammarAccess.getVariableDirectAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__2__Impl"


    // $ANTLR start "rule__VariableDirect__Group__3"
    // InternalDslParser.g:1105:1: rule__VariableDirect__Group__3 : rule__VariableDirect__Group__3__Impl rule__VariableDirect__Group__4 ;
    public final void rule__VariableDirect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1109:1: ( rule__VariableDirect__Group__3__Impl rule__VariableDirect__Group__4 )
            // InternalDslParser.g:1110:2: rule__VariableDirect__Group__3__Impl rule__VariableDirect__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__VariableDirect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__3"


    // $ANTLR start "rule__VariableDirect__Group__3__Impl"
    // InternalDslParser.g:1117:1: rule__VariableDirect__Group__3__Impl : ( Alpha ) ;
    public final void rule__VariableDirect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1121:1: ( ( Alpha ) )
            // InternalDslParser.g:1122:1: ( Alpha )
            {
            // InternalDslParser.g:1122:1: ( Alpha )
            // InternalDslParser.g:1123:2: Alpha
            {
             before(grammarAccess.getVariableDirectAccess().getAlphaKeyword_3()); 
            match(input,Alpha,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getAlphaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__3__Impl"


    // $ANTLR start "rule__VariableDirect__Group__4"
    // InternalDslParser.g:1132:1: rule__VariableDirect__Group__4 : rule__VariableDirect__Group__4__Impl rule__VariableDirect__Group__5 ;
    public final void rule__VariableDirect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1136:1: ( rule__VariableDirect__Group__4__Impl rule__VariableDirect__Group__5 )
            // InternalDslParser.g:1137:2: rule__VariableDirect__Group__4__Impl rule__VariableDirect__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__VariableDirect__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__4"


    // $ANTLR start "rule__VariableDirect__Group__4__Impl"
    // InternalDslParser.g:1144:1: rule__VariableDirect__Group__4__Impl : ( Colon ) ;
    public final void rule__VariableDirect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1148:1: ( ( Colon ) )
            // InternalDslParser.g:1149:1: ( Colon )
            {
            // InternalDslParser.g:1149:1: ( Colon )
            // InternalDslParser.g:1150:2: Colon
            {
             before(grammarAccess.getVariableDirectAccess().getColonKeyword_4()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__4__Impl"


    // $ANTLR start "rule__VariableDirect__Group__5"
    // InternalDslParser.g:1159:1: rule__VariableDirect__Group__5 : rule__VariableDirect__Group__5__Impl rule__VariableDirect__Group__6 ;
    public final void rule__VariableDirect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1163:1: ( rule__VariableDirect__Group__5__Impl rule__VariableDirect__Group__6 )
            // InternalDslParser.g:1164:2: rule__VariableDirect__Group__5__Impl rule__VariableDirect__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__VariableDirect__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__5"


    // $ANTLR start "rule__VariableDirect__Group__5__Impl"
    // InternalDslParser.g:1171:1: rule__VariableDirect__Group__5__Impl : ( ( rule__VariableDirect__AlphaAssignment_5 ) ) ;
    public final void rule__VariableDirect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1175:1: ( ( ( rule__VariableDirect__AlphaAssignment_5 ) ) )
            // InternalDslParser.g:1176:1: ( ( rule__VariableDirect__AlphaAssignment_5 ) )
            {
            // InternalDslParser.g:1176:1: ( ( rule__VariableDirect__AlphaAssignment_5 ) )
            // InternalDslParser.g:1177:2: ( rule__VariableDirect__AlphaAssignment_5 )
            {
             before(grammarAccess.getVariableDirectAccess().getAlphaAssignment_5()); 
            // InternalDslParser.g:1178:2: ( rule__VariableDirect__AlphaAssignment_5 )
            // InternalDslParser.g:1178:3: rule__VariableDirect__AlphaAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__VariableDirect__AlphaAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVariableDirectAccess().getAlphaAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__5__Impl"


    // $ANTLR start "rule__VariableDirect__Group__6"
    // InternalDslParser.g:1186:1: rule__VariableDirect__Group__6 : rule__VariableDirect__Group__6__Impl rule__VariableDirect__Group__7 ;
    public final void rule__VariableDirect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1190:1: ( rule__VariableDirect__Group__6__Impl rule__VariableDirect__Group__7 )
            // InternalDslParser.g:1191:2: rule__VariableDirect__Group__6__Impl rule__VariableDirect__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__VariableDirect__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__6"


    // $ANTLR start "rule__VariableDirect__Group__6__Impl"
    // InternalDslParser.g:1198:1: rule__VariableDirect__Group__6__Impl : ( Beta ) ;
    public final void rule__VariableDirect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1202:1: ( ( Beta ) )
            // InternalDslParser.g:1203:1: ( Beta )
            {
            // InternalDslParser.g:1203:1: ( Beta )
            // InternalDslParser.g:1204:2: Beta
            {
             before(grammarAccess.getVariableDirectAccess().getBetaKeyword_6()); 
            match(input,Beta,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getBetaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__6__Impl"


    // $ANTLR start "rule__VariableDirect__Group__7"
    // InternalDslParser.g:1213:1: rule__VariableDirect__Group__7 : rule__VariableDirect__Group__7__Impl rule__VariableDirect__Group__8 ;
    public final void rule__VariableDirect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1217:1: ( rule__VariableDirect__Group__7__Impl rule__VariableDirect__Group__8 )
            // InternalDslParser.g:1218:2: rule__VariableDirect__Group__7__Impl rule__VariableDirect__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__VariableDirect__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__7"


    // $ANTLR start "rule__VariableDirect__Group__7__Impl"
    // InternalDslParser.g:1225:1: rule__VariableDirect__Group__7__Impl : ( Colon ) ;
    public final void rule__VariableDirect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1229:1: ( ( Colon ) )
            // InternalDslParser.g:1230:1: ( Colon )
            {
            // InternalDslParser.g:1230:1: ( Colon )
            // InternalDslParser.g:1231:2: Colon
            {
             before(grammarAccess.getVariableDirectAccess().getColonKeyword_7()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__7__Impl"


    // $ANTLR start "rule__VariableDirect__Group__8"
    // InternalDslParser.g:1240:1: rule__VariableDirect__Group__8 : rule__VariableDirect__Group__8__Impl rule__VariableDirect__Group__9 ;
    public final void rule__VariableDirect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1244:1: ( rule__VariableDirect__Group__8__Impl rule__VariableDirect__Group__9 )
            // InternalDslParser.g:1245:2: rule__VariableDirect__Group__8__Impl rule__VariableDirect__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__VariableDirect__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__8"


    // $ANTLR start "rule__VariableDirect__Group__8__Impl"
    // InternalDslParser.g:1252:1: rule__VariableDirect__Group__8__Impl : ( ( rule__VariableDirect__BetaAssignment_8 ) ) ;
    public final void rule__VariableDirect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1256:1: ( ( ( rule__VariableDirect__BetaAssignment_8 ) ) )
            // InternalDslParser.g:1257:1: ( ( rule__VariableDirect__BetaAssignment_8 ) )
            {
            // InternalDslParser.g:1257:1: ( ( rule__VariableDirect__BetaAssignment_8 ) )
            // InternalDslParser.g:1258:2: ( rule__VariableDirect__BetaAssignment_8 )
            {
             before(grammarAccess.getVariableDirectAccess().getBetaAssignment_8()); 
            // InternalDslParser.g:1259:2: ( rule__VariableDirect__BetaAssignment_8 )
            // InternalDslParser.g:1259:3: rule__VariableDirect__BetaAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__VariableDirect__BetaAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getVariableDirectAccess().getBetaAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__8__Impl"


    // $ANTLR start "rule__VariableDirect__Group__9"
    // InternalDslParser.g:1267:1: rule__VariableDirect__Group__9 : rule__VariableDirect__Group__9__Impl ;
    public final void rule__VariableDirect__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1271:1: ( rule__VariableDirect__Group__9__Impl )
            // InternalDslParser.g:1272:2: rule__VariableDirect__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__9"


    // $ANTLR start "rule__VariableDirect__Group__9__Impl"
    // InternalDslParser.g:1278:1: rule__VariableDirect__Group__9__Impl : ( RULE_END ) ;
    public final void rule__VariableDirect__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1282:1: ( ( RULE_END ) )
            // InternalDslParser.g:1283:1: ( RULE_END )
            {
            // InternalDslParser.g:1283:1: ( RULE_END )
            // InternalDslParser.g:1284:2: RULE_END
            {
             before(grammarAccess.getVariableDirectAccess().getENDTerminalRuleCall_9()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getENDTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__Group__9__Impl"


    // $ANTLR start "rule__VariableCalcule__Group__0"
    // InternalDslParser.g:1294:1: rule__VariableCalcule__Group__0 : rule__VariableCalcule__Group__0__Impl rule__VariableCalcule__Group__1 ;
    public final void rule__VariableCalcule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1298:1: ( rule__VariableCalcule__Group__0__Impl rule__VariableCalcule__Group__1 )
            // InternalDslParser.g:1299:2: rule__VariableCalcule__Group__0__Impl rule__VariableCalcule__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VariableCalcule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableCalcule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__Group__0"


    // $ANTLR start "rule__VariableCalcule__Group__0__Impl"
    // InternalDslParser.g:1306:1: rule__VariableCalcule__Group__0__Impl : ( VariableCalcule ) ;
    public final void rule__VariableCalcule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1310:1: ( ( VariableCalcule ) )
            // InternalDslParser.g:1311:1: ( VariableCalcule )
            {
            // InternalDslParser.g:1311:1: ( VariableCalcule )
            // InternalDslParser.g:1312:2: VariableCalcule
            {
             before(grammarAccess.getVariableCalculeAccess().getVariableCalculeKeyword_0()); 
            match(input,VariableCalcule,FOLLOW_2); 
             after(grammarAccess.getVariableCalculeAccess().getVariableCalculeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__Group__0__Impl"


    // $ANTLR start "rule__VariableCalcule__Group__1"
    // InternalDslParser.g:1321:1: rule__VariableCalcule__Group__1 : rule__VariableCalcule__Group__1__Impl rule__VariableCalcule__Group__2 ;
    public final void rule__VariableCalcule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1325:1: ( rule__VariableCalcule__Group__1__Impl rule__VariableCalcule__Group__2 )
            // InternalDslParser.g:1326:2: rule__VariableCalcule__Group__1__Impl rule__VariableCalcule__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__VariableCalcule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableCalcule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__Group__1"


    // $ANTLR start "rule__VariableCalcule__Group__1__Impl"
    // InternalDslParser.g:1333:1: rule__VariableCalcule__Group__1__Impl : ( ( rule__VariableCalcule__NameAssignment_1 ) ) ;
    public final void rule__VariableCalcule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1337:1: ( ( ( rule__VariableCalcule__NameAssignment_1 ) ) )
            // InternalDslParser.g:1338:1: ( ( rule__VariableCalcule__NameAssignment_1 ) )
            {
            // InternalDslParser.g:1338:1: ( ( rule__VariableCalcule__NameAssignment_1 ) )
            // InternalDslParser.g:1339:2: ( rule__VariableCalcule__NameAssignment_1 )
            {
             before(grammarAccess.getVariableCalculeAccess().getNameAssignment_1()); 
            // InternalDslParser.g:1340:2: ( rule__VariableCalcule__NameAssignment_1 )
            // InternalDslParser.g:1340:3: rule__VariableCalcule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableCalcule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableCalculeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__Group__1__Impl"


    // $ANTLR start "rule__VariableCalcule__Group__2"
    // InternalDslParser.g:1348:1: rule__VariableCalcule__Group__2 : rule__VariableCalcule__Group__2__Impl rule__VariableCalcule__Group__3 ;
    public final void rule__VariableCalcule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1352:1: ( rule__VariableCalcule__Group__2__Impl rule__VariableCalcule__Group__3 )
            // InternalDslParser.g:1353:2: rule__VariableCalcule__Group__2__Impl rule__VariableCalcule__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__VariableCalcule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableCalcule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__Group__2"


    // $ANTLR start "rule__VariableCalcule__Group__2__Impl"
    // InternalDslParser.g:1360:1: rule__VariableCalcule__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__VariableCalcule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1364:1: ( ( RULE_BEGIN ) )
            // InternalDslParser.g:1365:1: ( RULE_BEGIN )
            {
            // InternalDslParser.g:1365:1: ( RULE_BEGIN )
            // InternalDslParser.g:1366:2: RULE_BEGIN
            {
             before(grammarAccess.getVariableCalculeAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getVariableCalculeAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__Group__2__Impl"


    // $ANTLR start "rule__VariableCalcule__Group__3"
    // InternalDslParser.g:1375:1: rule__VariableCalcule__Group__3 : rule__VariableCalcule__Group__3__Impl rule__VariableCalcule__Group__4 ;
    public final void rule__VariableCalcule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1379:1: ( rule__VariableCalcule__Group__3__Impl rule__VariableCalcule__Group__4 )
            // InternalDslParser.g:1380:2: rule__VariableCalcule__Group__3__Impl rule__VariableCalcule__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__VariableCalcule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableCalcule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__Group__3"


    // $ANTLR start "rule__VariableCalcule__Group__3__Impl"
    // InternalDslParser.g:1387:1: rule__VariableCalcule__Group__3__Impl : ( ( rule__VariableCalcule__ExpressionAssignment_3 ) ) ;
    public final void rule__VariableCalcule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1391:1: ( ( ( rule__VariableCalcule__ExpressionAssignment_3 ) ) )
            // InternalDslParser.g:1392:1: ( ( rule__VariableCalcule__ExpressionAssignment_3 ) )
            {
            // InternalDslParser.g:1392:1: ( ( rule__VariableCalcule__ExpressionAssignment_3 ) )
            // InternalDslParser.g:1393:2: ( rule__VariableCalcule__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableCalculeAccess().getExpressionAssignment_3()); 
            // InternalDslParser.g:1394:2: ( rule__VariableCalcule__ExpressionAssignment_3 )
            // InternalDslParser.g:1394:3: rule__VariableCalcule__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableCalcule__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableCalculeAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__Group__3__Impl"


    // $ANTLR start "rule__VariableCalcule__Group__4"
    // InternalDslParser.g:1402:1: rule__VariableCalcule__Group__4 : rule__VariableCalcule__Group__4__Impl ;
    public final void rule__VariableCalcule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1406:1: ( rule__VariableCalcule__Group__4__Impl )
            // InternalDslParser.g:1407:2: rule__VariableCalcule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableCalcule__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__Group__4"


    // $ANTLR start "rule__VariableCalcule__Group__4__Impl"
    // InternalDslParser.g:1413:1: rule__VariableCalcule__Group__4__Impl : ( RULE_END ) ;
    public final void rule__VariableCalcule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1417:1: ( ( RULE_END ) )
            // InternalDslParser.g:1418:1: ( RULE_END )
            {
            // InternalDslParser.g:1418:1: ( RULE_END )
            // InternalDslParser.g:1419:2: RULE_END
            {
             before(grammarAccess.getVariableCalculeAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getVariableCalculeAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__Group__4__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalDslParser.g:1429:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1433:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalDslParser.g:1434:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalDslParser.g:1441:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1445:1: ( ( ruleMultiplication ) )
            // InternalDslParser.g:1446:1: ( ruleMultiplication )
            {
            // InternalDslParser.g:1446:1: ( ruleMultiplication )
            // InternalDslParser.g:1447:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalDslParser.g:1456:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1460:1: ( rule__Addition__Group__1__Impl )
            // InternalDslParser.g:1461:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalDslParser.g:1467:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1471:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalDslParser.g:1472:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalDslParser.g:1472:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalDslParser.g:1473:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalDslParser.g:1474:2: ( rule__Addition__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=PlusSign && LA11_0<=HyphenMinus)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDslParser.g:1474:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalDslParser.g:1483:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1487:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalDslParser.g:1488:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalDslParser.g:1495:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1499:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalDslParser.g:1500:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalDslParser.g:1500:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalDslParser.g:1501:2: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // InternalDslParser.g:1502:2: ( rule__Addition__Alternatives_1_0 )
            // InternalDslParser.g:1502:3: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalDslParser.g:1510:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1514:1: ( rule__Addition__Group_1__1__Impl )
            // InternalDslParser.g:1515:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalDslParser.g:1521:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1525:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalDslParser.g:1526:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalDslParser.g:1526:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalDslParser.g:1527:2: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // InternalDslParser.g:1528:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalDslParser.g:1528:3: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // InternalDslParser.g:1537:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1541:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalDslParser.g:1542:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // InternalDslParser.g:1549:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1553:1: ( ( () ) )
            // InternalDslParser.g:1554:1: ( () )
            {
            // InternalDslParser.g:1554:1: ( () )
            // InternalDslParser.g:1555:2: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalDslParser.g:1556:2: ()
            // InternalDslParser.g:1556:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // InternalDslParser.g:1564:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1568:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalDslParser.g:1569:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // InternalDslParser.g:1575:1: rule__Addition__Group_1_0_0__1__Impl : ( PlusSign ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1579:1: ( ( PlusSign ) )
            // InternalDslParser.g:1580:1: ( PlusSign )
            {
            // InternalDslParser.g:1580:1: ( PlusSign )
            // InternalDslParser.g:1581:2: PlusSign
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,PlusSign,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // InternalDslParser.g:1591:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1595:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalDslParser.g:1596:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // InternalDslParser.g:1603:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1607:1: ( ( () ) )
            // InternalDslParser.g:1608:1: ( () )
            {
            // InternalDslParser.g:1608:1: ( () )
            // InternalDslParser.g:1609:2: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalDslParser.g:1610:2: ()
            // InternalDslParser.g:1610:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // InternalDslParser.g:1618:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1622:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalDslParser.g:1623:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // InternalDslParser.g:1629:1: rule__Addition__Group_1_0_1__1__Impl : ( HyphenMinus ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1633:1: ( ( HyphenMinus ) )
            // InternalDslParser.g:1634:1: ( HyphenMinus )
            {
            // InternalDslParser.g:1634:1: ( HyphenMinus )
            // InternalDslParser.g:1635:2: HyphenMinus
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,HyphenMinus,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalDslParser.g:1645:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1649:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalDslParser.g:1650:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalDslParser.g:1657:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1661:1: ( ( rulePrimaryExpression ) )
            // InternalDslParser.g:1662:1: ( rulePrimaryExpression )
            {
            // InternalDslParser.g:1662:1: ( rulePrimaryExpression )
            // InternalDslParser.g:1663:2: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalDslParser.g:1672:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1676:1: ( rule__Multiplication__Group__1__Impl )
            // InternalDslParser.g:1677:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalDslParser.g:1683:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1687:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalDslParser.g:1688:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalDslParser.g:1688:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalDslParser.g:1689:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalDslParser.g:1690:2: ( rule__Multiplication__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Asterisk||LA12_0==Solidus) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDslParser.g:1690:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalDslParser.g:1699:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1703:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalDslParser.g:1704:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalDslParser.g:1711:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1715:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // InternalDslParser.g:1716:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // InternalDslParser.g:1716:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // InternalDslParser.g:1717:2: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // InternalDslParser.g:1718:2: ( rule__Multiplication__Alternatives_1_0 )
            // InternalDslParser.g:1718:3: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalDslParser.g:1726:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1730:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalDslParser.g:1731:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalDslParser.g:1737:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1741:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalDslParser.g:1742:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalDslParser.g:1742:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalDslParser.g:1743:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // InternalDslParser.g:1744:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalDslParser.g:1744:3: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // InternalDslParser.g:1753:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1757:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // InternalDslParser.g:1758:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // InternalDslParser.g:1765:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1769:1: ( ( () ) )
            // InternalDslParser.g:1770:1: ( () )
            {
            // InternalDslParser.g:1770:1: ( () )
            // InternalDslParser.g:1771:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // InternalDslParser.g:1772:2: ()
            // InternalDslParser.g:1772:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // InternalDslParser.g:1780:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1784:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // InternalDslParser.g:1785:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // InternalDslParser.g:1791:1: rule__Multiplication__Group_1_0_0__1__Impl : ( Asterisk ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1795:1: ( ( Asterisk ) )
            // InternalDslParser.g:1796:1: ( Asterisk )
            {
            // InternalDslParser.g:1796:1: ( Asterisk )
            // InternalDslParser.g:1797:2: Asterisk
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,Asterisk,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // InternalDslParser.g:1807:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1811:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // InternalDslParser.g:1812:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // InternalDslParser.g:1819:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1823:1: ( ( () ) )
            // InternalDslParser.g:1824:1: ( () )
            {
            // InternalDslParser.g:1824:1: ( () )
            // InternalDslParser.g:1825:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // InternalDslParser.g:1826:2: ()
            // InternalDslParser.g:1826:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // InternalDslParser.g:1834:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1838:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // InternalDslParser.g:1839:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // InternalDslParser.g:1845:1: rule__Multiplication__Group_1_0_1__1__Impl : ( Solidus ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1849:1: ( ( Solidus ) )
            // InternalDslParser.g:1850:1: ( Solidus )
            {
            // InternalDslParser.g:1850:1: ( Solidus )
            // InternalDslParser.g:1851:2: Solidus
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,Solidus,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalDslParser.g:1861:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1865:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalDslParser.g:1866:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalDslParser.g:1873:1: rule__PrimaryExpression__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1877:1: ( ( LeftParenthesis ) )
            // InternalDslParser.g:1878:1: ( LeftParenthesis )
            {
            // InternalDslParser.g:1878:1: ( LeftParenthesis )
            // InternalDslParser.g:1879:2: LeftParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalDslParser.g:1888:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1892:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalDslParser.g:1893:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_24);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalDslParser.g:1900:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1904:1: ( ( ruleExpression ) )
            // InternalDslParser.g:1905:1: ( ruleExpression )
            {
            // InternalDslParser.g:1905:1: ( ruleExpression )
            // InternalDslParser.g:1906:2: ruleExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // InternalDslParser.g:1915:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1919:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalDslParser.g:1920:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // InternalDslParser.g:1926:1: rule__PrimaryExpression__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1930:1: ( ( RightParenthesis ) )
            // InternalDslParser.g:1931:1: ( RightParenthesis )
            {
            // InternalDslParser.g:1931:1: ( RightParenthesis )
            // InternalDslParser.g:1932:2: RightParenthesis
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // InternalDslParser.g:1942:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1946:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalDslParser.g:1947:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // InternalDslParser.g:1954:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1958:1: ( ( () ) )
            // InternalDslParser.g:1959:1: ( () )
            {
            // InternalDslParser.g:1959:1: ( () )
            // InternalDslParser.g:1960:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 
            // InternalDslParser.g:1961:2: ()
            // InternalDslParser.g:1961:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // InternalDslParser.g:1969:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1973:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalDslParser.g:1974:2: rule__PrimaryExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // InternalDslParser.g:1980:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:1984:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // InternalDslParser.g:1985:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // InternalDslParser.g:1985:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // InternalDslParser.g:1986:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // InternalDslParser.g:1987:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // InternalDslParser.g:1987:3: rule__PrimaryExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalDslParser.g:1996:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2000:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalDslParser.g:2001:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // InternalDslParser.g:2008:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2012:1: ( ( () ) )
            // InternalDslParser.g:2013:1: ( () )
            {
            // InternalDslParser.g:2013:1: ( () )
            // InternalDslParser.g:2014:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getVariableExpressionAction_2_0()); 
            // InternalDslParser.g:2015:2: ()
            // InternalDslParser.g:2015:3: 
            {
            }

             after(grammarAccess.getPrimaryExpressionAccess().getVariableExpressionAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // InternalDslParser.g:2023:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2027:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // InternalDslParser.g:2028:2: rule__PrimaryExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // InternalDslParser.g:2034:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2038:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // InternalDslParser.g:2039:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // InternalDslParser.g:2039:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // InternalDslParser.g:2040:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            // InternalDslParser.g:2041:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // InternalDslParser.g:2041:3: rule__PrimaryExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__Reel__Group__0"
    // InternalDslParser.g:2050:1: rule__Reel__Group__0 : rule__Reel__Group__0__Impl rule__Reel__Group__1 ;
    public final void rule__Reel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2054:1: ( rule__Reel__Group__0__Impl rule__Reel__Group__1 )
            // InternalDslParser.g:2055:2: rule__Reel__Group__0__Impl rule__Reel__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Reel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reel__Group__0"


    // $ANTLR start "rule__Reel__Group__0__Impl"
    // InternalDslParser.g:2062:1: rule__Reel__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Reel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2066:1: ( ( RULE_INT ) )
            // InternalDslParser.g:2067:1: ( RULE_INT )
            {
            // InternalDslParser.g:2067:1: ( RULE_INT )
            // InternalDslParser.g:2068:2: RULE_INT
            {
             before(grammarAccess.getReelAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getReelAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reel__Group__0__Impl"


    // $ANTLR start "rule__Reel__Group__1"
    // InternalDslParser.g:2077:1: rule__Reel__Group__1 : rule__Reel__Group__1__Impl ;
    public final void rule__Reel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2081:1: ( rule__Reel__Group__1__Impl )
            // InternalDslParser.g:2082:2: rule__Reel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reel__Group__1"


    // $ANTLR start "rule__Reel__Group__1__Impl"
    // InternalDslParser.g:2088:1: rule__Reel__Group__1__Impl : ( ( rule__Reel__Group_1__0 )? ) ;
    public final void rule__Reel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2092:1: ( ( ( rule__Reel__Group_1__0 )? ) )
            // InternalDslParser.g:2093:1: ( ( rule__Reel__Group_1__0 )? )
            {
            // InternalDslParser.g:2093:1: ( ( rule__Reel__Group_1__0 )? )
            // InternalDslParser.g:2094:2: ( rule__Reel__Group_1__0 )?
            {
             before(grammarAccess.getReelAccess().getGroup_1()); 
            // InternalDslParser.g:2095:2: ( rule__Reel__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FullStop) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDslParser.g:2095:3: rule__Reel__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reel__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reel__Group__1__Impl"


    // $ANTLR start "rule__Reel__Group_1__0"
    // InternalDslParser.g:2104:1: rule__Reel__Group_1__0 : rule__Reel__Group_1__0__Impl rule__Reel__Group_1__1 ;
    public final void rule__Reel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2108:1: ( rule__Reel__Group_1__0__Impl rule__Reel__Group_1__1 )
            // InternalDslParser.g:2109:2: rule__Reel__Group_1__0__Impl rule__Reel__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Reel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reel__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reel__Group_1__0"


    // $ANTLR start "rule__Reel__Group_1__0__Impl"
    // InternalDslParser.g:2116:1: rule__Reel__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__Reel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2120:1: ( ( FullStop ) )
            // InternalDslParser.g:2121:1: ( FullStop )
            {
            // InternalDslParser.g:2121:1: ( FullStop )
            // InternalDslParser.g:2122:2: FullStop
            {
             before(grammarAccess.getReelAccess().getFullStopKeyword_1_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getReelAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reel__Group_1__0__Impl"


    // $ANTLR start "rule__Reel__Group_1__1"
    // InternalDslParser.g:2131:1: rule__Reel__Group_1__1 : rule__Reel__Group_1__1__Impl ;
    public final void rule__Reel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2135:1: ( rule__Reel__Group_1__1__Impl )
            // InternalDslParser.g:2136:2: rule__Reel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reel__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reel__Group_1__1"


    // $ANTLR start "rule__Reel__Group_1__1__Impl"
    // InternalDslParser.g:2142:1: rule__Reel__Group_1__1__Impl : ( ( rule__Reel__Alternatives_1_1 ) ) ;
    public final void rule__Reel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2146:1: ( ( ( rule__Reel__Alternatives_1_1 ) ) )
            // InternalDslParser.g:2147:1: ( ( rule__Reel__Alternatives_1_1 ) )
            {
            // InternalDslParser.g:2147:1: ( ( rule__Reel__Alternatives_1_1 ) )
            // InternalDslParser.g:2148:2: ( rule__Reel__Alternatives_1_1 )
            {
             before(grammarAccess.getReelAccess().getAlternatives_1_1()); 
            // InternalDslParser.g:2149:2: ( rule__Reel__Alternatives_1_1 )
            // InternalDslParser.g:2149:3: rule__Reel__Alternatives_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Reel__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getReelAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reel__Group_1__1__Impl"


    // $ANTLR start "rule__Model__PackageAssignment_0"
    // InternalDslParser.g:2158:1: rule__Model__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__Model__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2162:1: ( ( rulePackageDeclaration ) )
            // InternalDslParser.g:2163:2: ( rulePackageDeclaration )
            {
            // InternalDslParser.g:2163:2: ( rulePackageDeclaration )
            // InternalDslParser.g:2164:3: rulePackageDeclaration
            {
             before(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackageAssignment_0"


    // $ANTLR start "rule__Model__ImportsAssignment_1"
    // InternalDslParser.g:2173:1: rule__Model__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2177:1: ( ( ruleImport ) )
            // InternalDslParser.g:2178:2: ( ruleImport )
            {
            // InternalDslParser.g:2178:2: ( ruleImport )
            // InternalDslParser.g:2179:3: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_1"


    // $ANTLR start "rule__Model__VariablesAssignment_2"
    // InternalDslParser.g:2188:1: rule__Model__VariablesAssignment_2 : ( ruleTruc ) ;
    public final void rule__Model__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2192:1: ( ( ruleTruc ) )
            // InternalDslParser.g:2193:2: ( ruleTruc )
            {
            // InternalDslParser.g:2193:2: ( ruleTruc )
            // InternalDslParser.g:2194:3: ruleTruc
            {
             before(grammarAccess.getModelAccess().getVariablesTrucParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTruc();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVariablesTrucParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__VariablesAssignment_2"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // InternalDslParser.g:2203:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2207:1: ( ( ruleQualifiedName ) )
            // InternalDslParser.g:2208:2: ( ruleQualifiedName )
            {
            // InternalDslParser.g:2208:2: ( ruleQualifiedName )
            // InternalDslParser.g:2209:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalDslParser.g:2218:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2222:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalDslParser.g:2223:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalDslParser.g:2223:2: ( ruleQualifiedNameWithWildcard )
            // InternalDslParser.g:2224:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Autre__BobAssignment_3"
    // InternalDslParser.g:2233:1: rule__Autre__BobAssignment_3 : ( ruleReel ) ;
    public final void rule__Autre__BobAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2237:1: ( ( ruleReel ) )
            // InternalDslParser.g:2238:2: ( ruleReel )
            {
            // InternalDslParser.g:2238:2: ( ruleReel )
            // InternalDslParser.g:2239:3: ruleReel
            {
             before(grammarAccess.getAutreAccess().getBobReelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleReel();

            state._fsp--;

             after(grammarAccess.getAutreAccess().getBobReelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Autre__BobAssignment_3"


    // $ANTLR start "rule__VariableDirect__NameAssignment_1"
    // InternalDslParser.g:2248:1: rule__VariableDirect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDirect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2252:1: ( ( RULE_ID ) )
            // InternalDslParser.g:2253:2: ( RULE_ID )
            {
            // InternalDslParser.g:2253:2: ( RULE_ID )
            // InternalDslParser.g:2254:3: RULE_ID
            {
             before(grammarAccess.getVariableDirectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__NameAssignment_1"


    // $ANTLR start "rule__VariableDirect__AlphaAssignment_5"
    // InternalDslParser.g:2263:1: rule__VariableDirect__AlphaAssignment_5 : ( ruleReel ) ;
    public final void rule__VariableDirect__AlphaAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2267:1: ( ( ruleReel ) )
            // InternalDslParser.g:2268:2: ( ruleReel )
            {
            // InternalDslParser.g:2268:2: ( ruleReel )
            // InternalDslParser.g:2269:3: ruleReel
            {
             before(grammarAccess.getVariableDirectAccess().getAlphaReelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleReel();

            state._fsp--;

             after(grammarAccess.getVariableDirectAccess().getAlphaReelParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__AlphaAssignment_5"


    // $ANTLR start "rule__VariableDirect__BetaAssignment_8"
    // InternalDslParser.g:2278:1: rule__VariableDirect__BetaAssignment_8 : ( ruleReel ) ;
    public final void rule__VariableDirect__BetaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2282:1: ( ( ruleReel ) )
            // InternalDslParser.g:2283:2: ( ruleReel )
            {
            // InternalDslParser.g:2283:2: ( ruleReel )
            // InternalDslParser.g:2284:3: ruleReel
            {
             before(grammarAccess.getVariableDirectAccess().getBetaReelParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleReel();

            state._fsp--;

             after(grammarAccess.getVariableDirectAccess().getBetaReelParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDirect__BetaAssignment_8"


    // $ANTLR start "rule__VariableCalcule__NameAssignment_1"
    // InternalDslParser.g:2293:1: rule__VariableCalcule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableCalcule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2297:1: ( ( RULE_ID ) )
            // InternalDslParser.g:2298:2: ( RULE_ID )
            {
            // InternalDslParser.g:2298:2: ( RULE_ID )
            // InternalDslParser.g:2299:3: RULE_ID
            {
             before(grammarAccess.getVariableCalculeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableCalculeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__NameAssignment_1"


    // $ANTLR start "rule__VariableCalcule__ExpressionAssignment_3"
    // InternalDslParser.g:2308:1: rule__VariableCalcule__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__VariableCalcule__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2312:1: ( ( ruleExpression ) )
            // InternalDslParser.g:2313:2: ( ruleExpression )
            {
            // InternalDslParser.g:2313:2: ( ruleExpression )
            // InternalDslParser.g:2314:3: ruleExpression
            {
             before(grammarAccess.getVariableCalculeAccess().getExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableCalculeAccess().getExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableCalcule__ExpressionAssignment_3"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // InternalDslParser.g:2323:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2327:1: ( ( ruleMultiplication ) )
            // InternalDslParser.g:2328:2: ( ruleMultiplication )
            {
            // InternalDslParser.g:2328:2: ( ruleMultiplication )
            // InternalDslParser.g:2329:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // InternalDslParser.g:2338:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2342:1: ( ( rulePrimaryExpression ) )
            // InternalDslParser.g:2343:2: ( rulePrimaryExpression )
            {
            // InternalDslParser.g:2343:2: ( rulePrimaryExpression )
            // InternalDslParser.g:2344:3: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_1_1"
    // InternalDslParser.g:2353:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( ruleReel ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2357:1: ( ( ruleReel ) )
            // InternalDslParser.g:2358:2: ( ruleReel )
            {
            // InternalDslParser.g:2358:2: ( ruleReel )
            // InternalDslParser.g:2359:3: ruleReel
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueReelParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReel();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getValueReelParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__PrimaryExpression__ValueAssignment_2_1"
    // InternalDslParser.g:2368:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslParser.g:2372:1: ( ( ( RULE_ID ) ) )
            // InternalDslParser.g:2373:2: ( ( RULE_ID ) )
            {
            // InternalDslParser.g:2373:2: ( ( RULE_ID ) )
            // InternalDslParser.g:2374:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueVariableCrossReference_2_1_0()); 
            // InternalDslParser.g:2375:3: ( RULE_ID )
            // InternalDslParser.g:2376:4: RULE_ID
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueVariableIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getValueVariableIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getPrimaryExpressionAccess().getValueVariableCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ValueAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000002D0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000252L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002202000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000600000L});

}