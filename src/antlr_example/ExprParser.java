// $ANTLR 3.2 Sep 23, 2009 14:05:07 src/antlr_example/Expr.g 2010-07-16 16:10:47
package antlr_example;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ExprParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "INT", "WS"
    };
    public static final int WS=9;
    public static final int PLUS=4;
    public static final int INT=8;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int DIV=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public ExprParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ExprParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "src/antlr_example/Expr.g"; }


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // src/antlr_example/Expr.g:18:1: expr : term ( ( PLUS | MINUS ) term )* ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set2=null;
        ExprParser.term_return term1 = null;

        ExprParser.term_return term3 = null;


        CommonTree set2_tree=null;

        try {
            // src/antlr_example/Expr.g:18:5: ( term ( ( PLUS | MINUS ) term )* )
            // src/antlr_example/Expr.g:18:7: term ( ( PLUS | MINUS ) term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_term_in_expr102);
            term1=term();

            state._fsp--;

            adaptor.addChild(root_0, term1.getTree());
            // src/antlr_example/Expr.g:18:12: ( ( PLUS | MINUS ) term )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=PLUS && LA1_0<=MINUS)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/antlr_example/Expr.g:18:13: ( PLUS | MINUS ) term
            	    {
            	    set2=(Token)input.LT(1);
            	    set2=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set2), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_expr114);
            	    term3=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // src/antlr_example/Expr.g:19:1: term : factor ( ( MULT | DIV ) factor )* ;
    public final ExprParser.term_return term() throws RecognitionException {
        ExprParser.term_return retval = new ExprParser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set5=null;
        ExprParser.factor_return factor4 = null;

        ExprParser.factor_return factor6 = null;


        CommonTree set5_tree=null;

        try {
            // src/antlr_example/Expr.g:19:5: ( factor ( ( MULT | DIV ) factor )* )
            // src/antlr_example/Expr.g:19:7: factor ( ( MULT | DIV ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term123);
            factor4=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor4.getTree());
            // src/antlr_example/Expr.g:19:14: ( ( MULT | DIV ) factor )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=MULT && LA2_0<=DIV)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/antlr_example/Expr.g:19:15: ( MULT | DIV ) factor
            	    {
            	    set5=(Token)input.LT(1);
            	    set5=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MULT && input.LA(1)<=DIV) ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set5), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term135);
            	    factor6=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor6.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // src/antlr_example/Expr.g:20:1: factor : INT ;
    public final ExprParser.factor_return factor() throws RecognitionException {
        ExprParser.factor_return retval = new ExprParser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT7=null;

        CommonTree INT7_tree=null;

        try {
            // src/antlr_example/Expr.g:20:7: ( INT )
            // src/antlr_example/Expr.g:20:9: INT
            {
            root_0 = (CommonTree)adaptor.nil();

            INT7=(Token)match(input,INT,FOLLOW_INT_in_factor144); 
            INT7_tree = (CommonTree)adaptor.create(INT7);
            adaptor.addChild(root_0, INT7_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_term_in_expr102 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_expr105 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_term_in_expr114 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_factor_in_term123 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_term126 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_factor_in_term135 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_INT_in_factor144 = new BitSet(new long[]{0x0000000000000002L});

}