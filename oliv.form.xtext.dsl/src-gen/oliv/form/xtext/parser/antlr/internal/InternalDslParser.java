package oliv.form.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import oliv.form.xtext.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_EXT_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Autre'", "'{'", "'Bob'", "'}'", "'Variable'", "'Alpha'", "':'", "'Beta'", "'VariableCalcule'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'.'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_EXT_INT=6;
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

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_variables_0_0= ruleTruc ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( (lv_variables_0_0= ruleTruc ) )* )
            // InternalDsl.g:78:2: ( (lv_variables_0_0= ruleTruc ) )*
            {
            // InternalDsl.g:78:2: ( (lv_variables_0_0= ruleTruc ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==16||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:79:3: (lv_variables_0_0= ruleTruc )
            	    {
            	    // InternalDsl.g:79:3: (lv_variables_0_0= ruleTruc )
            	    // InternalDsl.g:80:4: lv_variables_0_0= ruleTruc
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getVariablesTrucParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_variables_0_0=ruleTruc();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"variables",
            	    					lv_variables_0_0,
            	    					"oliv.form.xtext.Dsl.Truc");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTruc"
    // InternalDsl.g:100:1: entryRuleTruc returns [EObject current=null] : iv_ruleTruc= ruleTruc EOF ;
    public final EObject entryRuleTruc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTruc = null;


        try {
            // InternalDsl.g:100:45: (iv_ruleTruc= ruleTruc EOF )
            // InternalDsl.g:101:2: iv_ruleTruc= ruleTruc EOF
            {
             newCompositeNode(grammarAccess.getTrucRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTruc=ruleTruc();

            state._fsp--;

             current =iv_ruleTruc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTruc"


    // $ANTLR start "ruleTruc"
    // InternalDsl.g:107:1: ruleTruc returns [EObject current=null] : (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre ) ;
    public final EObject ruleTruc() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDirect_0 = null;

        EObject this_VariableCalcule_1 = null;

        EObject this_Autre_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:113:2: ( (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre ) )
            // InternalDsl.g:114:2: (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre )
            {
            // InternalDsl.g:114:2: (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre )
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
                    // InternalDsl.g:115:3: this_VariableDirect_0= ruleVariableDirect
                    {

                    			newCompositeNode(grammarAccess.getTrucAccess().getVariableDirectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDirect_0=ruleVariableDirect();

                    state._fsp--;


                    			current = this_VariableDirect_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:124:3: this_VariableCalcule_1= ruleVariableCalcule
                    {

                    			newCompositeNode(grammarAccess.getTrucAccess().getVariableCalculeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableCalcule_1=ruleVariableCalcule();

                    state._fsp--;


                    			current = this_VariableCalcule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:133:3: this_Autre_2= ruleAutre
                    {

                    			newCompositeNode(grammarAccess.getTrucAccess().getAutreParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Autre_2=ruleAutre();

                    state._fsp--;


                    			current = this_Autre_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTruc"


    // $ANTLR start "entryRuleAutre"
    // InternalDsl.g:145:1: entryRuleAutre returns [EObject current=null] : iv_ruleAutre= ruleAutre EOF ;
    public final EObject entryRuleAutre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutre = null;


        try {
            // InternalDsl.g:145:46: (iv_ruleAutre= ruleAutre EOF )
            // InternalDsl.g:146:2: iv_ruleAutre= ruleAutre EOF
            {
             newCompositeNode(grammarAccess.getAutreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutre=ruleAutre();

            state._fsp--;

             current =iv_ruleAutre; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutre"


    // $ANTLR start "ruleAutre"
    // InternalDsl.g:152:1: ruleAutre returns [EObject current=null] : (otherlv_0= 'Autre' otherlv_1= '{' otherlv_2= 'Bob' ( (lv_bob_3_0= ruleReel ) ) otherlv_4= '}' ) ;
    public final EObject ruleAutre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_bob_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:158:2: ( (otherlv_0= 'Autre' otherlv_1= '{' otherlv_2= 'Bob' ( (lv_bob_3_0= ruleReel ) ) otherlv_4= '}' ) )
            // InternalDsl.g:159:2: (otherlv_0= 'Autre' otherlv_1= '{' otherlv_2= 'Bob' ( (lv_bob_3_0= ruleReel ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:159:2: (otherlv_0= 'Autre' otherlv_1= '{' otherlv_2= 'Bob' ( (lv_bob_3_0= ruleReel ) ) otherlv_4= '}' )
            // InternalDsl.g:160:3: otherlv_0= 'Autre' otherlv_1= '{' otherlv_2= 'Bob' ( (lv_bob_3_0= ruleReel ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAutreAccess().getAutreKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAutreAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAutreAccess().getBobKeyword_2());
            		
            // InternalDsl.g:172:3: ( (lv_bob_3_0= ruleReel ) )
            // InternalDsl.g:173:4: (lv_bob_3_0= ruleReel )
            {
            // InternalDsl.g:173:4: (lv_bob_3_0= ruleReel )
            // InternalDsl.g:174:5: lv_bob_3_0= ruleReel
            {

            					newCompositeNode(grammarAccess.getAutreAccess().getBobReelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_bob_3_0=ruleReel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutreRule());
            					}
            					set(
            						current,
            						"bob",
            						lv_bob_3_0,
            						"oliv.form.xtext.Dsl.Reel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAutreAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutre"


    // $ANTLR start "entryRuleVariableDirect"
    // InternalDsl.g:199:1: entryRuleVariableDirect returns [EObject current=null] : iv_ruleVariableDirect= ruleVariableDirect EOF ;
    public final EObject entryRuleVariableDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDirect = null;


        try {
            // InternalDsl.g:199:55: (iv_ruleVariableDirect= ruleVariableDirect EOF )
            // InternalDsl.g:200:2: iv_ruleVariableDirect= ruleVariableDirect EOF
            {
             newCompositeNode(grammarAccess.getVariableDirectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDirect=ruleVariableDirect();

            state._fsp--;

             current =iv_ruleVariableDirect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDirect"


    // $ANTLR start "ruleVariableDirect"
    // InternalDsl.g:206:1: ruleVariableDirect returns [EObject current=null] : (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Alpha' otherlv_4= ':' ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= 'Beta' otherlv_7= ':' ( (lv_beta_8_0= ruleReel ) ) otherlv_9= '}' ) ;
    public final EObject ruleVariableDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_alpha_5_0 = null;

        AntlrDatatypeRuleToken lv_beta_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:212:2: ( (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Alpha' otherlv_4= ':' ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= 'Beta' otherlv_7= ':' ( (lv_beta_8_0= ruleReel ) ) otherlv_9= '}' ) )
            // InternalDsl.g:213:2: (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Alpha' otherlv_4= ':' ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= 'Beta' otherlv_7= ':' ( (lv_beta_8_0= ruleReel ) ) otherlv_9= '}' )
            {
            // InternalDsl.g:213:2: (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Alpha' otherlv_4= ':' ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= 'Beta' otherlv_7= ':' ( (lv_beta_8_0= ruleReel ) ) otherlv_9= '}' )
            // InternalDsl.g:214:3: otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Alpha' otherlv_4= ':' ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= 'Beta' otherlv_7= ':' ( (lv_beta_8_0= ruleReel ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDirectAccess().getVariableKeyword_0());
            		
            // InternalDsl.g:218:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:219:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:219:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:220:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDirectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDirectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDirectAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableDirectAccess().getAlphaKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableDirectAccess().getColonKeyword_4());
            		
            // InternalDsl.g:248:3: ( (lv_alpha_5_0= ruleReel ) )
            // InternalDsl.g:249:4: (lv_alpha_5_0= ruleReel )
            {
            // InternalDsl.g:249:4: (lv_alpha_5_0= ruleReel )
            // InternalDsl.g:250:5: lv_alpha_5_0= ruleReel
            {

            					newCompositeNode(grammarAccess.getVariableDirectAccess().getAlphaReelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_alpha_5_0=ruleReel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDirectRule());
            					}
            					set(
            						current,
            						"alpha",
            						lv_alpha_5_0,
            						"oliv.form.xtext.Dsl.Reel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getVariableDirectAccess().getBetaKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableDirectAccess().getColonKeyword_7());
            		
            // InternalDsl.g:275:3: ( (lv_beta_8_0= ruleReel ) )
            // InternalDsl.g:276:4: (lv_beta_8_0= ruleReel )
            {
            // InternalDsl.g:276:4: (lv_beta_8_0= ruleReel )
            // InternalDsl.g:277:5: lv_beta_8_0= ruleReel
            {

            					newCompositeNode(grammarAccess.getVariableDirectAccess().getBetaReelParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_beta_8_0=ruleReel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDirectRule());
            					}
            					set(
            						current,
            						"beta",
            						lv_beta_8_0,
            						"oliv.form.xtext.Dsl.Reel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getVariableDirectAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDirect"


    // $ANTLR start "entryRuleVariableCalcule"
    // InternalDsl.g:302:1: entryRuleVariableCalcule returns [EObject current=null] : iv_ruleVariableCalcule= ruleVariableCalcule EOF ;
    public final EObject entryRuleVariableCalcule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCalcule = null;


        try {
            // InternalDsl.g:302:56: (iv_ruleVariableCalcule= ruleVariableCalcule EOF )
            // InternalDsl.g:303:2: iv_ruleVariableCalcule= ruleVariableCalcule EOF
            {
             newCompositeNode(grammarAccess.getVariableCalculeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableCalcule=ruleVariableCalcule();

            state._fsp--;

             current =iv_ruleVariableCalcule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableCalcule"


    // $ANTLR start "ruleVariableCalcule"
    // InternalDsl.g:309:1: ruleVariableCalcule returns [EObject current=null] : (otherlv_0= 'VariableCalcule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleVariableCalcule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:315:2: ( (otherlv_0= 'VariableCalcule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // InternalDsl.g:316:2: (otherlv_0= 'VariableCalcule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:316:2: (otherlv_0= 'VariableCalcule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            // InternalDsl.g:317:3: otherlv_0= 'VariableCalcule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableCalculeAccess().getVariableCalculeKeyword_0());
            		
            // InternalDsl.g:321:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:322:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:322:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:323:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableCalculeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableCalculeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableCalculeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:343:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalDsl.g:344:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalDsl.g:344:4: (lv_expression_3_0= ruleExpression )
            // InternalDsl.g:345:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableCalculeAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableCalculeRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"oliv.form.xtext.Dsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableCalculeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableCalcule"


    // $ANTLR start "entryRuleExpression"
    // InternalDsl.g:370:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDsl.g:370:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDsl.g:371:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalDsl.g:377:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:383:2: (this_Addition_0= ruleAddition )
            // InternalDsl.g:384:2: this_Addition_0= ruleAddition
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;


            		current = this_Addition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalDsl.g:395:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalDsl.g:395:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalDsl.g:396:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalDsl.g:402:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:408:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalDsl.g:409:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalDsl.g:409:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalDsl.g:410:3: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:418:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=21 && LA4_0<=22)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDsl.g:419:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalDsl.g:419:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
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
            	            // InternalDsl.g:420:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalDsl.g:420:5: ( () otherlv_2= '+' )
            	            // InternalDsl.g:421:6: () otherlv_2= '+'
            	            {
            	            // InternalDsl.g:421:6: ()
            	            // InternalDsl.g:422:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,21,FOLLOW_12); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:434:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalDsl.g:434:5: ( () otherlv_4= '-' )
            	            // InternalDsl.g:435:6: () otherlv_4= '-'
            	            {
            	            // InternalDsl.g:435:6: ()
            	            // InternalDsl.g:436:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,22,FOLLOW_12); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDsl.g:448:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalDsl.g:449:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalDsl.g:449:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalDsl.g:450:6: lv_right_5_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"oliv.form.xtext.Dsl.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalDsl.g:472:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalDsl.g:472:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalDsl.g:473:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalDsl.g:479:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:485:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // InternalDsl.g:486:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // InternalDsl.g:486:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // InternalDsl.g:487:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:495:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=23 && LA6_0<=24)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:496:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // InternalDsl.g:496:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==23) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==24) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalDsl.g:497:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalDsl.g:497:5: ( () otherlv_2= '*' )
            	            // InternalDsl.g:498:6: () otherlv_2= '*'
            	            {
            	            // InternalDsl.g:498:6: ()
            	            // InternalDsl.g:499:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,23,FOLLOW_12); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:511:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalDsl.g:511:5: ( () otherlv_4= '/' )
            	            // InternalDsl.g:512:6: () otherlv_4= '/'
            	            {
            	            // InternalDsl.g:512:6: ()
            	            // InternalDsl.g:513:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,24,FOLLOW_12); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDsl.g:525:4: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // InternalDsl.g:526:5: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // InternalDsl.g:526:5: (lv_right_5_0= rulePrimaryExpression )
            	    // InternalDsl.g:527:6: lv_right_5_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_5_0=rulePrimaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"oliv.form.xtext.Dsl.PrimaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalDsl.g:549:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalDsl.g:549:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalDsl.g:550:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalDsl.g:556:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject this_Expression_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:562:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) ) )
            // InternalDsl.g:563:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) )
            {
            // InternalDsl.g:563:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDsl.g:564:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalDsl.g:564:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalDsl.g:565:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:583:3: ( () ( (lv_value_4_0= ruleReel ) ) )
                    {
                    // InternalDsl.g:583:3: ( () ( (lv_value_4_0= ruleReel ) ) )
                    // InternalDsl.g:584:4: () ( (lv_value_4_0= ruleReel ) )
                    {
                    // InternalDsl.g:584:4: ()
                    // InternalDsl.g:585:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:591:4: ( (lv_value_4_0= ruleReel ) )
                    // InternalDsl.g:592:5: (lv_value_4_0= ruleReel )
                    {
                    // InternalDsl.g:592:5: (lv_value_4_0= ruleReel )
                    // InternalDsl.g:593:6: lv_value_4_0= ruleReel
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueReelParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_4_0=ruleReel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"oliv.form.xtext.Dsl.Reel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:612:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalDsl.g:612:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    // InternalDsl.g:613:4: () ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalDsl.g:613:4: ()
                    // InternalDsl.g:614:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getVariableExpressionAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:620:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDsl.g:621:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDsl.g:621:5: (otherlv_6= RULE_ID )
                    // InternalDsl.g:622:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getValueVariableCrossReference_2_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleReel"
    // InternalDsl.g:638:1: entryRuleReel returns [String current=null] : iv_ruleReel= ruleReel EOF ;
    public final String entryRuleReel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReel = null;


        try {
            // InternalDsl.g:638:44: (iv_ruleReel= ruleReel EOF )
            // InternalDsl.g:639:2: iv_ruleReel= ruleReel EOF
            {
             newCompositeNode(grammarAccess.getReelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReel=ruleReel();

            state._fsp--;

             current =iv_ruleReel.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReel"


    // $ANTLR start "ruleReel"
    // InternalDsl.g:645:1: ruleReel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? ) ;
    public final AntlrDatatypeRuleToken ruleReel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_EXT_INT_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalDsl.g:651:2: ( (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? ) )
            // InternalDsl.g:652:2: (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? )
            {
            // InternalDsl.g:652:2: (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? )
            // InternalDsl.g:653:3: this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getReelAccess().getINTTerminalRuleCall_0());
            		
            // InternalDsl.g:660:3: (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:661:4: kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
                    {
                    kw=(Token)match(input,27,FOLLOW_17); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReelAccess().getFullStopKeyword_1_0());
                    			
                    // InternalDsl.g:666:4: (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_EXT_INT) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==RULE_INT) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalDsl.g:667:5: this_EXT_INT_2= RULE_EXT_INT
                            {
                            this_EXT_INT_2=(Token)match(input,RULE_EXT_INT,FOLLOW_2); 

                            					current.merge(this_EXT_INT_2);
                            				

                            					newLeafNode(this_EXT_INT_2, grammarAccess.getReelAccess().getEXT_INTTerminalRuleCall_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:675:5: this_INT_3= RULE_INT
                            {
                            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                            					current.merge(this_INT_3);
                            				

                            					newLeafNode(this_INT_3, grammarAccess.getReelAccess().getINTTerminalRuleCall_1_1_1());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000111002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000060L});

}