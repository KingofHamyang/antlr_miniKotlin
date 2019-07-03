// Generated from /Users/haseongjun/project/antlr_miniKotlin/KotlinParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KotlinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Escape=1, VAR=2, PACKAGE=3, IMPORT=4, RETURN=5, LOGICAL_OR=6, LOGICAL_AND=7, 
		GET=8, BIT_OR=9, BIT_AND=10, BIT_XOR=11, INOP=12, NOTIN=13, ISOP=14, NOTIS=15, 
		COLON=16, COMM=17, LPAR=18, RPAR=19, QUESTION=20, LCURL=21, RCURL=22, 
		EQ=23, PLUSEQ=24, MINUSEQ=25, MULTEQ=26, DIVEQ=27, QEQ=28, DO=29, DOT=30, 
		EQUAL_R=31, EQUAL=32, NOT_EQUAL=33, NOT_EQUAL_R=34, ARROW=35, DIV=36, 
		MUL=37, QUAT=38, RANGE_OP=39, WHEN=40, INC=41, DEC=42, FOR=43, WHILE=44, 
		IF=45, ELSE=46, ELSE_IF=47, GT=48, LT=49, GTE=50, LTE=51, SHIFT_R=52, 
		SHIFT_L=53, DOWN_TO=54, STEP=55, FUNC=56, LBRAC=57, RBRAC=58, ABSTRACT=59, 
		CLASS=60, INTERFACE=61, OVERRIDE=62, MINUS=63, PLUS=64, TYPE_INT=65, TYPE_STRING=66, 
		TYPE_FLOAT=67, TYPE_ANY=68, TYPE_Double=69, TYPE_Long=70, TYPE_SHORT=71, 
		TYPE_BYTE=72, TYPE_BOOLEAN=73, TYPE_UNIT=74, TYPE_CLASS=75, NL=76, INT=77, 
		BOOL=78, LONG=79, HEXA=80, BINARY=81, REAL=82, ID=83, WS=84, LQ=85, FieldID=86, 
		RQ=87, StrFieldReference=88, StrCommonText=89, StrEscape=90, StringExpStart=91, 
		StringExpression_WS=92, StringExpression_NL=93;
	public static final int
		RULE_prog = 0, RULE_chunk = 1, RULE_packages = 2, RULE_importing = 3, 
		RULE_packagelist = 4, RULE_parameter = 5, RULE_classDefine = 6, RULE_classbody = 7, 
		RULE_classblock = 8, RULE_classbodymembers = 9, RULE_getter = 10, RULE_typestrict = 11, 
		RULE_class_stmt = 12, RULE_extendlist = 13, RULE_variableDefine = 14, 
		RULE_functionDefine = 15, RULE_functionbody = 16, RULE_block = 17, RULE_multiple_stmt = 18, 
		RULE_stmt = 19, RULE_defining = 20, RULE_inblockExpression = 21, RULE_returning = 22, 
		RULE_expression = 23, RULE_assignstmt = 24, RULE_unaryexpression = 25, 
		RULE_commonstmt = 26, RULE_oroperation = 27, RULE_andoperation = 28, RULE_inclusiveoroperation = 29, 
		RULE_exclusiveoperation = 30, RULE_andExpr = 31, RULE_equalityExpr = 32, 
		RULE_comparableExpr = 33, RULE_inisOperation = 34, RULE_innotin = 35, 
		RULE_shiftExpr = 36, RULE_rangeExpr = 37, RULE_addExpr = 38, RULE_multiExpr = 39, 
		RULE_term = 40, RULE_prefixop = 41, RULE_postterm = 42, RULE_posttermwithoutincdec = 43, 
		RULE_dotoperation = 44, RULE_atomic = 45, RULE_postoperation = 46, RULE_digit = 47, 
		RULE_functioncall = 48, RULE_lambdaExpr = 49, RULE_functionname = 50, 
		RULE_inputparameter = 51, RULE_flowcontrol = 52, RULE_loopExp = 53, RULE_forExp = 54, 
		RULE_variableDeclare = 55, RULE_whileExp = 56, RULE_dowhileExp = 57, RULE_conditionalExp = 58, 
		RULE_ifExp = 59, RULE_ifstmt = 60, RULE_whenExp = 61, RULE_whenComponent = 62, 
		RULE_whenCondition = 63, RULE_rangeinWhen = 64, RULE_typeinWhen = 65, 
		RULE_type = 66, RULE_assignment = 67, RULE_string = 68, RULE_stringcomponent = 69, 
		RULE_stringContent = 70, RULE_stringExpression = 71;
	public static final String[] ruleNames = {
		"prog", "chunk", "packages", "importing", "packagelist", "parameter", 
		"classDefine", "classbody", "classblock", "classbodymembers", "getter", 
		"typestrict", "class_stmt", "extendlist", "variableDefine", "functionDefine", 
		"functionbody", "block", "multiple_stmt", "stmt", "defining", "inblockExpression", 
		"returning", "expression", "assignstmt", "unaryexpression", "commonstmt", 
		"oroperation", "andoperation", "inclusiveoroperation", "exclusiveoperation", 
		"andExpr", "equalityExpr", "comparableExpr", "inisOperation", "innotin", 
		"shiftExpr", "rangeExpr", "addExpr", "multiExpr", "term", "prefixop", 
		"postterm", "posttermwithoutincdec", "dotoperation", "atomic", "postoperation", 
		"digit", "functioncall", "lambdaExpr", "functionname", "inputparameter", 
		"flowcontrol", "loopExp", "forExp", "variableDeclare", "whileExp", "dowhileExp", 
		"conditionalExp", "ifExp", "ifstmt", "whenExp", "whenComponent", "whenCondition", 
		"rangeinWhen", "typeinWhen", "type", "assignment", "string", "stringcomponent", 
		"stringContent", "stringExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'package'", "'import'", "'return'", "'||'", "'&&'", 
		"'get'", "'or'", "'and'", "'xor'", "'in'", "'!in'", "'is'", "'!is'", "':'", 
		"','", "'('", "')'", "'?'", "'{'", "'}'", "'='", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'do'", "'.'", "'==='", "'=='", "'!='", "'!=='", "'->'", 
		"'/'", "'*'", "'%'", "'..'", "'when'", "'++'", "'--'", "'for'", "'while'", 
		"'if'", "'else'", "'else if'", "'>'", "'<'", "'>='", "'<='", "'shr'", 
		"'shl'", "'downTo'", "'step'", "'fun'", "'['", "']'", "'abstract'", "'class'", 
		"'interface'", "'override'", "'-'", "'+'", "'Int'", "'String'", "'Float'", 
		"'Any'", "'Double'", "'Long'", "'Short'", "'Byte'", "'Boolean'", "'Unit'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'${'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Escape", "VAR", "PACKAGE", "IMPORT", "RETURN", "LOGICAL_OR", "LOGICAL_AND", 
		"GET", "BIT_OR", "BIT_AND", "BIT_XOR", "INOP", "NOTIN", "ISOP", "NOTIS", 
		"COLON", "COMM", "LPAR", "RPAR", "QUESTION", "LCURL", "RCURL", "EQ", "PLUSEQ", 
		"MINUSEQ", "MULTEQ", "DIVEQ", "QEQ", "DO", "DOT", "EQUAL_R", "EQUAL", 
		"NOT_EQUAL", "NOT_EQUAL_R", "ARROW", "DIV", "MUL", "QUAT", "RANGE_OP", 
		"WHEN", "INC", "DEC", "FOR", "WHILE", "IF", "ELSE", "ELSE_IF", "GT", "LT", 
		"GTE", "LTE", "SHIFT_R", "SHIFT_L", "DOWN_TO", "STEP", "FUNC", "LBRAC", 
		"RBRAC", "ABSTRACT", "CLASS", "INTERFACE", "OVERRIDE", "MINUS", "PLUS", 
		"TYPE_INT", "TYPE_STRING", "TYPE_FLOAT", "TYPE_ANY", "TYPE_Double", "TYPE_Long", 
		"TYPE_SHORT", "TYPE_BYTE", "TYPE_BOOLEAN", "TYPE_UNIT", "TYPE_CLASS", 
		"NL", "INT", "BOOL", "LONG", "HEXA", "BINARY", "REAL", "ID", "WS", "LQ", 
		"FieldID", "RQ", "StrFieldReference", "StrCommonText", "StrEscape", "StringExpStart", 
		"StringExpression_WS", "StringExpression_NL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "KotlinParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KotlinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<ChunkContext> chunk() {
			return getRuleContexts(ChunkContext.class);
		}
		public ChunkContext chunk(int i) {
			return getRuleContext(ChunkContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(144);
				match(NL);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			chunk();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(152); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(151);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(154); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PACKAGE) | (1L << IMPORT) | (1L << LPAR) | (1L << DO) | (1L << WHEN) | (1L << INC) | (1L << DEC) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << FUNC) | (1L << ABSTRACT) | (1L << CLASS) | (1L << INTERFACE) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (TYPE_INT - 64)) | (1L << (TYPE_STRING - 64)) | (1L << (TYPE_FLOAT - 64)) | (1L << (TYPE_ANY - 64)) | (1L << (TYPE_Double - 64)) | (1L << (TYPE_Long - 64)) | (1L << (TYPE_SHORT - 64)) | (1L << (TYPE_BYTE - 64)) | (1L << (TYPE_BOOLEAN - 64)) | (1L << (TYPE_UNIT - 64)) | (1L << (TYPE_CLASS - 64)) | (1L << (INT - 64)) | (1L << (BOOL - 64)) | (1L << (LONG - 64)) | (1L << (HEXA - 64)) | (1L << (BINARY - 64)) | (1L << (REAL - 64)) | (1L << (ID - 64)) | (1L << (LQ - 64)))) != 0)) {
					{
					setState(156);
					chunk();
					}
				}

				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChunkContext extends ParserRuleContext {
		public FunctionDefineContext functionDefine() {
			return getRuleContext(FunctionDefineContext.class,0);
		}
		public ClassDefineContext classDefine() {
			return getRuleContext(ClassDefineContext.class,0);
		}
		public VariableDefineContext variableDefine() {
			return getRuleContext(VariableDefineContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PackagesContext packages() {
			return getRuleContext(PackagesContext.class,0);
		}
		public ImportingContext importing() {
			return getRuleContext(ImportingContext.class,0);
		}
		public FlowcontrolContext flowcontrol() {
			return getRuleContext(FlowcontrolContext.class,0);
		}
		public ChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunk; }
	}

	public final ChunkContext chunk() throws RecognitionException {
		ChunkContext _localctx = new ChunkContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_chunk);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				functionDefine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				classDefine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				variableDefine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				packages();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				importing();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				flowcontrol();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackagesContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(KotlinParser.PACKAGE, 0); }
		public PackagelistContext packagelist() {
			return getRuleContext(PackagelistContext.class,0);
		}
		public PackagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packages; }
	}

	public final PackagesContext packages() throws RecognitionException {
		PackagesContext _localctx = new PackagesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packages);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(PACKAGE);
			setState(174);
			packagelist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportingContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(KotlinParser.IMPORT, 0); }
		public PackagelistContext packagelist() {
			return getRuleContext(PackagelistContext.class,0);
		}
		public ImportingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importing; }
	}

	public final ImportingContext importing() throws RecognitionException {
		ImportingContext _localctx = new ImportingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IMPORT);
			setState(177);
			packagelist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackagelistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(KotlinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KotlinParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(KotlinParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KotlinParser.DOT, i);
		}
		public TerminalNode MUL() { return getToken(KotlinParser.MUL, 0); }
		public PackagelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packagelist; }
	}

	public final PackagelistContext packagelist() throws RecognitionException {
		PackagelistContext _localctx = new PackagelistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_packagelist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ID);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					match(DOT);
					setState(181);
					match(ID);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(187);
				match(DOT);
				setState(188);
				match(MUL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ID);
			setState(192);
			match(COLON);
			setState(193);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefineContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode CLASS() { return getToken(KotlinParser.CLASS, 0); }
		public TerminalNode INTERFACE() { return getToken(KotlinParser.INTERFACE, 0); }
		public TerminalNode ABSTRACT() { return getToken(KotlinParser.ABSTRACT, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public List<ExtendlistContext> extendlist() {
			return getRuleContexts(ExtendlistContext.class);
		}
		public ExtendlistContext extendlist(int i) {
			return getRuleContext(ExtendlistContext.class,i);
		}
		public ClassbodyContext classbody() {
			return getRuleContext(ClassbodyContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<VariableDefineContext> variableDefine() {
			return getRuleContexts(VariableDefineContext.class);
		}
		public VariableDefineContext variableDefine(int i) {
			return getRuleContext(VariableDefineContext.class,i);
		}
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public List<TerminalNode> COMM() { return getTokens(KotlinParser.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(KotlinParser.COMM, i);
		}
		public ClassDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefine; }
	}

	public final ClassDefineContext classDefine() throws RecognitionException {
		ClassDefineContext _localctx = new ClassDefineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDefine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(195);
				match(ABSTRACT);
				}
			}

			setState(198);
			_la = _input.LA(1);
			if ( !(_la==CLASS || _la==INTERFACE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(199);
			match(ID);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(200);
					match(NL);
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(206);
					match(NL);
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212);
				match(LPAR);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(213);
					match(NL);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==ID) {
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(219);
						match(VAR);
						}
						break;
					}
					setState(224);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(222);
						parameter();
						}
						break;
					case VAR:
						{
						setState(223);
						variableDefine();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMM) {
						{
						{
						setState(226);
						match(COMM);
						setState(230);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(227);
							match(NL);
							}
							}
							setState(232);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(235);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(233);
							parameter();
							}
							break;
						case VAR:
							{
							setState(234);
							variableDefine();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(240);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(237);
								match(NL);
								}
								} 
							}
							setState(242);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						}
						}
						}
						setState(247);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(248);
						match(NL);
						}
						}
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(256);
				match(RPAR);
				}
				break;
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(259);
				match(COLON);
				setState(260);
				extendlist();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMM) {
					{
					{
					setState(261);
					match(COMM);
					setState(262);
					extendlist();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(270);
					match(NL);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(276);
				classbody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassbodyContext extends ParserRuleContext {
		public ClassblockContext classblock() {
			return getRuleContext(ClassblockContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public ClassbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbody; }
	}

	public final ClassbodyContext classbody() throws RecognitionException {
		ClassbodyContext _localctx = new ClassbodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classbody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(279);
				match(NL);
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			classblock();
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(286);
					match(NL);
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassblockContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<ClassbodymembersContext> classbodymembers() {
			return getRuleContexts(ClassbodymembersContext.class);
		}
		public ClassbodymembersContext classbodymembers(int i) {
			return getRuleContext(ClassbodymembersContext.class,i);
		}
		public ClassblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classblock; }
	}

	public final ClassblockContext classblock() throws RecognitionException {
		ClassblockContext _localctx = new ClassblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classblock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(LCURL);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(293);
					match(NL);
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << FUNC) | (1L << ABSTRACT) | (1L << CLASS) | (1L << INTERFACE) | (1L << OVERRIDE))) != 0)) {
				{
				{
				setState(299);
				classbodymembers();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(305);
				match(NL);
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassbodymembersContext extends ParserRuleContext {
		public ClassDefineContext classDefine() {
			return getRuleContext(ClassDefineContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public FunctionDefineContext functionDefine() {
			return getRuleContext(FunctionDefineContext.class,0);
		}
		public TypestrictContext typestrict() {
			return getRuleContext(TypestrictContext.class,0);
		}
		public VariableDefineContext variableDefine() {
			return getRuleContext(VariableDefineContext.class,0);
		}
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public ClassbodymembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classbodymembers; }
	}

	public final ClassbodymembersContext classbodymembers() throws RecognitionException {
		ClassbodymembersContext _localctx = new ClassbodymembersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classbodymembers);
		int _la;
		try {
			int _alt;
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				classDefine();
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(314);
						match(NL);
						}
						} 
					}
					setState(319);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT || _la==OVERRIDE) {
					{
					setState(320);
					typestrict();
					}
				}

				setState(323);
				functionDefine();
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(324);
						match(NL);
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT || _la==OVERRIDE) {
					{
					setState(330);
					typestrict();
					}
				}

				setState(333);
				variableDefine();
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(334);
						match(NL);
						}
						} 
					}
					setState(339);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GET) {
					{
					setState(340);
					getter();
					}
				}

				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(343);
						match(NL);
						}
						} 
					}
					setState(348);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(KotlinParser.GET, 0); }
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public TerminalNode EQ() { return getToken(KotlinParser.EQ, 0); }
		public CommonstmtContext commonstmt() {
			return getRuleContext(CommonstmtContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(GET);
			setState(352);
			match(LPAR);
			setState(353);
			match(RPAR);
			setState(354);
			match(EQ);
			setState(355);
			commonstmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypestrictContext extends ParserRuleContext {
		public TerminalNode OVERRIDE() { return getToken(KotlinParser.OVERRIDE, 0); }
		public TerminalNode ABSTRACT() { return getToken(KotlinParser.ABSTRACT, 0); }
		public TypestrictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typestrict; }
	}

	public final TypestrictContext typestrict() throws RecognitionException {
		TypestrictContext _localctx = new TypestrictContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typestrict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			_la = _input.LA(1);
			if ( !(_la==ABSTRACT || _la==OVERRIDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_stmtContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(KotlinParser.MINUS, 0); }
		public Class_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_stmt; }
	}

	public final Class_stmtContext class_stmt() throws RecognitionException {
		Class_stmtContext _localctx = new Class_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_class_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(MINUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendlistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public List<InputparameterContext> inputparameter() {
			return getRuleContexts(InputparameterContext.class);
		}
		public InputparameterContext inputparameter(int i) {
			return getRuleContext(InputparameterContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public List<TerminalNode> COMM() { return getTokens(KotlinParser.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(KotlinParser.COMM, i);
		}
		public ExtendlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendlist; }
	}

	public final ExtendlistContext extendlist() throws RecognitionException {
		ExtendlistContext _localctx = new ExtendlistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_extendlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(ID);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(362);
				match(LPAR);
				setState(363);
				inputparameter();
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMM) {
					{
					{
					setState(364);
					match(COMM);
					setState(365);
					inputparameter();
					}
					}
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(371);
				match(RPAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefineContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(KotlinParser.VAR, 0); }
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CommonstmtContext commonstmt() {
			return getRuleContext(CommonstmtContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public VariableDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefine; }
	}

	public final VariableDefineContext variableDefine() throws RecognitionException {
		VariableDefineContext _localctx = new VariableDefineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(VAR);
			setState(376);
			match(ID);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(377);
				match(COLON);
				setState(378);
				type();
				}
				break;
			}
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(381);
				assignment();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(382);
					match(NL);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388);
				commonstmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefineContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(KotlinParser.FUNC, 0); }
		public FunctionnameContext functionname() {
			return getRuleContext(FunctionnameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMM() { return getTokens(KotlinParser.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(KotlinParser.COMM, i);
		}
		public FunctionDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefine; }
	}

	public final FunctionDefineContext functionDefine() throws RecognitionException {
		FunctionDefineContext _localctx = new FunctionDefineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDefine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(FUNC);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(393);
				match(NL);
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			functionname();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(400);
				match(NL);
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			match(LPAR);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(407);
					match(NL);
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(413);
				parameter();
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(414);
						match(NL);
						}
						} 
					}
					setState(419);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(420);
							match(NL);
							}
							}
							setState(425);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(426);
						match(COMM);
						setState(430);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(427);
							match(NL);
							}
							}
							setState(432);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(433);
						parameter();
						setState(437);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(434);
								match(NL);
								}
								} 
							}
							setState(439);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
						}
						}
						} 
					}
					setState(444);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				}
			}

			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(447);
				match(NL);
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(453);
			match(RPAR);
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(454);
					match(NL);
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(460);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EQ() { return getToken(KotlinParser.EQ, 0); }
		public CommonstmtContext commonstmt() {
			return getRuleContext(CommonstmtContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(KotlinParser.QUESTION, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionbody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(462);
				match(COLON);
				setState(463);
				type();
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(464);
					match(QUESTION);
					}
				}

				}
			}

			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(469);
					match(NL);
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				{
				setState(475);
				block();
				}
				break;
			case EQ:
				{
				setState(476);
				match(EQ);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(477);
					match(NL);
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(483);
				commonstmt();
				}
				break;
			case EOF:
			case VAR:
			case RCURL:
			case FUNC:
			case ABSTRACT:
			case CLASS:
			case INTERFACE:
			case OVERRIDE:
			case NL:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public Multiple_stmtContext multiple_stmt() {
			return getRuleContext(Multiple_stmtContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(LCURL);
			setState(487);
			multiple_stmt();
			setState(488);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiple_stmtContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Multiple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_stmt; }
	}

	public final Multiple_stmtContext multiple_stmt() throws RecognitionException {
		Multiple_stmtContext _localctx = new Multiple_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(490);
					match(NL);
					}
					} 
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << RETURN) | (1L << LPAR) | (1L << DO) | (1L << WHEN) | (1L << INC) | (1L << DEC) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << FUNC) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (TYPE_INT - 64)) | (1L << (TYPE_STRING - 64)) | (1L << (TYPE_FLOAT - 64)) | (1L << (TYPE_ANY - 64)) | (1L << (TYPE_Double - 64)) | (1L << (TYPE_Long - 64)) | (1L << (TYPE_SHORT - 64)) | (1L << (TYPE_BYTE - 64)) | (1L << (TYPE_BOOLEAN - 64)) | (1L << (TYPE_UNIT - 64)) | (1L << (TYPE_CLASS - 64)) | (1L << (NL - 64)) | (1L << (INT - 64)) | (1L << (BOOL - 64)) | (1L << (LONG - 64)) | (1L << (HEXA - 64)) | (1L << (BINARY - 64)) | (1L << (REAL - 64)) | (1L << (ID - 64)) | (1L << (LQ - 64)))) != 0)) {
				{
				setState(496);
				stmt();
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(498); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(497);
							match(NL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(500); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(503);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(502);
						stmt();
						}
						break;
					}
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public DefiningContext defining() {
			return getRuleContext(DefiningContext.class,0);
		}
		public InblockExpressionContext inblockExpression() {
			return getRuleContext(InblockExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmt);
		int _la;
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				defining();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(513);
					match(NL);
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(519);
				inblockExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefiningContext extends ParserRuleContext {
		public FunctionDefineContext functionDefine() {
			return getRuleContext(FunctionDefineContext.class,0);
		}
		public VariableDefineContext variableDefine() {
			return getRuleContext(VariableDefineContext.class,0);
		}
		public DefiningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defining; }
	}

	public final DefiningContext defining() throws RecognitionException {
		DefiningContext _localctx = new DefiningContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_defining);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				functionDefine();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				variableDefine();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InblockExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FlowcontrolContext flowcontrol() {
			return getRuleContext(FlowcontrolContext.class,0);
		}
		public ReturningContext returning() {
			return getRuleContext(ReturningContext.class,0);
		}
		public InblockExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inblockExpression; }
	}

	public final InblockExpressionContext inblockExpression() throws RecognitionException {
		InblockExpressionContext _localctx = new InblockExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inblockExpression);
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case LPAR:
			case WHEN:
			case INC:
			case DEC:
			case IF:
			case MINUS:
			case PLUS:
			case TYPE_INT:
			case TYPE_STRING:
			case TYPE_FLOAT:
			case TYPE_ANY:
			case TYPE_Double:
			case TYPE_Long:
			case TYPE_SHORT:
			case TYPE_BYTE:
			case TYPE_BOOLEAN:
			case TYPE_UNIT:
			case TYPE_CLASS:
			case INT:
			case BOOL:
			case LONG:
			case HEXA:
			case BINARY:
			case REAL:
			case ID:
			case LQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				expression();
				}
				break;
			case DO:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				flowcontrol();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				returning();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturningContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KotlinParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returning; }
	}

	public final ReturningContext returning() throws RecognitionException {
		ReturningContext _localctx = new ReturningContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returning);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(RETURN);
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(532);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public CommonstmtContext commonstmt() {
			return getRuleContext(CommonstmtContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				commonstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				assignstmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignstmtContext extends ParserRuleContext {
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CommonstmtContext commonstmt() {
			return getRuleContext(CommonstmtContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public VariableDefineContext variableDefine() {
			return getRuleContext(VariableDefineContext.class,0);
		}
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignstmt);
		int _la;
		try {
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				unaryexpression();
				setState(540);
				assignment();
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(541);
					match(NL);
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(547);
				commonstmt();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				variableDefine();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryexpressionContext extends ParserRuleContext {
		public PosttermwithoutincdecContext posttermwithoutincdec() {
			return getRuleContext(PosttermwithoutincdecContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			posttermwithoutincdec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonstmtContext extends ParserRuleContext {
		public OroperationContext oroperation() {
			return getRuleContext(OroperationContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(KotlinParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(KotlinParser.COLON, 0); }
		public List<CommonstmtContext> commonstmt() {
			return getRuleContexts(CommonstmtContext.class);
		}
		public CommonstmtContext commonstmt(int i) {
			return getRuleContext(CommonstmtContext.class,i);
		}
		public CommonstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonstmt; }
	}

	public final CommonstmtContext commonstmt() throws RecognitionException {
		CommonstmtContext _localctx = new CommonstmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_commonstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			oroperation(0);
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(555);
				match(QUESTION);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAR) | (1L << WHEN) | (1L << INC) | (1L << DEC) | (1L << IF) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (TYPE_INT - 64)) | (1L << (TYPE_STRING - 64)) | (1L << (TYPE_FLOAT - 64)) | (1L << (TYPE_ANY - 64)) | (1L << (TYPE_Double - 64)) | (1L << (TYPE_Long - 64)) | (1L << (TYPE_SHORT - 64)) | (1L << (TYPE_BYTE - 64)) | (1L << (TYPE_BOOLEAN - 64)) | (1L << (TYPE_UNIT - 64)) | (1L << (TYPE_CLASS - 64)) | (1L << (INT - 64)) | (1L << (BOOL - 64)) | (1L << (LONG - 64)) | (1L << (HEXA - 64)) | (1L << (BINARY - 64)) | (1L << (REAL - 64)) | (1L << (ID - 64)) | (1L << (LQ - 64)))) != 0)) {
					{
					setState(556);
					commonstmt();
					}
				}

				setState(559);
				match(COLON);
				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(560);
					commonstmt();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OroperationContext extends ParserRuleContext {
		public AndoperationContext andoperation() {
			return getRuleContext(AndoperationContext.class,0);
		}
		public OroperationContext oroperation() {
			return getRuleContext(OroperationContext.class,0);
		}
		public TerminalNode LOGICAL_OR() { return getToken(KotlinParser.LOGICAL_OR, 0); }
		public OroperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oroperation; }
	}

	public final OroperationContext oroperation() throws RecognitionException {
		return oroperation(0);
	}

	private OroperationContext oroperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OroperationContext _localctx = new OroperationContext(_ctx, _parentState);
		OroperationContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_oroperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(566);
			andoperation(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(573);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OroperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oroperation);
					setState(568);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(569);
					match(LOGICAL_OR);
					setState(570);
					andoperation(0);
					}
					} 
				}
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndoperationContext extends ParserRuleContext {
		public InclusiveoroperationContext inclusiveoroperation() {
			return getRuleContext(InclusiveoroperationContext.class,0);
		}
		public AndoperationContext andoperation() {
			return getRuleContext(AndoperationContext.class,0);
		}
		public TerminalNode LOGICAL_AND() { return getToken(KotlinParser.LOGICAL_AND, 0); }
		public AndoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andoperation; }
	}

	public final AndoperationContext andoperation() throws RecognitionException {
		return andoperation(0);
	}

	private AndoperationContext andoperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndoperationContext _localctx = new AndoperationContext(_ctx, _parentState);
		AndoperationContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_andoperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(577);
			inclusiveoroperation(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndoperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andoperation);
					setState(579);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(580);
					match(LOGICAL_AND);
					setState(581);
					inclusiveoroperation(0);
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveoroperationContext extends ParserRuleContext {
		public ExclusiveoperationContext exclusiveoperation() {
			return getRuleContext(ExclusiveoperationContext.class,0);
		}
		public InclusiveoroperationContext inclusiveoroperation() {
			return getRuleContext(InclusiveoroperationContext.class,0);
		}
		public TerminalNode BIT_OR() { return getToken(KotlinParser.BIT_OR, 0); }
		public InclusiveoroperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveoroperation; }
	}

	public final InclusiveoroperationContext inclusiveoroperation() throws RecognitionException {
		return inclusiveoroperation(0);
	}

	private InclusiveoroperationContext inclusiveoroperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveoroperationContext _localctx = new InclusiveoroperationContext(_ctx, _parentState);
		InclusiveoroperationContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_inclusiveoroperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(588);
			exclusiveoperation(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveoroperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveoroperation);
					setState(590);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(591);
					match(BIT_OR);
					setState(592);
					exclusiveoperation(0);
					}
					} 
				}
				setState(597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveoperationContext extends ParserRuleContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public ExclusiveoperationContext exclusiveoperation() {
			return getRuleContext(ExclusiveoperationContext.class,0);
		}
		public TerminalNode BIT_XOR() { return getToken(KotlinParser.BIT_XOR, 0); }
		public ExclusiveoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveoperation; }
	}

	public final ExclusiveoperationContext exclusiveoperation() throws RecognitionException {
		return exclusiveoperation(0);
	}

	private ExclusiveoperationContext exclusiveoperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveoperationContext _localctx = new ExclusiveoperationContext(_ctx, _parentState);
		ExclusiveoperationContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_exclusiveoperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(599);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveoperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveoperation);
					setState(601);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(602);
					match(BIT_XOR);
					setState(603);
					andExpr(0);
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public EqualityExprContext equalityExpr() {
			return getRuleContext(EqualityExprContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public TerminalNode BIT_AND() { return getToken(KotlinParser.BIT_AND, 0); }
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
	}

	public final AndExprContext andExpr() throws RecognitionException {
		return andExpr(0);
	}

	private AndExprContext andExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExprContext _localctx = new AndExprContext(_ctx, _parentState);
		AndExprContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(610);
			equalityExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(612);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(613);
					match(BIT_AND);
					setState(614);
					equalityExpr(0);
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExprContext extends ParserRuleContext {
		public ComparableExprContext comparableExpr() {
			return getRuleContext(ComparableExprContext.class,0);
		}
		public EqualityExprContext equalityExpr() {
			return getRuleContext(EqualityExprContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(KotlinParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(KotlinParser.NOT_EQUAL, 0); }
		public TerminalNode NOT_EQUAL_R() { return getToken(KotlinParser.NOT_EQUAL_R, 0); }
		public TerminalNode EQUAL_R() { return getToken(KotlinParser.EQUAL_R, 0); }
		public EqualityExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpr; }
	}

	public final EqualityExprContext equalityExpr() throws RecognitionException {
		return equalityExpr(0);
	}

	private EqualityExprContext equalityExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExprContext _localctx = new EqualityExprContext(_ctx, _parentState);
		EqualityExprContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_equalityExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(621);
			comparableExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(635);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
						setState(623);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(624);
						match(EQUAL);
						setState(625);
						comparableExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
						setState(626);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(627);
						match(NOT_EQUAL);
						setState(628);
						comparableExpr(0);
						}
						break;
					case 3:
						{
						_localctx = new EqualityExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
						setState(629);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(630);
						match(NOT_EQUAL_R);
						setState(631);
						comparableExpr(0);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
						setState(632);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(633);
						match(EQUAL_R);
						setState(634);
						comparableExpr(0);
						}
						break;
					}
					} 
				}
				setState(639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparableExprContext extends ParserRuleContext {
		public InisOperationContext inisOperation() {
			return getRuleContext(InisOperationContext.class,0);
		}
		public ComparableExprContext comparableExpr() {
			return getRuleContext(ComparableExprContext.class,0);
		}
		public TerminalNode GT() { return getToken(KotlinParser.GT, 0); }
		public TerminalNode LT() { return getToken(KotlinParser.LT, 0); }
		public TerminalNode GTE() { return getToken(KotlinParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(KotlinParser.LTE, 0); }
		public ComparableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparableExpr; }
	}

	public final ComparableExprContext comparableExpr() throws RecognitionException {
		return comparableExpr(0);
	}

	private ComparableExprContext comparableExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparableExprContext _localctx = new ComparableExprContext(_ctx, _parentState);
		ComparableExprContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_comparableExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(641);
			inisOperation();
			}
			_ctx.stop = _input.LT(-1);
			setState(657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(655);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new ComparableExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparableExpr);
						setState(643);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(644);
						match(GT);
						setState(645);
						inisOperation();
						}
						break;
					case 2:
						{
						_localctx = new ComparableExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparableExpr);
						setState(646);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(647);
						match(LT);
						setState(648);
						inisOperation();
						}
						break;
					case 3:
						{
						_localctx = new ComparableExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparableExpr);
						setState(649);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(650);
						match(GTE);
						setState(651);
						inisOperation();
						}
						break;
					case 4:
						{
						_localctx = new ComparableExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparableExpr);
						setState(652);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(653);
						match(LTE);
						setState(654);
						inisOperation();
						}
						break;
					}
					} 
				}
				setState(659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InisOperationContext extends ParserRuleContext {
		public List<ShiftExprContext> shiftExpr() {
			return getRuleContexts(ShiftExprContext.class);
		}
		public ShiftExprContext shiftExpr(int i) {
			return getRuleContext(ShiftExprContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<InnotinContext> innotin() {
			return getRuleContexts(InnotinContext.class);
		}
		public InnotinContext innotin(int i) {
			return getRuleContext(InnotinContext.class,i);
		}
		public TerminalNode ISOP() { return getToken(KotlinParser.ISOP, 0); }
		public TerminalNode NOTIS() { return getToken(KotlinParser.NOTIS, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public InisOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inisOperation; }
	}

	public final InisOperationContext inisOperation() throws RecognitionException {
		InisOperationContext _localctx = new InisOperationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_inisOperation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			shiftExpr(0);
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(670); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(661);
						innotin();
						setState(665);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(662);
							match(NL);
							}
							}
							setState(667);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(668);
						shiftExpr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(672); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				{
				setState(674);
				_la = _input.LA(1);
				if ( !(_la==ISOP || _la==NOTIS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(675);
					match(NL);
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681);
				type();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnotinContext extends ParserRuleContext {
		public TerminalNode INOP() { return getToken(KotlinParser.INOP, 0); }
		public TerminalNode NOTIN() { return getToken(KotlinParser.NOTIN, 0); }
		public InnotinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innotin; }
	}

	public final InnotinContext innotin() throws RecognitionException {
		InnotinContext _localctx = new InnotinContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_innotin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if ( !(_la==INOP || _la==NOTIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExprContext extends ParserRuleContext {
		public RangeExprContext rangeExpr() {
			return getRuleContext(RangeExprContext.class,0);
		}
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public TerminalNode SHIFT_R() { return getToken(KotlinParser.SHIFT_R, 0); }
		public TerminalNode SHIFT_L() { return getToken(KotlinParser.SHIFT_L, 0); }
		public ShiftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpr; }
	}

	public final ShiftExprContext shiftExpr() throws RecognitionException {
		return shiftExpr(0);
	}

	private ShiftExprContext shiftExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExprContext _localctx = new ShiftExprContext(_ctx, _parentState);
		ShiftExprContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_shiftExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(687);
			rangeExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(695);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpr);
						setState(689);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(690);
						match(SHIFT_R);
						setState(691);
						rangeExpr();
						}
						break;
					case 2:
						{
						_localctx = new ShiftExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpr);
						setState(692);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(693);
						match(SHIFT_L);
						setState(694);
						rangeExpr();
						}
						break;
					}
					} 
				}
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RangeExprContext extends ParserRuleContext {
		public List<AddExprContext> addExpr() {
			return getRuleContexts(AddExprContext.class);
		}
		public AddExprContext addExpr(int i) {
			return getRuleContext(AddExprContext.class,i);
		}
		public TerminalNode RANGE_OP() { return getToken(KotlinParser.RANGE_OP, 0); }
		public TerminalNode DOWN_TO() { return getToken(KotlinParser.DOWN_TO, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode STEP() { return getToken(KotlinParser.STEP, 0); }
		public RangeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpr; }
	}

	public final RangeExprContext rangeExpr() throws RecognitionException {
		RangeExprContext _localctx = new RangeExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rangeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			addExpr(0);
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(701);
				_la = _input.LA(1);
				if ( !(_la==RANGE_OP || _la==DOWN_TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(702);
					match(NL);
					}
					}
					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(708);
				addExpr(0);
				setState(711);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(709);
					match(STEP);
					setState(710);
					addExpr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddExprContext extends ParserRuleContext {
		public MultiExprContext multiExpr() {
			return getRuleContext(MultiExprContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(KotlinParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(KotlinParser.MINUS, 0); }
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	}

	public final AddExprContext addExpr() throws RecognitionException {
		return addExpr(0);
	}

	private AddExprContext addExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExprContext _localctx = new AddExprContext(_ctx, _parentState);
		AddExprContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_addExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(716);
			multiExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(724);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(718);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(719);
						match(PLUS);
						setState(720);
						multiExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(721);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(722);
						match(MINUS);
						setState(723);
						multiExpr(0);
						}
						break;
					}
					} 
				}
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MultiExprContext multiExpr() {
			return getRuleContext(MultiExprContext.class,0);
		}
		public TerminalNode DIV() { return getToken(KotlinParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(KotlinParser.MUL, 0); }
		public TerminalNode QUAT() { return getToken(KotlinParser.QUAT, 0); }
		public MultiExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiExpr; }
	}

	public final MultiExprContext multiExpr() throws RecognitionException {
		return multiExpr(0);
	}

	private MultiExprContext multiExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiExprContext _localctx = new MultiExprContext(_ctx, _parentState);
		MultiExprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_multiExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(730);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(743);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(741);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
					case 1:
						{
						_localctx = new MultiExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiExpr);
						setState(732);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(733);
						match(DIV);
						setState(734);
						term();
						}
						break;
					case 2:
						{
						_localctx = new MultiExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiExpr);
						setState(735);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(736);
						match(MUL);
						setState(737);
						term();
						}
						break;
					case 3:
						{
						_localctx = new MultiExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiExpr);
						setState(738);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(739);
						match(QUAT);
						setState(740);
						term();
						}
						break;
					}
					} 
				}
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public PosttermContext postterm() {
			return getRuleContext(PosttermContext.class,0);
		}
		public List<PrefixopContext> prefixop() {
			return getRuleContexts(PrefixopContext.class);
		}
		public PrefixopContext prefixop(int i) {
			return getRuleContext(PrefixopContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (INC - 41)) | (1L << (DEC - 41)) | (1L << (MINUS - 41)) | (1L << (PLUS - 41)))) != 0)) {
				{
				{
				setState(746);
				prefixop();
				}
				}
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(752);
			postterm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(KotlinParser.PLUS, 0); }
		public TerminalNode INC() { return getToken(KotlinParser.INC, 0); }
		public TerminalNode DEC() { return getToken(KotlinParser.DEC, 0); }
		public TerminalNode MINUS() { return getToken(KotlinParser.MINUS, 0); }
		public PrefixopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixop; }
	}

	public final PrefixopContext prefixop() throws RecognitionException {
		PrefixopContext _localctx = new PrefixopContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_prefixop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_la = _input.LA(1);
			if ( !(((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (INC - 41)) | (1L << (DEC - 41)) | (1L << (MINUS - 41)) | (1L << (PLUS - 41)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PosttermContext extends ParserRuleContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public List<PostoperationContext> postoperation() {
			return getRuleContexts(PostoperationContext.class);
		}
		public PostoperationContext postoperation(int i) {
			return getRuleContext(PostoperationContext.class,i);
		}
		public PosttermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postterm; }
	}

	public final PosttermContext postterm() throws RecognitionException {
		PosttermContext _localctx = new PosttermContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_postterm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			atomic();
			setState(760);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(757);
					postoperation();
					}
					} 
				}
				setState(762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PosttermwithoutincdecContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public List<TerminalNode> LBRAC() { return getTokens(KotlinParser.LBRAC); }
		public TerminalNode LBRAC(int i) {
			return getToken(KotlinParser.LBRAC, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRAC() { return getTokens(KotlinParser.RBRAC); }
		public TerminalNode RBRAC(int i) {
			return getToken(KotlinParser.RBRAC, i);
		}
		public List<DotoperationContext> dotoperation() {
			return getRuleContexts(DotoperationContext.class);
		}
		public DotoperationContext dotoperation(int i) {
			return getRuleContext(DotoperationContext.class,i);
		}
		public PosttermwithoutincdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posttermwithoutincdec; }
	}

	public final PosttermwithoutincdecContext posttermwithoutincdec() throws RecognitionException {
		PosttermwithoutincdecContext _localctx = new PosttermwithoutincdecContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_posttermwithoutincdec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(ID);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRAC) {
				{
				{
				setState(764);
				match(LBRAC);
				setState(765);
				expression();
				setState(766);
				match(RBRAC);
				}
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(776);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(773);
					dotoperation();
					}
					} 
				}
				setState(778);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotoperationContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public PosttermwithoutincdecContext posttermwithoutincdec() {
			return getRuleContext(PosttermwithoutincdecContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public DotoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotoperation; }
	}

	public final DotoperationContext dotoperation() throws RecognitionException {
		DotoperationContext _localctx = new DotoperationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_dotoperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(779);
				match(NL);
				}
				}
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(785);
			match(DOT);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(786);
				match(NL);
				}
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(792);
			posttermwithoutincdec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicContext extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public List<TerminalNode> LBRAC() { return getTokens(KotlinParser.LBRAC); }
		public TerminalNode LBRAC(int i) {
			return getToken(KotlinParser.LBRAC, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRAC() { return getTokens(KotlinParser.RBRAC); }
		public TerminalNode RBRAC(int i) {
			return getToken(KotlinParser.RBRAC, i);
		}
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ConditionalExpContext conditionalExp() {
			return getRuleContext(ConditionalExpContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_atomic);
		try {
			int _alt;
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				digit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(ID);
				setState(802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(796);
						match(LBRAC);
						setState(797);
						expression();
						setState(798);
						match(RBRAC);
						}
						} 
					}
					setState(804);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				match(LPAR);
				setState(806);
				expression();
				setState(807);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(809);
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(810);
				conditionalExp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(811);
				type();
				setState(812);
				match(LPAR);
				setState(813);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostoperationContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(KotlinParser.INC, 0); }
		public TerminalNode DEC() { return getToken(KotlinParser.DEC, 0); }
		public TerminalNode DOT() { return getToken(KotlinParser.DOT, 0); }
		public PosttermContext postterm() {
			return getRuleContext(PosttermContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public PostoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postoperation; }
	}

	public final PostoperationContext postoperation() throws RecognitionException {
		PostoperationContext _localctx = new PostoperationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_postoperation);
		int _la;
		try {
			setState(832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
			case DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(817);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DOT:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(818);
					match(NL);
					}
					}
					setState(823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(824);
				match(DOT);
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(825);
					match(NL);
					}
					}
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(831);
				postterm();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(KotlinParser.INT, 0); }
		public TerminalNode REAL() { return getToken(KotlinParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(KotlinParser.BOOL, 0); }
		public TerminalNode HEXA() { return getToken(KotlinParser.HEXA, 0); }
		public TerminalNode BINARY() { return getToken(KotlinParser.BINARY, 0); }
		public TerminalNode LONG() { return getToken(KotlinParser.LONG, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_digit);
		try {
			setState(841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				match(INT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				match(REAL);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(836);
				match(BOOL);
				}
				break;
			case HEXA:
				enterOuterAlt(_localctx, 4);
				{
				setState(837);
				match(HEXA);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 5);
				{
				setState(838);
				match(BINARY);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(839);
				match(LONG);
				}
				break;
			case LQ:
				enterOuterAlt(_localctx, 7);
				{
				setState(840);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public FunctionnameContext functionname() {
			return getRuleContext(FunctionnameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public List<InputparameterContext> inputparameter() {
			return getRuleContexts(InputparameterContext.class);
		}
		public InputparameterContext inputparameter(int i) {
			return getRuleContext(InputparameterContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<TerminalNode> COMM() { return getTokens(KotlinParser.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(KotlinParser.COMM, i);
		}
		public LambdaExprContext lambdaExpr() {
			return getRuleContext(LambdaExprContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_functioncall);
		int _la;
		try {
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(843);
				functionname();
				setState(844);
				match(LPAR);
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(845);
					match(NL);
					}
					}
					setState(850);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(851);
				inputparameter();
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(852);
					match(NL);
					}
					}
					setState(857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMM) {
					{
					{
					setState(858);
					match(COMM);
					setState(862);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(859);
						match(NL);
						}
						}
						setState(864);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(865);
					inputparameter();
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(866);
						match(NL);
						}
						}
						setState(871);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(876);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(877);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				functionname();
				setState(880);
				match(LPAR);
				setState(881);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(883);
				functionname();
				setState(884);
				lambdaExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExprContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpr; }
	}

	public final LambdaExprContext lambdaExpr() throws RecognitionException {
		LambdaExprContext _localctx = new LambdaExprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lambdaExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KotlinParser.ID, 0); }
		public FunctionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionname; }
	}

	public final FunctionnameContext functionname() throws RecognitionException {
		FunctionnameContext _localctx = new FunctionnameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_functionname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputparameterContext extends ParserRuleContext {
		public CommonstmtContext commonstmt() {
			return getRuleContext(CommonstmtContext.class,0);
		}
		public InputparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputparameter; }
	}

	public final InputparameterContext inputparameter() throws RecognitionException {
		InputparameterContext _localctx = new InputparameterContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_inputparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			commonstmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlowcontrolContext extends ParserRuleContext {
		public LoopExpContext loopExp() {
			return getRuleContext(LoopExpContext.class,0);
		}
		public FlowcontrolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flowcontrol; }
	}

	public final FlowcontrolContext flowcontrol() throws RecognitionException {
		FlowcontrolContext _localctx = new FlowcontrolContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_flowcontrol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			loopExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopExpContext extends ParserRuleContext {
		public ForExpContext forExp() {
			return getRuleContext(ForExpContext.class,0);
		}
		public WhileExpContext whileExp() {
			return getRuleContext(WhileExpContext.class,0);
		}
		public DowhileExpContext dowhileExp() {
			return getRuleContext(DowhileExpContext.class,0);
		}
		public LoopExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExp; }
	}

	public final LoopExpContext loopExp() throws RecognitionException {
		LoopExpContext _localctx = new LoopExpContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_loopExp);
		try {
			setState(899);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				forExp();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(897);
				whileExp();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(898);
				dowhileExp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KotlinParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public VariableDeclareContext variableDeclare() {
			return getRuleContext(VariableDeclareContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public TerminalNode INOP() { return getToken(KotlinParser.INOP, 0); }
		public TerminalNode NOTIN() { return getToken(KotlinParser.NOTIN, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InblockExpressionContext inblockExpression() {
			return getRuleContext(InblockExpressionContext.class,0);
		}
		public ForExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExp; }
	}

	public final ForExpContext forExp() throws RecognitionException {
		ForExpContext _localctx = new ForExpContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_forExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			match(FOR);
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(902);
				match(NL);
				}
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(908);
			match(LPAR);
			setState(909);
			variableDeclare();
			setState(910);
			_la = _input.LA(1);
			if ( !(_la==INOP || _la==NOTIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(911);
			expression();
			setState(912);
			match(RPAR);
			setState(916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(913);
					match(NL);
					}
					} 
				}
				setState(918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
			}
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(919);
				block();
				}
				break;
			case 2:
				{
				setState(920);
				inblockExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclareContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(KotlinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(KotlinParser.ID, i);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public List<TerminalNode> COLON() { return getTokens(KotlinParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(KotlinParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMM() { return getTokens(KotlinParser.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(KotlinParser.COMM, i);
		}
		public VariableDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclare; }
	}

	public final VariableDeclareContext variableDeclare() throws RecognitionException {
		VariableDeclareContext _localctx = new VariableDeclareContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclare);
		int _la;
		try {
			setState(946);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				match(LPAR);
				setState(924);
				match(ID);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(925);
					match(COLON);
					setState(926);
					type();
					}
				}

				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMM) {
					{
					{
					setState(929);
					match(COMM);
					{
					setState(930);
					match(ID);
					setState(933);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(931);
						match(COLON);
						setState(932);
						type();
						}
					}

					}
					}
					}
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(940);
				match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				match(ID);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(942);
					match(COLON);
					setState(943);
					type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileExpContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KotlinParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public CommonstmtContext commonstmt() {
			return getRuleContext(CommonstmtContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InblockExpressionContext inblockExpression() {
			return getRuleContext(InblockExpressionContext.class,0);
		}
		public WhileExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExp; }
	}

	public final WhileExpContext whileExp() throws RecognitionException {
		WhileExpContext _localctx = new WhileExpContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_whileExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(WHILE);
			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(949);
				match(NL);
				}
				}
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(955);
			match(LPAR);
			setState(956);
			commonstmt();
			setState(957);
			match(RPAR);
			setState(961);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(958);
					match(NL);
					}
					} 
				}
				setState(963);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(964);
				block();
				}
				break;
			case 2:
				{
				setState(965);
				inblockExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DowhileExpContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(KotlinParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(KotlinParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public CommonstmtContext commonstmt() {
			return getRuleContext(CommonstmtContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InblockExpressionContext inblockExpression() {
			return getRuleContext(InblockExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public DowhileExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhileExp; }
	}

	public final DowhileExpContext dowhileExp() throws RecognitionException {
		DowhileExpContext _localctx = new DowhileExpContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dowhileExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(DO);
			setState(971);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				{
				setState(969);
				block();
				}
				break;
			case VAR:
			case RETURN:
			case LPAR:
			case DO:
			case WHEN:
			case INC:
			case DEC:
			case FOR:
			case WHILE:
			case IF:
			case MINUS:
			case PLUS:
			case TYPE_INT:
			case TYPE_STRING:
			case TYPE_FLOAT:
			case TYPE_ANY:
			case TYPE_Double:
			case TYPE_Long:
			case TYPE_SHORT:
			case TYPE_BYTE:
			case TYPE_BOOLEAN:
			case TYPE_UNIT:
			case TYPE_CLASS:
			case INT:
			case BOOL:
			case LONG:
			case HEXA:
			case BINARY:
			case REAL:
			case ID:
			case LQ:
				{
				setState(970);
				inblockExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(973);
				match(NL);
				}
				}
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(979);
			match(WHILE);
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(980);
				match(NL);
				}
				}
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(986);
			match(LPAR);
			setState(987);
			commonstmt();
			setState(988);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpContext extends ParserRuleContext {
		public IfExpContext ifExp() {
			return getRuleContext(IfExpContext.class,0);
		}
		public WhenExpContext whenExp() {
			return getRuleContext(WhenExpContext.class,0);
		}
		public ConditionalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExp; }
	}

	public final ConditionalExpContext conditionalExp() throws RecognitionException {
		ConditionalExpContext _localctx = new ConditionalExpContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_conditionalExp);
		try {
			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				ifExp();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				whenExp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExpContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KotlinParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public CommonstmtContext commonstmt() {
			return getRuleContext(CommonstmtContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public List<IfstmtContext> ifstmt() {
			return getRuleContexts(IfstmtContext.class);
		}
		public IfstmtContext ifstmt(int i) {
			return getRuleContext(IfstmtContext.class,i);
		}
		public TerminalNode ELSE_IF() { return getToken(KotlinParser.ELSE_IF, 0); }
		public TerminalNode ELSE() { return getToken(KotlinParser.ELSE, 0); }
		public IfExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExp; }
	}

	public final IfExpContext ifExp() throws RecognitionException {
		IfExpContext _localctx = new IfExpContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ifExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(IF);
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(995);
				match(NL);
				}
				}
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1001);
			match(LPAR);
			setState(1002);
			commonstmt();
			setState(1003);
			match(RPAR);
			setState(1007);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1004);
					match(NL);
					}
					} 
				}
				setState(1009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1010);
				ifstmt();
				}
				break;
			}
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1013);
					match(NL);
					}
					}
					setState(1018);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1019);
				match(ELSE_IF);
				setState(1023);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1020);
						match(NL);
						}
						} 
					}
					setState(1025);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
				}
				setState(1027);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1026);
					ifstmt();
					}
					break;
				}
				}
				break;
			}
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1031);
					match(NL);
					}
					}
					setState(1036);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1037);
				match(ELSE);
				setState(1041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1038);
						match(NL);
						}
						} 
					}
					setState(1043);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
				}
				setState(1045);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1044);
					ifstmt();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstmtContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InblockExpressionContext inblockExpression() {
			return getRuleContext(InblockExpressionContext.class,0);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ifstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				{
				setState(1049);
				block();
				}
				break;
			case VAR:
			case RETURN:
			case LPAR:
			case DO:
			case WHEN:
			case INC:
			case DEC:
			case FOR:
			case WHILE:
			case IF:
			case MINUS:
			case PLUS:
			case TYPE_INT:
			case TYPE_STRING:
			case TYPE_FLOAT:
			case TYPE_ANY:
			case TYPE_Double:
			case TYPE_Long:
			case TYPE_SHORT:
			case TYPE_BYTE:
			case TYPE_BOOLEAN:
			case TYPE_UNIT:
			case TYPE_CLASS:
			case INT:
			case BOOL:
			case LONG:
			case HEXA:
			case BINARY:
			case REAL:
			case ID:
			case LQ:
				{
				setState(1050);
				inblockExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenExpContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(KotlinParser.WHEN, 0); }
		public TerminalNode LCURL() { return getToken(KotlinParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode LPAR() { return getToken(KotlinParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(KotlinParser.RPAR, 0); }
		public List<WhenComponentContext> whenComponent() {
			return getRuleContexts(WhenComponentContext.class);
		}
		public WhenComponentContext whenComponent(int i) {
			return getRuleContext(WhenComponentContext.class,i);
		}
		public WhenExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExp; }
	}

	public final WhenExpContext whenExp() throws RecognitionException {
		WhenExpContext _localctx = new WhenExpContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_whenExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			match(WHEN);
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1054);
					match(NL);
					}
					} 
				}
				setState(1059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			setState(1064);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1060);
				match(LPAR);
				setState(1061);
				expression();
				setState(1062);
				match(RPAR);
				}
			}

			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1066);
				match(NL);
				}
				}
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1072);
			match(LCURL);
			setState(1076);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1073);
					match(NL);
					}
					} 
				}
				setState(1078);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << INOP) | (1L << NOTIN) | (1L << ISOP) | (1L << NOTIS) | (1L << LPAR) | (1L << WHEN) | (1L << INC) | (1L << DEC) | (1L << IF) | (1L << ELSE) | (1L << MINUS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (PLUS - 64)) | (1L << (TYPE_INT - 64)) | (1L << (TYPE_STRING - 64)) | (1L << (TYPE_FLOAT - 64)) | (1L << (TYPE_ANY - 64)) | (1L << (TYPE_Double - 64)) | (1L << (TYPE_Long - 64)) | (1L << (TYPE_SHORT - 64)) | (1L << (TYPE_BYTE - 64)) | (1L << (TYPE_BOOLEAN - 64)) | (1L << (TYPE_UNIT - 64)) | (1L << (TYPE_CLASS - 64)) | (1L << (INT - 64)) | (1L << (BOOL - 64)) | (1L << (LONG - 64)) | (1L << (HEXA - 64)) | (1L << (BINARY - 64)) | (1L << (REAL - 64)) | (1L << (ID - 64)) | (1L << (LQ - 64)))) != 0)) {
				{
				{
				setState(1079);
				whenComponent();
				setState(1083);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1080);
						match(NL);
						}
						} 
					}
					setState(1085);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
				}
				}
				}
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1091);
				match(NL);
				}
				}
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1097);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenComponentContext extends ParserRuleContext {
		public List<WhenConditionContext> whenCondition() {
			return getRuleContexts(WhenConditionContext.class);
		}
		public WhenConditionContext whenCondition(int i) {
			return getRuleContext(WhenConditionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(KotlinParser.ARROW, 0); }
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public List<TerminalNode> COMM() { return getTokens(KotlinParser.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(KotlinParser.COMM, i);
		}
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TerminalNode ELSE() { return getToken(KotlinParser.ELSE, 0); }
		public WhenComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenComponent; }
	}

	public final WhenComponentContext whenComponent() throws RecognitionException {
		WhenComponentContext _localctx = new WhenComponentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_whenComponent);
		int _la;
		try {
			int _alt;
			setState(1153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case INOP:
			case NOTIN:
			case ISOP:
			case NOTIS:
			case LPAR:
			case WHEN:
			case INC:
			case DEC:
			case IF:
			case MINUS:
			case PLUS:
			case TYPE_INT:
			case TYPE_STRING:
			case TYPE_FLOAT:
			case TYPE_ANY:
			case TYPE_Double:
			case TYPE_Long:
			case TYPE_SHORT:
			case TYPE_BYTE:
			case TYPE_BOOLEAN:
			case TYPE_UNIT:
			case TYPE_CLASS:
			case INT:
			case BOOL:
			case LONG:
			case HEXA:
			case BINARY:
			case REAL:
			case ID:
			case LQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099);
				whenCondition();
				setState(1116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1103);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1100);
							match(NL);
							}
							}
							setState(1105);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1106);
						match(COMM);
						setState(1110);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(1107);
							match(NL);
							}
							}
							setState(1112);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1113);
						whenCondition();
						}
						} 
					}
					setState(1118);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
				}
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1119);
					match(NL);
					}
					}
					setState(1124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1125);
				match(ARROW);
				setState(1129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1126);
					match(NL);
					}
					}
					setState(1131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1132);
				ifstmt();
				setState(1134); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1133);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1136); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				match(ELSE);
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1139);
					match(NL);
					}
					}
					setState(1144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1145);
				match(ARROW);
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1146);
					match(NL);
					}
					}
					setState(1151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1152);
				ifstmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeinWhenContext rangeinWhen() {
			return getRuleContext(RangeinWhenContext.class,0);
		}
		public TypeinWhenContext typeinWhen() {
			return getRuleContext(TypeinWhenContext.class,0);
		}
		public WhenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenCondition; }
	}

	public final WhenConditionContext whenCondition() throws RecognitionException {
		WhenConditionContext _localctx = new WhenConditionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_whenCondition);
		try {
			setState(1158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case LPAR:
			case WHEN:
			case INC:
			case DEC:
			case IF:
			case MINUS:
			case PLUS:
			case TYPE_INT:
			case TYPE_STRING:
			case TYPE_FLOAT:
			case TYPE_ANY:
			case TYPE_Double:
			case TYPE_Long:
			case TYPE_SHORT:
			case TYPE_BYTE:
			case TYPE_BOOLEAN:
			case TYPE_UNIT:
			case TYPE_CLASS:
			case INT:
			case BOOL:
			case LONG:
			case HEXA:
			case BINARY:
			case REAL:
			case ID:
			case LQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				expression();
				}
				break;
			case INOP:
			case NOTIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				rangeinWhen();
				}
				break;
			case ISOP:
			case NOTIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1157);
				typeinWhen();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeinWhenContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INOP() { return getToken(KotlinParser.INOP, 0); }
		public TerminalNode NOTIN() { return getToken(KotlinParser.NOTIN, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public RangeinWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeinWhen; }
	}

	public final RangeinWhenContext rangeinWhen() throws RecognitionException {
		RangeinWhenContext _localctx = new RangeinWhenContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_rangeinWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			_la = _input.LA(1);
			if ( !(_la==INOP || _la==NOTIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1161);
				match(NL);
				}
				}
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1167);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeinWhenContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ISOP() { return getToken(KotlinParser.ISOP, 0); }
		public TerminalNode NOTIS() { return getToken(KotlinParser.NOTIS, 0); }
		public List<TerminalNode> NL() { return getTokens(KotlinParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(KotlinParser.NL, i);
		}
		public TypeinWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeinWhen; }
	}

	public final TypeinWhenContext typeinWhen() throws RecognitionException {
		TypeinWhenContext _localctx = new TypeinWhenContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typeinWhen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			_la = _input.LA(1);
			if ( !(_la==ISOP || _la==NOTIS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1170);
				match(NL);
				}
				}
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1176);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(KotlinParser.TYPE_INT, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(KotlinParser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(KotlinParser.TYPE_STRING, 0); }
		public TerminalNode TYPE_ANY() { return getToken(KotlinParser.TYPE_ANY, 0); }
		public TerminalNode TYPE_Double() { return getToken(KotlinParser.TYPE_Double, 0); }
		public TerminalNode TYPE_Long() { return getToken(KotlinParser.TYPE_Long, 0); }
		public TerminalNode TYPE_SHORT() { return getToken(KotlinParser.TYPE_SHORT, 0); }
		public TerminalNode TYPE_BYTE() { return getToken(KotlinParser.TYPE_BYTE, 0); }
		public TerminalNode TYPE_CLASS() { return getToken(KotlinParser.TYPE_CLASS, 0); }
		public TerminalNode TYPE_BOOLEAN() { return getToken(KotlinParser.TYPE_BOOLEAN, 0); }
		public TerminalNode TYPE_UNIT() { return getToken(KotlinParser.TYPE_UNIT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TYPE_INT - 65)) | (1L << (TYPE_STRING - 65)) | (1L << (TYPE_FLOAT - 65)) | (1L << (TYPE_ANY - 65)) | (1L << (TYPE_Double - 65)) | (1L << (TYPE_Long - 65)) | (1L << (TYPE_SHORT - 65)) | (1L << (TYPE_BYTE - 65)) | (1L << (TYPE_BOOLEAN - 65)) | (1L << (TYPE_UNIT - 65)) | (1L << (TYPE_CLASS - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(KotlinParser.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(KotlinParser.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(KotlinParser.MINUSEQ, 0); }
		public TerminalNode MULTEQ() { return getToken(KotlinParser.MULTEQ, 0); }
		public TerminalNode DIVEQ() { return getToken(KotlinParser.DIVEQ, 0); }
		public TerminalNode QEQ() { return getToken(KotlinParser.QEQ, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLUSEQ) | (1L << MINUSEQ) | (1L << MULTEQ) | (1L << DIVEQ) | (1L << QEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode LQ() { return getToken(KotlinParser.LQ, 0); }
		public TerminalNode RQ() { return getToken(KotlinParser.RQ, 0); }
		public List<StringcomponentContext> stringcomponent() {
			return getRuleContexts(StringcomponentContext.class);
		}
		public StringcomponentContext stringcomponent(int i) {
			return getRuleContext(StringcomponentContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(LQ);
			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (StrFieldReference - 88)) | (1L << (StrCommonText - 88)) | (1L << (StrEscape - 88)) | (1L << (StringExpStart - 88)))) != 0)) {
				{
				{
				setState(1183);
				stringcomponent();
				}
				}
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1189);
			match(RQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringcomponentContext extends ParserRuleContext {
		public StringContentContext stringContent() {
			return getRuleContext(StringContentContext.class,0);
		}
		public StringExpressionContext stringExpression() {
			return getRuleContext(StringExpressionContext.class,0);
		}
		public StringcomponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringcomponent; }
	}

	public final StringcomponentContext stringcomponent() throws RecognitionException {
		StringcomponentContext _localctx = new StringcomponentContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_stringcomponent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StrFieldReference:
			case StrCommonText:
			case StrEscape:
				{
				setState(1191);
				stringContent();
				}
				break;
			case StringExpStart:
				{
				setState(1192);
				stringExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContentContext extends ParserRuleContext {
		public TerminalNode StrCommonText() { return getToken(KotlinParser.StrCommonText, 0); }
		public TerminalNode StrEscape() { return getToken(KotlinParser.StrEscape, 0); }
		public TerminalNode StrFieldReference() { return getToken(KotlinParser.StrFieldReference, 0); }
		public StringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringContent; }
	}

	public final StringContentContext stringContent() throws RecognitionException {
		StringContentContext _localctx = new StringContentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_stringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (StrFieldReference - 88)) | (1L << (StrCommonText - 88)) | (1L << (StrEscape - 88)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringExpressionContext extends ParserRuleContext {
		public TerminalNode StringExpStart() { return getToken(KotlinParser.StringExpStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(KotlinParser.RCURL, 0); }
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_stringExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			match(StringExpStart);
			setState(1198);
			expression();
			setState(1199);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return oroperation_sempred((OroperationContext)_localctx, predIndex);
		case 28:
			return andoperation_sempred((AndoperationContext)_localctx, predIndex);
		case 29:
			return inclusiveoroperation_sempred((InclusiveoroperationContext)_localctx, predIndex);
		case 30:
			return exclusiveoperation_sempred((ExclusiveoperationContext)_localctx, predIndex);
		case 31:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 32:
			return equalityExpr_sempred((EqualityExprContext)_localctx, predIndex);
		case 33:
			return comparableExpr_sempred((ComparableExprContext)_localctx, predIndex);
		case 36:
			return shiftExpr_sempred((ShiftExprContext)_localctx, predIndex);
		case 38:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 39:
			return multiExpr_sempred((MultiExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean oroperation_sempred(OroperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andoperation_sempred(AndoperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveoroperation_sempred(InclusiveoroperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveoperation_sempred(ExclusiveoperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpr_sempred(EqualityExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean comparableExpr_sempred(ComparableExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpr_sempred(ShiftExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiExpr_sempred(MultiExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 3);
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u04b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\7\2\u0094\n\2\f\2\16\2\u0097\13\2\3\2\3\2\6\2\u009b\n\2\r\2\16"+
		"\2\u009c\3\2\5\2\u00a0\n\2\7\2\u00a2\n\2\f\2\16\2\u00a5\13\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3\u00ae\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\7"+
		"\6\u00b9\n\6\f\6\16\6\u00bc\13\6\3\6\3\6\5\6\u00c0\n\6\3\7\3\7\3\7\3\7"+
		"\3\b\5\b\u00c7\n\b\3\b\3\b\3\b\7\b\u00cc\n\b\f\b\16\b\u00cf\13\b\3\b\7"+
		"\b\u00d2\n\b\f\b\16\b\u00d5\13\b\3\b\3\b\7\b\u00d9\n\b\f\b\16\b\u00dc"+
		"\13\b\3\b\5\b\u00df\n\b\3\b\3\b\5\b\u00e3\n\b\3\b\3\b\7\b\u00e7\n\b\f"+
		"\b\16\b\u00ea\13\b\3\b\3\b\5\b\u00ee\n\b\3\b\7\b\u00f1\n\b\f\b\16\b\u00f4"+
		"\13\b\7\b\u00f6\n\b\f\b\16\b\u00f9\13\b\3\b\7\b\u00fc\n\b\f\b\16\b\u00ff"+
		"\13\b\5\b\u0101\n\b\3\b\5\b\u0104\n\b\3\b\3\b\3\b\3\b\7\b\u010a\n\b\f"+
		"\b\16\b\u010d\13\b\5\b\u010f\n\b\3\b\7\b\u0112\n\b\f\b\16\b\u0115\13\b"+
		"\3\b\5\b\u0118\n\b\3\t\7\t\u011b\n\t\f\t\16\t\u011e\13\t\3\t\3\t\7\t\u0122"+
		"\n\t\f\t\16\t\u0125\13\t\3\n\3\n\7\n\u0129\n\n\f\n\16\n\u012c\13\n\3\n"+
		"\7\n\u012f\n\n\f\n\16\n\u0132\13\n\3\n\7\n\u0135\n\n\f\n\16\n\u0138\13"+
		"\n\3\n\3\n\3\13\3\13\7\13\u013e\n\13\f\13\16\13\u0141\13\13\3\13\5\13"+
		"\u0144\n\13\3\13\3\13\7\13\u0148\n\13\f\13\16\13\u014b\13\13\3\13\5\13"+
		"\u014e\n\13\3\13\3\13\7\13\u0152\n\13\f\13\16\13\u0155\13\13\3\13\5\13"+
		"\u0158\n\13\3\13\7\13\u015b\n\13\f\13\16\13\u015e\13\13\5\13\u0160\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\7"+
		"\17\u0171\n\17\f\17\16\17\u0174\13\17\3\17\3\17\5\17\u0178\n\17\3\20\3"+
		"\20\3\20\3\20\5\20\u017e\n\20\3\20\3\20\7\20\u0182\n\20\f\20\16\20\u0185"+
		"\13\20\3\20\3\20\5\20\u0189\n\20\3\21\3\21\7\21\u018d\n\21\f\21\16\21"+
		"\u0190\13\21\3\21\3\21\7\21\u0194\n\21\f\21\16\21\u0197\13\21\3\21\3\21"+
		"\7\21\u019b\n\21\f\21\16\21\u019e\13\21\3\21\3\21\7\21\u01a2\n\21\f\21"+
		"\16\21\u01a5\13\21\3\21\7\21\u01a8\n\21\f\21\16\21\u01ab\13\21\3\21\3"+
		"\21\7\21\u01af\n\21\f\21\16\21\u01b2\13\21\3\21\3\21\7\21\u01b6\n\21\f"+
		"\21\16\21\u01b9\13\21\7\21\u01bb\n\21\f\21\16\21\u01be\13\21\5\21\u01c0"+
		"\n\21\3\21\7\21\u01c3\n\21\f\21\16\21\u01c6\13\21\3\21\3\21\7\21\u01ca"+
		"\n\21\f\21\16\21\u01cd\13\21\3\21\3\21\3\22\3\22\3\22\5\22\u01d4\n\22"+
		"\5\22\u01d6\n\22\3\22\7\22\u01d9\n\22\f\22\16\22\u01dc\13\22\3\22\3\22"+
		"\3\22\7\22\u01e1\n\22\f\22\16\22\u01e4\13\22\3\22\5\22\u01e7\n\22\3\23"+
		"\3\23\3\23\3\23\3\24\7\24\u01ee\n\24\f\24\16\24\u01f1\13\24\3\24\3\24"+
		"\6\24\u01f5\n\24\r\24\16\24\u01f6\3\24\5\24\u01fa\n\24\7\24\u01fc\n\24"+
		"\f\24\16\24\u01ff\13\24\5\24\u0201\n\24\3\25\3\25\7\25\u0205\n\25\f\25"+
		"\16\25\u0208\13\25\3\25\5\25\u020b\n\25\3\26\3\26\5\26\u020f\n\26\3\27"+
		"\3\27\3\27\5\27\u0214\n\27\3\30\3\30\5\30\u0218\n\30\3\31\3\31\5\31\u021c"+
		"\n\31\3\32\3\32\3\32\7\32\u0221\n\32\f\32\16\32\u0224\13\32\3\32\3\32"+
		"\3\32\5\32\u0229\n\32\3\33\3\33\3\34\3\34\3\34\5\34\u0230\n\34\3\34\3"+
		"\34\5\34\u0234\n\34\5\34\u0236\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u023e\n\35\f\35\16\35\u0241\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36"+
		"\u0249\n\36\f\36\16\36\u024c\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u0254\n\37\f\37\16\37\u0257\13\37\3 \3 \3 \3 \3 \3 \7 \u025f\n \f \16"+
		" \u0262\13 \3!\3!\3!\3!\3!\3!\7!\u026a\n!\f!\16!\u026d\13!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u027e\n\"\f\"\16"+
		"\"\u0281\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0292\n"+
		"#\f#\16#\u0295\13#\3$\3$\3$\7$\u029a\n$\f$\16$\u029d\13$\3$\3$\6$\u02a1"+
		"\n$\r$\16$\u02a2\3$\3$\7$\u02a7\n$\f$\16$\u02aa\13$\3$\5$\u02ad\n$\3%"+
		"\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u02ba\n&\f&\16&\u02bd\13&\3\'\3\'\3"+
		"\'\7\'\u02c2\n\'\f\'\16\'\u02c5\13\'\3\'\3\'\3\'\5\'\u02ca\n\'\5\'\u02cc"+
		"\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u02d7\n(\f(\16(\u02da\13(\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u02e8\n)\f)\16)\u02eb\13)\3*\7*\u02ee\n"+
		"*\f*\16*\u02f1\13*\3*\3*\3+\3+\3,\3,\7,\u02f9\n,\f,\16,\u02fc\13,\3-\3"+
		"-\3-\3-\3-\7-\u0303\n-\f-\16-\u0306\13-\3-\7-\u0309\n-\f-\16-\u030c\13"+
		"-\3.\7.\u030f\n.\f.\16.\u0312\13.\3.\3.\7.\u0316\n.\f.\16.\u0319\13.\3"+
		".\3.\3/\3/\3/\3/\3/\3/\7/\u0323\n/\f/\16/\u0326\13/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\5/\u0332\n/\3\60\3\60\7\60\u0336\n\60\f\60\16\60\u0339\13"+
		"\60\3\60\3\60\7\60\u033d\n\60\f\60\16\60\u0340\13\60\3\60\5\60\u0343\n"+
		"\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u034c\n\61\3\62\3\62\3\62"+
		"\7\62\u0351\n\62\f\62\16\62\u0354\13\62\3\62\3\62\7\62\u0358\n\62\f\62"+
		"\16\62\u035b\13\62\3\62\3\62\7\62\u035f\n\62\f\62\16\62\u0362\13\62\3"+
		"\62\3\62\7\62\u0366\n\62\f\62\16\62\u0369\13\62\7\62\u036b\n\62\f\62\16"+
		"\62\u036e\13\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0379"+
		"\n\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\5\67\u0386"+
		"\n\67\38\38\78\u038a\n8\f8\168\u038d\138\38\38\38\38\38\38\78\u0395\n"+
		"8\f8\168\u0398\138\38\38\58\u039c\n8\39\39\39\39\59\u03a2\n9\39\39\39"+
		"\39\59\u03a8\n9\79\u03aa\n9\f9\169\u03ad\139\39\39\39\39\59\u03b3\n9\5"+
		"9\u03b5\n9\3:\3:\7:\u03b9\n:\f:\16:\u03bc\13:\3:\3:\3:\3:\7:\u03c2\n:"+
		"\f:\16:\u03c5\13:\3:\3:\5:\u03c9\n:\3;\3;\3;\5;\u03ce\n;\3;\7;\u03d1\n"+
		";\f;\16;\u03d4\13;\3;\3;\7;\u03d8\n;\f;\16;\u03db\13;\3;\3;\3;\3;\3<\3"+
		"<\5<\u03e3\n<\3=\3=\7=\u03e7\n=\f=\16=\u03ea\13=\3=\3=\3=\3=\7=\u03f0"+
		"\n=\f=\16=\u03f3\13=\3=\5=\u03f6\n=\3=\7=\u03f9\n=\f=\16=\u03fc\13=\3"+
		"=\3=\7=\u0400\n=\f=\16=\u0403\13=\3=\5=\u0406\n=\5=\u0408\n=\3=\7=\u040b"+
		"\n=\f=\16=\u040e\13=\3=\3=\7=\u0412\n=\f=\16=\u0415\13=\3=\5=\u0418\n"+
		"=\5=\u041a\n=\3>\3>\5>\u041e\n>\3?\3?\7?\u0422\n?\f?\16?\u0425\13?\3?"+
		"\3?\3?\3?\5?\u042b\n?\3?\7?\u042e\n?\f?\16?\u0431\13?\3?\3?\7?\u0435\n"+
		"?\f?\16?\u0438\13?\3?\3?\7?\u043c\n?\f?\16?\u043f\13?\7?\u0441\n?\f?\16"+
		"?\u0444\13?\3?\7?\u0447\n?\f?\16?\u044a\13?\3?\3?\3@\3@\7@\u0450\n@\f"+
		"@\16@\u0453\13@\3@\3@\7@\u0457\n@\f@\16@\u045a\13@\3@\7@\u045d\n@\f@\16"+
		"@\u0460\13@\3@\7@\u0463\n@\f@\16@\u0466\13@\3@\3@\7@\u046a\n@\f@\16@\u046d"+
		"\13@\3@\3@\6@\u0471\n@\r@\16@\u0472\3@\3@\7@\u0477\n@\f@\16@\u047a\13"+
		"@\3@\3@\7@\u047e\n@\f@\16@\u0481\13@\3@\5@\u0484\n@\3A\3A\3A\5A\u0489"+
		"\nA\3B\3B\7B\u048d\nB\fB\16B\u0490\13B\3B\3B\3C\3C\7C\u0496\nC\fC\16C"+
		"\u0499\13C\3C\3C\3D\3D\3E\3E\3F\3F\7F\u04a3\nF\fF\16F\u04a6\13F\3F\3F"+
		"\3G\3G\5G\u04ac\nG\3H\3H\3I\3I\3I\3I\3I\2\f8:<>@BDJNPJ\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\2"+
		"\f\3\2>?\4\2==@@\3\2\20\21\3\2\16\17\4\2))88\4\2+,AB\3\2+,\3\2CM\3\2\31"+
		"\36\3\2Z\\\2\u052a\2\u0095\3\2\2\2\4\u00ad\3\2\2\2\6\u00af\3\2\2\2\b\u00b2"+
		"\3\2\2\2\n\u00b5\3\2\2\2\f\u00c1\3\2\2\2\16\u00c6\3\2\2\2\20\u011c\3\2"+
		"\2\2\22\u0126\3\2\2\2\24\u015f\3\2\2\2\26\u0161\3\2\2\2\30\u0167\3\2\2"+
		"\2\32\u0169\3\2\2\2\34\u016b\3\2\2\2\36\u0179\3\2\2\2 \u018a\3\2\2\2\""+
		"\u01d5\3\2\2\2$\u01e8\3\2\2\2&\u01ef\3\2\2\2(\u020a\3\2\2\2*\u020e\3\2"+
		"\2\2,\u0213\3\2\2\2.\u0215\3\2\2\2\60\u021b\3\2\2\2\62\u0228\3\2\2\2\64"+
		"\u022a\3\2\2\2\66\u022c\3\2\2\28\u0237\3\2\2\2:\u0242\3\2\2\2<\u024d\3"+
		"\2\2\2>\u0258\3\2\2\2@\u0263\3\2\2\2B\u026e\3\2\2\2D\u0282\3\2\2\2F\u0296"+
		"\3\2\2\2H\u02ae\3\2\2\2J\u02b0\3\2\2\2L\u02be\3\2\2\2N\u02cd\3\2\2\2P"+
		"\u02db\3\2\2\2R\u02ef\3\2\2\2T\u02f4\3\2\2\2V\u02f6\3\2\2\2X\u02fd\3\2"+
		"\2\2Z\u0310\3\2\2\2\\\u0331\3\2\2\2^\u0342\3\2\2\2`\u034b\3\2\2\2b\u0378"+
		"\3\2\2\2d\u037a\3\2\2\2f\u037c\3\2\2\2h\u037e\3\2\2\2j\u0380\3\2\2\2l"+
		"\u0385\3\2\2\2n\u0387\3\2\2\2p\u03b4\3\2\2\2r\u03b6\3\2\2\2t\u03ca\3\2"+
		"\2\2v\u03e2\3\2\2\2x\u03e4\3\2\2\2z\u041d\3\2\2\2|\u041f\3\2\2\2~\u0483"+
		"\3\2\2\2\u0080\u0488\3\2\2\2\u0082\u048a\3\2\2\2\u0084\u0493\3\2\2\2\u0086"+
		"\u049c\3\2\2\2\u0088\u049e\3\2\2\2\u008a\u04a0\3\2\2\2\u008c\u04ab\3\2"+
		"\2\2\u008e\u04ad\3\2\2\2\u0090\u04af\3\2\2\2\u0092\u0094\7N\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u00a3\5\4\3\2\u0099"+
		"\u009b\7N\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\5\4\3\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009a\3\2"+
		"\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\3\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ae\5 \21\2\u00a7\u00ae\5\16\b"+
		"\2\u00a8\u00ae\5\36\20\2\u00a9\u00ae\5\60\31\2\u00aa\u00ae\5\6\4\2\u00ab"+
		"\u00ae\5\b\5\2\u00ac\u00ae\5j\66\2\u00ad\u00a6\3\2\2\2\u00ad\u00a7\3\2"+
		"\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\5\3\2\2\2\u00af\u00b0\7\5\2\2"+
		"\u00b0\u00b1\5\n\6\2\u00b1\7\3\2\2\2\u00b2\u00b3\7\6\2\2\u00b3\u00b4\5"+
		"\n\6\2\u00b4\t\3\2\2\2\u00b5\u00ba\7U\2\2\u00b6\u00b7\7 \2\2\u00b7\u00b9"+
		"\7U\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bf\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7 "+
		"\2\2\u00be\u00c0\7\'\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\13\3\2\2\2\u00c1\u00c2\7U\2\2\u00c2\u00c3\7\22\2\2\u00c3\u00c4\5\u0086"+
		"D\2\u00c4\r\3\2\2\2\u00c5\u00c7\7=\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\t\2\2\2\u00c9\u00cd\7U\2\2\u00ca"+
		"\u00cc\7N\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u0103\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d2\7N\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00da\7\24\2\2\u00d7\u00d9\7N\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u0100\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00df\7\4\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e3\5\f\7\2\u00e1\u00e3\5\36\20\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00f7\3\2\2\2\u00e4\u00e8\7\23"+
		"\2\2\u00e5\u00e7\7N\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ed\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ee\5\f\7\2\u00ec\u00ee\5\36\20\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00f2\3\2\2\2\u00ef\u00f1\7N\2\2\u00f0\u00ef\3\2"+
		"\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00e4\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fd\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fc\7N\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u00de\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\7\25\2\2\u0103\u00d3\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u010e\3\2\2\2\u0105\u0106\7\22\2\2\u0106\u010b\5\34\17\2\u0107\u0108"+
		"\7\23\2\2\u0108\u010a\5\34\17\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2"+
		"\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010e\u0105\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0113\3\2\2\2\u0110"+
		"\u0112\7N\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0118\5\20\t\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\17\3\2\2"+
		"\2\u0119\u011b\7N\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0123\5\22\n\2\u0120\u0122\7N\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\21\3\2\2\2\u0125\u0123"+
		"\3\2\2\2\u0126\u012a\7\27\2\2\u0127\u0129\7N\2\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0130\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012d\u012f\5\24\13\2\u012e\u012d\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0136\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0133\u0135\7N\2\2\u0134\u0133\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\30\2\2\u013a\23\3\2\2\2\u013b\u013f"+
		"\5\16\b\2\u013c\u013e\7N\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0160\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0142\u0144\5\30\r\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0149\5 \21\2\u0146\u0148\7N\2\2\u0147\u0146\3\2"+
		"\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u0160\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\5\30\r\2\u014d\u014c\3"+
		"\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0153\5\36\20\2\u0150"+
		"\u0152\7N\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0158\5\26\f\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015c\3"+
		"\2\2\2\u0159\u015b\7N\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015f\u013b\3\2\2\2\u015f\u0143\3\2\2\2\u015f\u014d\3\2\2\2\u0160"+
		"\25\3\2\2\2\u0161\u0162\7\n\2\2\u0162\u0163\7\24\2\2\u0163\u0164\7\25"+
		"\2\2\u0164\u0165\7\31\2\2\u0165\u0166\5\66\34\2\u0166\27\3\2\2\2\u0167"+
		"\u0168\t\3\2\2\u0168\31\3\2\2\2\u0169\u016a\7A\2\2\u016a\33\3\2\2\2\u016b"+
		"\u0177\7U\2\2\u016c\u016d\7\24\2\2\u016d\u0172\5h\65\2\u016e\u016f\7\23"+
		"\2\2\u016f\u0171\5h\65\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2"+
		"\2\2\u0175\u0176\7\25\2\2\u0176\u0178\3\2\2\2\u0177\u016c\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\35\3\2\2\2\u0179\u017a\7\4\2\2\u017a\u017d\7U\2\2"+
		"\u017b\u017c\7\22\2\2\u017c\u017e\5\u0086D\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0188\3\2\2\2\u017f\u0183\5\u0088E\2\u0180\u0182"+
		"\7N\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\5\66"+
		"\34\2\u0187\u0189\3\2\2\2\u0188\u017f\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\37\3\2\2\2\u018a\u018e\7:\2\2\u018b\u018d\7N\2\2\u018c\u018b\3\2\2\2"+
		"\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0195\5f\64\2\u0192\u0194\7N\2\2\u0193"+
		"\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019c\7\24\2\2\u0199"+
		"\u019b\7N\2\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u01bf\3\2\2\2\u019e\u019c\3\2\2\2\u019f"+
		"\u01a3\5\f\7\2\u01a0\u01a2\7N\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01bc\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a6\u01a8\7N\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2"+
		"\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ac\u01b0\7\23\2\2\u01ad\u01af\7N\2\2\u01ae\u01ad\3\2"+
		"\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b7\5\f\7\2\u01b4\u01b6\7N"+
		"\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01a9\3\2"+
		"\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u019f\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c4\3\2\2\2\u01c1\u01c3\7N\2\2\u01c2\u01c1\3\2\2\2\u01c3"+
		"\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2"+
		"\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01cb\7\25\2\2\u01c8\u01ca\7N\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\5\"\22\2\u01cf"+
		"!\3\2\2\2\u01d0\u01d1\7\22\2\2\u01d1\u01d3\5\u0086D\2\u01d2\u01d4\7\26"+
		"\2\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5"+
		"\u01d0\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01da\3\2\2\2\u01d7\u01d9\7N"+
		"\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01e6\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01e7\5$"+
		"\23\2\u01de\u01e2\7\31\2\2\u01df\u01e1\7N\2\2\u01e0\u01df\3\2\2\2\u01e1"+
		"\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2"+
		"\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e7\5\66\34\2\u01e6\u01dd\3\2\2\2\u01e6"+
		"\u01de\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7#\3\2\2\2\u01e8\u01e9\7\27\2\2"+
		"\u01e9\u01ea\5&\24\2\u01ea\u01eb\7\30\2\2\u01eb%\3\2\2\2\u01ec\u01ee\7"+
		"N\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01f0\3\2\2\2\u01f0\u0200\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01fd\5("+
		"\25\2\u01f3\u01f5\7N\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01fa\5("+
		"\25\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb"+
		"\u01f4\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u01f2\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\'\3\2\2\2\u0202\u020b\5*\26\2\u0203\u0205\7N\2\2"+
		"\u0204\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020b\5,\27\2\u020a"+
		"\u0202\3\2\2\2\u020a\u0206\3\2\2\2\u020b)\3\2\2\2\u020c\u020f\5 \21\2"+
		"\u020d\u020f\5\36\20\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f+"+
		"\3\2\2\2\u0210\u0214\5\60\31\2\u0211\u0214\5j\66\2\u0212\u0214\5.\30\2"+
		"\u0213\u0210\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214-\3"+
		"\2\2\2\u0215\u0217\7\7\2\2\u0216\u0218\5\60\31\2\u0217\u0216\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218/\3\2\2\2\u0219\u021c\5\66\34\2\u021a\u021c\5\62\32"+
		"\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c\61\3\2\2\2\u021d\u021e"+
		"\5\64\33\2\u021e\u0222\5\u0088E\2\u021f\u0221\7N\2\2\u0220\u021f\3\2\2"+
		"\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225"+
		"\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0226\5\66\34\2\u0226\u0229\3\2\2\2"+
		"\u0227\u0229\5\36\20\2\u0228\u021d\3\2\2\2\u0228\u0227\3\2\2\2\u0229\63"+
		"\3\2\2\2\u022a\u022b\5X-\2\u022b\65\3\2\2\2\u022c\u0235\58\35\2\u022d"+
		"\u022f\7\26\2\2\u022e\u0230\5\66\34\2\u022f\u022e\3\2\2\2\u022f\u0230"+
		"\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\7\22\2\2\u0232\u0234\5\66\34"+
		"\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u022d"+
		"\3\2\2\2\u0235\u0236\3\2\2\2\u0236\67\3\2\2\2\u0237\u0238\b\35\1\2\u0238"+
		"\u0239\5:\36\2\u0239\u023f\3\2\2\2\u023a\u023b\f\3\2\2\u023b\u023c\7\b"+
		"\2\2\u023c\u023e\5:\36\2\u023d\u023a\3\2\2\2\u023e\u0241\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u02409\3\2\2\2\u0241\u023f\3\2\2\2"+
		"\u0242\u0243\b\36\1\2\u0243\u0244\5<\37\2\u0244\u024a\3\2\2\2\u0245\u0246"+
		"\f\3\2\2\u0246\u0247\7\t\2\2\u0247\u0249\5<\37\2\u0248\u0245\3\2\2\2\u0249"+
		"\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b;\3\2\2\2"+
		"\u024c\u024a\3\2\2\2\u024d\u024e\b\37\1\2\u024e\u024f\5> \2\u024f\u0255"+
		"\3\2\2\2\u0250\u0251\f\3\2\2\u0251\u0252\7\13\2\2\u0252\u0254\5> \2\u0253"+
		"\u0250\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256=\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259\b \1\2\u0259\u025a"+
		"\5@!\2\u025a\u0260\3\2\2\2\u025b\u025c\f\3\2\2\u025c\u025d\7\r\2\2\u025d"+
		"\u025f\5@!\2\u025e\u025b\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2"+
		"\2\u0260\u0261\3\2\2\2\u0261?\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264"+
		"\b!\1\2\u0264\u0265\5B\"\2\u0265\u026b\3\2\2\2\u0266\u0267\f\3\2\2\u0267"+
		"\u0268\7\f\2\2\u0268\u026a\5B\"\2\u0269\u0266\3\2\2\2\u026a\u026d\3\2"+
		"\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026cA\3\2\2\2\u026d\u026b"+
		"\3\2\2\2\u026e\u026f\b\"\1\2\u026f\u0270\5D#\2\u0270\u027f\3\2\2\2\u0271"+
		"\u0272\f\6\2\2\u0272\u0273\7\"\2\2\u0273\u027e\5D#\2\u0274\u0275\f\5\2"+
		"\2\u0275\u0276\7#\2\2\u0276\u027e\5D#\2\u0277\u0278\f\4\2\2\u0278\u0279"+
		"\7$\2\2\u0279\u027e\5D#\2\u027a\u027b\f\3\2\2\u027b\u027c\7!\2\2\u027c"+
		"\u027e\5D#\2\u027d\u0271\3\2\2\2\u027d\u0274\3\2\2\2\u027d\u0277\3\2\2"+
		"\2\u027d\u027a\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280"+
		"\3\2\2\2\u0280C\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0283\b#\1\2\u0283\u0284"+
		"\5F$\2\u0284\u0293\3\2\2\2\u0285\u0286\f\6\2\2\u0286\u0287\7\62\2\2\u0287"+
		"\u0292\5F$\2\u0288\u0289\f\5\2\2\u0289\u028a\7\63\2\2\u028a\u0292\5F$"+
		"\2\u028b\u028c\f\4\2\2\u028c\u028d\7\64\2\2\u028d\u0292\5F$\2\u028e\u028f"+
		"\f\3\2\2\u028f\u0290\7\65\2\2\u0290\u0292\5F$\2\u0291\u0285\3\2\2\2\u0291"+
		"\u0288\3\2\2\2\u0291\u028b\3\2\2\2\u0291\u028e\3\2\2\2\u0292\u0295\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294E\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0296\u02ac\5J&\2\u0297\u029b\5H%\2\u0298\u029a\7N\2\2\u0299"+
		"\u0298\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029c\u029e\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u029f\5J&\2\u029f\u02a1"+
		"\3\2\2\2\u02a0\u0297\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02ad\3\2\2\2\u02a4\u02a8\t\4\2\2\u02a5\u02a7\7N"+
		"\2\2\u02a6\u02a5\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02ab\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab\u02ad\5\u0086"+
		"D\2\u02ac\u02a0\3\2\2\2\u02ac\u02a4\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad"+
		"G\3\2\2\2\u02ae\u02af\t\5\2\2\u02afI\3\2\2\2\u02b0\u02b1\b&\1\2\u02b1"+
		"\u02b2\5L\'\2\u02b2\u02bb\3\2\2\2\u02b3\u02b4\f\4\2\2\u02b4\u02b5\7\66"+
		"\2\2\u02b5\u02ba\5L\'\2\u02b6\u02b7\f\3\2\2\u02b7\u02b8\7\67\2\2\u02b8"+
		"\u02ba\5L\'\2\u02b9\u02b3\3\2\2\2\u02b9\u02b6\3\2\2\2\u02ba\u02bd\3\2"+
		"\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bcK\3\2\2\2\u02bd\u02bb"+
		"\3\2\2\2\u02be\u02cb\5N(\2\u02bf\u02c3\t\6\2\2\u02c0\u02c2\7N\2\2\u02c1"+
		"\u02c0\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2"+
		"\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c9\5N(\2\u02c7\u02c8"+
		"\79\2\2\u02c8\u02ca\5N(\2\u02c9\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cc\3\2\2\2\u02cb\u02bf\3\2\2\2\u02cb\u02cc\3\2\2\2\u02ccM\3\2\2\2"+
		"\u02cd\u02ce\b(\1\2\u02ce\u02cf\5P)\2\u02cf\u02d8\3\2\2\2\u02d0\u02d1"+
		"\f\4\2\2\u02d1\u02d2\7B\2\2\u02d2\u02d7\5P)\2\u02d3\u02d4\f\3\2\2\u02d4"+
		"\u02d5\7A\2\2\u02d5\u02d7\5P)\2\u02d6\u02d0\3\2\2\2\u02d6\u02d3\3\2\2"+
		"\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9O"+
		"\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dc\b)\1\2\u02dc\u02dd\5R*\2\u02dd"+
		"\u02e9\3\2\2\2\u02de\u02df\f\5\2\2\u02df\u02e0\7&\2\2\u02e0\u02e8\5R*"+
		"\2\u02e1\u02e2\f\4\2\2\u02e2\u02e3\7\'\2\2\u02e3\u02e8\5R*\2\u02e4\u02e5"+
		"\f\3\2\2\u02e5\u02e6\7(\2\2\u02e6\u02e8\5R*\2\u02e7\u02de\3\2\2\2\u02e7"+
		"\u02e1\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2"+
		"\2\2\u02e9\u02ea\3\2\2\2\u02eaQ\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ee"+
		"\5T+\2\u02ed\u02ec\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3\5V"+
		",\2\u02f3S\3\2\2\2\u02f4\u02f5\t\7\2\2\u02f5U\3\2\2\2\u02f6\u02fa\5\\"+
		"/\2\u02f7\u02f9\5^\60\2\u02f8\u02f7\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa"+
		"\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fbW\3\2\2\2\u02fc\u02fa\3\2\2\2"+
		"\u02fd\u0304\7U\2\2\u02fe\u02ff\7;\2\2\u02ff\u0300\5\60\31\2\u0300\u0301"+
		"\7<\2\2\u0301\u0303\3\2\2\2\u0302\u02fe\3\2\2\2\u0303\u0306\3\2\2\2\u0304"+
		"\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u030a\3\2\2\2\u0306\u0304\3\2"+
		"\2\2\u0307\u0309\5Z.\2\u0308\u0307\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308"+
		"\3\2\2\2\u030a\u030b\3\2\2\2\u030bY\3\2\2\2\u030c\u030a\3\2\2\2\u030d"+
		"\u030f\7N\2\2\u030e\u030d\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2"+
		"\2\2\u0310\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u0310\3\2\2\2\u0313"+
		"\u0317\7 \2\2\u0314\u0316\7N\2\2\u0315\u0314\3\2\2\2\u0316\u0319\3\2\2"+
		"\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\3\2\2\2\u0319\u0317"+
		"\3\2\2\2\u031a\u031b\5X-\2\u031b[\3\2\2\2\u031c\u0332\5`\61\2\u031d\u0324"+
		"\7U\2\2\u031e\u031f\7;\2\2\u031f\u0320\5\60\31\2\u0320\u0321\7<\2\2\u0321"+
		"\u0323\3\2\2\2\u0322\u031e\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2"+
		"\2\2\u0324\u0325\3\2\2\2\u0325\u0332\3\2\2\2\u0326\u0324\3\2\2\2\u0327"+
		"\u0328\7\24\2\2\u0328\u0329\5\60\31\2\u0329\u032a\7\25\2\2\u032a\u0332"+
		"\3\2\2\2\u032b\u0332\5b\62\2\u032c\u0332\5v<\2\u032d\u032e\5\u0086D\2"+
		"\u032e\u032f\7\24\2\2\u032f\u0330\7\25\2\2\u0330\u0332\3\2\2\2\u0331\u031c"+
		"\3\2\2\2\u0331\u031d\3\2\2\2\u0331\u0327\3\2\2\2\u0331\u032b\3\2\2\2\u0331"+
		"\u032c\3\2\2\2\u0331\u032d\3\2\2\2\u0332]\3\2\2\2\u0333\u0343\t\b\2\2"+
		"\u0334\u0336\7N\2\2\u0335\u0334\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335"+
		"\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033a\3\2\2\2\u0339\u0337\3\2\2\2\u033a"+
		"\u033e\7 \2\2\u033b\u033d\7N\2\2\u033c\u033b\3\2\2\2\u033d\u0340\3\2\2"+
		"\2\u033e\u033c\3\2\2\2\u033e\u033f\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u033e"+
		"\3\2\2\2\u0341\u0343\5V,\2\u0342\u0333\3\2\2\2\u0342\u0337\3\2\2\2\u0343"+
		"_\3\2\2\2\u0344\u034c\7O\2\2\u0345\u034c\7T\2\2\u0346\u034c\7P\2\2\u0347"+
		"\u034c\7R\2\2\u0348\u034c\7S\2\2\u0349\u034c\7Q\2\2\u034a\u034c\5\u008a"+
		"F\2\u034b\u0344\3\2\2\2\u034b\u0345\3\2\2\2\u034b\u0346\3\2\2\2\u034b"+
		"\u0347\3\2\2\2\u034b\u0348\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034a\3\2"+
		"\2\2\u034ca\3\2\2\2\u034d\u034e\5f\64\2\u034e\u0352\7\24\2\2\u034f\u0351"+
		"\7N\2\2\u0350\u034f\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0352\3\2\2\2\u0355\u0359\5h"+
		"\65\2\u0356\u0358\7N\2\2\u0357\u0356\3\2\2\2\u0358\u035b\3\2\2\2\u0359"+
		"\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u036c\3\2\2\2\u035b\u0359\3\2"+
		"\2\2\u035c\u0360\7\23\2\2\u035d\u035f\7N\2\2\u035e\u035d\3\2\2\2\u035f"+
		"\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\3\2"+
		"\2\2\u0362\u0360\3\2\2\2\u0363\u0367\5h\65\2\u0364\u0366\7N\2\2\u0365"+
		"\u0364\3\2\2\2\u0366\u0369\3\2\2\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2"+
		"\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u036a\u035c\3\2\2\2\u036b"+
		"\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036f\3\2"+
		"\2\2\u036e\u036c\3\2\2\2\u036f\u0370\7\25\2\2\u0370\u0379\3\2\2\2\u0371"+
		"\u0372\5f\64\2\u0372\u0373\7\24\2\2\u0373\u0374\7\25\2\2\u0374\u0379\3"+
		"\2\2\2\u0375\u0376\5f\64\2\u0376\u0377\5d\63\2\u0377\u0379\3\2\2\2\u0378"+
		"\u034d\3\2\2\2\u0378\u0371\3\2\2\2\u0378\u0375\3\2\2\2\u0379c\3\2\2\2"+
		"\u037a\u037b\5$\23\2\u037be\3\2\2\2\u037c\u037d\7U\2\2\u037dg\3\2\2\2"+
		"\u037e\u037f\5\66\34\2\u037fi\3\2\2\2\u0380\u0381\5l\67\2\u0381k\3\2\2"+
		"\2\u0382\u0386\5n8\2\u0383\u0386\5r:\2\u0384\u0386\5t;\2\u0385\u0382\3"+
		"\2\2\2\u0385\u0383\3\2\2\2\u0385\u0384\3\2\2\2\u0386m\3\2\2\2\u0387\u038b"+
		"\7-\2\2\u0388\u038a\7N\2\2\u0389\u0388\3\2\2\2\u038a\u038d\3\2\2\2\u038b"+
		"\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038e\3\2\2\2\u038d\u038b\3\2"+
		"\2\2\u038e\u038f\7\24\2\2\u038f\u0390\5p9\2\u0390\u0391\t\5\2\2\u0391"+
		"\u0392\5\60\31\2\u0392\u0396\7\25\2\2\u0393\u0395\7N\2\2\u0394\u0393\3"+
		"\2\2\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397"+
		"\u039b\3\2\2\2\u0398\u0396\3\2\2\2\u0399\u039c\5$\23\2\u039a\u039c\5,"+
		"\27\2\u039b\u0399\3\2\2\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"o\3\2\2\2\u039d\u039e\7\24\2\2\u039e\u03a1\7U\2\2\u039f\u03a0\7\22\2\2"+
		"\u03a0\u03a2\5\u0086D\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03ab\3\2\2\2\u03a3\u03a4\7\23\2\2\u03a4\u03a7\7U\2\2\u03a5\u03a6\7\22"+
		"\2\2\u03a6\u03a8\5\u0086D\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03aa\3\2\2\2\u03a9\u03a3\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2"+
		"\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae"+
		"\u03b5\7\25\2\2\u03af\u03b2\7U\2\2\u03b0\u03b1\7\22\2\2\u03b1\u03b3\5"+
		"\u0086D\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b5\3\2\2\2"+
		"\u03b4\u039d\3\2\2\2\u03b4\u03af\3\2\2\2\u03b5q\3\2\2\2\u03b6\u03ba\7"+
		".\2\2\u03b7\u03b9\7N\2\2\u03b8\u03b7\3\2\2\2\u03b9\u03bc\3\2\2\2\u03ba"+
		"\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bd\3\2\2\2\u03bc\u03ba\3\2"+
		"\2\2\u03bd\u03be\7\24\2\2\u03be\u03bf\5\66\34\2\u03bf\u03c3\7\25\2\2\u03c0"+
		"\u03c2\7N\2\2\u03c1\u03c0\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2"+
		"\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c8\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6"+
		"\u03c9\5$\23\2\u03c7\u03c9\5,\27\2\u03c8\u03c6\3\2\2\2\u03c8\u03c7\3\2"+
		"\2\2\u03c8\u03c9\3\2\2\2\u03c9s\3\2\2\2\u03ca\u03cd\7\37\2\2\u03cb\u03ce"+
		"\5$\23\2\u03cc\u03ce\5,\27\2\u03cd\u03cb\3\2\2\2\u03cd\u03cc\3\2\2\2\u03ce"+
		"\u03d2\3\2\2\2\u03cf\u03d1\7N\2\2\u03d0\u03cf\3\2\2\2\u03d1\u03d4\3\2"+
		"\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4"+
		"\u03d2\3\2\2\2\u03d5\u03d9\7.\2\2\u03d6\u03d8\7N\2\2\u03d7\u03d6\3\2\2"+
		"\2\u03d8\u03db\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc"+
		"\3\2\2\2\u03db\u03d9\3\2\2\2\u03dc\u03dd\7\24\2\2\u03dd\u03de\5\66\34"+
		"\2\u03de\u03df\7\25\2\2\u03dfu\3\2\2\2\u03e0\u03e3\5x=\2\u03e1\u03e3\5"+
		"|?\2\u03e2\u03e0\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3w\3\2\2\2\u03e4\u03e8"+
		"\7/\2\2\u03e5\u03e7\7N\2\2\u03e6\u03e5\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8"+
		"\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03eb\3\2\2\2\u03ea\u03e8\3\2"+
		"\2\2\u03eb\u03ec\7\24\2\2\u03ec\u03ed\5\66\34\2\u03ed\u03f1\7\25\2\2\u03ee"+
		"\u03f0\7N\2\2\u03ef\u03ee\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2"+
		"\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4"+
		"\u03f6\5z>\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u0407\3\2\2"+
		"\2\u03f7\u03f9\7N\2\2\u03f8\u03f7\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8"+
		"\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd"+
		"\u0401\7\61\2\2\u03fe\u0400\7N\2\2\u03ff\u03fe\3\2\2\2\u0400\u0403\3\2"+
		"\2\2\u0401\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0405\3\2\2\2\u0403"+
		"\u0401\3\2\2\2\u0404\u0406\5z>\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2"+
		"\2\u0406\u0408\3\2\2\2\u0407\u03fa\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0419"+
		"\3\2\2\2\u0409\u040b\7N\2\2\u040a\u0409\3\2\2\2\u040b\u040e\3\2\2\2\u040c"+
		"\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040f\3\2\2\2\u040e\u040c\3\2"+
		"\2\2\u040f\u0413\7\60\2\2\u0410\u0412\7N\2\2\u0411\u0410\3\2\2\2\u0412"+
		"\u0415\3\2\2\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0417\3\2"+
		"\2\2\u0415\u0413\3\2\2\2\u0416\u0418\5z>\2\u0417\u0416\3\2\2\2\u0417\u0418"+
		"\3\2\2\2\u0418\u041a\3\2\2\2\u0419\u040c\3\2\2\2\u0419\u041a\3\2\2\2\u041a"+
		"y\3\2\2\2\u041b\u041e\5$\23\2\u041c\u041e\5,\27\2\u041d\u041b\3\2\2\2"+
		"\u041d\u041c\3\2\2\2\u041e{\3\2\2\2\u041f\u0423\7*\2\2\u0420\u0422\7N"+
		"\2\2\u0421\u0420\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423"+
		"\u0424\3\2\2\2\u0424\u042a\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0427\7\24"+
		"\2\2\u0427\u0428\5\60\31\2\u0428\u0429\7\25\2\2\u0429\u042b\3\2\2\2\u042a"+
		"\u0426\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042f\3\2\2\2\u042c\u042e\7N"+
		"\2\2\u042d\u042c\3\2\2\2\u042e\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u0432\3\2\2\2\u0431\u042f\3\2\2\2\u0432\u0436\7\27"+
		"\2\2\u0433\u0435\7N\2\2\u0434\u0433\3\2\2\2\u0435\u0438\3\2\2\2\u0436"+
		"\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0442\3\2\2\2\u0438\u0436\3\2"+
		"\2\2\u0439\u043d\5~@\2\u043a\u043c\7N\2\2\u043b\u043a\3\2\2\2\u043c\u043f"+
		"\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0441\3\2\2\2\u043f"+
		"\u043d\3\2\2\2\u0440\u0439\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2"+
		"\2\2\u0442\u0443\3\2\2\2\u0443\u0448\3\2\2\2\u0444\u0442\3\2\2\2\u0445"+
		"\u0447\7N\2\2\u0446\u0445\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2"+
		"\2\2\u0448\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a\u0448\3\2\2\2\u044b"+
		"\u044c\7\30\2\2\u044c}\3\2\2\2\u044d\u045e\5\u0080A\2\u044e\u0450\7N\2"+
		"\2\u044f\u044e\3\2\2\2\u0450\u0453\3\2\2\2\u0451\u044f\3\2\2\2\u0451\u0452"+
		"\3\2\2\2\u0452\u0454\3\2\2\2\u0453\u0451\3\2\2\2\u0454\u0458\7\23\2\2"+
		"\u0455\u0457\7N\2\2\u0456\u0455\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456"+
		"\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045b\3\2\2\2\u045a\u0458\3\2\2\2\u045b"+
		"\u045d\5\u0080A\2\u045c\u0451\3\2\2\2\u045d\u0460\3\2\2\2\u045e\u045c"+
		"\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0464\3\2\2\2\u0460\u045e\3\2\2\2\u0461"+
		"\u0463\7N\2\2\u0462\u0461\3\2\2\2\u0463\u0466\3\2\2\2\u0464\u0462\3\2"+
		"\2\2\u0464\u0465\3\2\2\2\u0465\u0467\3\2\2\2\u0466\u0464\3\2\2\2\u0467"+
		"\u046b\7%\2\2\u0468\u046a\7N\2\2\u0469\u0468\3\2\2\2\u046a\u046d\3\2\2"+
		"\2\u046b\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046e\3\2\2\2\u046d\u046b"+
		"\3\2\2\2\u046e\u0470\5z>\2\u046f\u0471\7N\2\2\u0470\u046f\3\2\2\2\u0471"+
		"\u0472\3\2\2\2\u0472\u0470\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0484\3\2"+
		"\2\2\u0474\u0478\7\60\2\2\u0475\u0477\7N\2\2\u0476\u0475\3\2\2\2\u0477"+
		"\u047a\3\2\2\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2"+
		"\2\2\u047a\u0478\3\2\2\2\u047b\u047f\7%\2\2\u047c\u047e\7N\2\2\u047d\u047c"+
		"\3\2\2\2\u047e\u0481\3\2\2\2\u047f\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480"+
		"\u0482\3\2\2\2\u0481\u047f\3\2\2\2\u0482\u0484\5z>\2\u0483\u044d\3\2\2"+
		"\2\u0483\u0474\3\2\2\2\u0484\177\3\2\2\2\u0485\u0489\5\60\31\2\u0486\u0489"+
		"\5\u0082B\2\u0487\u0489\5\u0084C\2\u0488\u0485\3\2\2\2\u0488\u0486\3\2"+
		"\2\2\u0488\u0487\3\2\2\2\u0489\u0081\3\2\2\2\u048a\u048e\t\5\2\2\u048b"+
		"\u048d\7N\2\2\u048c\u048b\3\2\2\2\u048d\u0490\3\2\2\2\u048e\u048c\3\2"+
		"\2\2\u048e\u048f\3\2\2\2\u048f\u0491\3\2\2\2\u0490\u048e\3\2\2\2\u0491"+
		"\u0492\5\60\31\2\u0492\u0083\3\2\2\2\u0493\u0497\t\4\2\2\u0494\u0496\7"+
		"N\2\2\u0495\u0494\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0495\3\2\2\2\u0497"+
		"\u0498\3\2\2\2\u0498\u049a\3\2\2\2\u0499\u0497\3\2\2\2\u049a\u049b\5\u0086"+
		"D\2\u049b\u0085\3\2\2\2\u049c\u049d\t\t\2\2\u049d\u0087\3\2\2\2\u049e"+
		"\u049f\t\n\2\2\u049f\u0089\3\2\2\2\u04a0\u04a4\7W\2\2\u04a1\u04a3\5\u008c"+
		"G\2\u04a2\u04a1\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4"+
		"\u04a5\3\2\2\2\u04a5\u04a7\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a7\u04a8\7Y"+
		"\2\2\u04a8\u008b\3\2\2\2\u04a9\u04ac\5\u008eH\2\u04aa\u04ac\5\u0090I\2"+
		"\u04ab\u04a9\3\2\2\2\u04ab\u04aa\3\2\2\2\u04ac\u008d\3\2\2\2\u04ad\u04ae"+
		"\t\13\2\2\u04ae\u008f\3\2\2\2\u04af\u04b0\7]\2\2\u04b0\u04b1\5\60\31\2"+
		"\u04b1\u04b2\7\30\2\2\u04b2\u0091\3\2\2\2\u00a5\u0095\u009c\u009f\u00a3"+
		"\u00ad\u00ba\u00bf\u00c6\u00cd\u00d3\u00da\u00de\u00e2\u00e8\u00ed\u00f2"+
		"\u00f7\u00fd\u0100\u0103\u010b\u010e\u0113\u0117\u011c\u0123\u012a\u0130"+
		"\u0136\u013f\u0143\u0149\u014d\u0153\u0157\u015c\u015f\u0172\u0177\u017d"+
		"\u0183\u0188\u018e\u0195\u019c\u01a3\u01a9\u01b0\u01b7\u01bc\u01bf\u01c4"+
		"\u01cb\u01d3\u01d5\u01da\u01e2\u01e6\u01ef\u01f6\u01f9\u01fd\u0200\u0206"+
		"\u020a\u020e\u0213\u0217\u021b\u0222\u0228\u022f\u0233\u0235\u023f\u024a"+
		"\u0255\u0260\u026b\u027d\u027f\u0291\u0293\u029b\u02a2\u02a8\u02ac\u02b9"+
		"\u02bb\u02c3\u02c9\u02cb\u02d6\u02d8\u02e7\u02e9\u02ef\u02fa\u0304\u030a"+
		"\u0310\u0317\u0324\u0331\u0337\u033e\u0342\u034b\u0352\u0359\u0360\u0367"+
		"\u036c\u0378\u0385\u038b\u0396\u039b\u03a1\u03a7\u03ab\u03b2\u03b4\u03ba"+
		"\u03c3\u03c8\u03cd\u03d2\u03d9\u03e2\u03e8\u03f1\u03f5\u03fa\u0401\u0405"+
		"\u0407\u040c\u0413\u0417\u0419\u041d\u0423\u042a\u042f\u0436\u043d\u0442"+
		"\u0448\u0451\u0458\u045e\u0464\u046b\u0472\u0478\u047f\u0483\u0488\u048e"+
		"\u0497\u04a4\u04ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}