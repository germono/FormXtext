package oliv.form.xtext.ide.contentassist.antlr.internal;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EXT_INT", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nomImport'", "'import'", "'.*'", "'.'", "'Autre'", "'Bob'", "'Variable'", "'Alpha'", "':'", "'Beta'", "'VariableCalcule'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_EXT_INT=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }


    	private DslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleModel EOF )
            // InternalDsl.g:55:1: ruleModel EOF
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
    // InternalDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalDsl.g:69:4: rule__Model__Group__0
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
    // InternalDsl.g:78:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( rulePackageDeclaration EOF )
            // InternalDsl.g:80:1: rulePackageDeclaration EOF
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
    // InternalDsl.g:87:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__PackageDeclaration__Group__0 )
            // InternalDsl.g:94:4: rule__PackageDeclaration__Group__0
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
    // InternalDsl.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleImport EOF )
            // InternalDsl.g:105:1: ruleImport EOF
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
    // InternalDsl.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Import__Group__0 )
            // InternalDsl.g:119:4: rule__Import__Group__0
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
    // InternalDsl.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalDsl.g:130:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalDsl.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalDsl.g:144:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalDsl.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleQualifiedName EOF )
            // InternalDsl.g:155:1: ruleQualifiedName EOF
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
    // InternalDsl.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalDsl.g:169:4: rule__QualifiedName__Group__0
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
    // InternalDsl.g:178:1: entryRuleTruc : ruleTruc EOF ;
    public final void entryRuleTruc() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleTruc EOF )
            // InternalDsl.g:180:1: ruleTruc EOF
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
    // InternalDsl.g:187:1: ruleTruc : ( ( rule__Truc__Alternatives ) ) ;
    public final void ruleTruc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Truc__Alternatives ) ) )
            // InternalDsl.g:192:2: ( ( rule__Truc__Alternatives ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Truc__Alternatives ) )
            // InternalDsl.g:193:3: ( rule__Truc__Alternatives )
            {
             before(grammarAccess.getTrucAccess().getAlternatives()); 
            // InternalDsl.g:194:3: ( rule__Truc__Alternatives )
            // InternalDsl.g:194:4: rule__Truc__Alternatives
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
    // InternalDsl.g:203:1: entryRuleAutre : ruleAutre EOF ;
    public final void entryRuleAutre() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleAutre EOF )
            // InternalDsl.g:205:1: ruleAutre EOF
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
    // InternalDsl.g:212:1: ruleAutre : ( ( rule__Autre__Group__0 ) ) ;
    public final void ruleAutre() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Autre__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Autre__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Autre__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Autre__Group__0 )
            {
             before(grammarAccess.getAutreAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Autre__Group__0 )
            // InternalDsl.g:219:4: rule__Autre__Group__0
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
    // InternalDsl.g:228:1: entryRuleVariableDirect : ruleVariableDirect EOF ;
    public final void entryRuleVariableDirect() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleVariableDirect EOF )
            // InternalDsl.g:230:1: ruleVariableDirect EOF
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
    // InternalDsl.g:237:1: ruleVariableDirect : ( ( rule__VariableDirect__Group__0 ) ) ;
    public final void ruleVariableDirect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__VariableDirect__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__VariableDirect__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__VariableDirect__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__VariableDirect__Group__0 )
            {
             before(grammarAccess.getVariableDirectAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__VariableDirect__Group__0 )
            // InternalDsl.g:244:4: rule__VariableDirect__Group__0
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
    // InternalDsl.g:253:1: entryRuleVariableCalcule : ruleVariableCalcule EOF ;
    public final void entryRuleVariableCalcule() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleVariableCalcule EOF )
            // InternalDsl.g:255:1: ruleVariableCalcule EOF
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
    // InternalDsl.g:262:1: ruleVariableCalcule : ( ( rule__VariableCalcule__Group__0 ) ) ;
    public final void ruleVariableCalcule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__VariableCalcule__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__VariableCalcule__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__VariableCalcule__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__VariableCalcule__Group__0 )
            {
             before(grammarAccess.getVariableCalculeAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__VariableCalcule__Group__0 )
            // InternalDsl.g:269:4: rule__VariableCalcule__Group__0
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
    // InternalDsl.g:278:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleExpression EOF )
            // InternalDsl.g:280:1: ruleExpression EOF
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
    // InternalDsl.g:287:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ruleAddition ) )
            // InternalDsl.g:292:2: ( ruleAddition )
            {
            // InternalDsl.g:292:2: ( ruleAddition )
            // InternalDsl.g:293:3: ruleAddition
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
    // InternalDsl.g:303:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleAddition EOF )
            // InternalDsl.g:305:1: ruleAddition EOF
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
    // InternalDsl.g:312:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Addition__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__Addition__Group__0 )
            // InternalDsl.g:319:4: rule__Addition__Group__0
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
    // InternalDsl.g:328:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleMultiplication EOF )
            // InternalDsl.g:330:1: ruleMultiplication EOF
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
    // InternalDsl.g:337:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalDsl.g:342:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalDsl.g:343:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalDsl.g:344:3: ( rule__Multiplication__Group__0 )
            // InternalDsl.g:344:4: rule__Multiplication__Group__0
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
    // InternalDsl.g:353:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( rulePrimaryExpression EOF )
            // InternalDsl.g:355:1: rulePrimaryExpression EOF
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
    // InternalDsl.g:362:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalDsl.g:367:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalDsl.g:367:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalDsl.g:368:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalDsl.g:369:3: ( rule__PrimaryExpression__Alternatives )
            // InternalDsl.g:369:4: rule__PrimaryExpression__Alternatives
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
    // InternalDsl.g:378:1: entryRuleReel : ruleReel EOF ;
    public final void entryRuleReel() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleReel EOF )
            // InternalDsl.g:380:1: ruleReel EOF
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
    // InternalDsl.g:387:1: ruleReel : ( ( rule__Reel__Group__0 ) ) ;
    public final void ruleReel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__Reel__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__Reel__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__Reel__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__Reel__Group__0 )
            {
             before(grammarAccess.getReelAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__Reel__Group__0 )
            // InternalDsl.g:394:4: rule__Reel__Group__0
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
    // InternalDsl.g:402:1: rule__Truc__Alternatives : ( ( ruleVariableDirect ) | ( ruleVariableCalcule ) | ( ruleAutre ) );
    public final void rule__Truc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:406:1: ( ( ruleVariableDirect ) | ( ruleVariableCalcule ) | ( ruleAutre ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 16:
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
                    // InternalDsl.g:407:2: ( ruleVariableDirect )
                    {
                    // InternalDsl.g:407:2: ( ruleVariableDirect )
                    // InternalDsl.g:408:3: ruleVariableDirect
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
                    // InternalDsl.g:413:2: ( ruleVariableCalcule )
                    {
                    // InternalDsl.g:413:2: ( ruleVariableCalcule )
                    // InternalDsl.g:414:3: ruleVariableCalcule
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
                    // InternalDsl.g:419:2: ( ruleAutre )
                    {
                    // InternalDsl.g:419:2: ( ruleAutre )
                    // InternalDsl.g:420:3: ruleAutre
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
    // InternalDsl.g:429:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:433:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:434:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalDsl.g:434:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalDsl.g:435:3: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // InternalDsl.g:436:3: ( rule__Addition__Group_1_0_0__0 )
                    // InternalDsl.g:436:4: rule__Addition__Group_1_0_0__0
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
                    // InternalDsl.g:440:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalDsl.g:440:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalDsl.g:441:3: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // InternalDsl.g:442:3: ( rule__Addition__Group_1_0_1__0 )
                    // InternalDsl.g:442:4: rule__Addition__Group_1_0_1__0
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
    // InternalDsl.g:450:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:454:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:455:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // InternalDsl.g:455:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // InternalDsl.g:456:3: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // InternalDsl.g:457:3: ( rule__Multiplication__Group_1_0_0__0 )
                    // InternalDsl.g:457:4: rule__Multiplication__Group_1_0_0__0
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
                    // InternalDsl.g:461:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // InternalDsl.g:461:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // InternalDsl.g:462:3: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // InternalDsl.g:463:3: ( rule__Multiplication__Group_1_0_1__0 )
                    // InternalDsl.g:463:4: rule__Multiplication__Group_1_0_1__0
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
    // InternalDsl.g:471:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:475:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 27:
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
                    // InternalDsl.g:476:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalDsl.g:476:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalDsl.g:477:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalDsl.g:478:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalDsl.g:478:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalDsl.g:482:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalDsl.g:482:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalDsl.g:483:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalDsl.g:484:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalDsl.g:484:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalDsl.g:488:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalDsl.g:488:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalDsl.g:489:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalDsl.g:490:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalDsl.g:490:4: rule__PrimaryExpression__Group_2__0
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
    // InternalDsl.g:498:1: rule__Reel__Alternatives_1_1 : ( ( RULE_EXT_INT ) | ( RULE_INT ) );
    public final void rule__Reel__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:502:1: ( ( RULE_EXT_INT ) | ( RULE_INT ) )
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
                    // InternalDsl.g:503:2: ( RULE_EXT_INT )
                    {
                    // InternalDsl.g:503:2: ( RULE_EXT_INT )
                    // InternalDsl.g:504:3: RULE_EXT_INT
                    {
                     before(grammarAccess.getReelAccess().getEXT_INTTerminalRuleCall_1_1_0()); 
                    match(input,RULE_EXT_INT,FOLLOW_2); 
                     after(grammarAccess.getReelAccess().getEXT_INTTerminalRuleCall_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:509:2: ( RULE_INT )
                    {
                    // InternalDsl.g:509:2: ( RULE_INT )
                    // InternalDsl.g:510:3: RULE_INT
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
    // InternalDsl.g:519:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:523:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalDsl.g:524:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalDsl.g:531:1: rule__Model__Group__0__Impl : ( ( rule__Model__PackageAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:535:1: ( ( ( rule__Model__PackageAssignment_0 )? ) )
            // InternalDsl.g:536:1: ( ( rule__Model__PackageAssignment_0 )? )
            {
            // InternalDsl.g:536:1: ( ( rule__Model__PackageAssignment_0 )? )
            // InternalDsl.g:537:2: ( rule__Model__PackageAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getPackageAssignment_0()); 
            // InternalDsl.g:538:2: ( rule__Model__PackageAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:538:3: rule__Model__PackageAssignment_0
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
    // InternalDsl.g:546:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:550:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalDsl.g:551:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalDsl.g:558:1: rule__Model__Group__1__Impl : ( ( rule__Model__ImportsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:562:1: ( ( ( rule__Model__ImportsAssignment_1 )* ) )
            // InternalDsl.g:563:1: ( ( rule__Model__ImportsAssignment_1 )* )
            {
            // InternalDsl.g:563:1: ( ( rule__Model__ImportsAssignment_1 )* )
            // InternalDsl.g:564:2: ( rule__Model__ImportsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_1()); 
            // InternalDsl.g:565:2: ( rule__Model__ImportsAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==13) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:565:3: rule__Model__ImportsAssignment_1
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
    // InternalDsl.g:573:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:577:1: ( rule__Model__Group__2__Impl )
            // InternalDsl.g:578:2: rule__Model__Group__2__Impl
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
    // InternalDsl.g:584:1: rule__Model__Group__2__Impl : ( ( rule__Model__VariablesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:588:1: ( ( ( rule__Model__VariablesAssignment_2 )* ) )
            // InternalDsl.g:589:1: ( ( rule__Model__VariablesAssignment_2 )* )
            {
            // InternalDsl.g:589:1: ( ( rule__Model__VariablesAssignment_2 )* )
            // InternalDsl.g:590:2: ( rule__Model__VariablesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getVariablesAssignment_2()); 
            // InternalDsl.g:591:2: ( rule__Model__VariablesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16||LA8_0==18||LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:591:3: rule__Model__VariablesAssignment_2
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
    // InternalDsl.g:600:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:604:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalDsl.g:605:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
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
    // InternalDsl.g:612:1: rule__PackageDeclaration__Group__0__Impl : ( 'nomImport' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:616:1: ( ( 'nomImport' ) )
            // InternalDsl.g:617:1: ( 'nomImport' )
            {
            // InternalDsl.g:617:1: ( 'nomImport' )
            // InternalDsl.g:618:2: 'nomImport'
            {
             before(grammarAccess.getPackageDeclarationAccess().getNomImportKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDsl.g:627:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:631:1: ( rule__PackageDeclaration__Group__1__Impl )
            // InternalDsl.g:632:2: rule__PackageDeclaration__Group__1__Impl
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
    // InternalDsl.g:638:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:642:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalDsl.g:643:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalDsl.g:643:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalDsl.g:644:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalDsl.g:645:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalDsl.g:645:3: rule__PackageDeclaration__NameAssignment_1
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
    // InternalDsl.g:654:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:658:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDsl.g:659:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalDsl.g:666:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:670:1: ( ( 'import' ) )
            // InternalDsl.g:671:1: ( 'import' )
            {
            // InternalDsl.g:671:1: ( 'import' )
            // InternalDsl.g:672:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalDsl.g:681:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:685:1: ( rule__Import__Group__1__Impl )
            // InternalDsl.g:686:2: rule__Import__Group__1__Impl
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
    // InternalDsl.g:692:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:696:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalDsl.g:697:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalDsl.g:697:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalDsl.g:698:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalDsl.g:699:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalDsl.g:699:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalDsl.g:708:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:712:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalDsl.g:713:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalDsl.g:720:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:724:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:725:1: ( ruleQualifiedName )
            {
            // InternalDsl.g:725:1: ( ruleQualifiedName )
            // InternalDsl.g:726:2: ruleQualifiedName
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
    // InternalDsl.g:735:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:739:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalDsl.g:740:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalDsl.g:746:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:750:1: ( ( ( '.*' )? ) )
            // InternalDsl.g:751:1: ( ( '.*' )? )
            {
            // InternalDsl.g:751:1: ( ( '.*' )? )
            // InternalDsl.g:752:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalDsl.g:753:2: ( '.*' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:753:3: '.*'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalDsl.g:762:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:766:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalDsl.g:767:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalDsl.g:774:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:778:1: ( ( RULE_ID ) )
            // InternalDsl.g:779:1: ( RULE_ID )
            {
            // InternalDsl.g:779:1: ( RULE_ID )
            // InternalDsl.g:780:2: RULE_ID
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
    // InternalDsl.g:789:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:793:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalDsl.g:794:2: rule__QualifiedName__Group__1__Impl
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
    // InternalDsl.g:800:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:804:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalDsl.g:805:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalDsl.g:805:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalDsl.g:806:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalDsl.g:807:2: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:807:3: rule__QualifiedName__Group_1__0
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
    // InternalDsl.g:816:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:820:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalDsl.g:821:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalDsl.g:828:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:832:1: ( ( '.' ) )
            // InternalDsl.g:833:1: ( '.' )
            {
            // InternalDsl.g:833:1: ( '.' )
            // InternalDsl.g:834:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDsl.g:843:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:847:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalDsl.g:848:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalDsl.g:854:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:858:1: ( ( RULE_ID ) )
            // InternalDsl.g:859:1: ( RULE_ID )
            {
            // InternalDsl.g:859:1: ( RULE_ID )
            // InternalDsl.g:860:2: RULE_ID
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
    // InternalDsl.g:870:1: rule__Autre__Group__0 : rule__Autre__Group__0__Impl rule__Autre__Group__1 ;
    public final void rule__Autre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:874:1: ( rule__Autre__Group__0__Impl rule__Autre__Group__1 )
            // InternalDsl.g:875:2: rule__Autre__Group__0__Impl rule__Autre__Group__1
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
    // InternalDsl.g:882:1: rule__Autre__Group__0__Impl : ( 'Autre' ) ;
    public final void rule__Autre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:886:1: ( ( 'Autre' ) )
            // InternalDsl.g:887:1: ( 'Autre' )
            {
            // InternalDsl.g:887:1: ( 'Autre' )
            // InternalDsl.g:888:2: 'Autre'
            {
             before(grammarAccess.getAutreAccess().getAutreKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:897:1: rule__Autre__Group__1 : rule__Autre__Group__1__Impl rule__Autre__Group__2 ;
    public final void rule__Autre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:901:1: ( rule__Autre__Group__1__Impl rule__Autre__Group__2 )
            // InternalDsl.g:902:2: rule__Autre__Group__1__Impl rule__Autre__Group__2
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
    // InternalDsl.g:909:1: rule__Autre__Group__1__Impl : ( 'Bob' ) ;
    public final void rule__Autre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:913:1: ( ( 'Bob' ) )
            // InternalDsl.g:914:1: ( 'Bob' )
            {
            // InternalDsl.g:914:1: ( 'Bob' )
            // InternalDsl.g:915:2: 'Bob'
            {
             before(grammarAccess.getAutreAccess().getBobKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAutreAccess().getBobKeyword_1()); 

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
    // InternalDsl.g:924:1: rule__Autre__Group__2 : rule__Autre__Group__2__Impl ;
    public final void rule__Autre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:928:1: ( rule__Autre__Group__2__Impl )
            // InternalDsl.g:929:2: rule__Autre__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Autre__Group__2__Impl();

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
    // InternalDsl.g:935:1: rule__Autre__Group__2__Impl : ( ( rule__Autre__BobAssignment_2 ) ) ;
    public final void rule__Autre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:939:1: ( ( ( rule__Autre__BobAssignment_2 ) ) )
            // InternalDsl.g:940:1: ( ( rule__Autre__BobAssignment_2 ) )
            {
            // InternalDsl.g:940:1: ( ( rule__Autre__BobAssignment_2 ) )
            // InternalDsl.g:941:2: ( rule__Autre__BobAssignment_2 )
            {
             before(grammarAccess.getAutreAccess().getBobAssignment_2()); 
            // InternalDsl.g:942:2: ( rule__Autre__BobAssignment_2 )
            // InternalDsl.g:942:3: rule__Autre__BobAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Autre__BobAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAutreAccess().getBobAssignment_2()); 

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


    // $ANTLR start "rule__VariableDirect__Group__0"
    // InternalDsl.g:951:1: rule__VariableDirect__Group__0 : rule__VariableDirect__Group__0__Impl rule__VariableDirect__Group__1 ;
    public final void rule__VariableDirect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:955:1: ( rule__VariableDirect__Group__0__Impl rule__VariableDirect__Group__1 )
            // InternalDsl.g:956:2: rule__VariableDirect__Group__0__Impl rule__VariableDirect__Group__1
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
    // InternalDsl.g:963:1: rule__VariableDirect__Group__0__Impl : ( 'Variable' ) ;
    public final void rule__VariableDirect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:967:1: ( ( 'Variable' ) )
            // InternalDsl.g:968:1: ( 'Variable' )
            {
            // InternalDsl.g:968:1: ( 'Variable' )
            // InternalDsl.g:969:2: 'Variable'
            {
             before(grammarAccess.getVariableDirectAccess().getVariableKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDsl.g:978:1: rule__VariableDirect__Group__1 : rule__VariableDirect__Group__1__Impl rule__VariableDirect__Group__2 ;
    public final void rule__VariableDirect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:982:1: ( rule__VariableDirect__Group__1__Impl rule__VariableDirect__Group__2 )
            // InternalDsl.g:983:2: rule__VariableDirect__Group__1__Impl rule__VariableDirect__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:990:1: rule__VariableDirect__Group__1__Impl : ( ( rule__VariableDirect__NameAssignment_1 ) ) ;
    public final void rule__VariableDirect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:994:1: ( ( ( rule__VariableDirect__NameAssignment_1 ) ) )
            // InternalDsl.g:995:1: ( ( rule__VariableDirect__NameAssignment_1 ) )
            {
            // InternalDsl.g:995:1: ( ( rule__VariableDirect__NameAssignment_1 ) )
            // InternalDsl.g:996:2: ( rule__VariableDirect__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDirectAccess().getNameAssignment_1()); 
            // InternalDsl.g:997:2: ( rule__VariableDirect__NameAssignment_1 )
            // InternalDsl.g:997:3: rule__VariableDirect__NameAssignment_1
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
    // InternalDsl.g:1005:1: rule__VariableDirect__Group__2 : rule__VariableDirect__Group__2__Impl rule__VariableDirect__Group__3 ;
    public final void rule__VariableDirect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1009:1: ( rule__VariableDirect__Group__2__Impl rule__VariableDirect__Group__3 )
            // InternalDsl.g:1010:2: rule__VariableDirect__Group__2__Impl rule__VariableDirect__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:1017:1: rule__VariableDirect__Group__2__Impl : ( 'Alpha' ) ;
    public final void rule__VariableDirect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1021:1: ( ( 'Alpha' ) )
            // InternalDsl.g:1022:1: ( 'Alpha' )
            {
            // InternalDsl.g:1022:1: ( 'Alpha' )
            // InternalDsl.g:1023:2: 'Alpha'
            {
             before(grammarAccess.getVariableDirectAccess().getAlphaKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getAlphaKeyword_2()); 

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
    // InternalDsl.g:1032:1: rule__VariableDirect__Group__3 : rule__VariableDirect__Group__3__Impl rule__VariableDirect__Group__4 ;
    public final void rule__VariableDirect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1036:1: ( rule__VariableDirect__Group__3__Impl rule__VariableDirect__Group__4 )
            // InternalDsl.g:1037:2: rule__VariableDirect__Group__3__Impl rule__VariableDirect__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:1044:1: rule__VariableDirect__Group__3__Impl : ( ':' ) ;
    public final void rule__VariableDirect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1048:1: ( ( ':' ) )
            // InternalDsl.g:1049:1: ( ':' )
            {
            // InternalDsl.g:1049:1: ( ':' )
            // InternalDsl.g:1050:2: ':'
            {
             before(grammarAccess.getVariableDirectAccess().getColonKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getColonKeyword_3()); 

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
    // InternalDsl.g:1059:1: rule__VariableDirect__Group__4 : rule__VariableDirect__Group__4__Impl rule__VariableDirect__Group__5 ;
    public final void rule__VariableDirect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1063:1: ( rule__VariableDirect__Group__4__Impl rule__VariableDirect__Group__5 )
            // InternalDsl.g:1064:2: rule__VariableDirect__Group__4__Impl rule__VariableDirect__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:1071:1: rule__VariableDirect__Group__4__Impl : ( ( rule__VariableDirect__AlphaAssignment_4 ) ) ;
    public final void rule__VariableDirect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1075:1: ( ( ( rule__VariableDirect__AlphaAssignment_4 ) ) )
            // InternalDsl.g:1076:1: ( ( rule__VariableDirect__AlphaAssignment_4 ) )
            {
            // InternalDsl.g:1076:1: ( ( rule__VariableDirect__AlphaAssignment_4 ) )
            // InternalDsl.g:1077:2: ( rule__VariableDirect__AlphaAssignment_4 )
            {
             before(grammarAccess.getVariableDirectAccess().getAlphaAssignment_4()); 
            // InternalDsl.g:1078:2: ( rule__VariableDirect__AlphaAssignment_4 )
            // InternalDsl.g:1078:3: rule__VariableDirect__AlphaAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VariableDirect__AlphaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVariableDirectAccess().getAlphaAssignment_4()); 

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
    // InternalDsl.g:1086:1: rule__VariableDirect__Group__5 : rule__VariableDirect__Group__5__Impl rule__VariableDirect__Group__6 ;
    public final void rule__VariableDirect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1090:1: ( rule__VariableDirect__Group__5__Impl rule__VariableDirect__Group__6 )
            // InternalDsl.g:1091:2: rule__VariableDirect__Group__5__Impl rule__VariableDirect__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:1098:1: rule__VariableDirect__Group__5__Impl : ( 'Beta' ) ;
    public final void rule__VariableDirect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1102:1: ( ( 'Beta' ) )
            // InternalDsl.g:1103:1: ( 'Beta' )
            {
            // InternalDsl.g:1103:1: ( 'Beta' )
            // InternalDsl.g:1104:2: 'Beta'
            {
             before(grammarAccess.getVariableDirectAccess().getBetaKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getBetaKeyword_5()); 

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
    // InternalDsl.g:1113:1: rule__VariableDirect__Group__6 : rule__VariableDirect__Group__6__Impl rule__VariableDirect__Group__7 ;
    public final void rule__VariableDirect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1117:1: ( rule__VariableDirect__Group__6__Impl rule__VariableDirect__Group__7 )
            // InternalDsl.g:1118:2: rule__VariableDirect__Group__6__Impl rule__VariableDirect__Group__7
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:1125:1: rule__VariableDirect__Group__6__Impl : ( ':' ) ;
    public final void rule__VariableDirect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1129:1: ( ( ':' ) )
            // InternalDsl.g:1130:1: ( ':' )
            {
            // InternalDsl.g:1130:1: ( ':' )
            // InternalDsl.g:1131:2: ':'
            {
             before(grammarAccess.getVariableDirectAccess().getColonKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getColonKeyword_6()); 

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
    // InternalDsl.g:1140:1: rule__VariableDirect__Group__7 : rule__VariableDirect__Group__7__Impl ;
    public final void rule__VariableDirect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1144:1: ( rule__VariableDirect__Group__7__Impl )
            // InternalDsl.g:1145:2: rule__VariableDirect__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDirect__Group__7__Impl();

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
    // InternalDsl.g:1151:1: rule__VariableDirect__Group__7__Impl : ( ( rule__VariableDirect__BetaAssignment_7 ) ) ;
    public final void rule__VariableDirect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1155:1: ( ( ( rule__VariableDirect__BetaAssignment_7 ) ) )
            // InternalDsl.g:1156:1: ( ( rule__VariableDirect__BetaAssignment_7 ) )
            {
            // InternalDsl.g:1156:1: ( ( rule__VariableDirect__BetaAssignment_7 ) )
            // InternalDsl.g:1157:2: ( rule__VariableDirect__BetaAssignment_7 )
            {
             before(grammarAccess.getVariableDirectAccess().getBetaAssignment_7()); 
            // InternalDsl.g:1158:2: ( rule__VariableDirect__BetaAssignment_7 )
            // InternalDsl.g:1158:3: rule__VariableDirect__BetaAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__VariableDirect__BetaAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getVariableDirectAccess().getBetaAssignment_7()); 

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


    // $ANTLR start "rule__VariableCalcule__Group__0"
    // InternalDsl.g:1167:1: rule__VariableCalcule__Group__0 : rule__VariableCalcule__Group__0__Impl rule__VariableCalcule__Group__1 ;
    public final void rule__VariableCalcule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1171:1: ( rule__VariableCalcule__Group__0__Impl rule__VariableCalcule__Group__1 )
            // InternalDsl.g:1172:2: rule__VariableCalcule__Group__0__Impl rule__VariableCalcule__Group__1
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
    // InternalDsl.g:1179:1: rule__VariableCalcule__Group__0__Impl : ( 'VariableCalcule' ) ;
    public final void rule__VariableCalcule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1183:1: ( ( 'VariableCalcule' ) )
            // InternalDsl.g:1184:1: ( 'VariableCalcule' )
            {
            // InternalDsl.g:1184:1: ( 'VariableCalcule' )
            // InternalDsl.g:1185:2: 'VariableCalcule'
            {
             before(grammarAccess.getVariableCalculeAccess().getVariableCalculeKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDsl.g:1194:1: rule__VariableCalcule__Group__1 : rule__VariableCalcule__Group__1__Impl rule__VariableCalcule__Group__2 ;
    public final void rule__VariableCalcule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1198:1: ( rule__VariableCalcule__Group__1__Impl rule__VariableCalcule__Group__2 )
            // InternalDsl.g:1199:2: rule__VariableCalcule__Group__1__Impl rule__VariableCalcule__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1206:1: rule__VariableCalcule__Group__1__Impl : ( ( rule__VariableCalcule__NameAssignment_1 ) ) ;
    public final void rule__VariableCalcule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1210:1: ( ( ( rule__VariableCalcule__NameAssignment_1 ) ) )
            // InternalDsl.g:1211:1: ( ( rule__VariableCalcule__NameAssignment_1 ) )
            {
            // InternalDsl.g:1211:1: ( ( rule__VariableCalcule__NameAssignment_1 ) )
            // InternalDsl.g:1212:2: ( rule__VariableCalcule__NameAssignment_1 )
            {
             before(grammarAccess.getVariableCalculeAccess().getNameAssignment_1()); 
            // InternalDsl.g:1213:2: ( rule__VariableCalcule__NameAssignment_1 )
            // InternalDsl.g:1213:3: rule__VariableCalcule__NameAssignment_1
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
    // InternalDsl.g:1221:1: rule__VariableCalcule__Group__2 : rule__VariableCalcule__Group__2__Impl rule__VariableCalcule__Group__3 ;
    public final void rule__VariableCalcule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1225:1: ( rule__VariableCalcule__Group__2__Impl rule__VariableCalcule__Group__3 )
            // InternalDsl.g:1226:2: rule__VariableCalcule__Group__2__Impl rule__VariableCalcule__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1233:1: rule__VariableCalcule__Group__2__Impl : ( ( rule__VariableCalcule__ExpressionAssignment_2 ) ) ;
    public final void rule__VariableCalcule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1237:1: ( ( ( rule__VariableCalcule__ExpressionAssignment_2 ) ) )
            // InternalDsl.g:1238:1: ( ( rule__VariableCalcule__ExpressionAssignment_2 ) )
            {
            // InternalDsl.g:1238:1: ( ( rule__VariableCalcule__ExpressionAssignment_2 ) )
            // InternalDsl.g:1239:2: ( rule__VariableCalcule__ExpressionAssignment_2 )
            {
             before(grammarAccess.getVariableCalculeAccess().getExpressionAssignment_2()); 
            // InternalDsl.g:1240:2: ( rule__VariableCalcule__ExpressionAssignment_2 )
            // InternalDsl.g:1240:3: rule__VariableCalcule__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableCalcule__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableCalculeAccess().getExpressionAssignment_2()); 

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
    // InternalDsl.g:1248:1: rule__VariableCalcule__Group__3 : rule__VariableCalcule__Group__3__Impl ;
    public final void rule__VariableCalcule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1252:1: ( rule__VariableCalcule__Group__3__Impl )
            // InternalDsl.g:1253:2: rule__VariableCalcule__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableCalcule__Group__3__Impl();

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
    // InternalDsl.g:1259:1: rule__VariableCalcule__Group__3__Impl : ( ( rule__VariableCalcule__Expression2Assignment_3 ) ) ;
    public final void rule__VariableCalcule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1263:1: ( ( ( rule__VariableCalcule__Expression2Assignment_3 ) ) )
            // InternalDsl.g:1264:1: ( ( rule__VariableCalcule__Expression2Assignment_3 ) )
            {
            // InternalDsl.g:1264:1: ( ( rule__VariableCalcule__Expression2Assignment_3 ) )
            // InternalDsl.g:1265:2: ( rule__VariableCalcule__Expression2Assignment_3 )
            {
             before(grammarAccess.getVariableCalculeAccess().getExpression2Assignment_3()); 
            // InternalDsl.g:1266:2: ( rule__VariableCalcule__Expression2Assignment_3 )
            // InternalDsl.g:1266:3: rule__VariableCalcule__Expression2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableCalcule__Expression2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableCalculeAccess().getExpression2Assignment_3()); 

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


    // $ANTLR start "rule__Addition__Group__0"
    // InternalDsl.g:1275:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1279:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalDsl.g:1280:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:1287:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1291:1: ( ( ruleMultiplication ) )
            // InternalDsl.g:1292:1: ( ruleMultiplication )
            {
            // InternalDsl.g:1292:1: ( ruleMultiplication )
            // InternalDsl.g:1293:2: ruleMultiplication
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
    // InternalDsl.g:1302:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1306:1: ( rule__Addition__Group__1__Impl )
            // InternalDsl.g:1307:2: rule__Addition__Group__1__Impl
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
    // InternalDsl.g:1313:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1317:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalDsl.g:1318:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalDsl.g:1318:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalDsl.g:1319:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalDsl.g:1320:2: ( rule__Addition__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=23 && LA11_0<=24)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1320:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalDsl.g:1329:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1333:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalDsl.g:1334:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1341:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1345:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalDsl.g:1346:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalDsl.g:1346:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalDsl.g:1347:2: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // InternalDsl.g:1348:2: ( rule__Addition__Alternatives_1_0 )
            // InternalDsl.g:1348:3: rule__Addition__Alternatives_1_0
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
    // InternalDsl.g:1356:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1360:1: ( rule__Addition__Group_1__1__Impl )
            // InternalDsl.g:1361:2: rule__Addition__Group_1__1__Impl
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
    // InternalDsl.g:1367:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1371:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalDsl.g:1372:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalDsl.g:1372:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalDsl.g:1373:2: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // InternalDsl.g:1374:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalDsl.g:1374:3: rule__Addition__RightAssignment_1_1
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
    // InternalDsl.g:1383:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1387:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalDsl.g:1388:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDsl.g:1395:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1399:1: ( ( () ) )
            // InternalDsl.g:1400:1: ( () )
            {
            // InternalDsl.g:1400:1: ( () )
            // InternalDsl.g:1401:2: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalDsl.g:1402:2: ()
            // InternalDsl.g:1402:3: 
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
    // InternalDsl.g:1410:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1414:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalDsl.g:1415:2: rule__Addition__Group_1_0_0__1__Impl
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
    // InternalDsl.g:1421:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1425:1: ( ( '+' ) )
            // InternalDsl.g:1426:1: ( '+' )
            {
            // InternalDsl.g:1426:1: ( '+' )
            // InternalDsl.g:1427:2: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDsl.g:1437:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1441:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalDsl.g:1442:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:1449:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1453:1: ( ( () ) )
            // InternalDsl.g:1454:1: ( () )
            {
            // InternalDsl.g:1454:1: ( () )
            // InternalDsl.g:1455:2: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalDsl.g:1456:2: ()
            // InternalDsl.g:1456:3: 
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
    // InternalDsl.g:1464:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1468:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalDsl.g:1469:2: rule__Addition__Group_1_0_1__1__Impl
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
    // InternalDsl.g:1475:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1479:1: ( ( '-' ) )
            // InternalDsl.g:1480:1: ( '-' )
            {
            // InternalDsl.g:1480:1: ( '-' )
            // InternalDsl.g:1481:2: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDsl.g:1491:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1495:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalDsl.g:1496:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:1503:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1507:1: ( ( rulePrimaryExpression ) )
            // InternalDsl.g:1508:1: ( rulePrimaryExpression )
            {
            // InternalDsl.g:1508:1: ( rulePrimaryExpression )
            // InternalDsl.g:1509:2: rulePrimaryExpression
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
    // InternalDsl.g:1518:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1522:1: ( rule__Multiplication__Group__1__Impl )
            // InternalDsl.g:1523:2: rule__Multiplication__Group__1__Impl
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
    // InternalDsl.g:1529:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1533:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalDsl.g:1534:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalDsl.g:1534:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalDsl.g:1535:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalDsl.g:1536:2: ( rule__Multiplication__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=25 && LA12_0<=26)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:1536:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalDsl.g:1545:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1549:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalDsl.g:1550:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1557:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1561:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // InternalDsl.g:1562:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // InternalDsl.g:1562:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // InternalDsl.g:1563:2: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // InternalDsl.g:1564:2: ( rule__Multiplication__Alternatives_1_0 )
            // InternalDsl.g:1564:3: rule__Multiplication__Alternatives_1_0
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
    // InternalDsl.g:1572:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1576:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalDsl.g:1577:2: rule__Multiplication__Group_1__1__Impl
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
    // InternalDsl.g:1583:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1587:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalDsl.g:1588:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalDsl.g:1588:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalDsl.g:1589:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // InternalDsl.g:1590:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalDsl.g:1590:3: rule__Multiplication__RightAssignment_1_1
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
    // InternalDsl.g:1599:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1603:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // InternalDsl.g:1604:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDsl.g:1611:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1615:1: ( ( () ) )
            // InternalDsl.g:1616:1: ( () )
            {
            // InternalDsl.g:1616:1: ( () )
            // InternalDsl.g:1617:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // InternalDsl.g:1618:2: ()
            // InternalDsl.g:1618:3: 
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
    // InternalDsl.g:1626:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1630:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // InternalDsl.g:1631:2: rule__Multiplication__Group_1_0_0__1__Impl
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
    // InternalDsl.g:1637:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1641:1: ( ( '*' ) )
            // InternalDsl.g:1642:1: ( '*' )
            {
            // InternalDsl.g:1642:1: ( '*' )
            // InternalDsl.g:1643:2: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDsl.g:1653:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1657:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // InternalDsl.g:1658:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:1665:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1669:1: ( ( () ) )
            // InternalDsl.g:1670:1: ( () )
            {
            // InternalDsl.g:1670:1: ( () )
            // InternalDsl.g:1671:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // InternalDsl.g:1672:2: ()
            // InternalDsl.g:1672:3: 
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
    // InternalDsl.g:1680:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1684:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // InternalDsl.g:1685:2: rule__Multiplication__Group_1_0_1__1__Impl
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
    // InternalDsl.g:1691:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1695:1: ( ( '/' ) )
            // InternalDsl.g:1696:1: ( '/' )
            {
            // InternalDsl.g:1696:1: ( '/' )
            // InternalDsl.g:1697:2: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDsl.g:1707:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1711:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalDsl.g:1712:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1719:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1723:1: ( ( '(' ) )
            // InternalDsl.g:1724:1: ( '(' )
            {
            // InternalDsl.g:1724:1: ( '(' )
            // InternalDsl.g:1725:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:1734:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1738:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalDsl.g:1739:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalDsl.g:1746:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1750:1: ( ( ruleExpression ) )
            // InternalDsl.g:1751:1: ( ruleExpression )
            {
            // InternalDsl.g:1751:1: ( ruleExpression )
            // InternalDsl.g:1752:2: ruleExpression
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
    // InternalDsl.g:1761:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1765:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalDsl.g:1766:2: rule__PrimaryExpression__Group_0__2__Impl
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
    // InternalDsl.g:1772:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1776:1: ( ( ')' ) )
            // InternalDsl.g:1777:1: ( ')' )
            {
            // InternalDsl.g:1777:1: ( ')' )
            // InternalDsl.g:1778:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalDsl.g:1788:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1792:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalDsl.g:1793:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:1800:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1804:1: ( ( () ) )
            // InternalDsl.g:1805:1: ( () )
            {
            // InternalDsl.g:1805:1: ( () )
            // InternalDsl.g:1806:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 
            // InternalDsl.g:1807:2: ()
            // InternalDsl.g:1807:3: 
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
    // InternalDsl.g:1815:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1819:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalDsl.g:1820:2: rule__PrimaryExpression__Group_1__1__Impl
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
    // InternalDsl.g:1826:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1830:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // InternalDsl.g:1831:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // InternalDsl.g:1831:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // InternalDsl.g:1832:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // InternalDsl.g:1833:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // InternalDsl.g:1833:3: rule__PrimaryExpression__ValueAssignment_1_1
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
    // InternalDsl.g:1842:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1846:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalDsl.g:1847:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1854:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1858:1: ( ( () ) )
            // InternalDsl.g:1859:1: ( () )
            {
            // InternalDsl.g:1859:1: ( () )
            // InternalDsl.g:1860:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getVariableExpressionAction_2_0()); 
            // InternalDsl.g:1861:2: ()
            // InternalDsl.g:1861:3: 
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
    // InternalDsl.g:1869:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1873:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // InternalDsl.g:1874:2: rule__PrimaryExpression__Group_2__1__Impl
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
    // InternalDsl.g:1880:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1884:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // InternalDsl.g:1885:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // InternalDsl.g:1885:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // InternalDsl.g:1886:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            // InternalDsl.g:1887:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // InternalDsl.g:1887:3: rule__PrimaryExpression__ValueAssignment_2_1
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
    // InternalDsl.g:1896:1: rule__Reel__Group__0 : rule__Reel__Group__0__Impl rule__Reel__Group__1 ;
    public final void rule__Reel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1900:1: ( rule__Reel__Group__0__Impl rule__Reel__Group__1 )
            // InternalDsl.g:1901:2: rule__Reel__Group__0__Impl rule__Reel__Group__1
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
    // InternalDsl.g:1908:1: rule__Reel__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Reel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1912:1: ( ( RULE_INT ) )
            // InternalDsl.g:1913:1: ( RULE_INT )
            {
            // InternalDsl.g:1913:1: ( RULE_INT )
            // InternalDsl.g:1914:2: RULE_INT
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
    // InternalDsl.g:1923:1: rule__Reel__Group__1 : rule__Reel__Group__1__Impl ;
    public final void rule__Reel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1927:1: ( rule__Reel__Group__1__Impl )
            // InternalDsl.g:1928:2: rule__Reel__Group__1__Impl
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
    // InternalDsl.g:1934:1: rule__Reel__Group__1__Impl : ( ( rule__Reel__Group_1__0 )? ) ;
    public final void rule__Reel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1938:1: ( ( ( rule__Reel__Group_1__0 )? ) )
            // InternalDsl.g:1939:1: ( ( rule__Reel__Group_1__0 )? )
            {
            // InternalDsl.g:1939:1: ( ( rule__Reel__Group_1__0 )? )
            // InternalDsl.g:1940:2: ( rule__Reel__Group_1__0 )?
            {
             before(grammarAccess.getReelAccess().getGroup_1()); 
            // InternalDsl.g:1941:2: ( rule__Reel__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1941:3: rule__Reel__Group_1__0
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
    // InternalDsl.g:1950:1: rule__Reel__Group_1__0 : rule__Reel__Group_1__0__Impl rule__Reel__Group_1__1 ;
    public final void rule__Reel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1954:1: ( rule__Reel__Group_1__0__Impl rule__Reel__Group_1__1 )
            // InternalDsl.g:1955:2: rule__Reel__Group_1__0__Impl rule__Reel__Group_1__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalDsl.g:1962:1: rule__Reel__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Reel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1966:1: ( ( '.' ) )
            // InternalDsl.g:1967:1: ( '.' )
            {
            // InternalDsl.g:1967:1: ( '.' )
            // InternalDsl.g:1968:2: '.'
            {
             before(grammarAccess.getReelAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalDsl.g:1977:1: rule__Reel__Group_1__1 : rule__Reel__Group_1__1__Impl ;
    public final void rule__Reel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1981:1: ( rule__Reel__Group_1__1__Impl )
            // InternalDsl.g:1982:2: rule__Reel__Group_1__1__Impl
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
    // InternalDsl.g:1988:1: rule__Reel__Group_1__1__Impl : ( ( rule__Reel__Alternatives_1_1 ) ) ;
    public final void rule__Reel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1992:1: ( ( ( rule__Reel__Alternatives_1_1 ) ) )
            // InternalDsl.g:1993:1: ( ( rule__Reel__Alternatives_1_1 ) )
            {
            // InternalDsl.g:1993:1: ( ( rule__Reel__Alternatives_1_1 ) )
            // InternalDsl.g:1994:2: ( rule__Reel__Alternatives_1_1 )
            {
             before(grammarAccess.getReelAccess().getAlternatives_1_1()); 
            // InternalDsl.g:1995:2: ( rule__Reel__Alternatives_1_1 )
            // InternalDsl.g:1995:3: rule__Reel__Alternatives_1_1
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
    // InternalDsl.g:2004:1: rule__Model__PackageAssignment_0 : ( rulePackageDeclaration ) ;
    public final void rule__Model__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2008:1: ( ( rulePackageDeclaration ) )
            // InternalDsl.g:2009:2: ( rulePackageDeclaration )
            {
            // InternalDsl.g:2009:2: ( rulePackageDeclaration )
            // InternalDsl.g:2010:3: rulePackageDeclaration
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
    // InternalDsl.g:2019:1: rule__Model__ImportsAssignment_1 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2023:1: ( ( ruleImport ) )
            // InternalDsl.g:2024:2: ( ruleImport )
            {
            // InternalDsl.g:2024:2: ( ruleImport )
            // InternalDsl.g:2025:3: ruleImport
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
    // InternalDsl.g:2034:1: rule__Model__VariablesAssignment_2 : ( ruleTruc ) ;
    public final void rule__Model__VariablesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2038:1: ( ( ruleTruc ) )
            // InternalDsl.g:2039:2: ( ruleTruc )
            {
            // InternalDsl.g:2039:2: ( ruleTruc )
            // InternalDsl.g:2040:3: ruleTruc
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
    // InternalDsl.g:2049:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2053:1: ( ( ruleQualifiedName ) )
            // InternalDsl.g:2054:2: ( ruleQualifiedName )
            {
            // InternalDsl.g:2054:2: ( ruleQualifiedName )
            // InternalDsl.g:2055:3: ruleQualifiedName
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
    // InternalDsl.g:2064:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2068:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalDsl.g:2069:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalDsl.g:2069:2: ( ruleQualifiedNameWithWildcard )
            // InternalDsl.g:2070:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__Autre__BobAssignment_2"
    // InternalDsl.g:2079:1: rule__Autre__BobAssignment_2 : ( ruleReel ) ;
    public final void rule__Autre__BobAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2083:1: ( ( ruleReel ) )
            // InternalDsl.g:2084:2: ( ruleReel )
            {
            // InternalDsl.g:2084:2: ( ruleReel )
            // InternalDsl.g:2085:3: ruleReel
            {
             before(grammarAccess.getAutreAccess().getBobReelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReel();

            state._fsp--;

             after(grammarAccess.getAutreAccess().getBobReelParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Autre__BobAssignment_2"


    // $ANTLR start "rule__VariableDirect__NameAssignment_1"
    // InternalDsl.g:2094:1: rule__VariableDirect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDirect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2098:1: ( ( RULE_ID ) )
            // InternalDsl.g:2099:2: ( RULE_ID )
            {
            // InternalDsl.g:2099:2: ( RULE_ID )
            // InternalDsl.g:2100:3: RULE_ID
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


    // $ANTLR start "rule__VariableDirect__AlphaAssignment_4"
    // InternalDsl.g:2109:1: rule__VariableDirect__AlphaAssignment_4 : ( ruleReel ) ;
    public final void rule__VariableDirect__AlphaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2113:1: ( ( ruleReel ) )
            // InternalDsl.g:2114:2: ( ruleReel )
            {
            // InternalDsl.g:2114:2: ( ruleReel )
            // InternalDsl.g:2115:3: ruleReel
            {
             before(grammarAccess.getVariableDirectAccess().getAlphaReelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleReel();

            state._fsp--;

             after(grammarAccess.getVariableDirectAccess().getAlphaReelParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__VariableDirect__AlphaAssignment_4"


    // $ANTLR start "rule__VariableDirect__BetaAssignment_7"
    // InternalDsl.g:2124:1: rule__VariableDirect__BetaAssignment_7 : ( ruleReel ) ;
    public final void rule__VariableDirect__BetaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2128:1: ( ( ruleReel ) )
            // InternalDsl.g:2129:2: ( ruleReel )
            {
            // InternalDsl.g:2129:2: ( ruleReel )
            // InternalDsl.g:2130:3: ruleReel
            {
             before(grammarAccess.getVariableDirectAccess().getBetaReelParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleReel();

            state._fsp--;

             after(grammarAccess.getVariableDirectAccess().getBetaReelParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__VariableDirect__BetaAssignment_7"


    // $ANTLR start "rule__VariableCalcule__NameAssignment_1"
    // InternalDsl.g:2139:1: rule__VariableCalcule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableCalcule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2143:1: ( ( RULE_ID ) )
            // InternalDsl.g:2144:2: ( RULE_ID )
            {
            // InternalDsl.g:2144:2: ( RULE_ID )
            // InternalDsl.g:2145:3: RULE_ID
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


    // $ANTLR start "rule__VariableCalcule__ExpressionAssignment_2"
    // InternalDsl.g:2154:1: rule__VariableCalcule__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__VariableCalcule__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2158:1: ( ( ruleExpression ) )
            // InternalDsl.g:2159:2: ( ruleExpression )
            {
            // InternalDsl.g:2159:2: ( ruleExpression )
            // InternalDsl.g:2160:3: ruleExpression
            {
             before(grammarAccess.getVariableCalculeAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableCalculeAccess().getExpressionExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__VariableCalcule__ExpressionAssignment_2"


    // $ANTLR start "rule__VariableCalcule__Expression2Assignment_3"
    // InternalDsl.g:2169:1: rule__VariableCalcule__Expression2Assignment_3 : ( ruleExpression ) ;
    public final void rule__VariableCalcule__Expression2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2173:1: ( ( ruleExpression ) )
            // InternalDsl.g:2174:2: ( ruleExpression )
            {
            // InternalDsl.g:2174:2: ( ruleExpression )
            // InternalDsl.g:2175:3: ruleExpression
            {
             before(grammarAccess.getVariableCalculeAccess().getExpression2ExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableCalculeAccess().getExpression2ExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__VariableCalcule__Expression2Assignment_3"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // InternalDsl.g:2184:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2188:1: ( ( ruleMultiplication ) )
            // InternalDsl.g:2189:2: ( ruleMultiplication )
            {
            // InternalDsl.g:2189:2: ( ruleMultiplication )
            // InternalDsl.g:2190:3: ruleMultiplication
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
    // InternalDsl.g:2199:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2203:1: ( ( rulePrimaryExpression ) )
            // InternalDsl.g:2204:2: ( rulePrimaryExpression )
            {
            // InternalDsl.g:2204:2: ( rulePrimaryExpression )
            // InternalDsl.g:2205:3: rulePrimaryExpression
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
    // InternalDsl.g:2214:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( ruleReel ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2218:1: ( ( ruleReel ) )
            // InternalDsl.g:2219:2: ( ruleReel )
            {
            // InternalDsl.g:2219:2: ( ruleReel )
            // InternalDsl.g:2220:3: ruleReel
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
    // InternalDsl.g:2229:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2233:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:2234:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:2234:2: ( ( RULE_ID ) )
            // InternalDsl.g:2235:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueVariableCrossReference_2_1_0()); 
            // InternalDsl.g:2236:3: ( RULE_ID )
            // InternalDsl.g:2237:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000452000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000450002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});

}