package oliv.form.xtext.fix.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import oliv.form.xtext.fix.services.FixGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFixParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*Courbe'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFixParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFixParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFixParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFix.g"; }



     	private FixGrammarAccess grammarAccess;

        public InternalFixParser(TokenStream input, FixGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected FixGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalFix.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalFix.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalFix.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalFix.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalFix.g:77:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // InternalFix.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // InternalFix.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFix.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // InternalFix.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    // InternalFix.g:80:4: lv_greetings_0_0= ruleGreeting
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"greetings",
            	    					lv_greetings_0_0,
            	    					"oliv.form.xtext.fix.Fix.Greeting");
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


    // $ANTLR start "entryRuleGreeting"
    // InternalFix.g:100:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalFix.g:100:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalFix.g:101:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalFix.g:107:1: ruleGreeting returns [EObject current=null] : (otherlv_0= '*Courbe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_points_2_0= rulePoint ) ) ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_points_2_0 = null;



        	enterRule();

        try {
            // InternalFix.g:113:2: ( (otherlv_0= '*Courbe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_points_2_0= rulePoint ) ) ) )
            // InternalFix.g:114:2: (otherlv_0= '*Courbe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_points_2_0= rulePoint ) ) )
            {
            // InternalFix.g:114:2: (otherlv_0= '*Courbe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_points_2_0= rulePoint ) ) )
            // InternalFix.g:115:3: otherlv_0= '*Courbe' ( (lv_name_1_0= RULE_ID ) ) ( (lv_points_2_0= rulePoint ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getCourbeKeyword_0());
            		
            // InternalFix.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFix.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFix.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalFix.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreetingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalFix.g:137:3: ( (lv_points_2_0= rulePoint ) )
            // InternalFix.g:138:4: (lv_points_2_0= rulePoint )
            {
            // InternalFix.g:138:4: (lv_points_2_0= rulePoint )
            // InternalFix.g:139:5: lv_points_2_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getGreetingAccess().getPointsPointParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_points_2_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGreetingRule());
            					}
            					add(
            						current,
            						"points",
            						lv_points_2_0,
            						"oliv.form.xtext.fix.Fix.Point");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRulePoint"
    // InternalFix.g:160:1: entryRulePoint returns [String current=null] : iv_rulePoint= rulePoint EOF ;
    public final String entryRulePoint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePoint = null;


        try {
            // InternalFix.g:160:45: (iv_rulePoint= rulePoint EOF )
            // InternalFix.g:161:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint.getText(); 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalFix.g:167:1: rulePoint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePoint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalFix.g:173:2: ( (this_INT_0= RULE_INT this_INT_1= RULE_INT ) )
            // InternalFix.g:174:2: (this_INT_0= RULE_INT this_INT_1= RULE_INT )
            {
            // InternalFix.g:174:2: (this_INT_0= RULE_INT this_INT_1= RULE_INT )
            // InternalFix.g:175:3: this_INT_0= RULE_INT this_INT_1= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getPointAccess().getINTTerminalRuleCall_0());
            		
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getPointAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "rulePoint"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});

}