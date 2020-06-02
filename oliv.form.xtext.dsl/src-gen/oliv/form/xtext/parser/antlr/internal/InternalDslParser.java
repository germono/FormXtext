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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_EXT_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nomImport'", "'import'", "'.*'", "'.'", "'Autre'", "'{'", "'Bob'", "'}'", "'Variable'", "'Alpha'", "':'", "'Beta'", "'VariableCalcule'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
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
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_EXT_INT=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
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
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_variables_2_0= ruleTruc ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_variables_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_variables_2_0= ruleTruc ) )* ) )
            // InternalDsl.g:78:2: ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_variables_2_0= ruleTruc ) )* )
            {
            // InternalDsl.g:78:2: ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_variables_2_0= ruleTruc ) )* )
            // InternalDsl.g:79:3: ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_variables_2_0= ruleTruc ) )*
            {
            // InternalDsl.g:79:3: ( (lv_package_0_0= rulePackageDeclaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:80:4: (lv_package_0_0= rulePackageDeclaration )
                    {
                    // InternalDsl.g:80:4: (lv_package_0_0= rulePackageDeclaration )
                    // InternalDsl.g:81:5: lv_package_0_0= rulePackageDeclaration
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getPackagePackageDeclarationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_package_0_0=rulePackageDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"package",
                    						lv_package_0_0,
                    						"oliv.form.xtext.Dsl.PackageDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:98:3: ( (lv_imports_1_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:99:4: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalDsl.g:99:4: (lv_imports_1_0= ruleImport )
            	    // InternalDsl.g:100:5: lv_imports_1_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"oliv.form.xtext.Dsl.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalDsl.g:117:3: ( (lv_variables_2_0= ruleTruc ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==20||LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:118:4: (lv_variables_2_0= ruleTruc )
            	    {
            	    // InternalDsl.g:118:4: (lv_variables_2_0= ruleTruc )
            	    // InternalDsl.g:119:5: lv_variables_2_0= ruleTruc
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVariablesTrucParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_variables_2_0=ruleTruc();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_2_0,
            	    						"oliv.form.xtext.Dsl.Truc");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalDsl.g:140:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalDsl.g:140:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalDsl.g:141:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalDsl.g:147:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'nomImport' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:153:2: ( (otherlv_0= 'nomImport' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalDsl.g:154:2: (otherlv_0= 'nomImport' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalDsl.g:154:2: (otherlv_0= 'nomImport' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalDsl.g:155:3: otherlv_0= 'nomImport' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getNomImportKeyword_0());
            		
            // InternalDsl.g:159:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDsl.g:160:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDsl.g:160:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDsl.g:161:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"oliv.form.xtext.Dsl.QualifiedName");
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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleImport"
    // InternalDsl.g:182:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDsl.g:182:47: (iv_ruleImport= ruleImport EOF )
            // InternalDsl.g:183:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDsl.g:189:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:195:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalDsl.g:196:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalDsl.g:196:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalDsl.g:197:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalDsl.g:201:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalDsl.g:202:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalDsl.g:202:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalDsl.g:203:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"oliv.form.xtext.Dsl.QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalDsl.g:224:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalDsl.g:224:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalDsl.g:225:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalDsl.g:231:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:237:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalDsl.g:238:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalDsl.g:238:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalDsl.g:239:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:249:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:250:4: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDsl.g:260:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDsl.g:260:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDsl.g:261:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDsl.g:267:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDsl.g:273:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDsl.g:274:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDsl.g:274:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDsl.g:275:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDsl.g:282:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:283:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleTruc"
    // InternalDsl.g:300:1: entryRuleTruc returns [EObject current=null] : iv_ruleTruc= ruleTruc EOF ;
    public final EObject entryRuleTruc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTruc = null;


        try {
            // InternalDsl.g:300:45: (iv_ruleTruc= ruleTruc EOF )
            // InternalDsl.g:301:2: iv_ruleTruc= ruleTruc EOF
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
    // InternalDsl.g:307:1: ruleTruc returns [EObject current=null] : (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre ) ;
    public final EObject ruleTruc() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDirect_0 = null;

        EObject this_VariableCalcule_1 = null;

        EObject this_Autre_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:313:2: ( (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre ) )
            // InternalDsl.g:314:2: (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre )
            {
            // InternalDsl.g:314:2: (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:315:3: this_VariableDirect_0= ruleVariableDirect
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
                    // InternalDsl.g:324:3: this_VariableCalcule_1= ruleVariableCalcule
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
                    // InternalDsl.g:333:3: this_Autre_2= ruleAutre
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
    // InternalDsl.g:345:1: entryRuleAutre returns [EObject current=null] : iv_ruleAutre= ruleAutre EOF ;
    public final EObject entryRuleAutre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutre = null;


        try {
            // InternalDsl.g:345:46: (iv_ruleAutre= ruleAutre EOF )
            // InternalDsl.g:346:2: iv_ruleAutre= ruleAutre EOF
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
    // InternalDsl.g:352:1: ruleAutre returns [EObject current=null] : (otherlv_0= 'Autre' otherlv_1= '{' otherlv_2= 'Bob' ( (lv_bob_3_0= ruleReel ) ) otherlv_4= '}' ) ;
    public final EObject ruleAutre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_bob_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:358:2: ( (otherlv_0= 'Autre' otherlv_1= '{' otherlv_2= 'Bob' ( (lv_bob_3_0= ruleReel ) ) otherlv_4= '}' ) )
            // InternalDsl.g:359:2: (otherlv_0= 'Autre' otherlv_1= '{' otherlv_2= 'Bob' ( (lv_bob_3_0= ruleReel ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:359:2: (otherlv_0= 'Autre' otherlv_1= '{' otherlv_2= 'Bob' ( (lv_bob_3_0= ruleReel ) ) otherlv_4= '}' )
            // InternalDsl.g:360:3: otherlv_0= 'Autre' otherlv_1= '{' otherlv_2= 'Bob' ( (lv_bob_3_0= ruleReel ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAutreAccess().getAutreKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAutreAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAutreAccess().getBobKeyword_2());
            		
            // InternalDsl.g:372:3: ( (lv_bob_3_0= ruleReel ) )
            // InternalDsl.g:373:4: (lv_bob_3_0= ruleReel )
            {
            // InternalDsl.g:373:4: (lv_bob_3_0= ruleReel )
            // InternalDsl.g:374:5: lv_bob_3_0= ruleReel
            {

            					newCompositeNode(grammarAccess.getAutreAccess().getBobReelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:399:1: entryRuleVariableDirect returns [EObject current=null] : iv_ruleVariableDirect= ruleVariableDirect EOF ;
    public final EObject entryRuleVariableDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDirect = null;


        try {
            // InternalDsl.g:399:55: (iv_ruleVariableDirect= ruleVariableDirect EOF )
            // InternalDsl.g:400:2: iv_ruleVariableDirect= ruleVariableDirect EOF
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
    // InternalDsl.g:406:1: ruleVariableDirect returns [EObject current=null] : (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Alpha' otherlv_4= ':' ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= 'Beta' otherlv_7= ':' ( (lv_beta_8_0= ruleReel ) ) otherlv_9= '}' ) ;
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
            // InternalDsl.g:412:2: ( (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Alpha' otherlv_4= ':' ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= 'Beta' otherlv_7= ':' ( (lv_beta_8_0= ruleReel ) ) otherlv_9= '}' ) )
            // InternalDsl.g:413:2: (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Alpha' otherlv_4= ':' ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= 'Beta' otherlv_7= ':' ( (lv_beta_8_0= ruleReel ) ) otherlv_9= '}' )
            {
            // InternalDsl.g:413:2: (otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Alpha' otherlv_4= ':' ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= 'Beta' otherlv_7= ':' ( (lv_beta_8_0= ruleReel ) ) otherlv_9= '}' )
            // InternalDsl.g:414:3: otherlv_0= 'Variable' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Alpha' otherlv_4= ':' ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= 'Beta' otherlv_7= ':' ( (lv_beta_8_0= ruleReel ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDirectAccess().getVariableKeyword_0());
            		
            // InternalDsl.g:418:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:419:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:419:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:420:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDirectAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableDirectAccess().getAlphaKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableDirectAccess().getColonKeyword_4());
            		
            // InternalDsl.g:448:3: ( (lv_alpha_5_0= ruleReel ) )
            // InternalDsl.g:449:4: (lv_alpha_5_0= ruleReel )
            {
            // InternalDsl.g:449:4: (lv_alpha_5_0= ruleReel )
            // InternalDsl.g:450:5: lv_alpha_5_0= ruleReel
            {

            					newCompositeNode(grammarAccess.getVariableDirectAccess().getAlphaReelParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_6=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getVariableDirectAccess().getBetaKeyword_6());
            		
            otherlv_7=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableDirectAccess().getColonKeyword_7());
            		
            // InternalDsl.g:475:3: ( (lv_beta_8_0= ruleReel ) )
            // InternalDsl.g:476:4: (lv_beta_8_0= ruleReel )
            {
            // InternalDsl.g:476:4: (lv_beta_8_0= ruleReel )
            // InternalDsl.g:477:5: lv_beta_8_0= ruleReel
            {

            					newCompositeNode(grammarAccess.getVariableDirectAccess().getBetaReelParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:502:1: entryRuleVariableCalcule returns [EObject current=null] : iv_ruleVariableCalcule= ruleVariableCalcule EOF ;
    public final EObject entryRuleVariableCalcule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCalcule = null;


        try {
            // InternalDsl.g:502:56: (iv_ruleVariableCalcule= ruleVariableCalcule EOF )
            // InternalDsl.g:503:2: iv_ruleVariableCalcule= ruleVariableCalcule EOF
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
    // InternalDsl.g:509:1: ruleVariableCalcule returns [EObject current=null] : (otherlv_0= 'VariableCalcule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleVariableCalcule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:515:2: ( (otherlv_0= 'VariableCalcule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // InternalDsl.g:516:2: (otherlv_0= 'VariableCalcule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // InternalDsl.g:516:2: (otherlv_0= 'VariableCalcule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            // InternalDsl.g:517:3: otherlv_0= 'VariableCalcule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableCalculeAccess().getVariableCalculeKeyword_0());
            		
            // InternalDsl.g:521:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:522:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:522:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:523:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableCalculeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:543:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalDsl.g:544:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalDsl.g:544:4: (lv_expression_3_0= ruleExpression )
            // InternalDsl.g:545:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getVariableCalculeAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

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
    // InternalDsl.g:570:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDsl.g:570:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDsl.g:571:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDsl.g:577:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:583:2: (this_Addition_0= ruleAddition )
            // InternalDsl.g:584:2: this_Addition_0= ruleAddition
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
    // InternalDsl.g:595:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalDsl.g:595:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalDsl.g:596:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalDsl.g:602:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:608:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalDsl.g:609:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalDsl.g:609:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalDsl.g:610:3: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:618:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=25 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:619:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalDsl.g:619:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==25) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==26) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalDsl.g:620:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalDsl.g:620:5: ( () otherlv_2= '+' )
            	            // InternalDsl.g:621:6: () otherlv_2= '+'
            	            {
            	            // InternalDsl.g:621:6: ()
            	            // InternalDsl.g:622:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,25,FOLLOW_15); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:634:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalDsl.g:634:5: ( () otherlv_4= '-' )
            	            // InternalDsl.g:635:6: () otherlv_4= '-'
            	            {
            	            // InternalDsl.g:635:6: ()
            	            // InternalDsl.g:636:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,26,FOLLOW_15); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDsl.g:648:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalDsl.g:649:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalDsl.g:649:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalDsl.g:650:6: lv_right_5_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    break loop8;
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
    // InternalDsl.g:672:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalDsl.g:672:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalDsl.g:673:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalDsl.g:679:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:685:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // InternalDsl.g:686:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // InternalDsl.g:686:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // InternalDsl.g:687:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:695:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=27 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:696:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // InternalDsl.g:696:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==27) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==28) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalDsl.g:697:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalDsl.g:697:5: ( () otherlv_2= '*' )
            	            // InternalDsl.g:698:6: () otherlv_2= '*'
            	            {
            	            // InternalDsl.g:698:6: ()
            	            // InternalDsl.g:699:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,27,FOLLOW_15); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:711:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalDsl.g:711:5: ( () otherlv_4= '/' )
            	            // InternalDsl.g:712:6: () otherlv_4= '/'
            	            {
            	            // InternalDsl.g:712:6: ()
            	            // InternalDsl.g:713:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,28,FOLLOW_15); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDsl.g:725:4: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // InternalDsl.g:726:5: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // InternalDsl.g:726:5: (lv_right_5_0= rulePrimaryExpression )
            	    // InternalDsl.g:727:6: lv_right_5_0= rulePrimaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop10;
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
    // InternalDsl.g:749:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalDsl.g:749:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalDsl.g:750:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalDsl.g:756:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject this_Expression_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:762:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) ) )
            // InternalDsl.g:763:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) )
            {
            // InternalDsl.g:763:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case RULE_INT:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDsl.g:764:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalDsl.g:764:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalDsl.g:765:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,30,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:783:3: ( () ( (lv_value_4_0= ruleReel ) ) )
                    {
                    // InternalDsl.g:783:3: ( () ( (lv_value_4_0= ruleReel ) ) )
                    // InternalDsl.g:784:4: () ( (lv_value_4_0= ruleReel ) )
                    {
                    // InternalDsl.g:784:4: ()
                    // InternalDsl.g:785:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:791:4: ( (lv_value_4_0= ruleReel ) )
                    // InternalDsl.g:792:5: (lv_value_4_0= ruleReel )
                    {
                    // InternalDsl.g:792:5: (lv_value_4_0= ruleReel )
                    // InternalDsl.g:793:6: lv_value_4_0= ruleReel
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
                    // InternalDsl.g:812:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalDsl.g:812:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    // InternalDsl.g:813:4: () ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalDsl.g:813:4: ()
                    // InternalDsl.g:814:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getVariableExpressionAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:820:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDsl.g:821:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDsl.g:821:5: (otherlv_6= RULE_ID )
                    // InternalDsl.g:822:6: otherlv_6= RULE_ID
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
    // InternalDsl.g:838:1: entryRuleReel returns [String current=null] : iv_ruleReel= ruleReel EOF ;
    public final String entryRuleReel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReel = null;


        try {
            // InternalDsl.g:838:44: (iv_ruleReel= ruleReel EOF )
            // InternalDsl.g:839:2: iv_ruleReel= ruleReel EOF
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
    // InternalDsl.g:845:1: ruleReel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? ) ;
    public final AntlrDatatypeRuleToken ruleReel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_EXT_INT_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalDsl.g:851:2: ( (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? ) )
            // InternalDsl.g:852:2: (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? )
            {
            // InternalDsl.g:852:2: (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? )
            // InternalDsl.g:853:3: this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getReelAccess().getINTTerminalRuleCall_0());
            		
            // InternalDsl.g:860:3: (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:861:4: kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
                    {
                    kw=(Token)match(input,15,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReelAccess().getFullStopKeyword_1_0());
                    			
                    // InternalDsl.g:866:4: (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_EXT_INT) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==RULE_INT) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalDsl.g:867:5: this_EXT_INT_2= RULE_EXT_INT
                            {
                            this_EXT_INT_2=(Token)match(input,RULE_EXT_INT,FOLLOW_2); 

                            					current.merge(this_EXT_INT_2);
                            				

                            					newLeafNode(this_EXT_INT_2, grammarAccess.getReelAccess().getEXT_INTTerminalRuleCall_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:875:5: this_INT_3= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001112002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001110002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000060L});

}