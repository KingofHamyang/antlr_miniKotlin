lexer grammar KotlinLexer;
//lexer rule
Escape: '\\' [a-z];
//CommonText: ~('\\' | '"' | '$')+;

VAR: 'var' | 'val';

PACKAGE: 'package';
IMPORT: 'import';

RETURN: 'return';

LOGICAL_OR: '||';
LOGICAL_AND: '&&';
GET: 'get';
BIT_OR: 'or';
BIT_AND: 'and';
BIT_XOR: 'xor';
INOP: 'in';
NOTIN: '!in';
ISOP: 'is';
NOTIS: '!is';
COLON: ':';
COMM: ',';
LPAR: '(';
RPAR: ')';
QUESTION: '?';
LCURL: '{';
RCURL: '}';
EQ: '=';
PLUSEQ: '+=';
MINUSEQ: '-=';
MULTEQ: '*=';
DIVEQ: '/=';
QEQ: '%=';
DO: 'do';
DOT: '.';

EQUAL_R: '===';
EQUAL: '==';
NOT_EQUAL: '!=';
NOT_EQUAL_R: '!==';
ARROW: '->';

DIV: '/';
MUL: '*';
QUAT: '%';
RANGE_OP: '..';

WHEN: 'when';
INC: '++';
DEC: '--';
FOR: 'for';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
ELSE_IF: 'else if';

GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';

SHIFT_R: 'shr';
SHIFT_L: 'shl';

DOWN_TO: 'downTo';
STEP: 'step';

FUNC: 'fun';

LBRAC: '[';
RBRAC: ']';
ABSTRACT: 'abstract';
CLASS: 'class';
INTERFACE: 'interface';
OVERRIDE: 'override';
MINUS: '-';
PLUS: '+';
TYPE_INT: 'Int';
TYPE_STRING: 'String';
TYPE_FLOAT: 'Float';
TYPE_ANY: 'Any';
TYPE_Double: 'Double';
TYPE_Long: 'Long';
TYPE_SHORT: 'Short';
TYPE_BYTE: 'Byte';
TYPE_BOOLEAN: 'Boolean';
TYPE_UNIT: 'Unit';
TYPE_CLASS: ID '<' ID '>';
NL: '\u000A' | '\u000D' '\u000A';
//NL: ( '\r' '\n'? | '\n') -> skip;
INT: [0-9]+;
BOOL: 'true' | 'fales';
LONG: [0-9]+ 'L';
HEXA: '0x' [0-9A-F]+;
BINARY: '0b' [0|1]+;
// should handle negatives
REAL: [0-9]+ '.' [0-9]+ ('e' [1-9]+ [0-9]*)?;

ID: [a-zA-Z_][a-zA-Z_0-9]*;
//WS: [\u0020\u0009\u000C]+ -> skip;
WS: [ \t]+ -> skip;
LQ: '"' -> pushMode(EnterString);
FieldID: '$' ID;

mode EnterString;
RQ: '"' -> popMode;

StrFieldReference: FieldID;

StrCommonText: ~('\\' | '"' | '$')+;

StrEscape: '\\' ('t' | 'n');

StringExpStart: '${' -> pushMode(EnterStringExpression);

mode EnterStringExpression;

StringExpression_RCURL: RCURL -> popMode, type(RCURL);
StringExpression_ID: ID -> type(ID);
StringExpression_WS: WS -> skip;
StringExpression_NL: NL -> skip;

StringExpression_VAR: VAR -> type(VAR);

StringExpression_LOGICAL_OR: LOGICAL_OR -> type(LOGICAL_OR);
StringExpression_LOGICAL_AND: LOGICAL_AND -> type(LOGICAL_AND);
StringExpression_BIT_OR: BIT_OR -> type(BIT_OR);
StringExpression_BIT_AND: BIT_AND -> type(BIT_AND);
StringExpression_BIT_XOR: BIT_XOR -> type(BIT_XOR);
StringExpression_INOP: INOP -> type(INOP);
StringExpression_NOTIN: NOTIN -> type(NOTIN);
StringExpression_ISOP: ISOP -> type(ISOP);
StringExpression_NOTIS: NOTIS -> type(NOTIS);
StringExpression_COLON: COLON -> type(COLON);
StringExpression_COMM: COMM -> type(COMM);
StringExpression_LPAR: LPAR -> type(LPAR);
StringExpression_RPAR: RPAR -> type(RPAR);
StringExpression_QUESTION: QUESTION -> type(QUESTION);
StringExpression_LCURL: LCURL -> type(LCURL);
StringExpression_DOT: DOT -> type(DOT);

StringExpression_EQUAL_R: EQUAL_R -> type(EQUAL_R);
StringExpression_EQUAL: EQUAL -> type(EQUAL);
StringExpression_NOT_EQUAL: NOT_EQUAL -> type(NOT_EQUAL);
StringExpression_NOT_EQUAL_R: NOT_EQUAL_R -> type(NOT_EQUAL_R);

StringExpression_DIV: DIV -> type(DIV);
StringExpression_MUL: MUL -> type(MUL);
StringExpression_QUAT: QUAT -> type(QUAT);
StringExpression_RANGE_OP: RANGE_OP -> type(RANGE_OP);

StringExpression_INC: INC -> type(INC);
StringExpression_DEC: DEC -> type(DEC);

StringExpression_IF: IF -> type(IF);
StringExpression_ELSE: ELSE -> type(ELSE);
StringExpression_ELSE_IF: ELSE_IF -> type(ELSE_IF);

StringExpression_GT: GT -> type(GT);
StringExpression_LT: LT -> type(LT);
StringExpression_GTE: GTE -> type(GTE);
StringExpression_LTE: LTE -> type(LTE);

StringExpression_SHIFT_R: SHIFT_R -> type(SHIFT_R);
StringExpression_SHIFT_L: SHIFT_L -> type(SHIFT_L);

StringExpression_MINUS: MINUS -> type(MINUS);
StringExpression_PLUS: PLUS -> type(PLUS);
StringExpression_TYPE_INT: TYPE_INT -> type(TYPE_INT);
StringExpression_TYPE_STRING: TYPE_STRING -> type(TYPE_STRING);
StringExpression_TYPE_FLOAT: TYPE_FLOAT -> type(TYPE_FLOAT);
StringExpression_TYPE_ANY: TYPE_ANY -> type(TYPE_ANY);
StringExpression_TYPE_Double: TYPE_Double -> type(TYPE_Double);
StringExpression_TYPE_Long: TYPE_Long -> type(TYPE_Long);
StringExpression_TYPE_SHORT: TYPE_SHORT -> type(TYPE_SHORT);
StringExpression_TYPE_BYTE: TYPE_BYTE -> type(TYPE_BYTE);
StringExpression_TYPE_CLASS: TYPE_CLASS -> type(TYPE_CLASS);
StringExpression_TYPE_UNIT: TYPE_UNIT -> type(TYPE_UNIT);
StringExpression_INT: INT -> type(INT);
StringExpression_BOOL: BOOL -> type(BOOL);
StringExpression_LONG: LONG -> type(LONG);
StringExpression_HEXA: HEXA -> type(HEXA);
StringExpression_BINARY: BINARY -> type(BINARY);
// should handle negatives
StringExpression_REAL: REAL -> type(REAL);
StringExpression_LBRAC: LBRAC -> type(LBRAC);
StringExpression_RBRAC: RBRAC -> type(RBRAC);
StringExpression_LQ: LQ -> pushMode(EnterString), type(LQ);

