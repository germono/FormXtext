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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SPACE", "RULE_ID", "RULE_FDL", "RULE_NOMBRE", "RULE_NOMBRE1", "RULE_NOMBRE2", "RULE_NOMBRE3", "RULE_NOMBRE4", "RULE_NOMBRE5", "RULE_NOMBRE6", "RULE_NOMBRE7", "RULE_NOMBRE8", "RULE_CHIFF1", "RULE_CHIFF2", "RULE_CHIFF3", "RULE_CHIFF4", "RULE_CHIFF5", "RULE_CHIFF6", "RULE_CHIFF7", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'*Courbe'"
    };
    public static final int RULE_NOMBRE=7;
    public static final int RULE_STRING=23;
    public static final int RULE_SL_COMMENT=25;
    public static final int RULE_CHIFF4=19;
    public static final int RULE_CHIFF3=18;
    public static final int RULE_CHIFF2=17;
    public static final int RULE_CHIFF1=16;
    public static final int RULE_CHIFF7=22;
    public static final int RULE_CHIFF6=21;
    public static final int RULE_CHIFF5=20;
    public static final int RULE_SPACE=4;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=26;
    public static final int RULE_NOMBRE2=9;
    public static final int RULE_FDL=6;
    public static final int RULE_NOMBRE3=10;
    public static final int RULE_NOMBRE1=8;
    public static final int T__27=27;
    public static final int RULE_ML_COMMENT=24;
    public static final int RULE_NOMBRE8=15;
    public static final int RULE_NOMBRE6=13;
    public static final int RULE_NOMBRE7=14;
    public static final int RULE_NOMBRE4=11;
    public static final int RULE_NOMBRE5=12;

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
    // InternalFix.g:71:1: ruleModel returns [EObject current=null] : ( (lv_Courbes_0_0= ruleCourbe ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_Courbes_0_0 = null;



        	enterRule();

        try {
            // InternalFix.g:77:2: ( ( (lv_Courbes_0_0= ruleCourbe ) )* )
            // InternalFix.g:78:2: ( (lv_Courbes_0_0= ruleCourbe ) )*
            {
            // InternalFix.g:78:2: ( (lv_Courbes_0_0= ruleCourbe ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFix.g:79:3: (lv_Courbes_0_0= ruleCourbe )
            	    {
            	    // InternalFix.g:79:3: (lv_Courbes_0_0= ruleCourbe )
            	    // InternalFix.g:80:4: lv_Courbes_0_0= ruleCourbe
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getCourbesCourbeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_Courbes_0_0=ruleCourbe();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"Courbes",
            	    					lv_Courbes_0_0,
            	    					"oliv.form.xtext.fix.Fix.Courbe");
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


    // $ANTLR start "entryRuleCourbe"
    // InternalFix.g:100:1: entryRuleCourbe returns [EObject current=null] : iv_ruleCourbe= ruleCourbe EOF ;
    public final EObject entryRuleCourbe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCourbe = null;


        try {
            // InternalFix.g:100:47: (iv_ruleCourbe= ruleCourbe EOF )
            // InternalFix.g:101:2: iv_ruleCourbe= ruleCourbe EOF
            {
             newCompositeNode(grammarAccess.getCourbeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCourbe=ruleCourbe();

            state._fsp--;

             current =iv_ruleCourbe; 
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
    // $ANTLR end "entryRuleCourbe"


    // $ANTLR start "ruleCourbe"
    // InternalFix.g:107:1: ruleCourbe returns [EObject current=null] : (otherlv_0= '*Courbe' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) this_FDL_3= RULE_FDL ( (lv_lignes_4_0= ruleLigne ) )* ) ;
    public final EObject ruleCourbe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SPACE_1=null;
        Token lv_name_2_0=null;
        Token this_FDL_3=null;
        EObject lv_lignes_4_0 = null;



        	enterRule();

        try {
            // InternalFix.g:113:2: ( (otherlv_0= '*Courbe' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) this_FDL_3= RULE_FDL ( (lv_lignes_4_0= ruleLigne ) )* ) )
            // InternalFix.g:114:2: (otherlv_0= '*Courbe' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) this_FDL_3= RULE_FDL ( (lv_lignes_4_0= ruleLigne ) )* )
            {
            // InternalFix.g:114:2: (otherlv_0= '*Courbe' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) this_FDL_3= RULE_FDL ( (lv_lignes_4_0= ruleLigne ) )* )
            // InternalFix.g:115:3: otherlv_0= '*Courbe' this_SPACE_1= RULE_SPACE ( (lv_name_2_0= RULE_ID ) ) this_FDL_3= RULE_FDL ( (lv_lignes_4_0= ruleLigne ) )*
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCourbeAccess().getCourbeKeyword_0());
            		
            this_SPACE_1=(Token)match(input,RULE_SPACE,FOLLOW_5); 

            			newLeafNode(this_SPACE_1, grammarAccess.getCourbeAccess().getSPACETerminalRuleCall_1());
            		
            // InternalFix.g:123:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalFix.g:124:4: (lv_name_2_0= RULE_ID )
            {
            // InternalFix.g:124:4: (lv_name_2_0= RULE_ID )
            // InternalFix.g:125:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCourbeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCourbeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"oliv.form.xtext.fix.Fix.ID");
            				

            }


            }

            this_FDL_3=(Token)match(input,RULE_FDL,FOLLOW_7); 

            			newLeafNode(this_FDL_3, grammarAccess.getCourbeAccess().getFDLTerminalRuleCall_3());
            		
            // InternalFix.g:145:3: ( (lv_lignes_4_0= ruleLigne ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_NOMBRE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFix.g:146:4: (lv_lignes_4_0= ruleLigne )
            	    {
            	    // InternalFix.g:146:4: (lv_lignes_4_0= ruleLigne )
            	    // InternalFix.g:147:5: lv_lignes_4_0= ruleLigne
            	    {

            	    					newCompositeNode(grammarAccess.getCourbeAccess().getLignesLigneParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_lignes_4_0=ruleLigne();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCourbeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"lignes",
            	    						lv_lignes_4_0,
            	    						"oliv.form.xtext.fix.Fix.Ligne");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleCourbe"


    // $ANTLR start "entryRuleLigne"
    // InternalFix.g:168:1: entryRuleLigne returns [EObject current=null] : iv_ruleLigne= ruleLigne EOF ;
    public final EObject entryRuleLigne() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLigne = null;


        try {
            // InternalFix.g:168:46: (iv_ruleLigne= ruleLigne EOF )
            // InternalFix.g:169:2: iv_ruleLigne= ruleLigne EOF
            {
             newCompositeNode(grammarAccess.getLigneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLigne=ruleLigne();

            state._fsp--;

             current =iv_ruleLigne; 
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
    // $ANTLR end "entryRuleLigne"


    // $ANTLR start "ruleLigne"
    // InternalFix.g:175:1: ruleLigne returns [EObject current=null] : ( ( (lv_x_0_0= RULE_NOMBRE ) ) ( (lv_y_1_0= RULE_NOMBRE ) ) this_FDL_2= RULE_FDL ) ;
    public final EObject ruleLigne() throws RecognitionException {
        EObject current = null;

        Token lv_x_0_0=null;
        Token lv_y_1_0=null;
        Token this_FDL_2=null;


        	enterRule();

        try {
            // InternalFix.g:181:2: ( ( ( (lv_x_0_0= RULE_NOMBRE ) ) ( (lv_y_1_0= RULE_NOMBRE ) ) this_FDL_2= RULE_FDL ) )
            // InternalFix.g:182:2: ( ( (lv_x_0_0= RULE_NOMBRE ) ) ( (lv_y_1_0= RULE_NOMBRE ) ) this_FDL_2= RULE_FDL )
            {
            // InternalFix.g:182:2: ( ( (lv_x_0_0= RULE_NOMBRE ) ) ( (lv_y_1_0= RULE_NOMBRE ) ) this_FDL_2= RULE_FDL )
            // InternalFix.g:183:3: ( (lv_x_0_0= RULE_NOMBRE ) ) ( (lv_y_1_0= RULE_NOMBRE ) ) this_FDL_2= RULE_FDL
            {
            // InternalFix.g:183:3: ( (lv_x_0_0= RULE_NOMBRE ) )
            // InternalFix.g:184:4: (lv_x_0_0= RULE_NOMBRE )
            {
            // InternalFix.g:184:4: (lv_x_0_0= RULE_NOMBRE )
            // InternalFix.g:185:5: lv_x_0_0= RULE_NOMBRE
            {
            lv_x_0_0=(Token)match(input,RULE_NOMBRE,FOLLOW_8); 

            					newLeafNode(lv_x_0_0, grammarAccess.getLigneAccess().getXNOMBRETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLigneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_0_0,
            						"oliv.form.xtext.fix.Fix.NOMBRE");
            				

            }


            }

            // InternalFix.g:201:3: ( (lv_y_1_0= RULE_NOMBRE ) )
            // InternalFix.g:202:4: (lv_y_1_0= RULE_NOMBRE )
            {
            // InternalFix.g:202:4: (lv_y_1_0= RULE_NOMBRE )
            // InternalFix.g:203:5: lv_y_1_0= RULE_NOMBRE
            {
            lv_y_1_0=(Token)match(input,RULE_NOMBRE,FOLLOW_6); 

            					newLeafNode(lv_y_1_0, grammarAccess.getLigneAccess().getYNOMBRETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLigneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_1_0,
            						"oliv.form.xtext.fix.Fix.NOMBRE");
            				

            }


            }

            this_FDL_2=(Token)match(input,RULE_FDL,FOLLOW_2); 

            			newLeafNode(this_FDL_2, grammarAccess.getLigneAccess().getFDLTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleLigne"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});

}