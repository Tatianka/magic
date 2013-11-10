grammar Simplang;

tokens {
  INDENT,
  DEDENT
}

@header {
  import java.util.Stack;
}

@lexer::members {
  private int indentLevel = 0;
  Stack<Integer> indentation = new Stack<Integer>();
  private int lastIndent = 0;
}

init: statement*;

block
 : INDENT statement+ DEDENT
 ;

statement
    : assignment NL
    | expression
    | block;

assignment : ID '=' expression;

expression
    : ID
    | LPAR expression RPAR
    | VAL
    | expression ('*' | '/') expression
    | expression ('+' | '-') expression
    ;

VAL : INT | FLOAT | STRING | CHAR;

INT : NUMBER;

FLOAT : NUMBER '.' DIGIT*;

STRING : '"' (~'"' | NL)* '"';

CHAR : '\'' (~'\'') '\'';

ID: ('a'..'z' | 'A'..'Z')([a-zA-Z0-9])* ;

NL: '\r'? '\n' | '\r';

LEADING_WS: {getCharPositionInLine()==0}? (' '|'\t')+ ;

WS: (' ' | '\t')+ -> skip;

LPAR : '(';
RPAR : ')';

fragment
NUMBER : '0' | '-'? [1-9]DIGIT*;
DIGIT : [0-9];
