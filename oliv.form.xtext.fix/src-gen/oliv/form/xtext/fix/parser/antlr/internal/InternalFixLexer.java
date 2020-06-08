package oliv.form.xtext.fix.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFixLexer extends Lexer {
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

    public InternalFixLexer() {;} 
    public InternalFixLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFixLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalFix.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFix.g:11:7: ( '*Courbe' )
            // InternalFix.g:11:9: '*Courbe'
            {
            match("*Courbe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "RULE_NOMBRE"
    public final void mRULE_NOMBRE() throws RecognitionException {
        try {
            int _type = RULE_NOMBRE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFix.g:226:13: ( ( RULE_NOMBRE1 | RULE_NOMBRE2 | RULE_NOMBRE3 | RULE_NOMBRE4 | RULE_NOMBRE5 | RULE_NOMBRE6 | RULE_NOMBRE7 | RULE_NOMBRE8 ) )
            // InternalFix.g:226:15: ( RULE_NOMBRE1 | RULE_NOMBRE2 | RULE_NOMBRE3 | RULE_NOMBRE4 | RULE_NOMBRE5 | RULE_NOMBRE6 | RULE_NOMBRE7 | RULE_NOMBRE8 )
            {
            // InternalFix.g:226:15: ( RULE_NOMBRE1 | RULE_NOMBRE2 | RULE_NOMBRE3 | RULE_NOMBRE4 | RULE_NOMBRE5 | RULE_NOMBRE6 | RULE_NOMBRE7 | RULE_NOMBRE8 )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalFix.g:226:16: RULE_NOMBRE1
                    {
                    mRULE_NOMBRE1(); 

                    }
                    break;
                case 2 :
                    // InternalFix.g:226:29: RULE_NOMBRE2
                    {
                    mRULE_NOMBRE2(); 

                    }
                    break;
                case 3 :
                    // InternalFix.g:226:42: RULE_NOMBRE3
                    {
                    mRULE_NOMBRE3(); 

                    }
                    break;
                case 4 :
                    // InternalFix.g:226:55: RULE_NOMBRE4
                    {
                    mRULE_NOMBRE4(); 

                    }
                    break;
                case 5 :
                    // InternalFix.g:226:68: RULE_NOMBRE5
                    {
                    mRULE_NOMBRE5(); 

                    }
                    break;
                case 6 :
                    // InternalFix.g:226:81: RULE_NOMBRE6
                    {
                    mRULE_NOMBRE6(); 

                    }
                    break;
                case 7 :
                    // InternalFix.g:226:94: RULE_NOMBRE7
                    {
                    mRULE_NOMBRE7(); 

                    }
                    break;
                case 8 :
                    // InternalFix.g:226:107: RULE_NOMBRE8
                    {
                    mRULE_NOMBRE8(); 

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
    // $ANTLR end "RULE_NOMBRE"

    // $ANTLR start "RULE_NOMBRE1"
    public final void mRULE_NOMBRE1() throws RecognitionException {
        try {
            // InternalFix.g:228:23: ( RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_CHIFF1 )
            // InternalFix.g:228:25: RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_CHIFF1
            {
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_CHIFF1(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOMBRE1"

    // $ANTLR start "RULE_CHIFF1"
    public final void mRULE_CHIFF1() throws RecognitionException {
        try {
            // InternalFix.g:230:22: ( '0' .. '9' )
            // InternalFix.g:230:24: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHIFF1"

    // $ANTLR start "RULE_NOMBRE2"
    public final void mRULE_NOMBRE2() throws RecognitionException {
        try {
            // InternalFix.g:232:23: ( RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_CHIFF2 )
            // InternalFix.g:232:25: RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_CHIFF2
            {
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_CHIFF2(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOMBRE2"

    // $ANTLR start "RULE_CHIFF2"
    public final void mRULE_CHIFF2() throws RecognitionException {
        try {
            // InternalFix.g:234:22: ( '0' .. '9' '0' .. '9' )
            // InternalFix.g:234:24: '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHIFF2"

    // $ANTLR start "RULE_NOMBRE3"
    public final void mRULE_NOMBRE3() throws RecognitionException {
        try {
            // InternalFix.g:236:23: ( RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_CHIFF3 )
            // InternalFix.g:236:25: RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_CHIFF3
            {
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_CHIFF3(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOMBRE3"

    // $ANTLR start "RULE_CHIFF3"
    public final void mRULE_CHIFF3() throws RecognitionException {
        try {
            // InternalFix.g:238:22: ( '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalFix.g:238:24: '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHIFF3"

    // $ANTLR start "RULE_NOMBRE4"
    public final void mRULE_NOMBRE4() throws RecognitionException {
        try {
            // InternalFix.g:240:23: ( RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_CHIFF4 )
            // InternalFix.g:240:25: RULE_SPACE RULE_SPACE RULE_SPACE RULE_SPACE RULE_CHIFF4
            {
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_CHIFF4(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOMBRE4"

    // $ANTLR start "RULE_CHIFF4"
    public final void mRULE_CHIFF4() throws RecognitionException {
        try {
            // InternalFix.g:242:22: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalFix.g:242:24: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHIFF4"

    // $ANTLR start "RULE_NOMBRE5"
    public final void mRULE_NOMBRE5() throws RecognitionException {
        try {
            // InternalFix.g:244:23: ( RULE_SPACE RULE_SPACE RULE_SPACE RULE_CHIFF5 )
            // InternalFix.g:244:25: RULE_SPACE RULE_SPACE RULE_SPACE RULE_CHIFF5
            {
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_CHIFF5(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOMBRE5"

    // $ANTLR start "RULE_CHIFF5"
    public final void mRULE_CHIFF5() throws RecognitionException {
        try {
            // InternalFix.g:246:22: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalFix.g:246:24: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHIFF5"

    // $ANTLR start "RULE_NOMBRE6"
    public final void mRULE_NOMBRE6() throws RecognitionException {
        try {
            // InternalFix.g:248:23: ( RULE_SPACE RULE_SPACE RULE_CHIFF6 )
            // InternalFix.g:248:25: RULE_SPACE RULE_SPACE RULE_CHIFF6
            {
            mRULE_SPACE(); 
            mRULE_SPACE(); 
            mRULE_CHIFF6(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOMBRE6"

    // $ANTLR start "RULE_CHIFF6"
    public final void mRULE_CHIFF6() throws RecognitionException {
        try {
            // InternalFix.g:250:22: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalFix.g:250:24: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHIFF6"

    // $ANTLR start "RULE_NOMBRE7"
    public final void mRULE_NOMBRE7() throws RecognitionException {
        try {
            // InternalFix.g:252:23: ( RULE_SPACE RULE_CHIFF7 )
            // InternalFix.g:252:25: RULE_SPACE RULE_CHIFF7
            {
            mRULE_SPACE(); 
            mRULE_CHIFF7(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOMBRE7"

    // $ANTLR start "RULE_CHIFF7"
    public final void mRULE_CHIFF7() throws RecognitionException {
        try {
            // InternalFix.g:254:22: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalFix.g:254:24: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHIFF7"

    // $ANTLR start "RULE_NOMBRE8"
    public final void mRULE_NOMBRE8() throws RecognitionException {
        try {
            // InternalFix.g:256:23: ( '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalFix.g:256:25: '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOMBRE8"

    // $ANTLR start "RULE_FDL"
    public final void mRULE_FDL() throws RecognitionException {
        try {
            int _type = RULE_FDL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFix.g:258:10: ( ( ( '\\r' )? '\\n' )? )
            // InternalFix.g:258:12: ( ( '\\r' )? '\\n' )?
            {
            // InternalFix.g:258:12: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalFix.g:258:13: ( '\\r' )? '\\n'
                    {
                    // InternalFix.g:258:13: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalFix.g:258:13: '\\r'
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
    // $ANTLR end "RULE_FDL"

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFix.g:260:12: ( ' ' )
            // InternalFix.g:260:14: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFix.g:262:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalFix.g:262:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalFix.g:262:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFix.g:262:11: '^'
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

            // InternalFix.g:262:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFix.g:
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
            	    break loop5;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalFix.g:264:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalFix.g:264:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalFix.g:264:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalFix.g:264:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalFix.g:264:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalFix.g:264:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFix.g:264:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalFix.g:264:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalFix.g:264:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFix.g:264:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalFix.g:264:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalFix.g:266:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalFix.g:266:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalFix.g:266:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFix.g:266:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalFix.g:268:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalFix.g:268:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalFix.g:268:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFix.g:268:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalFix.g:268:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFix.g:268:41: ( '\\r' )? '\\n'
                    {
                    // InternalFix.g:268:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalFix.g:268:41: '\\r'
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
            // InternalFix.g:270:9: ( ( '\\t' | '\\r' | '\\n' )+ )
            // InternalFix.g:270:11: ( '\\t' | '\\r' | '\\n' )+
            {
            // InternalFix.g:270:11: ( '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalFix.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalFix.g:1:8: ( T__27 | RULE_NOMBRE | RULE_FDL | RULE_SPACE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt14=9;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalFix.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // InternalFix.g:1:16: RULE_NOMBRE
                {
                mRULE_NOMBRE(); 

                }
                break;
            case 3 :
                // InternalFix.g:1:28: RULE_FDL
                {
                mRULE_FDL(); 

                }
                break;
            case 4 :
                // InternalFix.g:1:37: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;
            case 5 :
                // InternalFix.g:1:48: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 6 :
                // InternalFix.g:1:56: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 7 :
                // InternalFix.g:1:68: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 8 :
                // InternalFix.g:1:84: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 9 :
                // InternalFix.g:1:100: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA1_eotS =
        "\17\uffff";
    static final String DFA1_eofS =
        "\17\uffff";
    static final String DFA1_minS =
        "\2\40\1\uffff\1\40\1\uffff\1\40\1\uffff\1\40\1\uffff\1\40\2\uffff\1\40\2\uffff";
    static final String DFA1_maxS =
        "\2\71\1\uffff\1\71\1\uffff\1\71\1\uffff\1\71\1\uffff\1\71\2\uffff\1\71\2\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\10\1\uffff\1\7\1\uffff\1\6\1\uffff\1\5\1\uffff\1\4\1\3\1\uffff\1\1\1\2";
    static final String DFA1_specialS =
        "\17\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\17\uffff\12\2",
            "\1\3\17\uffff\12\4",
            "",
            "\1\5\17\uffff\12\6",
            "",
            "\1\7\17\uffff\12\10",
            "",
            "\1\11\17\uffff\12\12",
            "",
            "\1\14\17\uffff\12\13",
            "",
            "",
            "\1\15\17\uffff\12\16",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "226:15: ( RULE_NOMBRE1 | RULE_NOMBRE2 | RULE_NOMBRE3 | RULE_NOMBRE4 | RULE_NOMBRE5 | RULE_NOMBRE6 | RULE_NOMBRE7 | RULE_NOMBRE8 )";
        }
    }
    static final String DFA14_eotS =
        "\1\6\1\uffff\1\13\1\uffff\1\12\1\6\10\uffff";
    static final String DFA14_eofS =
        "\16\uffff";
    static final String DFA14_minS =
        "\1\11\1\uffff\1\40\1\uffff\1\12\1\11\3\uffff\1\52\4\uffff";
    static final String DFA14_maxS =
        "\1\172\1\uffff\1\71\1\uffff\1\12\1\15\3\uffff\1\57\4\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\2\uffff\1\3\1\5\1\6\1\uffff\1\11\1\4\1\7\1\10";
    static final String DFA14_specialS =
        "\16\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\12\1\5\2\uffff\1\4\22\uffff\1\2\1\uffff\1\10\4\uffff\1\10\2\uffff\1\1\4\uffff\1\11\12\3\7\uffff\32\7\3\uffff\2\7\1\uffff\32\7",
            "",
            "\1\3\17\uffff\12\3",
            "",
            "\1\5",
            "\2\12\2\uffff\1\12",
            "",
            "",
            "",
            "\1\14\4\uffff\1\15",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | RULE_NOMBRE | RULE_FDL | RULE_SPACE | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}