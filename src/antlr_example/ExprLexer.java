// $ANTLR 3.2 Sep 23, 2009 14:05:07 src/antlr_example/Expr.g 2010-07-16 16:10:47
package antlr_example;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ExprLexer extends Lexer {
    public static final int WS=9;
    public static final int PLUS=4;
    public static final int INT=8;
    public static final int DIV=7;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int EOF=-1;

    // delegates
    // delegators

    public ExprLexer() {;} 
    public ExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "src/antlr_example/Expr.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/antlr_example/Expr.g:5:6: ( '+' )
            // src/antlr_example/Expr.g:5:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/antlr_example/Expr.g:6:7: ( '-' )
            // src/antlr_example/Expr.g:6:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/antlr_example/Expr.g:7:6: ( '*' )
            // src/antlr_example/Expr.g:7:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/antlr_example/Expr.g:8:5: ( '/' )
            // src/antlr_example/Expr.g:8:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/antlr_example/Expr.g:22:5: ( ( '0' .. '9' )+ )
            // src/antlr_example/Expr.g:22:9: ( '0' .. '9' )+
            {
            // src/antlr_example/Expr.g:22:9: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/antlr_example/Expr.g:22:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/antlr_example/Expr.g:23:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // src/antlr_example/Expr.g:23:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // src/antlr_example/Expr.g:23:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/antlr_example/Expr.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // src/antlr_example/Expr.g:1:8: ( PLUS | MINUS | MULT | DIV | INT | WS )
        int alt3=6;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt3=1;
            }
            break;
        case '-':
            {
            alt3=2;
            }
            break;
        case '*':
            {
            alt3=3;
            }
            break;
        case '/':
            {
            alt3=4;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt3=5;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt3=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 3, 0, input);

            throw nvae;
        }

        switch (alt3) {
            case 1 :
                // src/antlr_example/Expr.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // src/antlr_example/Expr.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // src/antlr_example/Expr.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // src/antlr_example/Expr.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // src/antlr_example/Expr.g:1:30: INT
                {
                mINT(); 

                }
                break;
            case 6 :
                // src/antlr_example/Expr.g:1:34: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}