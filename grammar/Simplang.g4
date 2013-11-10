grammar Simplang;

tokens {
  INDENT,
  DEDENT
}

@lexer::members {
    int nesting = 0;
}

init: statement*;

block
 : INDENT statement+ DEDENT
 ;

statement
    : simple_statement NL
    | block_statement;

simple_statement
    : assignment
    | var_def
    | expression
    | ret
    | (BREAK | CONTINUE );

block_statement
    : if_statement
    | while_statement
    | for_statement
    | func_def
    | block;


indexed_id: ID LBRACK val RBRACK;
var : ID | indexed_id;
val : var | INT | FLOAT | STRING | CHAR | BOOL | NULL | list | range;

simple_assignment: var ('=' | ':=') expression;

complex_assignment
    : var (
        | '+='
        | '-='
        | '*='
        | '/='
        | '//='
        | '%='
        | '&='
        | '|='
        | '~='
        ) expression;

assignment : simple_assignment | complex_assignment;


if_statement: IF expression NL block (ELIF expression NL block)* (ELSE NL block)?;

while_statement: WHILE expression NL block;

for_statement: FOR simple_assignment NL block;

list : LBRACK param_list RBRACK;
range : LBRACK expression':'expression(':'expression)? RBRACK;

param_list: (expression (',' expression)*)?;

func_def: type ID LPAR arglist RPAR NL block;

arglist: (type ID (',' type ID)*)?;

func_call: ((LPAR expression RPAR) | var) LPAR param_list RPAR;
construct: NEW type LPAR param_list RPAR;
indexation: (LPAR expression RPAR | var) LBRACK expression RBRACK;
member: var | func_call;
attribute_ref: ((LPAR expression RPAR) | var) '.' member;
slicing: ((LPAR expression RPAR) | var) LBRACK expression':'expression(':'expression)? RBRACK;

var_def: type ID ('=' expression)?;

ret : RET expression?;

type: ID
    | type LBRACK RBRACK
    | type LBRACK ':' RBRACK
    | ('void' | 'int' | 'bool' | 'float' | 'char' | 'string');

increment:var '++';

decrement:var '--';

expression
    : val
    | increment
    | decrement
    | LPAR expression RPAR
    | (func_call | construct)
    | slicing
    | indexation
    | attribute_ref
    | '^'<assoc=right> expression
    | '~' expression
    | '-' expression
    | expression ('*' | '/' | '//' | '%') expression
    | expression ('+' | '-') expression
    | expression ('&' | '|') expression
    | expression ('==' | '!=' | '<=' | '>=' | '>' | '<') expression
    | NOT expression
    | expression AND expression
    | expression OR expression
    ;

WHILE : 'while';
FOR : 'for';
IF : 'if';
ELIF : 'elif';
ELSE : 'else';
BREAK: 'break';
CONTINUE: 'continue';
RET: 'return';
NEW: 'new';

NULL : 'null';
LPAR : '(' {nesting++;};
RPAR : ')' {nesting--;};
LBRACK: '[' {nesting++;};
RBRACK: ']' {nesting--;};

AND : '&&' | 'and';
OR : '||' | 'or';
NOT : '!' | 'not';

BOOL : 'false' | 'true';
INT : NUMBER;
FLOAT : NUMBER '.' DIGIT*;
STRING : '"' (~'"' | NL)* '"';
CHAR : '\'' (~'\'') '\'';

ID: ('a'..'z' | 'A'..'Z')([a-zA-Z0-9])* ;

EMPTY_LINE: {getCharPositionInLine()==0}? ((' '|'\t')* COMMENT? NL) -> skip ;

COMMENT: '#' ~[\r\n]* -> skip;

LINE_ESCAPE: '\\' NL -> skip;

/** Nested newline within a (..) or [..] are ignored. */
IGNORE_NEWLINE: '\r'? '\n' {nesting>0}? -> skip;

NL: '\r'? '\n' | '\r';

LEADING_WS: {getCharPositionInLine()==0}? (' '|'\t')+ ;


WS: (' ' | '\t')+ -> skip;



fragment
NUMBER : '0' | '-'? [1-9]DIGIT*;
DIGIT : [0-9];
