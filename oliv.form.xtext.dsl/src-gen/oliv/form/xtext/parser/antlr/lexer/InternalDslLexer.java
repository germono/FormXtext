package oliv.form.xtext.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslLexer extends Lexer {
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

    public InternalDslLexer() {;} 
    public InternalDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDslLexer.g"; }

    // $ANTLR start "VariableCalcule"
    public final void mVariableCalcule() throws RecognitionException {
        try {
            int _type = VariableCalcule;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:14:17: ( 'VariableCalcule' )
            // InternalDslLexer.g:14:19: 'VariableCalcule'
            {
            match("VariableCalcule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VariableCalcule"

    // $ANTLR start "NomImport"
    public final void mNomImport() throws RecognitionException {
        try {
            int _type = NomImport;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:16:11: ( 'nomImport' )
            // InternalDslLexer.g:16:13: 'nomImport'
            {
            match("nomImport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NomImport"

    // $ANTLR start "Variable"
    public final void mVariable() throws RecognitionException {
        try {
            int _type = Variable;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:18:10: ( 'Variable' )
            // InternalDslLexer.g:18:12: 'Variable'
            {
            match("Variable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Variable"

    // $ANTLR start "Import"
    public final void mImport() throws RecognitionException {
        try {
            int _type = Import;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:20:8: ( 'import' )
            // InternalDslLexer.g:20:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Import"

    // $ANTLR start "Alpha"
    public final void mAlpha() throws RecognitionException {
        try {
            int _type = Alpha;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:22:7: ( 'Alpha' )
            // InternalDslLexer.g:22:9: 'Alpha'
            {
            match("Alpha"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Alpha"

    // $ANTLR start "Autre"
    public final void mAutre() throws RecognitionException {
        try {
            int _type = Autre;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:24:7: ( 'Autre' )
            // InternalDslLexer.g:24:9: 'Autre'
            {
            match("Autre"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Autre"

    // $ANTLR start "Beta"
    public final void mBeta() throws RecognitionException {
        try {
            int _type = Beta;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:26:6: ( 'Beta' )
            // InternalDslLexer.g:26:8: 'Beta'
            {
            match("Beta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Beta"

    // $ANTLR start "Bob"
    public final void mBob() throws RecognitionException {
        try {
            int _type = Bob;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:28:5: ( 'Bob' )
            // InternalDslLexer.g:28:7: 'Bob'
            {
            match("Bob"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bob"

    // $ANTLR start "FullStopAsterisk"
    public final void mFullStopAsterisk() throws RecognitionException {
        try {
            int _type = FullStopAsterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:30:18: ( '.*' )
            // InternalDslLexer.g:30:20: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopAsterisk"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:32:17: ( '(' )
            // InternalDslLexer.g:32:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:34:18: ( ')' )
            // InternalDslLexer.g:34:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:36:10: ( '*' )
            // InternalDslLexer.g:36:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:38:10: ( '+' )
            // InternalDslLexer.g:38:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:40:13: ( '-' )
            // InternalDslLexer.g:40:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:42:10: ( '.' )
            // InternalDslLexer.g:42:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:44:9: ( '/' )
            // InternalDslLexer.g:44:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:46:7: ( ':' )
            // InternalDslLexer.g:46:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "RULE_EXT_INT"
    public final void mRULE_EXT_INT() throws RecognitionException {
        try {
            int _type = RULE_EXT_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:48:14: ( RULE_INT ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT )
            // InternalDslLexer.g:48:16: RULE_INT ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT
            {
            mRULE_INT(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDslLexer.g:48:35: ( '-' | '+' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDslLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXT_INT"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalDslLexer.g:50:21: ()
            // InternalDslLexer.g:50:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalDslLexer.g:52:19: ()
            // InternalDslLexer.g:52:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:54:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDslLexer.g:54:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDslLexer.g:54:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDslLexer.g:54:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDslLexer.g:54:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDslLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:56:10: ( ( '0' .. '9' )+ )
            // InternalDslLexer.g:56:12: ( '0' .. '9' )+
            {
            // InternalDslLexer.g:56:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDslLexer.g:56:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:58:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDslLexer.g:58:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDslLexer.g:58:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDslLexer.g:58:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDslLexer.g:58:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDslLexer.g:58:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDslLexer.g:58:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDslLexer.g:58:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDslLexer.g:58:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDslLexer.g:58:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDslLexer.g:58:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:60:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDslLexer.g:60:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDslLexer.g:60:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDslLexer.g:60:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:62:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDslLexer.g:62:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDslLexer.g:62:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDslLexer.g:62:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalDslLexer.g:62:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDslLexer.g:62:41: ( '\\r' )? '\\n'
                    {
                    // InternalDslLexer.g:62:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalDslLexer.g:62:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:64:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDslLexer.g:64:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDslLexer.g:64:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDslLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDslLexer.g:66:16: ( . )
            // InternalDslLexer.g:66:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDslLexer.g:1:8: ( VariableCalcule | NomImport | Variable | Import | Alpha | Autre | Beta | Bob | FullStopAsterisk | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | HyphenMinus | FullStop | Solidus | Colon | RULE_EXT_INT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=25;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalDslLexer.g:1:10: VariableCalcule
                {
                mVariableCalcule(); 

                }
                break;
            case 2 :
                // InternalDslLexer.g:1:26: NomImport
                {
                mNomImport(); 

                }
                break;
            case 3 :
                // InternalDslLexer.g:1:36: Variable
                {
                mVariable(); 

                }
                break;
            case 4 :
                // InternalDslLexer.g:1:45: Import
                {
                mImport(); 

                }
                break;
            case 5 :
                // InternalDslLexer.g:1:52: Alpha
                {
                mAlpha(); 

                }
                break;
            case 6 :
                // InternalDslLexer.g:1:58: Autre
                {
                mAutre(); 

                }
                break;
            case 7 :
                // InternalDslLexer.g:1:64: Beta
                {
                mBeta(); 

                }
                break;
            case 8 :
                // InternalDslLexer.g:1:69: Bob
                {
                mBob(); 

                }
                break;
            case 9 :
                // InternalDslLexer.g:1:73: FullStopAsterisk
                {
                mFullStopAsterisk(); 

                }
                break;
            case 10 :
                // InternalDslLexer.g:1:90: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 11 :
                // InternalDslLexer.g:1:106: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 12 :
                // InternalDslLexer.g:1:123: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 13 :
                // InternalDslLexer.g:1:132: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 14 :
                // InternalDslLexer.g:1:141: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 15 :
                // InternalDslLexer.g:1:153: FullStop
                {
                mFullStop(); 

                }
                break;
            case 16 :
                // InternalDslLexer.g:1:162: Solidus
                {
                mSolidus(); 

                }
                break;
            case 17 :
                // InternalDslLexer.g:1:170: Colon
                {
                mColon(); 

                }
                break;
            case 18 :
                // InternalDslLexer.g:1:176: RULE_EXT_INT
                {
                mRULE_EXT_INT(); 

                }
                break;
            case 19 :
                // InternalDslLexer.g:1:189: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // InternalDslLexer.g:1:197: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // InternalDslLexer.g:1:206: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalDslLexer.g:1:218: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalDslLexer.g:1:234: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalDslLexer.g:1:250: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // InternalDslLexer.g:1:258: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\5\26\1\36\5\uffff\1\46\1\uffff\1\50\1\24\1\uffff\2\24\2\uffff\1\26\1\uffff\6\26\14\uffff\1\50\3\uffff\6\26\1\72\5\26\1\100\1\uffff\3\26\1\104\1\105\1\uffff\2\26\1\110\2\uffff\2\26\1\uffff\1\114\2\26\1\uffff\1\117\1\26\1\uffff\4\26\1\125\1\uffff";
    static final String DFA13_eofS =
        "\126\uffff";
    static final String DFA13_minS =
        "\1\0\1\141\1\157\1\155\1\154\1\145\1\52\5\uffff\1\52\1\uffff\1\60\1\101\1\uffff\2\0\2\uffff\1\162\1\uffff\1\155\2\160\2\164\1\142\14\uffff\1\60\3\uffff\1\151\1\111\1\157\1\150\1\162\1\141\1\60\1\141\1\155\1\162\1\141\1\145\1\60\1\uffff\1\142\1\160\1\164\2\60\1\uffff\1\154\1\157\1\60\2\uffff\1\145\1\162\1\uffff\1\60\1\164\1\141\1\uffff\1\60\1\154\1\uffff\1\143\1\165\1\154\1\145\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\141\1\157\1\155\1\165\1\157\1\52\5\uffff\1\57\1\uffff\1\145\1\172\1\uffff\2\uffff\2\uffff\1\162\1\uffff\1\155\2\160\2\164\1\142\14\uffff\1\145\3\uffff\1\151\1\111\1\157\1\150\1\162\1\141\1\172\1\141\1\155\1\162\1\141\1\145\1\172\1\uffff\1\142\1\160\1\164\2\172\1\uffff\1\154\1\157\1\172\2\uffff\1\145\1\162\1\uffff\1\172\1\164\1\141\1\uffff\1\172\1\154\1\uffff\1\143\1\165\1\154\1\145\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\7\uffff\1\12\1\13\1\14\1\15\1\16\1\uffff\1\21\2\uffff\1\23\2\uffff\1\30\1\31\1\uffff\1\23\6\uffff\1\11\1\17\1\12\1\13\1\14\1\15\1\16\1\26\1\27\1\20\1\21\1\24\1\uffff\1\22\1\25\1\30\15\uffff\1\10\5\uffff\1\7\3\uffff\1\5\1\6\2\uffff\1\4\3\uffff\1\3\2\uffff\1\2\5\uffff\1\1";
    static final String DFA13_specialS =
        "\1\2\20\uffff\1\0\1\1\103\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\21\4\24\1\22\1\7\1\10\1\11\1\12\1\24\1\13\1\6\1\14\12\16\1\15\6\24\1\4\1\5\23\20\1\1\4\20\3\24\1\17\1\20\1\24\10\20\1\3\4\20\1\2\14\20\uff85\24",
            "\1\25",
            "\1\27",
            "\1\30",
            "\1\31\10\uffff\1\32",
            "\1\33\11\uffff\1\34",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "\1\44\4\uffff\1\45",
            "",
            "\12\51\13\uffff\1\52\37\uffff\1\52",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\0\53",
            "\0\53",
            "",
            "",
            "\1\55",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\51\13\uffff\1\52\37\uffff\1\52",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\106",
            "\1\107",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\111",
            "\1\112",
            "",
            "\12\26\7\uffff\2\26\1\113\27\26\4\uffff\1\26\1\uffff\32\26",
            "\1\115",
            "\1\116",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( VariableCalcule | NomImport | Variable | Import | Alpha | Autre | Beta | Bob | FullStopAsterisk | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | HyphenMinus | FullStop | Solidus | Colon | RULE_EXT_INT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_17 = input.LA(1);

                        s = -1;
                        if ( ((LA13_17>='\u0000' && LA13_17<='\uFFFF')) ) {s = 43;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_18 = input.LA(1);

                        s = -1;
                        if ( ((LA13_18>='\u0000' && LA13_18<='\uFFFF')) ) {s = 43;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='V') ) {s = 1;}

                        else if ( (LA13_0=='n') ) {s = 2;}

                        else if ( (LA13_0=='i') ) {s = 3;}

                        else if ( (LA13_0=='A') ) {s = 4;}

                        else if ( (LA13_0=='B') ) {s = 5;}

                        else if ( (LA13_0=='.') ) {s = 6;}

                        else if ( (LA13_0=='(') ) {s = 7;}

                        else if ( (LA13_0==')') ) {s = 8;}

                        else if ( (LA13_0=='*') ) {s = 9;}

                        else if ( (LA13_0=='+') ) {s = 10;}

                        else if ( (LA13_0=='-') ) {s = 11;}

                        else if ( (LA13_0=='/') ) {s = 12;}

                        else if ( (LA13_0==':') ) {s = 13;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 14;}

                        else if ( (LA13_0=='^') ) {s = 15;}

                        else if ( ((LA13_0>='C' && LA13_0<='U')||(LA13_0>='W' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||(LA13_0>='o' && LA13_0<='z')) ) {s = 16;}

                        else if ( (LA13_0=='\"') ) {s = 17;}

                        else if ( (LA13_0=='\'') ) {s = 18;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 19;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||LA13_0==','||(LA13_0>=';' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}