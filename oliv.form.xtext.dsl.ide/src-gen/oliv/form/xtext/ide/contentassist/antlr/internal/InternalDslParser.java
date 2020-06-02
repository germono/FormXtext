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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EXT_INT", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Autre'", "'{'", "'Bob'", "'}'", "'Variable'", "'Alpha'", "':'", "'Beta'", "'VariableCalcule'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'.'"
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
    // InternalDsl.g:62:1: ruleModel : ( ( rule__Model__VariablesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Model__VariablesAssignment )* ) )
            // InternalDsl.g:67:2: ( ( rule__Model__VariablesAssignment )* )
            {
            // InternalDsl.g:67:2: ( ( rule__Model__VariablesAssignment )* )
            // InternalDsl.g:68:3: ( rule__Model__VariablesAssignment )*
            {
             before(grammarAccess.getModelAccess().getVariablesAssignment()); 
            // InternalDsl.g:69:3: ( rule__Model__VariablesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==16||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:69:4: rule__Model__VariablesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__VariablesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVariablesAssignment()); 

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


    // $ANTLR start "entryRuleTruc"
    // InternalDsl.g:78:1: entryRuleTruc : ruleTruc EOF ;
    public final void entryRuleTruc() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleTruc EOF )
            // InternalDsl.g:80:1: ruleTruc EOF
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
    // InternalDsl.g:87:1: ruleTruc : ( ( rule__Truc__Alternatives ) ) ;
    public final void ruleTruc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Truc__Alternatives ) ) )
            // InternalDsl.g:92:2: ( ( rule__Truc__Alternatives ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Truc__Alternatives ) )
            // InternalDsl.g:93:3: ( rule__Truc__Alternatives )
            {
             before(grammarAccess.getTrucAccess().getAlternatives()); 
            // InternalDsl.g:94:3: ( rule__Truc__Alternatives )
            // InternalDsl.g:94:4: rule__Truc__Alternatives
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
    // InternalDsl.g:103:1: entryRuleAutre : ruleAutre EOF ;
    public final void entryRuleAutre() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleAutre EOF )
            // InternalDsl.g:105:1: ruleAutre EOF
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
    // InternalDsl.g:112:1: ruleAutre : ( ( rule__Autre__Group__0 ) ) ;
    public final void ruleAutre() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Autre__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Autre__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Autre__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Autre__Group__0 )
            {
             before(grammarAccess.getAutreAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Autre__Group__0 )
            // InternalDsl.g:119:4: rule__Autre__Group__0
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
    // InternalDsl.g:128:1: entryRuleVariableDirect : ruleVariableDirect EOF ;
    public final void entryRuleVariableDirect() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleVariableDirect EOF )
            // InternalDsl.g:130:1: ruleVariableDirect EOF
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
    // InternalDsl.g:137:1: ruleVariableDirect : ( ( rule__VariableDirect__Group__0 ) ) ;
    public final void ruleVariableDirect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__VariableDirect__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__VariableDirect__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__VariableDirect__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__VariableDirect__Group__0 )
            {
             before(grammarAccess.getVariableDirectAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__VariableDirect__Group__0 )
            // InternalDsl.g:144:4: rule__VariableDirect__Group__0
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
    // InternalDsl.g:153:1: entryRuleVariableCalcule : ruleVariableCalcule EOF ;
    public final void entryRuleVariableCalcule() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleVariableCalcule EOF )
            // InternalDsl.g:155:1: ruleVariableCalcule EOF
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
    // InternalDsl.g:162:1: ruleVariableCalcule : ( ( rule__VariableCalcule__Group__0 ) ) ;
    public final void ruleVariableCalcule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__VariableCalcule__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__VariableCalcule__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__VariableCalcule__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__VariableCalcule__Group__0 )
            {
             before(grammarAccess.getVariableCalculeAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__VariableCalcule__Group__0 )
            // InternalDsl.g:169:4: rule__VariableCalcule__Group__0
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
    // InternalDsl.g:178:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleExpression EOF )
            // InternalDsl.g:180:1: ruleExpression EOF
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
    // InternalDsl.g:187:1: ruleExpression : ( ruleAddition ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ruleAddition ) )
            // InternalDsl.g:192:2: ( ruleAddition )
            {
            // InternalDsl.g:192:2: ( ruleAddition )
            // InternalDsl.g:193:3: ruleAddition
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
    // InternalDsl.g:203:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleAddition EOF )
            // InternalDsl.g:205:1: ruleAddition EOF
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
    // InternalDsl.g:212:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Addition__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Addition__Group__0 )
            // InternalDsl.g:219:4: rule__Addition__Group__0
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
    // InternalDsl.g:228:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleMultiplication EOF )
            // InternalDsl.g:230:1: ruleMultiplication EOF
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
    // InternalDsl.g:237:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__Multiplication__Group__0 )
            // InternalDsl.g:244:4: rule__Multiplication__Group__0
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
    // InternalDsl.g:253:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( rulePrimaryExpression EOF )
            // InternalDsl.g:255:1: rulePrimaryExpression EOF
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
    // InternalDsl.g:262:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalDsl.g:267:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalDsl.g:267:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalDsl.g:268:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalDsl.g:269:3: ( rule__PrimaryExpression__Alternatives )
            // InternalDsl.g:269:4: rule__PrimaryExpression__Alternatives
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
    // InternalDsl.g:278:1: entryRuleReel : ruleReel EOF ;
    public final void entryRuleReel() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleReel EOF )
            // InternalDsl.g:280:1: ruleReel EOF
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
    // InternalDsl.g:287:1: ruleReel : ( ( rule__Reel__Group__0 ) ) ;
    public final void ruleReel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__Reel__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__Reel__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__Reel__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__Reel__Group__0 )
            {
             before(grammarAccess.getReelAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__Reel__Group__0 )
            // InternalDsl.g:294:4: rule__Reel__Group__0
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
    // InternalDsl.g:302:1: rule__Truc__Alternatives : ( ( ruleVariableDirect ) | ( ruleVariableCalcule ) | ( ruleAutre ) );
    public final void rule__Truc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:306:1: ( ( ruleVariableDirect ) | ( ruleVariableCalcule ) | ( ruleAutre ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDsl.g:307:2: ( ruleVariableDirect )
                    {
                    // InternalDsl.g:307:2: ( ruleVariableDirect )
                    // InternalDsl.g:308:3: ruleVariableDirect
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
                    // InternalDsl.g:313:2: ( ruleVariableCalcule )
                    {
                    // InternalDsl.g:313:2: ( ruleVariableCalcule )
                    // InternalDsl.g:314:3: ruleVariableCalcule
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
                    // InternalDsl.g:319:2: ( ruleAutre )
                    {
                    // InternalDsl.g:319:2: ( ruleAutre )
                    // InternalDsl.g:320:3: ruleAutre
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
    // InternalDsl.g:329:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:333:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:334:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalDsl.g:334:2: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalDsl.g:335:3: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // InternalDsl.g:336:3: ( rule__Addition__Group_1_0_0__0 )
                    // InternalDsl.g:336:4: rule__Addition__Group_1_0_0__0
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
                    // InternalDsl.g:340:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalDsl.g:340:2: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalDsl.g:341:3: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // InternalDsl.g:342:3: ( rule__Addition__Group_1_0_1__0 )
                    // InternalDsl.g:342:4: rule__Addition__Group_1_0_1__0
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
    // InternalDsl.g:350:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:354:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:355:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // InternalDsl.g:355:2: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // InternalDsl.g:356:3: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // InternalDsl.g:357:3: ( rule__Multiplication__Group_1_0_0__0 )
                    // InternalDsl.g:357:4: rule__Multiplication__Group_1_0_0__0
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
                    // InternalDsl.g:361:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // InternalDsl.g:361:2: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // InternalDsl.g:362:3: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // InternalDsl.g:363:3: ( rule__Multiplication__Group_1_0_1__0 )
                    // InternalDsl.g:363:4: rule__Multiplication__Group_1_0_1__0
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
    // InternalDsl.g:371:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:375:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:376:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalDsl.g:376:2: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalDsl.g:377:3: ( rule__PrimaryExpression__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    // InternalDsl.g:378:3: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalDsl.g:378:4: rule__PrimaryExpression__Group_0__0
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
                    // InternalDsl.g:382:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // InternalDsl.g:382:2: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // InternalDsl.g:383:3: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // InternalDsl.g:384:3: ( rule__PrimaryExpression__Group_1__0 )
                    // InternalDsl.g:384:4: rule__PrimaryExpression__Group_1__0
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
                    // InternalDsl.g:388:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalDsl.g:388:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalDsl.g:389:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalDsl.g:390:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalDsl.g:390:4: rule__PrimaryExpression__Group_2__0
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
    // InternalDsl.g:398:1: rule__Reel__Alternatives_1_1 : ( ( RULE_EXT_INT ) | ( RULE_INT ) );
    public final void rule__Reel__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:402:1: ( ( RULE_EXT_INT ) | ( RULE_INT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_EXT_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:403:2: ( RULE_EXT_INT )
                    {
                    // InternalDsl.g:403:2: ( RULE_EXT_INT )
                    // InternalDsl.g:404:3: RULE_EXT_INT
                    {
                     before(grammarAccess.getReelAccess().getEXT_INTTerminalRuleCall_1_1_0()); 
                    match(input,RULE_EXT_INT,FOLLOW_2); 
                     after(grammarAccess.getReelAccess().getEXT_INTTerminalRuleCall_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:409:2: ( RULE_INT )
                    {
                    // InternalDsl.g:409:2: ( RULE_INT )
                    // InternalDsl.g:410:3: RULE_INT
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


    // $ANTLR start "rule__Autre__Group__0"
    // InternalDsl.g:419:1: rule__Autre__Group__0 : rule__Autre__Group__0__Impl rule__Autre__Group__1 ;
    public final void rule__Autre__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:423:1: ( rule__Autre__Group__0__Impl rule__Autre__Group__1 )
            // InternalDsl.g:424:2: rule__Autre__Group__0__Impl rule__Autre__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:431:1: rule__Autre__Group__0__Impl : ( 'Autre' ) ;
    public final void rule__Autre__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:435:1: ( ( 'Autre' ) )
            // InternalDsl.g:436:1: ( 'Autre' )
            {
            // InternalDsl.g:436:1: ( 'Autre' )
            // InternalDsl.g:437:2: 'Autre'
            {
             before(grammarAccess.getAutreAccess().getAutreKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalDsl.g:446:1: rule__Autre__Group__1 : rule__Autre__Group__1__Impl rule__Autre__Group__2 ;
    public final void rule__Autre__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:450:1: ( rule__Autre__Group__1__Impl rule__Autre__Group__2 )
            // InternalDsl.g:451:2: rule__Autre__Group__1__Impl rule__Autre__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalDsl.g:458:1: rule__Autre__Group__1__Impl : ( '{' ) ;
    public final void rule__Autre__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:462:1: ( ( '{' ) )
            // InternalDsl.g:463:1: ( '{' )
            {
            // InternalDsl.g:463:1: ( '{' )
            // InternalDsl.g:464:2: '{'
            {
             before(grammarAccess.getAutreAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAutreAccess().getLeftCurlyBracketKeyword_1()); 

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
    // InternalDsl.g:473:1: rule__Autre__Group__2 : rule__Autre__Group__2__Impl rule__Autre__Group__3 ;
    public final void rule__Autre__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:477:1: ( rule__Autre__Group__2__Impl rule__Autre__Group__3 )
            // InternalDsl.g:478:2: rule__Autre__Group__2__Impl rule__Autre__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:485:1: rule__Autre__Group__2__Impl : ( 'Bob' ) ;
    public final void rule__Autre__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:489:1: ( ( 'Bob' ) )
            // InternalDsl.g:490:1: ( 'Bob' )
            {
            // InternalDsl.g:490:1: ( 'Bob' )
            // InternalDsl.g:491:2: 'Bob'
            {
             before(grammarAccess.getAutreAccess().getBobKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalDsl.g:500:1: rule__Autre__Group__3 : rule__Autre__Group__3__Impl rule__Autre__Group__4 ;
    public final void rule__Autre__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:504:1: ( rule__Autre__Group__3__Impl rule__Autre__Group__4 )
            // InternalDsl.g:505:2: rule__Autre__Group__3__Impl rule__Autre__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:512:1: rule__Autre__Group__3__Impl : ( ( rule__Autre__BobAssignment_3 ) ) ;
    public final void rule__Autre__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:1: ( ( ( rule__Autre__BobAssignment_3 ) ) )
            // InternalDsl.g:517:1: ( ( rule__Autre__BobAssignment_3 ) )
            {
            // InternalDsl.g:517:1: ( ( rule__Autre__BobAssignment_3 ) )
            // InternalDsl.g:518:2: ( rule__Autre__BobAssignment_3 )
            {
             before(grammarAccess.getAutreAccess().getBobAssignment_3()); 
            // InternalDsl.g:519:2: ( rule__Autre__BobAssignment_3 )
            // InternalDsl.g:519:3: rule__Autre__BobAssignment_3
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
    // InternalDsl.g:527:1: rule__Autre__Group__4 : rule__Autre__Group__4__Impl ;
    public final void rule__Autre__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:531:1: ( rule__Autre__Group__4__Impl )
            // InternalDsl.g:532:2: rule__Autre__Group__4__Impl
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
    // InternalDsl.g:538:1: rule__Autre__Group__4__Impl : ( '}' ) ;
    public final void rule__Autre__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:542:1: ( ( '}' ) )
            // InternalDsl.g:543:1: ( '}' )
            {
            // InternalDsl.g:543:1: ( '}' )
            // InternalDsl.g:544:2: '}'
            {
             before(grammarAccess.getAutreAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAutreAccess().getRightCurlyBracketKeyword_4()); 

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
    // InternalDsl.g:554:1: rule__VariableDirect__Group__0 : rule__VariableDirect__Group__0__Impl rule__VariableDirect__Group__1 ;
    public final void rule__VariableDirect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:558:1: ( rule__VariableDirect__Group__0__Impl rule__VariableDirect__Group__1 )
            // InternalDsl.g:559:2: rule__VariableDirect__Group__0__Impl rule__VariableDirect__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:566:1: rule__VariableDirect__Group__0__Impl : ( 'Variable' ) ;
    public final void rule__VariableDirect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:570:1: ( ( 'Variable' ) )
            // InternalDsl.g:571:1: ( 'Variable' )
            {
            // InternalDsl.g:571:1: ( 'Variable' )
            // InternalDsl.g:572:2: 'Variable'
            {
             before(grammarAccess.getVariableDirectAccess().getVariableKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalDsl.g:581:1: rule__VariableDirect__Group__1 : rule__VariableDirect__Group__1__Impl rule__VariableDirect__Group__2 ;
    public final void rule__VariableDirect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:585:1: ( rule__VariableDirect__Group__1__Impl rule__VariableDirect__Group__2 )
            // InternalDsl.g:586:2: rule__VariableDirect__Group__1__Impl rule__VariableDirect__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:593:1: rule__VariableDirect__Group__1__Impl : ( ( rule__VariableDirect__NameAssignment_1 ) ) ;
    public final void rule__VariableDirect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:597:1: ( ( ( rule__VariableDirect__NameAssignment_1 ) ) )
            // InternalDsl.g:598:1: ( ( rule__VariableDirect__NameAssignment_1 ) )
            {
            // InternalDsl.g:598:1: ( ( rule__VariableDirect__NameAssignment_1 ) )
            // InternalDsl.g:599:2: ( rule__VariableDirect__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDirectAccess().getNameAssignment_1()); 
            // InternalDsl.g:600:2: ( rule__VariableDirect__NameAssignment_1 )
            // InternalDsl.g:600:3: rule__VariableDirect__NameAssignment_1
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
    // InternalDsl.g:608:1: rule__VariableDirect__Group__2 : rule__VariableDirect__Group__2__Impl rule__VariableDirect__Group__3 ;
    public final void rule__VariableDirect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:612:1: ( rule__VariableDirect__Group__2__Impl rule__VariableDirect__Group__3 )
            // InternalDsl.g:613:2: rule__VariableDirect__Group__2__Impl rule__VariableDirect__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:620:1: rule__VariableDirect__Group__2__Impl : ( '{' ) ;
    public final void rule__VariableDirect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:624:1: ( ( '{' ) )
            // InternalDsl.g:625:1: ( '{' )
            {
            // InternalDsl.g:625:1: ( '{' )
            // InternalDsl.g:626:2: '{'
            {
             before(grammarAccess.getVariableDirectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalDsl.g:635:1: rule__VariableDirect__Group__3 : rule__VariableDirect__Group__3__Impl rule__VariableDirect__Group__4 ;
    public final void rule__VariableDirect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:639:1: ( rule__VariableDirect__Group__3__Impl rule__VariableDirect__Group__4 )
            // InternalDsl.g:640:2: rule__VariableDirect__Group__3__Impl rule__VariableDirect__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:647:1: rule__VariableDirect__Group__3__Impl : ( 'Alpha' ) ;
    public final void rule__VariableDirect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:651:1: ( ( 'Alpha' ) )
            // InternalDsl.g:652:1: ( 'Alpha' )
            {
            // InternalDsl.g:652:1: ( 'Alpha' )
            // InternalDsl.g:653:2: 'Alpha'
            {
             before(grammarAccess.getVariableDirectAccess().getAlphaKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalDsl.g:662:1: rule__VariableDirect__Group__4 : rule__VariableDirect__Group__4__Impl rule__VariableDirect__Group__5 ;
    public final void rule__VariableDirect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:666:1: ( rule__VariableDirect__Group__4__Impl rule__VariableDirect__Group__5 )
            // InternalDsl.g:667:2: rule__VariableDirect__Group__4__Impl rule__VariableDirect__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:674:1: rule__VariableDirect__Group__4__Impl : ( ':' ) ;
    public final void rule__VariableDirect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:678:1: ( ( ':' ) )
            // InternalDsl.g:679:1: ( ':' )
            {
            // InternalDsl.g:679:1: ( ':' )
            // InternalDsl.g:680:2: ':'
            {
             before(grammarAccess.getVariableDirectAccess().getColonKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDsl.g:689:1: rule__VariableDirect__Group__5 : rule__VariableDirect__Group__5__Impl rule__VariableDirect__Group__6 ;
    public final void rule__VariableDirect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:693:1: ( rule__VariableDirect__Group__5__Impl rule__VariableDirect__Group__6 )
            // InternalDsl.g:694:2: rule__VariableDirect__Group__5__Impl rule__VariableDirect__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:701:1: rule__VariableDirect__Group__5__Impl : ( ( rule__VariableDirect__AlphaAssignment_5 ) ) ;
    public final void rule__VariableDirect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:705:1: ( ( ( rule__VariableDirect__AlphaAssignment_5 ) ) )
            // InternalDsl.g:706:1: ( ( rule__VariableDirect__AlphaAssignment_5 ) )
            {
            // InternalDsl.g:706:1: ( ( rule__VariableDirect__AlphaAssignment_5 ) )
            // InternalDsl.g:707:2: ( rule__VariableDirect__AlphaAssignment_5 )
            {
             before(grammarAccess.getVariableDirectAccess().getAlphaAssignment_5()); 
            // InternalDsl.g:708:2: ( rule__VariableDirect__AlphaAssignment_5 )
            // InternalDsl.g:708:3: rule__VariableDirect__AlphaAssignment_5
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
    // InternalDsl.g:716:1: rule__VariableDirect__Group__6 : rule__VariableDirect__Group__6__Impl rule__VariableDirect__Group__7 ;
    public final void rule__VariableDirect__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:720:1: ( rule__VariableDirect__Group__6__Impl rule__VariableDirect__Group__7 )
            // InternalDsl.g:721:2: rule__VariableDirect__Group__6__Impl rule__VariableDirect__Group__7
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:728:1: rule__VariableDirect__Group__6__Impl : ( 'Beta' ) ;
    public final void rule__VariableDirect__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:732:1: ( ( 'Beta' ) )
            // InternalDsl.g:733:1: ( 'Beta' )
            {
            // InternalDsl.g:733:1: ( 'Beta' )
            // InternalDsl.g:734:2: 'Beta'
            {
             before(grammarAccess.getVariableDirectAccess().getBetaKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalDsl.g:743:1: rule__VariableDirect__Group__7 : rule__VariableDirect__Group__7__Impl rule__VariableDirect__Group__8 ;
    public final void rule__VariableDirect__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:747:1: ( rule__VariableDirect__Group__7__Impl rule__VariableDirect__Group__8 )
            // InternalDsl.g:748:2: rule__VariableDirect__Group__7__Impl rule__VariableDirect__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:755:1: rule__VariableDirect__Group__7__Impl : ( ':' ) ;
    public final void rule__VariableDirect__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:759:1: ( ( ':' ) )
            // InternalDsl.g:760:1: ( ':' )
            {
            // InternalDsl.g:760:1: ( ':' )
            // InternalDsl.g:761:2: ':'
            {
             before(grammarAccess.getVariableDirectAccess().getColonKeyword_7()); 
            match(input,18,FOLLOW_2); 
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
    // InternalDsl.g:770:1: rule__VariableDirect__Group__8 : rule__VariableDirect__Group__8__Impl rule__VariableDirect__Group__9 ;
    public final void rule__VariableDirect__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:774:1: ( rule__VariableDirect__Group__8__Impl rule__VariableDirect__Group__9 )
            // InternalDsl.g:775:2: rule__VariableDirect__Group__8__Impl rule__VariableDirect__Group__9
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:782:1: rule__VariableDirect__Group__8__Impl : ( ( rule__VariableDirect__BetaAssignment_8 ) ) ;
    public final void rule__VariableDirect__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:786:1: ( ( ( rule__VariableDirect__BetaAssignment_8 ) ) )
            // InternalDsl.g:787:1: ( ( rule__VariableDirect__BetaAssignment_8 ) )
            {
            // InternalDsl.g:787:1: ( ( rule__VariableDirect__BetaAssignment_8 ) )
            // InternalDsl.g:788:2: ( rule__VariableDirect__BetaAssignment_8 )
            {
             before(grammarAccess.getVariableDirectAccess().getBetaAssignment_8()); 
            // InternalDsl.g:789:2: ( rule__VariableDirect__BetaAssignment_8 )
            // InternalDsl.g:789:3: rule__VariableDirect__BetaAssignment_8
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
    // InternalDsl.g:797:1: rule__VariableDirect__Group__9 : rule__VariableDirect__Group__9__Impl ;
    public final void rule__VariableDirect__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:801:1: ( rule__VariableDirect__Group__9__Impl )
            // InternalDsl.g:802:2: rule__VariableDirect__Group__9__Impl
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
    // InternalDsl.g:808:1: rule__VariableDirect__Group__9__Impl : ( '}' ) ;
    public final void rule__VariableDirect__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:812:1: ( ( '}' ) )
            // InternalDsl.g:813:1: ( '}' )
            {
            // InternalDsl.g:813:1: ( '}' )
            // InternalDsl.g:814:2: '}'
            {
             before(grammarAccess.getVariableDirectAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVariableDirectAccess().getRightCurlyBracketKeyword_9()); 

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
    // InternalDsl.g:824:1: rule__VariableCalcule__Group__0 : rule__VariableCalcule__Group__0__Impl rule__VariableCalcule__Group__1 ;
    public final void rule__VariableCalcule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:828:1: ( rule__VariableCalcule__Group__0__Impl rule__VariableCalcule__Group__1 )
            // InternalDsl.g:829:2: rule__VariableCalcule__Group__0__Impl rule__VariableCalcule__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:836:1: rule__VariableCalcule__Group__0__Impl : ( 'VariableCalcule' ) ;
    public final void rule__VariableCalcule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:840:1: ( ( 'VariableCalcule' ) )
            // InternalDsl.g:841:1: ( 'VariableCalcule' )
            {
            // InternalDsl.g:841:1: ( 'VariableCalcule' )
            // InternalDsl.g:842:2: 'VariableCalcule'
            {
             before(grammarAccess.getVariableCalculeAccess().getVariableCalculeKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalDsl.g:851:1: rule__VariableCalcule__Group__1 : rule__VariableCalcule__Group__1__Impl rule__VariableCalcule__Group__2 ;
    public final void rule__VariableCalcule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:855:1: ( rule__VariableCalcule__Group__1__Impl rule__VariableCalcule__Group__2 )
            // InternalDsl.g:856:2: rule__VariableCalcule__Group__1__Impl rule__VariableCalcule__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDsl.g:863:1: rule__VariableCalcule__Group__1__Impl : ( ( rule__VariableCalcule__NameAssignment_1 ) ) ;
    public final void rule__VariableCalcule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:867:1: ( ( ( rule__VariableCalcule__NameAssignment_1 ) ) )
            // InternalDsl.g:868:1: ( ( rule__VariableCalcule__NameAssignment_1 ) )
            {
            // InternalDsl.g:868:1: ( ( rule__VariableCalcule__NameAssignment_1 ) )
            // InternalDsl.g:869:2: ( rule__VariableCalcule__NameAssignment_1 )
            {
             before(grammarAccess.getVariableCalculeAccess().getNameAssignment_1()); 
            // InternalDsl.g:870:2: ( rule__VariableCalcule__NameAssignment_1 )
            // InternalDsl.g:870:3: rule__VariableCalcule__NameAssignment_1
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
    // InternalDsl.g:878:1: rule__VariableCalcule__Group__2 : rule__VariableCalcule__Group__2__Impl rule__VariableCalcule__Group__3 ;
    public final void rule__VariableCalcule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:882:1: ( rule__VariableCalcule__Group__2__Impl rule__VariableCalcule__Group__3 )
            // InternalDsl.g:883:2: rule__VariableCalcule__Group__2__Impl rule__VariableCalcule__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:890:1: rule__VariableCalcule__Group__2__Impl : ( '{' ) ;
    public final void rule__VariableCalcule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:894:1: ( ( '{' ) )
            // InternalDsl.g:895:1: ( '{' )
            {
            // InternalDsl.g:895:1: ( '{' )
            // InternalDsl.g:896:2: '{'
            {
             before(grammarAccess.getVariableCalculeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVariableCalculeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalDsl.g:905:1: rule__VariableCalcule__Group__3 : rule__VariableCalcule__Group__3__Impl rule__VariableCalcule__Group__4 ;
    public final void rule__VariableCalcule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:909:1: ( rule__VariableCalcule__Group__3__Impl rule__VariableCalcule__Group__4 )
            // InternalDsl.g:910:2: rule__VariableCalcule__Group__3__Impl rule__VariableCalcule__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:917:1: rule__VariableCalcule__Group__3__Impl : ( ( rule__VariableCalcule__ExpressionAssignment_3 ) ) ;
    public final void rule__VariableCalcule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:921:1: ( ( ( rule__VariableCalcule__ExpressionAssignment_3 ) ) )
            // InternalDsl.g:922:1: ( ( rule__VariableCalcule__ExpressionAssignment_3 ) )
            {
            // InternalDsl.g:922:1: ( ( rule__VariableCalcule__ExpressionAssignment_3 ) )
            // InternalDsl.g:923:2: ( rule__VariableCalcule__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableCalculeAccess().getExpressionAssignment_3()); 
            // InternalDsl.g:924:2: ( rule__VariableCalcule__ExpressionAssignment_3 )
            // InternalDsl.g:924:3: rule__VariableCalcule__ExpressionAssignment_3
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
    // InternalDsl.g:932:1: rule__VariableCalcule__Group__4 : rule__VariableCalcule__Group__4__Impl ;
    public final void rule__VariableCalcule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:936:1: ( rule__VariableCalcule__Group__4__Impl )
            // InternalDsl.g:937:2: rule__VariableCalcule__Group__4__Impl
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
    // InternalDsl.g:943:1: rule__VariableCalcule__Group__4__Impl : ( '}' ) ;
    public final void rule__VariableCalcule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:947:1: ( ( '}' ) )
            // InternalDsl.g:948:1: ( '}' )
            {
            // InternalDsl.g:948:1: ( '}' )
            // InternalDsl.g:949:2: '}'
            {
             before(grammarAccess.getVariableCalculeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVariableCalculeAccess().getRightCurlyBracketKeyword_4()); 

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
    // InternalDsl.g:959:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:963:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalDsl.g:964:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:971:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:975:1: ( ( ruleMultiplication ) )
            // InternalDsl.g:976:1: ( ruleMultiplication )
            {
            // InternalDsl.g:976:1: ( ruleMultiplication )
            // InternalDsl.g:977:2: ruleMultiplication
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
    // InternalDsl.g:986:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:990:1: ( rule__Addition__Group__1__Impl )
            // InternalDsl.g:991:2: rule__Addition__Group__1__Impl
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
    // InternalDsl.g:997:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1001:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalDsl.g:1002:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalDsl.g:1002:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalDsl.g:1003:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalDsl.g:1004:2: ( rule__Addition__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=21 && LA7_0<=22)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:1004:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalDsl.g:1013:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1017:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalDsl.g:1018:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1025:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1029:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalDsl.g:1030:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalDsl.g:1030:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalDsl.g:1031:2: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // InternalDsl.g:1032:2: ( rule__Addition__Alternatives_1_0 )
            // InternalDsl.g:1032:3: rule__Addition__Alternatives_1_0
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
    // InternalDsl.g:1040:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1044:1: ( rule__Addition__Group_1__1__Impl )
            // InternalDsl.g:1045:2: rule__Addition__Group_1__1__Impl
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
    // InternalDsl.g:1051:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1055:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalDsl.g:1056:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalDsl.g:1056:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalDsl.g:1057:2: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // InternalDsl.g:1058:2: ( rule__Addition__RightAssignment_1_1 )
            // InternalDsl.g:1058:3: rule__Addition__RightAssignment_1_1
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
    // InternalDsl.g:1067:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1071:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalDsl.g:1072:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:1079:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1083:1: ( ( () ) )
            // InternalDsl.g:1084:1: ( () )
            {
            // InternalDsl.g:1084:1: ( () )
            // InternalDsl.g:1085:2: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalDsl.g:1086:2: ()
            // InternalDsl.g:1086:3: 
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
    // InternalDsl.g:1094:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1098:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalDsl.g:1099:2: rule__Addition__Group_1_0_0__1__Impl
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
    // InternalDsl.g:1105:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1109:1: ( ( '+' ) )
            // InternalDsl.g:1110:1: ( '+' )
            {
            // InternalDsl.g:1110:1: ( '+' )
            // InternalDsl.g:1111:2: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalDsl.g:1121:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1125:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalDsl.g:1126:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:1133:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1137:1: ( ( () ) )
            // InternalDsl.g:1138:1: ( () )
            {
            // InternalDsl.g:1138:1: ( () )
            // InternalDsl.g:1139:2: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalDsl.g:1140:2: ()
            // InternalDsl.g:1140:3: 
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
    // InternalDsl.g:1148:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1152:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalDsl.g:1153:2: rule__Addition__Group_1_0_1__1__Impl
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
    // InternalDsl.g:1159:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1163:1: ( ( '-' ) )
            // InternalDsl.g:1164:1: ( '-' )
            {
            // InternalDsl.g:1164:1: ( '-' )
            // InternalDsl.g:1165:2: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalDsl.g:1175:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1179:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalDsl.g:1180:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:1187:1: rule__Multiplication__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1191:1: ( ( rulePrimaryExpression ) )
            // InternalDsl.g:1192:1: ( rulePrimaryExpression )
            {
            // InternalDsl.g:1192:1: ( rulePrimaryExpression )
            // InternalDsl.g:1193:2: rulePrimaryExpression
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
    // InternalDsl.g:1202:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1206:1: ( rule__Multiplication__Group__1__Impl )
            // InternalDsl.g:1207:2: rule__Multiplication__Group__1__Impl
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
    // InternalDsl.g:1213:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1217:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalDsl.g:1218:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalDsl.g:1218:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalDsl.g:1219:2: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalDsl.g:1220:2: ( rule__Multiplication__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=23 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:1220:3: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalDsl.g:1229:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1233:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalDsl.g:1234:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1241:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1245:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // InternalDsl.g:1246:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // InternalDsl.g:1246:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // InternalDsl.g:1247:2: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // InternalDsl.g:1248:2: ( rule__Multiplication__Alternatives_1_0 )
            // InternalDsl.g:1248:3: rule__Multiplication__Alternatives_1_0
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
    // InternalDsl.g:1256:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1260:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalDsl.g:1261:2: rule__Multiplication__Group_1__1__Impl
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
    // InternalDsl.g:1267:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1271:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalDsl.g:1272:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalDsl.g:1272:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalDsl.g:1273:2: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // InternalDsl.g:1274:2: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalDsl.g:1274:3: rule__Multiplication__RightAssignment_1_1
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
    // InternalDsl.g:1283:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1287:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // InternalDsl.g:1288:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalDsl.g:1295:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1299:1: ( ( () ) )
            // InternalDsl.g:1300:1: ( () )
            {
            // InternalDsl.g:1300:1: ( () )
            // InternalDsl.g:1301:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // InternalDsl.g:1302:2: ()
            // InternalDsl.g:1302:3: 
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
    // InternalDsl.g:1310:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1314:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // InternalDsl.g:1315:2: rule__Multiplication__Group_1_0_0__1__Impl
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
    // InternalDsl.g:1321:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1325:1: ( ( '*' ) )
            // InternalDsl.g:1326:1: ( '*' )
            {
            // InternalDsl.g:1326:1: ( '*' )
            // InternalDsl.g:1327:2: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalDsl.g:1337:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1341:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // InternalDsl.g:1342:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:1349:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1353:1: ( ( () ) )
            // InternalDsl.g:1354:1: ( () )
            {
            // InternalDsl.g:1354:1: ( () )
            // InternalDsl.g:1355:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // InternalDsl.g:1356:2: ()
            // InternalDsl.g:1356:3: 
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
    // InternalDsl.g:1364:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1368:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // InternalDsl.g:1369:2: rule__Multiplication__Group_1_0_1__1__Impl
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
    // InternalDsl.g:1375:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1379:1: ( ( '/' ) )
            // InternalDsl.g:1380:1: ( '/' )
            {
            // InternalDsl.g:1380:1: ( '/' )
            // InternalDsl.g:1381:2: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalDsl.g:1391:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1395:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalDsl.g:1396:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1403:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1407:1: ( ( '(' ) )
            // InternalDsl.g:1408:1: ( '(' )
            {
            // InternalDsl.g:1408:1: ( '(' )
            // InternalDsl.g:1409:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalDsl.g:1418:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1422:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalDsl.g:1423:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalDsl.g:1430:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1434:1: ( ( ruleExpression ) )
            // InternalDsl.g:1435:1: ( ruleExpression )
            {
            // InternalDsl.g:1435:1: ( ruleExpression )
            // InternalDsl.g:1436:2: ruleExpression
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
    // InternalDsl.g:1445:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1449:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalDsl.g:1450:2: rule__PrimaryExpression__Group_0__2__Impl
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
    // InternalDsl.g:1456:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1460:1: ( ( ')' ) )
            // InternalDsl.g:1461:1: ( ')' )
            {
            // InternalDsl.g:1461:1: ( ')' )
            // InternalDsl.g:1462:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalDsl.g:1472:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1476:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // InternalDsl.g:1477:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalDsl.g:1484:1: rule__PrimaryExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1488:1: ( ( () ) )
            // InternalDsl.g:1489:1: ( () )
            {
            // InternalDsl.g:1489:1: ( () )
            // InternalDsl.g:1490:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0()); 
            // InternalDsl.g:1491:2: ()
            // InternalDsl.g:1491:3: 
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
    // InternalDsl.g:1499:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1503:1: ( rule__PrimaryExpression__Group_1__1__Impl )
            // InternalDsl.g:1504:2: rule__PrimaryExpression__Group_1__1__Impl
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
    // InternalDsl.g:1510:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1514:1: ( ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) ) )
            // InternalDsl.g:1515:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            {
            // InternalDsl.g:1515:1: ( ( rule__PrimaryExpression__ValueAssignment_1_1 ) )
            // InternalDsl.g:1516:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_1_1()); 
            // InternalDsl.g:1517:2: ( rule__PrimaryExpression__ValueAssignment_1_1 )
            // InternalDsl.g:1517:3: rule__PrimaryExpression__ValueAssignment_1_1
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
    // InternalDsl.g:1526:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1530:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalDsl.g:1531:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:1538:1: rule__PrimaryExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1542:1: ( ( () ) )
            // InternalDsl.g:1543:1: ( () )
            {
            // InternalDsl.g:1543:1: ( () )
            // InternalDsl.g:1544:2: ()
            {
             before(grammarAccess.getPrimaryExpressionAccess().getVariableExpressionAction_2_0()); 
            // InternalDsl.g:1545:2: ()
            // InternalDsl.g:1545:3: 
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
    // InternalDsl.g:1553:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1557:1: ( rule__PrimaryExpression__Group_2__1__Impl )
            // InternalDsl.g:1558:2: rule__PrimaryExpression__Group_2__1__Impl
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
    // InternalDsl.g:1564:1: rule__PrimaryExpression__Group_2__1__Impl : ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1568:1: ( ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) ) )
            // InternalDsl.g:1569:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            {
            // InternalDsl.g:1569:1: ( ( rule__PrimaryExpression__ValueAssignment_2_1 ) )
            // InternalDsl.g:1570:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueAssignment_2_1()); 
            // InternalDsl.g:1571:2: ( rule__PrimaryExpression__ValueAssignment_2_1 )
            // InternalDsl.g:1571:3: rule__PrimaryExpression__ValueAssignment_2_1
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
    // InternalDsl.g:1580:1: rule__Reel__Group__0 : rule__Reel__Group__0__Impl rule__Reel__Group__1 ;
    public final void rule__Reel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1584:1: ( rule__Reel__Group__0__Impl rule__Reel__Group__1 )
            // InternalDsl.g:1585:2: rule__Reel__Group__0__Impl rule__Reel__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDsl.g:1592:1: rule__Reel__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Reel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1596:1: ( ( RULE_INT ) )
            // InternalDsl.g:1597:1: ( RULE_INT )
            {
            // InternalDsl.g:1597:1: ( RULE_INT )
            // InternalDsl.g:1598:2: RULE_INT
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
    // InternalDsl.g:1607:1: rule__Reel__Group__1 : rule__Reel__Group__1__Impl ;
    public final void rule__Reel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1611:1: ( rule__Reel__Group__1__Impl )
            // InternalDsl.g:1612:2: rule__Reel__Group__1__Impl
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
    // InternalDsl.g:1618:1: rule__Reel__Group__1__Impl : ( ( rule__Reel__Group_1__0 )? ) ;
    public final void rule__Reel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1622:1: ( ( ( rule__Reel__Group_1__0 )? ) )
            // InternalDsl.g:1623:1: ( ( rule__Reel__Group_1__0 )? )
            {
            // InternalDsl.g:1623:1: ( ( rule__Reel__Group_1__0 )? )
            // InternalDsl.g:1624:2: ( rule__Reel__Group_1__0 )?
            {
             before(grammarAccess.getReelAccess().getGroup_1()); 
            // InternalDsl.g:1625:2: ( rule__Reel__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:1625:3: rule__Reel__Group_1__0
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
    // InternalDsl.g:1634:1: rule__Reel__Group_1__0 : rule__Reel__Group_1__0__Impl rule__Reel__Group_1__1 ;
    public final void rule__Reel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1638:1: ( rule__Reel__Group_1__0__Impl rule__Reel__Group_1__1 )
            // InternalDsl.g:1639:2: rule__Reel__Group_1__0__Impl rule__Reel__Group_1__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDsl.g:1646:1: rule__Reel__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Reel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1650:1: ( ( '.' ) )
            // InternalDsl.g:1651:1: ( '.' )
            {
            // InternalDsl.g:1651:1: ( '.' )
            // InternalDsl.g:1652:2: '.'
            {
             before(grammarAccess.getReelAccess().getFullStopKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalDsl.g:1661:1: rule__Reel__Group_1__1 : rule__Reel__Group_1__1__Impl ;
    public final void rule__Reel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1665:1: ( rule__Reel__Group_1__1__Impl )
            // InternalDsl.g:1666:2: rule__Reel__Group_1__1__Impl
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
    // InternalDsl.g:1672:1: rule__Reel__Group_1__1__Impl : ( ( rule__Reel__Alternatives_1_1 ) ) ;
    public final void rule__Reel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1676:1: ( ( ( rule__Reel__Alternatives_1_1 ) ) )
            // InternalDsl.g:1677:1: ( ( rule__Reel__Alternatives_1_1 ) )
            {
            // InternalDsl.g:1677:1: ( ( rule__Reel__Alternatives_1_1 ) )
            // InternalDsl.g:1678:2: ( rule__Reel__Alternatives_1_1 )
            {
             before(grammarAccess.getReelAccess().getAlternatives_1_1()); 
            // InternalDsl.g:1679:2: ( rule__Reel__Alternatives_1_1 )
            // InternalDsl.g:1679:3: rule__Reel__Alternatives_1_1
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


    // $ANTLR start "rule__Model__VariablesAssignment"
    // InternalDsl.g:1688:1: rule__Model__VariablesAssignment : ( ruleTruc ) ;
    public final void rule__Model__VariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1692:1: ( ( ruleTruc ) )
            // InternalDsl.g:1693:2: ( ruleTruc )
            {
            // InternalDsl.g:1693:2: ( ruleTruc )
            // InternalDsl.g:1694:3: ruleTruc
            {
             before(grammarAccess.getModelAccess().getVariablesTrucParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTruc();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVariablesTrucParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__VariablesAssignment"


    // $ANTLR start "rule__Autre__BobAssignment_3"
    // InternalDsl.g:1703:1: rule__Autre__BobAssignment_3 : ( ruleReel ) ;
    public final void rule__Autre__BobAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1707:1: ( ( ruleReel ) )
            // InternalDsl.g:1708:2: ( ruleReel )
            {
            // InternalDsl.g:1708:2: ( ruleReel )
            // InternalDsl.g:1709:3: ruleReel
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
    // InternalDsl.g:1718:1: rule__VariableDirect__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDirect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1722:1: ( ( RULE_ID ) )
            // InternalDsl.g:1723:2: ( RULE_ID )
            {
            // InternalDsl.g:1723:2: ( RULE_ID )
            // InternalDsl.g:1724:3: RULE_ID
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
    // InternalDsl.g:1733:1: rule__VariableDirect__AlphaAssignment_5 : ( ruleReel ) ;
    public final void rule__VariableDirect__AlphaAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1737:1: ( ( ruleReel ) )
            // InternalDsl.g:1738:2: ( ruleReel )
            {
            // InternalDsl.g:1738:2: ( ruleReel )
            // InternalDsl.g:1739:3: ruleReel
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
    // InternalDsl.g:1748:1: rule__VariableDirect__BetaAssignment_8 : ( ruleReel ) ;
    public final void rule__VariableDirect__BetaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1752:1: ( ( ruleReel ) )
            // InternalDsl.g:1753:2: ( ruleReel )
            {
            // InternalDsl.g:1753:2: ( ruleReel )
            // InternalDsl.g:1754:3: ruleReel
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
    // InternalDsl.g:1763:1: rule__VariableCalcule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableCalcule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1767:1: ( ( RULE_ID ) )
            // InternalDsl.g:1768:2: ( RULE_ID )
            {
            // InternalDsl.g:1768:2: ( RULE_ID )
            // InternalDsl.g:1769:3: RULE_ID
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
    // InternalDsl.g:1778:1: rule__VariableCalcule__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__VariableCalcule__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1782:1: ( ( ruleExpression ) )
            // InternalDsl.g:1783:2: ( ruleExpression )
            {
            // InternalDsl.g:1783:2: ( ruleExpression )
            // InternalDsl.g:1784:3: ruleExpression
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
    // InternalDsl.g:1793:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1797:1: ( ( ruleMultiplication ) )
            // InternalDsl.g:1798:2: ( ruleMultiplication )
            {
            // InternalDsl.g:1798:2: ( ruleMultiplication )
            // InternalDsl.g:1799:3: ruleMultiplication
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
    // InternalDsl.g:1808:1: rule__Multiplication__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1812:1: ( ( rulePrimaryExpression ) )
            // InternalDsl.g:1813:2: ( rulePrimaryExpression )
            {
            // InternalDsl.g:1813:2: ( rulePrimaryExpression )
            // InternalDsl.g:1814:3: rulePrimaryExpression
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
    // InternalDsl.g:1823:1: rule__PrimaryExpression__ValueAssignment_1_1 : ( ruleReel ) ;
    public final void rule__PrimaryExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1827:1: ( ( ruleReel ) )
            // InternalDsl.g:1828:2: ( ruleReel )
            {
            // InternalDsl.g:1828:2: ( ruleReel )
            // InternalDsl.g:1829:3: ruleReel
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
    // InternalDsl.g:1838:1: rule__PrimaryExpression__ValueAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__PrimaryExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1842:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:1843:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:1843:2: ( ( RULE_ID ) )
            // InternalDsl.g:1844:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getValueVariableCrossReference_2_1_0()); 
            // InternalDsl.g:1845:3: ( RULE_ID )
            // InternalDsl.g:1846:4: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000111002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000060L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000030L});

}