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
    // InternalDslParser.g:57:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDslParser.g:57:46: (iv_ruleModel= ruleModel EOF )
            // InternalDslParser.g:58:2: iv_ruleModel= ruleModel EOF
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
    // InternalDslParser.g:64:1: ruleModel returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_variables_2_0= ruleTruc ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_variables_2_0 = null;



        	enterRule();

        try {
            // InternalDslParser.g:70:2: ( ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_variables_2_0= ruleTruc ) )* ) )
            // InternalDslParser.g:71:2: ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_variables_2_0= ruleTruc ) )* )
            {
            // InternalDslParser.g:71:2: ( ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_variables_2_0= ruleTruc ) )* )
            // InternalDslParser.g:72:3: ( (lv_package_0_0= rulePackageDeclaration ) )? ( (lv_imports_1_0= ruleImport ) )* ( (lv_variables_2_0= ruleTruc ) )*
            {
            // InternalDslParser.g:72:3: ( (lv_package_0_0= rulePackageDeclaration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==NomImport) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDslParser.g:73:4: (lv_package_0_0= rulePackageDeclaration )
                    {
                    // InternalDslParser.g:73:4: (lv_package_0_0= rulePackageDeclaration )
                    // InternalDslParser.g:74:5: lv_package_0_0= rulePackageDeclaration
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

            // InternalDslParser.g:91:3: ( (lv_imports_1_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Import) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDslParser.g:92:4: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalDslParser.g:92:4: (lv_imports_1_0= ruleImport )
            	    // InternalDslParser.g:93:5: lv_imports_1_0= ruleImport
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

            // InternalDslParser.g:110:3: ( (lv_variables_2_0= ruleTruc ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==VariableCalcule||LA3_0==Variable||LA3_0==Autre) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDslParser.g:111:4: (lv_variables_2_0= ruleTruc )
            	    {
            	    // InternalDslParser.g:111:4: (lv_variables_2_0= ruleTruc )
            	    // InternalDslParser.g:112:5: lv_variables_2_0= ruleTruc
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
    // InternalDslParser.g:133:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalDslParser.g:133:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalDslParser.g:134:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
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
    // InternalDslParser.g:140:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= NomImport ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDslParser.g:146:2: ( (otherlv_0= NomImport ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalDslParser.g:147:2: (otherlv_0= NomImport ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalDslParser.g:147:2: (otherlv_0= NomImport ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalDslParser.g:148:3: otherlv_0= NomImport ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,NomImport,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getNomImportKeyword_0());
            		
            // InternalDslParser.g:152:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDslParser.g:153:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDslParser.g:153:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDslParser.g:154:5: lv_name_1_0= ruleQualifiedName
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
    // InternalDslParser.g:175:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDslParser.g:175:47: (iv_ruleImport= ruleImport EOF )
            // InternalDslParser.g:176:2: iv_ruleImport= ruleImport EOF
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
    // InternalDslParser.g:182:1: ruleImport returns [EObject current=null] : (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDslParser.g:188:2: ( (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalDslParser.g:189:2: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalDslParser.g:189:2: (otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalDslParser.g:190:3: otherlv_0= Import ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalDslParser.g:194:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalDslParser.g:195:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalDslParser.g:195:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalDslParser.g:196:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalDslParser.g:217:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalDslParser.g:217:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalDslParser.g:218:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalDslParser.g:224:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDslParser.g:230:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? ) )
            // InternalDslParser.g:231:2: (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? )
            {
            // InternalDslParser.g:231:2: (this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )? )
            // InternalDslParser.g:232:3: this_QualifiedName_0= ruleQualifiedName (kw= FullStopAsterisk )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDslParser.g:242:3: (kw= FullStopAsterisk )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==FullStopAsterisk) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDslParser.g:243:4: kw= FullStopAsterisk
                    {
                    kw=(Token)match(input,FullStopAsterisk,FOLLOW_2); 

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
    // InternalDslParser.g:253:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDslParser.g:253:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDslParser.g:254:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalDslParser.g:260:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDslParser.g:266:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalDslParser.g:267:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalDslParser.g:267:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalDslParser.g:268:3: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDslParser.g:275:3: (kw= FullStop this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==FullStop) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDslParser.g:276:4: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_5); 

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
    // InternalDslParser.g:293:1: entryRuleTruc returns [EObject current=null] : iv_ruleTruc= ruleTruc EOF ;
    public final EObject entryRuleTruc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTruc = null;


        try {
            // InternalDslParser.g:293:45: (iv_ruleTruc= ruleTruc EOF )
            // InternalDslParser.g:294:2: iv_ruleTruc= ruleTruc EOF
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
    // InternalDslParser.g:300:1: ruleTruc returns [EObject current=null] : (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre ) ;
    public final EObject ruleTruc() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDirect_0 = null;

        EObject this_VariableCalcule_1 = null;

        EObject this_Autre_2 = null;



        	enterRule();

        try {
            // InternalDslParser.g:306:2: ( (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre ) )
            // InternalDslParser.g:307:2: (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre )
            {
            // InternalDslParser.g:307:2: (this_VariableDirect_0= ruleVariableDirect | this_VariableCalcule_1= ruleVariableCalcule | this_Autre_2= ruleAutre )
            int alt6=3;
            switch ( input.LA(1) ) {
            case Variable:
                {
                alt6=1;
                }
                break;
            case VariableCalcule:
                {
                alt6=2;
                }
                break;
            case Autre:
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
                    // InternalDslParser.g:308:3: this_VariableDirect_0= ruleVariableDirect
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
                    // InternalDslParser.g:317:3: this_VariableCalcule_1= ruleVariableCalcule
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
                    // InternalDslParser.g:326:3: this_Autre_2= ruleAutre
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
    // InternalDslParser.g:338:1: entryRuleAutre returns [EObject current=null] : iv_ruleAutre= ruleAutre EOF ;
    public final EObject entryRuleAutre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutre = null;


        try {
            // InternalDslParser.g:338:46: (iv_ruleAutre= ruleAutre EOF )
            // InternalDslParser.g:339:2: iv_ruleAutre= ruleAutre EOF
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
    // InternalDslParser.g:345:1: ruleAutre returns [EObject current=null] : (otherlv_0= Autre this_BEGIN_1= RULE_BEGIN otherlv_2= Bob ( (lv_bob_3_0= ruleReel ) ) this_END_4= RULE_END ) ;
    public final EObject ruleAutre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_bob_3_0 = null;



        	enterRule();

        try {
            // InternalDslParser.g:351:2: ( (otherlv_0= Autre this_BEGIN_1= RULE_BEGIN otherlv_2= Bob ( (lv_bob_3_0= ruleReel ) ) this_END_4= RULE_END ) )
            // InternalDslParser.g:352:2: (otherlv_0= Autre this_BEGIN_1= RULE_BEGIN otherlv_2= Bob ( (lv_bob_3_0= ruleReel ) ) this_END_4= RULE_END )
            {
            // InternalDslParser.g:352:2: (otherlv_0= Autre this_BEGIN_1= RULE_BEGIN otherlv_2= Bob ( (lv_bob_3_0= ruleReel ) ) this_END_4= RULE_END )
            // InternalDslParser.g:353:3: otherlv_0= Autre this_BEGIN_1= RULE_BEGIN otherlv_2= Bob ( (lv_bob_3_0= ruleReel ) ) this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Autre,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAutreAccess().getAutreKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_9); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getAutreAccess().getBEGINTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Bob,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getAutreAccess().getBobKeyword_2());
            		
            // InternalDslParser.g:365:3: ( (lv_bob_3_0= ruleReel ) )
            // InternalDslParser.g:366:4: (lv_bob_3_0= ruleReel )
            {
            // InternalDslParser.g:366:4: (lv_bob_3_0= ruleReel )
            // InternalDslParser.g:367:5: lv_bob_3_0= ruleReel
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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getAutreAccess().getENDTerminalRuleCall_4());
            		

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
    // InternalDslParser.g:392:1: entryRuleVariableDirect returns [EObject current=null] : iv_ruleVariableDirect= ruleVariableDirect EOF ;
    public final EObject entryRuleVariableDirect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDirect = null;


        try {
            // InternalDslParser.g:392:55: (iv_ruleVariableDirect= ruleVariableDirect EOF )
            // InternalDslParser.g:393:2: iv_ruleVariableDirect= ruleVariableDirect EOF
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
    // InternalDslParser.g:399:1: ruleVariableDirect returns [EObject current=null] : (otherlv_0= Variable ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Alpha otherlv_4= Colon ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= Beta otherlv_7= Colon ( (lv_beta_8_0= ruleReel ) ) this_END_9= RULE_END ) ;
    public final EObject ruleVariableDirect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_END_9=null;
        AntlrDatatypeRuleToken lv_alpha_5_0 = null;

        AntlrDatatypeRuleToken lv_beta_8_0 = null;



        	enterRule();

        try {
            // InternalDslParser.g:405:2: ( (otherlv_0= Variable ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Alpha otherlv_4= Colon ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= Beta otherlv_7= Colon ( (lv_beta_8_0= ruleReel ) ) this_END_9= RULE_END ) )
            // InternalDslParser.g:406:2: (otherlv_0= Variable ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Alpha otherlv_4= Colon ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= Beta otherlv_7= Colon ( (lv_beta_8_0= ruleReel ) ) this_END_9= RULE_END )
            {
            // InternalDslParser.g:406:2: (otherlv_0= Variable ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Alpha otherlv_4= Colon ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= Beta otherlv_7= Colon ( (lv_beta_8_0= ruleReel ) ) this_END_9= RULE_END )
            // InternalDslParser.g:407:3: otherlv_0= Variable ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Alpha otherlv_4= Colon ( (lv_alpha_5_0= ruleReel ) ) otherlv_6= Beta otherlv_7= Colon ( (lv_beta_8_0= ruleReel ) ) this_END_9= RULE_END
            {
            otherlv_0=(Token)match(input,Variable,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDirectAccess().getVariableKeyword_0());
            		
            // InternalDslParser.g:411:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDslParser.g:412:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDslParser.g:412:4: (lv_name_1_0= RULE_ID )
            // InternalDslParser.g:413:5: lv_name_1_0= RULE_ID
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

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_12); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getVariableDirectAccess().getBEGINTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Alpha,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableDirectAccess().getAlphaKeyword_3());
            		
            otherlv_4=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableDirectAccess().getColonKeyword_4());
            		
            // InternalDslParser.g:441:3: ( (lv_alpha_5_0= ruleReel ) )
            // InternalDslParser.g:442:4: (lv_alpha_5_0= ruleReel )
            {
            // InternalDslParser.g:442:4: (lv_alpha_5_0= ruleReel )
            // InternalDslParser.g:443:5: lv_alpha_5_0= ruleReel
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

            otherlv_6=(Token)match(input,Beta,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getVariableDirectAccess().getBetaKeyword_6());
            		
            otherlv_7=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableDirectAccess().getColonKeyword_7());
            		
            // InternalDslParser.g:468:3: ( (lv_beta_8_0= ruleReel ) )
            // InternalDslParser.g:469:4: (lv_beta_8_0= ruleReel )
            {
            // InternalDslParser.g:469:4: (lv_beta_8_0= ruleReel )
            // InternalDslParser.g:470:5: lv_beta_8_0= ruleReel
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

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_9, grammarAccess.getVariableDirectAccess().getENDTerminalRuleCall_9());
            		

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
    // InternalDslParser.g:495:1: entryRuleVariableCalcule returns [EObject current=null] : iv_ruleVariableCalcule= ruleVariableCalcule EOF ;
    public final EObject entryRuleVariableCalcule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableCalcule = null;


        try {
            // InternalDslParser.g:495:56: (iv_ruleVariableCalcule= ruleVariableCalcule EOF )
            // InternalDslParser.g:496:2: iv_ruleVariableCalcule= ruleVariableCalcule EOF
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
    // InternalDslParser.g:502:1: ruleVariableCalcule returns [EObject current=null] : (otherlv_0= VariableCalcule ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_expression_3_0= ruleExpression ) ) this_END_4= RULE_END ) ;
    public final EObject ruleVariableCalcule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalDslParser.g:508:2: ( (otherlv_0= VariableCalcule ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_expression_3_0= ruleExpression ) ) this_END_4= RULE_END ) )
            // InternalDslParser.g:509:2: (otherlv_0= VariableCalcule ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_expression_3_0= ruleExpression ) ) this_END_4= RULE_END )
            {
            // InternalDslParser.g:509:2: (otherlv_0= VariableCalcule ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_expression_3_0= ruleExpression ) ) this_END_4= RULE_END )
            // InternalDslParser.g:510:3: otherlv_0= VariableCalcule ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_expression_3_0= ruleExpression ) ) this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,VariableCalcule,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableCalculeAccess().getVariableCalculeKeyword_0());
            		
            // InternalDslParser.g:514:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDslParser.g:515:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDslParser.g:515:4: (lv_name_1_0= RULE_ID )
            // InternalDslParser.g:516:5: lv_name_1_0= RULE_ID
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

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getVariableCalculeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalDslParser.g:536:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalDslParser.g:537:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalDslParser.g:537:4: (lv_expression_3_0= ruleExpression )
            // InternalDslParser.g:538:5: lv_expression_3_0= ruleExpression
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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getVariableCalculeAccess().getENDTerminalRuleCall_4());
            		

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
    // InternalDslParser.g:563:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalDslParser.g:563:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalDslParser.g:564:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalDslParser.g:570:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalDslParser.g:576:2: (this_Addition_0= ruleAddition )
            // InternalDslParser.g:577:2: this_Addition_0= ruleAddition
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
    // InternalDslParser.g:588:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalDslParser.g:588:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalDslParser.g:589:2: iv_ruleAddition= ruleAddition EOF
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
    // InternalDslParser.g:595:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDslParser.g:601:2: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // InternalDslParser.g:602:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // InternalDslParser.g:602:2: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // InternalDslParser.g:603:3: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDslParser.g:611:3: ( ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=PlusSign && LA8_0<=HyphenMinus)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDslParser.g:612:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // InternalDslParser.g:612:4: ( ( () otherlv_2= PlusSign ) | ( () otherlv_4= HyphenMinus ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==PlusSign) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==HyphenMinus) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalDslParser.g:613:5: ( () otherlv_2= PlusSign )
            	            {
            	            // InternalDslParser.g:613:5: ( () otherlv_2= PlusSign )
            	            // InternalDslParser.g:614:6: () otherlv_2= PlusSign
            	            {
            	            // InternalDslParser.g:614:6: ()
            	            // InternalDslParser.g:615:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,PlusSign,FOLLOW_15); 

            	            						newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDslParser.g:627:5: ( () otherlv_4= HyphenMinus )
            	            {
            	            // InternalDslParser.g:627:5: ( () otherlv_4= HyphenMinus )
            	            // InternalDslParser.g:628:6: () otherlv_4= HyphenMinus
            	            {
            	            // InternalDslParser.g:628:6: ()
            	            // InternalDslParser.g:629:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,HyphenMinus,FOLLOW_15); 

            	            						newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDslParser.g:641:4: ( (lv_right_5_0= ruleMultiplication ) )
            	    // InternalDslParser.g:642:5: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // InternalDslParser.g:642:5: (lv_right_5_0= ruleMultiplication )
            	    // InternalDslParser.g:643:6: lv_right_5_0= ruleMultiplication
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
    // InternalDslParser.g:665:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalDslParser.g:665:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalDslParser.g:666:2: iv_ruleMultiplication= ruleMultiplication EOF
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
    // InternalDslParser.g:672:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalDslParser.g:678:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // InternalDslParser.g:679:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // InternalDslParser.g:679:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // InternalDslParser.g:680:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDslParser.g:688:3: ( ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Asterisk||LA10_0==Solidus) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDslParser.g:689:4: ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // InternalDslParser.g:689:4: ( ( () otherlv_2= Asterisk ) | ( () otherlv_4= Solidus ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==Asterisk) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==Solidus) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalDslParser.g:690:5: ( () otherlv_2= Asterisk )
            	            {
            	            // InternalDslParser.g:690:5: ( () otherlv_2= Asterisk )
            	            // InternalDslParser.g:691:6: () otherlv_2= Asterisk
            	            {
            	            // InternalDslParser.g:691:6: ()
            	            // InternalDslParser.g:692:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,Asterisk,FOLLOW_15); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDslParser.g:704:5: ( () otherlv_4= Solidus )
            	            {
            	            // InternalDslParser.g:704:5: ( () otherlv_4= Solidus )
            	            // InternalDslParser.g:705:6: () otherlv_4= Solidus
            	            {
            	            // InternalDslParser.g:705:6: ()
            	            // InternalDslParser.g:706:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,Solidus,FOLLOW_15); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalDslParser.g:718:4: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // InternalDslParser.g:719:5: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // InternalDslParser.g:719:5: (lv_right_5_0= rulePrimaryExpression )
            	    // InternalDslParser.g:720:6: lv_right_5_0= rulePrimaryExpression
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
    // InternalDslParser.g:742:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalDslParser.g:742:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalDslParser.g:743:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalDslParser.g:749:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject this_Expression_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalDslParser.g:755:2: ( ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) ) )
            // InternalDslParser.g:756:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) )
            {
            // InternalDslParser.g:756:2: ( (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis ) | ( () ( (lv_value_4_0= ruleReel ) ) ) | ( () ( (otherlv_6= RULE_ID ) ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
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
                    // InternalDslParser.g:757:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    {
                    // InternalDslParser.g:757:3: (otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis )
                    // InternalDslParser.g:758:4: otherlv_0= LeftParenthesis this_Expression_1= ruleExpression otherlv_2= RightParenthesis
                    {
                    otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_18);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,RightParenthesis,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDslParser.g:776:3: ( () ( (lv_value_4_0= ruleReel ) ) )
                    {
                    // InternalDslParser.g:776:3: ( () ( (lv_value_4_0= ruleReel ) ) )
                    // InternalDslParser.g:777:4: () ( (lv_value_4_0= ruleReel ) )
                    {
                    // InternalDslParser.g:777:4: ()
                    // InternalDslParser.g:778:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDslParser.g:784:4: ( (lv_value_4_0= ruleReel ) )
                    // InternalDslParser.g:785:5: (lv_value_4_0= ruleReel )
                    {
                    // InternalDslParser.g:785:5: (lv_value_4_0= ruleReel )
                    // InternalDslParser.g:786:6: lv_value_4_0= ruleReel
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
                    // InternalDslParser.g:805:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalDslParser.g:805:3: ( () ( (otherlv_6= RULE_ID ) ) )
                    // InternalDslParser.g:806:4: () ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalDslParser.g:806:4: ()
                    // InternalDslParser.g:807:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryExpressionAccess().getVariableExpressionAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDslParser.g:813:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDslParser.g:814:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDslParser.g:814:5: (otherlv_6= RULE_ID )
                    // InternalDslParser.g:815:6: otherlv_6= RULE_ID
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
    // InternalDslParser.g:831:1: entryRuleReel returns [String current=null] : iv_ruleReel= ruleReel EOF ;
    public final String entryRuleReel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReel = null;


        try {
            // InternalDslParser.g:831:44: (iv_ruleReel= ruleReel EOF )
            // InternalDslParser.g:832:2: iv_ruleReel= ruleReel EOF
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
    // InternalDslParser.g:838:1: ruleReel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? ) ;
    public final AntlrDatatypeRuleToken ruleReel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_EXT_INT_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalDslParser.g:844:2: ( (this_INT_0= RULE_INT (kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? ) )
            // InternalDslParser.g:845:2: (this_INT_0= RULE_INT (kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? )
            {
            // InternalDslParser.g:845:2: (this_INT_0= RULE_INT (kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? )
            // InternalDslParser.g:846:3: this_INT_0= RULE_INT (kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_7); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getReelAccess().getINTTerminalRuleCall_0());
            		
            // InternalDslParser.g:853:3: (kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FullStop) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDslParser.g:854:4: kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
                    {
                    kw=(Token)match(input,FullStop,FOLLOW_19); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getReelAccess().getFullStopKeyword_1_0());
                    			
                    // InternalDslParser.g:859:4: (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
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
                            // InternalDslParser.g:860:5: this_EXT_INT_2= RULE_EXT_INT
                            {
                            this_EXT_INT_2=(Token)match(input,RULE_EXT_INT,FOLLOW_2); 

                            					current.merge(this_EXT_INT_2);
                            				

                            					newLeafNode(this_EXT_INT_2, grammarAccess.getReelAccess().getEXT_INTTerminalRuleCall_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDslParser.g:868:5: this_INT_3= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000002D2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000252L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002202000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000600000L});

}