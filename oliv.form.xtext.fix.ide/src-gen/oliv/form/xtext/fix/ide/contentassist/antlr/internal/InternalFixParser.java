package oliv.form.xtext.fix.ide.contentassist.antlr.internal;

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
import oliv.form.xtext.fix.services.FixGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFixParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*Courbe'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(FixGrammarAccess grammarAccess) {
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
    // InternalFix.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalFix.g:54:1: ( ruleModel EOF )
            // InternalFix.g:55:1: ruleModel EOF
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
    // InternalFix.g:62:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:66:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalFix.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalFix.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            // InternalFix.g:68:3: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalFix.g:69:3: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFix.g:69:4: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

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


    // $ANTLR start "entryRuleGreeting"
    // InternalFix.g:78:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalFix.g:79:1: ( ruleGreeting EOF )
            // InternalFix.g:80:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalFix.g:87:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:91:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // InternalFix.g:92:2: ( ( rule__Greeting__Group__0 ) )
            {
            // InternalFix.g:92:2: ( ( rule__Greeting__Group__0 ) )
            // InternalFix.g:93:3: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // InternalFix.g:94:3: ( rule__Greeting__Group__0 )
            // InternalFix.g:94:4: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRulePoint"
    // InternalFix.g:103:1: entryRulePoint : rulePoint EOF ;
    public final void entryRulePoint() throws RecognitionException {
        try {
            // InternalFix.g:104:1: ( rulePoint EOF )
            // InternalFix.g:105:1: rulePoint EOF
            {
             before(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getPointRule()); 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalFix.g:112:1: rulePoint : ( ( rule__Point__Group__0 ) ) ;
    public final void rulePoint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:116:2: ( ( ( rule__Point__Group__0 ) ) )
            // InternalFix.g:117:2: ( ( rule__Point__Group__0 ) )
            {
            // InternalFix.g:117:2: ( ( rule__Point__Group__0 ) )
            // InternalFix.g:118:3: ( rule__Point__Group__0 )
            {
             before(grammarAccess.getPointAccess().getGroup()); 
            // InternalFix.g:119:3: ( rule__Point__Group__0 )
            // InternalFix.g:119:4: rule__Point__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPointAccess().getGroup()); 

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "rule__Greeting__Group__0"
    // InternalFix.g:127:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:131:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalFix.g:132:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__1();

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
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // InternalFix.g:139:1: rule__Greeting__Group__0__Impl : ( '*Courbe' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:143:1: ( ( '*Courbe' ) )
            // InternalFix.g:144:1: ( '*Courbe' )
            {
            // InternalFix.g:144:1: ( '*Courbe' )
            // InternalFix.g:145:2: '*Courbe'
            {
             before(grammarAccess.getGreetingAccess().getCourbeKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getCourbeKeyword_0()); 

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
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // InternalFix.g:154:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:158:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // InternalFix.g:159:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2();

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
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // InternalFix.g:166:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:170:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // InternalFix.g:171:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // InternalFix.g:171:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // InternalFix.g:172:2: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // InternalFix.g:173:2: ( rule__Greeting__NameAssignment_1 )
            // InternalFix.g:173:3: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // InternalFix.g:181:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:185:1: ( rule__Greeting__Group__2__Impl )
            // InternalFix.g:186:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2__Impl();

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
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // InternalFix.g:192:1: rule__Greeting__Group__2__Impl : ( ( rule__Greeting__PointsAssignment_2 ) ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:196:1: ( ( ( rule__Greeting__PointsAssignment_2 ) ) )
            // InternalFix.g:197:1: ( ( rule__Greeting__PointsAssignment_2 ) )
            {
            // InternalFix.g:197:1: ( ( rule__Greeting__PointsAssignment_2 ) )
            // InternalFix.g:198:2: ( rule__Greeting__PointsAssignment_2 )
            {
             before(grammarAccess.getGreetingAccess().getPointsAssignment_2()); 
            // InternalFix.g:199:2: ( rule__Greeting__PointsAssignment_2 )
            // InternalFix.g:199:3: rule__Greeting__PointsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__PointsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getPointsAssignment_2()); 

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
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Point__Group__0"
    // InternalFix.g:208:1: rule__Point__Group__0 : rule__Point__Group__0__Impl rule__Point__Group__1 ;
    public final void rule__Point__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:212:1: ( rule__Point__Group__0__Impl rule__Point__Group__1 )
            // InternalFix.g:213:2: rule__Point__Group__0__Impl rule__Point__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Point__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Point__Group__1();

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
    // $ANTLR end "rule__Point__Group__0"


    // $ANTLR start "rule__Point__Group__0__Impl"
    // InternalFix.g:220:1: rule__Point__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Point__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:224:1: ( ( RULE_INT ) )
            // InternalFix.g:225:1: ( RULE_INT )
            {
            // InternalFix.g:225:1: ( RULE_INT )
            // InternalFix.g:226:2: RULE_INT
            {
             before(grammarAccess.getPointAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Point__Group__0__Impl"


    // $ANTLR start "rule__Point__Group__1"
    // InternalFix.g:235:1: rule__Point__Group__1 : rule__Point__Group__1__Impl ;
    public final void rule__Point__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:239:1: ( rule__Point__Group__1__Impl )
            // InternalFix.g:240:2: rule__Point__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Point__Group__1__Impl();

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
    // $ANTLR end "rule__Point__Group__1"


    // $ANTLR start "rule__Point__Group__1__Impl"
    // InternalFix.g:246:1: rule__Point__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Point__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:250:1: ( ( RULE_INT ) )
            // InternalFix.g:251:1: ( RULE_INT )
            {
            // InternalFix.g:251:1: ( RULE_INT )
            // InternalFix.g:252:2: RULE_INT
            {
             before(grammarAccess.getPointAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPointAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Point__Group__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalFix.g:262:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:266:1: ( ( ruleGreeting ) )
            // InternalFix.g:267:2: ( ruleGreeting )
            {
            // InternalFix.g:267:2: ( ruleGreeting )
            // InternalFix.g:268:3: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // InternalFix.g:277:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:281:1: ( ( RULE_ID ) )
            // InternalFix.g:282:2: ( RULE_ID )
            {
            // InternalFix.g:282:2: ( RULE_ID )
            // InternalFix.g:283:3: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Greeting__NameAssignment_1"


    // $ANTLR start "rule__Greeting__PointsAssignment_2"
    // InternalFix.g:292:1: rule__Greeting__PointsAssignment_2 : ( rulePoint ) ;
    public final void rule__Greeting__PointsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFix.g:296:1: ( ( rulePoint ) )
            // InternalFix.g:297:2: ( rulePoint )
            {
            // InternalFix.g:297:2: ( rulePoint )
            // InternalFix.g:298:3: rulePoint
            {
             before(grammarAccess.getGreetingAccess().getPointsPointParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePoint();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getPointsPointParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Greeting__PointsAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}