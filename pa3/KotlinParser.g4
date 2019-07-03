parser grammar KotlinParser;
// parser rules
options {
	tokenVocab = KotlinLexer;
}

prog: NL* chunk (NL+ chunk?)*;

chunk:
	functionDefine
	| classDefine
	| variableDefine
	| expression
	| packages
	| importing
	| flowcontrol;

packages: PACKAGE packagelist;
importing: IMPORT packagelist;

packagelist: ID (DOT ID)* (DOT MUL)?;
parameter: ID COLON type;

classDefine:
	ABSTRACT? (CLASS | INTERFACE) ID NL* (
		NL* LPAR NL* (
			VAR? (parameter | variableDefine) (
				COMM NL* (parameter | variableDefine) NL*
			)* NL*
		)? RPAR
	)? (COLON extendlist (',' extendlist)*)? NL* classbody?;
classbody: NL* classblock NL*;
classblock: LCURL NL* classbodymembers* NL* RCURL;
classbodymembers:
	classDefine NL*
	| typestrict? functionDefine NL*
	| typestrict? variableDefine NL* getter? NL*;
getter: GET LPAR RPAR EQ commonstmt;
typestrict: OVERRIDE | ABSTRACT;
class_stmt: MINUS;
extendlist:
	ID (LPAR inputparameter (COMM inputparameter)* RPAR)?;

variableDefine:
	VAR ID (COLON type)? (assignment NL* commonstmt)?;
functionDefine:
	FUNC NL* functionname NL* LPAR NL* (
		parameter NL* (NL* COMM NL* parameter NL*)*
	)? NL* RPAR NL* functionbody;

functionbody: (COLON type (QUESTION)?)? NL* (
		block
		| EQ NL* commonstmt
	)?;
block: LCURL multiple_stmt RCURL;
multiple_stmt: NL* (stmt (NL+ stmt?)*)?;

stmt: defining | NL* inblockExpression;

defining: functionDefine | variableDefine;

inblockExpression: expression | flowcontrol | returning;

returning: RETURN (expression)?;
expression: commonstmt | assignstmt;
assignstmt:
	unaryexpression assignment NL* commonstmt
	| variableDefine;
unaryexpression: posttermwithoutincdec;
//고쳐야함
commonstmt:
	oroperation (QUESTION commonstmt? COLON commonstmt?)?;
oroperation: andoperation | oroperation LOGICAL_OR andoperation;
andoperation:
	inclusiveoroperation
	| andoperation LOGICAL_AND inclusiveoroperation;
inclusiveoroperation:
	exclusiveoperation
	| inclusiveoroperation BIT_OR exclusiveoperation;

exclusiveoperation:
	andExpr
	| exclusiveoperation BIT_XOR andExpr;
andExpr: equalityExpr | andExpr BIT_AND equalityExpr;

equalityExpr:
	comparableExpr
	| equalityExpr EQUAL comparableExpr
	| equalityExpr NOT_EQUAL comparableExpr
	| equalityExpr NOT_EQUAL_R comparableExpr
	| equalityExpr EQUAL_R comparableExpr;

comparableExpr:
	inisOperation
	| comparableExpr GT inisOperation
	| comparableExpr LT inisOperation
	| comparableExpr GTE inisOperation
	| comparableExpr LTE inisOperation;
inisOperation:
	shiftExpr (
		(innotin NL* shiftExpr)+
		| ((ISOP | NOTIS) NL* type)
	)?;
innotin: INOP | NOTIN;

shiftExpr:
	rangeExpr
	| shiftExpr SHIFT_R rangeExpr
	| shiftExpr SHIFT_L rangeExpr;
rangeExpr:
	addExpr ((RANGE_OP | DOWN_TO) NL* addExpr (STEP addExpr)?)?;

addExpr:
	multiExpr
	| addExpr PLUS multiExpr
	| addExpr MINUS multiExpr;
multiExpr:
	term
	| multiExpr DIV term
	| multiExpr MUL term
	| multiExpr QUAT term;
term: prefixop* postterm;
prefixop: (PLUS | INC | DEC | MINUS);
postterm: atomic postoperation*;
posttermwithoutincdec:
	ID (LBRAC expression RBRAC)* dotoperation*;
dotoperation: NL* DOT NL* posttermwithoutincdec;
atomic:
	digit
	| ID (LBRAC expression RBRAC)*
	| LPAR expression RPAR
	| functioncall
	| conditionalExp
	| type LPAR RPAR;
postoperation: (INC | DEC) | NL* DOT NL* postterm;

digit: INT | REAL | BOOL | HEXA | BINARY | LONG | string;

functioncall:
	functionname LPAR NL* inputparameter NL* (
		COMM NL* inputparameter NL*
	)* RPAR
	| functionname LPAR RPAR
	| functionname lambdaExpr;
lambdaExpr: block;
functionname: ID;
inputparameter: commonstmt;

flowcontrol: loopExp;
loopExp: forExp | whileExp | dowhileExp;
forExp:
	FOR NL* LPAR variableDeclare (INOP | NOTIN) expression RPAR NL* (
		block
		| inblockExpression
	)?;
variableDeclare:
	LPAR ID (COLON type)? (COMM (ID (COLON type)?))* RPAR
	| ID (COLON type)?;
whileExp:
	WHILE NL* LPAR commonstmt RPAR NL* (
		block
		| inblockExpression
	)?;
dowhileExp:
	DO (block | inblockExpression) NL* WHILE NL* LPAR commonstmt RPAR;

conditionalExp: ifExp | whenExp;

ifExp:
	IF NL* LPAR commonstmt RPAR NL* ifstmt? (
		NL* ELSE_IF NL* ifstmt?
	)? (NL* ELSE NL* ifstmt?)?;
ifstmt: (block | inblockExpression);
whenExp:
	WHEN NL* (LPAR expression RPAR)? NL* LCURL NL* (
		whenComponent NL*
	)* NL* RCURL;
whenComponent:
	whenCondition (NL* COMM NL* whenCondition)* NL* ARROW NL* ifstmt NL+
	| ELSE NL* ARROW NL* ifstmt;

whenCondition: expression | rangeinWhen | typeinWhen;

rangeinWhen: (INOP | NOTIN) NL* expression;

typeinWhen: (ISOP | NOTIS) NL* type;

type:
	TYPE_INT
	| TYPE_FLOAT
	| TYPE_STRING
	| TYPE_ANY
	| TYPE_Double
	| TYPE_Long
	| TYPE_SHORT
	| TYPE_BYTE
	| TYPE_CLASS
	| TYPE_BOOLEAN
	| TYPE_UNIT;
assignment: EQ | PLUSEQ | MINUSEQ | MULTEQ | DIVEQ | QEQ;

string: LQ stringcomponent* RQ;
stringcomponent: (stringContent | stringExpression);

stringContent: StrCommonText | StrEscape | StrFieldReference;

stringExpression: StringExpStart expression RCURL;