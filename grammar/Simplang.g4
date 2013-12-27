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
    | block_statement
    ;

simple_statement
    : assignment
    | var_def
    | expression
    | ret
    | stat=(BREAK | CONTINUE )
    ;

block_statement
    : if_statement
    | while_statement
    | for_statement
    | func_def
    | block;


var : ID # VarID
    | var LBRACK expression RBRACK #VarList
    ;

val : var # ValVar
    | INT # ValInt
    | FLOAT # ValFloat
    | STRING # ValString
    | CHAR # ValChar
    | BOOL # ValBool
    | NULL # ValNull
    | list # ValList
    | range # ValRange;

simple_assignment: var '=' expression;

complex_assignment
    : var op = (
          '+='
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

/*func_call: ((LPAR expression RPAR) | var) LPAR param_list RPAR;*/
func_call: ID LPAR param_list RPAR;

construct: NEW type LPAR param_list RPAR;
member: var | func_call;
attribute_ref: ((LPAR expression RPAR) | var) '.' member;

var_def: type ID ('=' expression)?;

ret : RET expression?;

type: ID # typeId
    | type LBRACK RBRACK # typeList
    | type LBRACK ':' RBRACK # typeRange
    | ('void' | 'int' | 'bool' | 'float' | 'char' | 'string') # typeBasic
    ;

increment:var '++';

decrement:var '--';

expression
    : increment # Inc
    | decrement # Dec
    | LPAR expression RPAR # Paren
    | (func_call | construct) # Func
    | expression LBRACK expression':'expression(':'expression)? RBRACK # Slice
    | expression LBRACK expression RBRACK # Index
    | attribute_ref # Attr
    | EXP<assoc=right> expression # Exp
    | '~' expression # BitNot
    | '-' expression # UnaryMinus
    | expression op=(MUL | DIV | IDIV | REM) expression # Mul
    | expression op=(ADD | SUB) expression # Add
    | expression '&' # BitAnd
    | expression '|' # BitOr
    | expression op=(EQ | NE | LE | GE | GT | LT) expression # Compare
    | NOT expression # BoolNot
    | expression op=AND expression # BoolAnd
    | expression op=OR expression # BoolOr
    | val # Value
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

MUL: '*';
DIV: '/';
IDIV: '//';
REM: '%';
ADD: '+';
SUB: '-';
EXP: '^';

EQ: '==';
NE: '!=';
LE: '<=';
GE: '>=';
GT: '>';
LT: '<';

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
NUMBER : '0' | [1-9]DIGIT*;
DIGIT : [0-9];
