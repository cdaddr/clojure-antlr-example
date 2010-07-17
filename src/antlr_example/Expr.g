grammar Expr;

options {
    output=AST;
    ASTLabelType=CommonTree;
}

tokens {
    PLUS = '+';
    MINUS = '-';
    MULT = '*';
    DIV = '/';
}

@header        {package antlr_example;}
@lexer::header {package antlr_example;}

expr: term ((PLUS | MINUS)^ term)* ;
term: factor ((MULT | DIV)^ factor)* ;
factor: INT ;
     
INT :   '0'..'9'+ ;
WS  :   ( ' ' | '\t' | '\r' | '\n')+ {$channel=HIDDEN;} ;
