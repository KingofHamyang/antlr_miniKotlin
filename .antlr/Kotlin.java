// Generated from /Users/haseongjun/project/antlr_miniKotlin/Kotlin.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Kotlin extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StringExpr=1, Escape=2, FieldID=3, VAR=4, RETURN=5, LOGICAL_OR=6, LOGICAL_AND=7, 
		BIT_OR=8, BIT_AND=9, BIT_XOR=10, INOP=11, NOTIN=12, ISOP=13, NOTIS=14, 
		COLON=15, COMM=16, LPAR=17, RPAR=18, QUESTION=19, LCURL=20, RCURL=21, 
		EQ=22, PLUSEQ=23, MINUSEQ=24, MULTEQ=25, DIVEQ=26, QEQ=27, DO=28, DOT=29, 
		EQUAL_R=30, EQUAL=31, NOT_EQUAL=32, NOT_EQUAL_R=33, ARROW=34, DIV=35, 
		MUL=36, QUAT=37, RANGE_OP=38, WHEN=39, INC=40, DEC=41, FOR=42, WHILE=43, 
		IF=44, ELSE=45, ELSE_IF=46, GT=47, LT=48, GTE=49, LTE=50, SHIFT_R=51, 
		SHIFT_L=52, DOWN_TO=53, STEP=54, FUNC=55, MINUS=56, PLUS=57, TYPE_INT=58, 
		TYPE_STRING=59, TYPE_FLOAT=60, TYPE_ANY=61, TYPE_Double=62, TYPE_Long=63, 
		TYPE_SHORT=64, TYPE_BYTE=65, NL=66, INT=67, BOOL=68, LONG=69, HEXA=70, 
		BINARY=71, REAL=72, ID=73, WS=74, Q_OPEN=75, FieldIdentifier=76, Q_CLOSE=77, 
		LineStrRef=78, LineStrText=79, LineStrEscapedChar=80;
	public static final int
		RULE_prog = 0, RULE_variableDefine = 1, RULE_functionDefine = 2, RULE_functionbody = 3, 
		RULE_block = 4, RULE_multiple_stmt = 5, RULE_stmt = 6, RULE_defining = 7, 
		RULE_inblockExpression = 8, RULE_returning = 9, RULE_expression = 10, 
		RULE_assignstmt = 11, RULE_unaryexpression = 12, RULE_commonstmt = 13, 
		RULE_oroperation = 14, RULE_andoperation = 15, RULE_inclusiveoroperation = 16, 
		RULE_exclusiveoperation = 17, RULE_andExpr = 18, RULE_equalityExpr = 19, 
		RULE_comparableExpr = 20, RULE_inisOperation = 21, RULE_shiftExpr = 22, 
		RULE_rangeExpr = 23, RULE_addExpr = 24, RULE_multiExpr = 25, RULE_term = 26, 
		RULE_postterm = 27, RULE_atomic = 28, RULE_postoperation = 29, RULE_digit = 30, 
		RULE_functioncall = 31, RULE_functionname = 32, RULE_inputparameter = 33, 
		RULE_flowcontrol = 34, RULE_loopExp = 35, RULE_forExp = 36, RULE_variableDeclare = 37, 
		RULE_whileExp = 38, RULE_dowhileExp = 39, RULE_conditionalExp = 40, RULE_ifExp = 41, 
		RULE_whenExp = 42, RULE_whenlist = 43, RULE_whenCondition = 44, RULE_rangeOperation = 45, 
		RULE_typeOperation = 46, RULE_type = 47, RULE_parameter = 48, RULE_assignment = 49, 
		RULE_string = 50, RULE_stringContent = 51;
	public static final String[] ruleNames = {
		"prog", "variableDefine", "functionDefine", "functionbody", "block", "multiple_stmt", 
		"stmt", "defining", "inblockExpression", "returning", "expression", "assignstmt", 
		"unaryexpression", "commonstmt", "oroperation", "andoperation", "inclusiveoroperation", 
		"exclusiveoperation", "andExpr", "equalityExpr", "comparableExpr", "inisOperation", 
		"shiftExpr", "rangeExpr", "addExpr", "multiExpr", "term", "postterm", 
		"atomic", "postoperation", "digit", "functioncall", "functionname", "inputparameter", 
		"flowcontrol", "loopExp", "forExp", "variableDeclare", "whileExp", "dowhileExp", 
		"conditionalExp", "ifExp", "whenExp", "whenlist", "whenCondition", "rangeOperation", 
		"typeOperation", "type", "parameter", "assignment", "string", "stringContent"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'${'", null, null, null, "'return'", "'||'", "'&&'", "'or'", "'and'", 
		"'xor'", "'in'", "'!in'", "'is'", "'!is'", "':'", "','", "'('", "')'", 
		"'?'", "'{'", "'}'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'do'", 
		"'.'", "'==='", "'=='", "'!='", "'!=='", "'->'", "'/'", "'*'", "'%'", 
		"'..'", "'when'", "'++'", "'--'", "'for'", "'while'", "'if'", "'else'", 
		"'else if'", "'>'", "'<'", "'>='", "'<='", "'shr'", "'shl'", "'downTo'", 
		"'step'", "'fun'", "'-'", "'+'", "'Int'", "'String'", "'Float'", "'Any'", 
		"'Double'", "'Long'", "'Short'", "'Byte'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StringExpr", "Escape", "FieldID", "VAR", "RETURN", "LOGICAL_OR", 
		"LOGICAL_AND", "BIT_OR", "BIT_AND", "BIT_XOR", "INOP", "NOTIN", "ISOP", 
		"NOTIS", "COLON", "COMM", "LPAR", "RPAR", "QUESTION", "LCURL", "RCURL", 
		"EQ", "PLUSEQ", "MINUSEQ", "MULTEQ", "DIVEQ", "QEQ", "DO", "DOT", "EQUAL_R", 
		"EQUAL", "NOT_EQUAL", "NOT_EQUAL_R", "ARROW", "DIV", "MUL", "QUAT", "RANGE_OP", 
		"WHEN", "INC", "DEC", "FOR", "WHILE", "IF", "ELSE", "ELSE_IF", "GT", "LT", 
		"GTE", "LTE", "SHIFT_R", "SHIFT_L", "DOWN_TO", "STEP", "FUNC", "MINUS", 
		"PLUS", "TYPE_INT", "TYPE_STRING", "TYPE_FLOAT", "TYPE_ANY", "TYPE_Double", 
		"TYPE_Long", "TYPE_SHORT", "TYPE_BYTE", "NL", "INT", "BOOL", "LONG", "HEXA", 
		"BINARY", "REAL", "ID", "WS", "Q_OPEN", "FieldIdentifier", "Q_CLOSE", 
		"LineStrRef", "LineStrText", "LineStrEscapedChar"
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
	public String getGrammarFileName() { return "Kotlin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Kotlin(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<FunctionDefineContext> functionDefine() {
			return getRuleContexts(FunctionDefineContext.class);
		}
		public FunctionDefineContext functionDefine(int i) {
			return getRuleContext(FunctionDefineContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC || _la==NL) {
				{
				{
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(104);
					match(NL);
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(110);
				functionDefine();
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(111);
						match(NL);
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				}
				}
				setState(121);
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

	public static class VariableDefineContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Kotlin.VAR, 0); }
		public TerminalNode ID() { return getToken(Kotlin.ID, 0); }
		public TerminalNode COLON() { return getToken(Kotlin.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CommonstmtContext commonstmt() {
			return getRuleContext(CommonstmtContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public VariableDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefine; }
	}

	public final VariableDefineContext variableDefine() throws RecognitionException {
		VariableDefineContext _localctx = new VariableDefineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(VAR);
			setState(123);
			match(ID);
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(124);
				match(COLON);
				setState(125);
				type();
				}
				break;
			}
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(128);
				assignment();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(129);
					match(NL);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
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
		public TerminalNode FUNC() { return getToken(Kotlin.FUNC, 0); }
		public FunctionnameContext functionname() {
			return getRuleContext(FunctionnameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(Kotlin.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Kotlin.RPAR, 0); }
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public List<TerminalNode> COMM() { return getTokens(Kotlin.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(Kotlin.COMM, i);
		}
		public FunctionDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefine; }
	}

	public final FunctionDefineContext functionDefine() throws RecognitionException {
		FunctionDefineContext _localctx = new FunctionDefineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDefine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(FUNC);
			setState(140);
			functionname();
			setState(141);
			match(LPAR);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(142);
				parameter();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMM) {
					{
					{
					setState(143);
					match(COMM);
					setState(144);
					parameter();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(152);
			match(RPAR);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(153);
					match(NL);
					}
					} 
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(159);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Kotlin.EQ, 0); }
		public CommonstmtContext commonstmt() {
			return getRuleContext(CommonstmtContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Kotlin.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public TerminalNode QUESTION() { return getToken(Kotlin.QUESTION, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(161);
				match(COLON);
				setState(162);
				type();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION) {
					{
					setState(163);
					match(QUESTION);
					}
				}

				}
			}

			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(168);
				match(NL);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				{
				setState(174);
				block();
				}
				break;
			case EQ:
				{
				setState(175);
				match(EQ);
				setState(176);
				commonstmt();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(Kotlin.LCURL, 0); }
		public Multiple_stmtContext multiple_stmt() {
			return getRuleContext(Multiple_stmtContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(Kotlin.RCURL, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(LCURL);
			setState(180);
			multiple_stmt();
			setState(181);
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
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
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
		enterRule(_localctx, 10, RULE_multiple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					match(NL);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << RETURN) | (1L << LPAR) | (1L << DO) | (1L << WHEN) | (1L << INC) | (1L << DEC) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << FUNC) | (1L << MINUS) | (1L << PLUS))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (NL - 66)) | (1L << (INT - 66)) | (1L << (BOOL - 66)) | (1L << (LONG - 66)) | (1L << (HEXA - 66)) | (1L << (BINARY - 66)) | (1L << (REAL - 66)) | (1L << (ID - 66)) | (1L << (Q_OPEN - 66)))) != 0)) {
				{
				setState(189);
				stmt();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(191); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(190);
							match(NL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(193); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(195);
						stmt();
						}
						break;
					}
					}
					}
					setState(202);
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
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				defining();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
		enterRule(_localctx, 14, RULE_defining);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				functionDefine();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
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
		enterRule(_localctx, 16, RULE_inblockExpression);
		try {
			setState(222);
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
			case INT:
			case BOOL:
			case LONG:
			case HEXA:
			case BINARY:
			case REAL:
			case ID:
			case Q_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				expression();
				}
				break;
			case DO:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				flowcontrol();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
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
		public TerminalNode RETURN() { return getToken(Kotlin.RETURN, 0); }
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
		enterRule(_localctx, 18, RULE_returning);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(RETURN);
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(225);
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
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				commonstmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
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
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
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
		enterRule(_localctx, 22, RULE_assignstmt);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
			case WHEN:
			case IF:
			case INT:
			case BOOL:
			case LONG:
			case HEXA:
			case BINARY:
			case REAL:
			case ID:
			case Q_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				unaryexpression();
				setState(233);
				assignment();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(234);
					match(NL);
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				commonstmt();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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
		public PosttermContext postterm() {
			return getRuleContext(PosttermContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unaryexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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

	public static class CommonstmtContext extends ParserRuleContext {
		public OroperationContext oroperation() {
			return getRuleContext(OroperationContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(Kotlin.QUESTION, 0); }
		public List<CommonstmtContext> commonstmt() {
			return getRuleContexts(CommonstmtContext.class);
		}
		public CommonstmtContext commonstmt(int i) {
			return getRuleContext(CommonstmtContext.class,i);
		}
		public TerminalNode COLON() { return getToken(Kotlin.COLON, 0); }
		public CommonstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonstmt; }
	}

	public final CommonstmtContext commonstmt() throws RecognitionException {
		CommonstmtContext _localctx = new CommonstmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_commonstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			oroperation(0);
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(248);
				match(QUESTION);
				setState(249);
				commonstmt();
				setState(250);
				match(COLON);
				setState(251);
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

	public static class OroperationContext extends ParserRuleContext {
		public AndoperationContext andoperation() {
			return getRuleContext(AndoperationContext.class,0);
		}
		public OroperationContext oroperation() {
			return getRuleContext(OroperationContext.class,0);
		}
		public TerminalNode LOGICAL_OR() { return getToken(Kotlin.LOGICAL_OR, 0); }
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_oroperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(256);
			andoperation(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OroperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_oroperation);
					setState(258);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(259);
					match(LOGICAL_OR);
					setState(260);
					andoperation(0);
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public TerminalNode LOGICAL_AND() { return getToken(Kotlin.LOGICAL_AND, 0); }
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_andoperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(267);
			inclusiveoroperation(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndoperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andoperation);
					setState(269);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(270);
					match(LOGICAL_AND);
					setState(271);
					inclusiveoroperation(0);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public TerminalNode BIT_OR() { return getToken(Kotlin.BIT_OR, 0); }
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_inclusiveoroperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(278);
			exclusiveoperation(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveoroperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveoroperation);
					setState(280);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(281);
					match(BIT_OR);
					setState(282);
					exclusiveoperation(0);
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public TerminalNode BIT_XOR() { return getToken(Kotlin.BIT_XOR, 0); }
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_exclusiveoperation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(289);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveoperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveoperation);
					setState(291);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(292);
					match(BIT_XOR);
					setState(293);
					andExpr(0);
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public TerminalNode BIT_AND() { return getToken(Kotlin.BIT_AND, 0); }
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(300);
			equalityExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(302);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(303);
					match(BIT_AND);
					setState(304);
					equalityExpr(0);
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public TerminalNode EQUAL() { return getToken(Kotlin.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(Kotlin.NOT_EQUAL, 0); }
		public TerminalNode NOT_EQUAL_R() { return getToken(Kotlin.NOT_EQUAL_R, 0); }
		public TerminalNode EQUAL_R() { return getToken(Kotlin.EQUAL_R, 0); }
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_equalityExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(311);
			comparableExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
						setState(313);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(314);
						match(EQUAL);
						setState(315);
						comparableExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
						setState(316);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(317);
						match(NOT_EQUAL);
						setState(318);
						comparableExpr(0);
						}
						break;
					case 3:
						{
						_localctx = new EqualityExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
						setState(319);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(320);
						match(NOT_EQUAL_R);
						setState(321);
						comparableExpr(0);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpr);
						setState(322);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(323);
						match(EQUAL_R);
						setState(324);
						comparableExpr(0);
						}
						break;
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		public TerminalNode GT() { return getToken(Kotlin.GT, 0); }
		public TerminalNode LT() { return getToken(Kotlin.LT, 0); }
		public TerminalNode GTE() { return getToken(Kotlin.GTE, 0); }
		public TerminalNode LTE() { return getToken(Kotlin.LTE, 0); }
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_comparableExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(331);
			inisOperation();
			}
			_ctx.stop = _input.LT(-1);
			setState(347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(345);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ComparableExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparableExpr);
						setState(333);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(334);
						match(GT);
						setState(335);
						inisOperation();
						}
						break;
					case 2:
						{
						_localctx = new ComparableExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparableExpr);
						setState(336);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(337);
						match(LT);
						setState(338);
						inisOperation();
						}
						break;
					case 3:
						{
						_localctx = new ComparableExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparableExpr);
						setState(339);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(340);
						match(GTE);
						setState(341);
						inisOperation();
						}
						break;
					case 4:
						{
						_localctx = new ComparableExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comparableExpr);
						setState(342);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(343);
						match(LTE);
						setState(344);
						inisOperation();
						}
						break;
					}
					} 
				}
				setState(349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		public TerminalNode ISOP() { return getToken(Kotlin.ISOP, 0); }
		public TerminalNode NOTIS() { return getToken(Kotlin.NOTIS, 0); }
		public List<TerminalNode> INOP() { return getTokens(Kotlin.INOP); }
		public TerminalNode INOP(int i) {
			return getToken(Kotlin.INOP, i);
		}
		public List<TerminalNode> NOTIN() { return getTokens(Kotlin.NOTIN); }
		public TerminalNode NOTIN(int i) {
			return getToken(Kotlin.NOTIN, i);
		}
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public InisOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inisOperation; }
	}

	public final InisOperationContext inisOperation() throws RecognitionException {
		InisOperationContext _localctx = new InisOperationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inisOperation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			shiftExpr(0);
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(359); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(351);
						_la = _input.LA(1);
						if ( !(_la==INOP || _la==NOTIN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(355);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(352);
							match(NL);
							}
							}
							setState(357);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(358);
						shiftExpr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(361); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				{
				setState(363);
				_la = _input.LA(1);
				if ( !(_la==ISOP || _la==NOTIS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(364);
					match(NL);
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
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

	public static class ShiftExprContext extends ParserRuleContext {
		public RangeExprContext rangeExpr() {
			return getRuleContext(RangeExprContext.class,0);
		}
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public TerminalNode SHIFT_R() { return getToken(Kotlin.SHIFT_R, 0); }
		public TerminalNode SHIFT_L() { return getToken(Kotlin.SHIFT_L, 0); }
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_shiftExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(374);
			rangeExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(382);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpr);
						setState(376);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(377);
						match(SHIFT_R);
						setState(378);
						rangeExpr();
						}
						break;
					case 2:
						{
						_localctx = new ShiftExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpr);
						setState(379);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(380);
						match(SHIFT_L);
						setState(381);
						rangeExpr();
						}
						break;
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		public TerminalNode RANGE_OP() { return getToken(Kotlin.RANGE_OP, 0); }
		public TerminalNode DOWN_TO() { return getToken(Kotlin.DOWN_TO, 0); }
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public TerminalNode STEP() { return getToken(Kotlin.STEP, 0); }
		public RangeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpr; }
	}

	public final RangeExprContext rangeExpr() throws RecognitionException {
		RangeExprContext _localctx = new RangeExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rangeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			addExpr(0);
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(388);
				_la = _input.LA(1);
				if ( !(_la==RANGE_OP || _la==DOWN_TO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(389);
					match(NL);
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(395);
				addExpr(0);
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(396);
					match(STEP);
					setState(397);
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
		public TerminalNode PLUS() { return getToken(Kotlin.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Kotlin.MINUS, 0); }
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_addExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(403);
			multiExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(405);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(406);
						match(PLUS);
						setState(407);
						multiExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(408);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(409);
						match(MINUS);
						setState(410);
						multiExpr(0);
						}
						break;
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		public TerminalNode DIV() { return getToken(Kotlin.DIV, 0); }
		public TerminalNode MUL() { return getToken(Kotlin.MUL, 0); }
		public TerminalNode QUAT() { return getToken(Kotlin.QUAT, 0); }
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_multiExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(417);
			term();
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new MultiExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiExpr);
						setState(419);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(420);
						match(DIV);
						setState(421);
						term();
						}
						break;
					case 2:
						{
						_localctx = new MultiExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiExpr);
						setState(422);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(423);
						match(MUL);
						setState(424);
						term();
						}
						break;
					case 3:
						{
						_localctx = new MultiExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiExpr);
						setState(425);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(426);
						match(QUAT);
						setState(427);
						term();
						}
						break;
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		public List<TerminalNode> PLUS() { return getTokens(Kotlin.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Kotlin.PLUS, i);
		}
		public List<TerminalNode> INC() { return getTokens(Kotlin.INC); }
		public TerminalNode INC(int i) {
			return getToken(Kotlin.INC, i);
		}
		public List<TerminalNode> DEC() { return getTokens(Kotlin.DEC); }
		public TerminalNode DEC(int i) {
			return getToken(Kotlin.DEC, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Kotlin.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Kotlin.MINUS, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << MINUS) | (1L << PLUS))) != 0)) {
				{
				{
				setState(433);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << MINUS) | (1L << PLUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
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
		enterRule(_localctx, 54, RULE_postterm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			atomic();
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					postoperation();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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

	public static class AtomicContext extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public TerminalNode ID() { return getToken(Kotlin.ID, 0); }
		public TerminalNode LPAR() { return getToken(Kotlin.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Kotlin.RPAR, 0); }
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ConditionalExpContext conditionalExp() {
			return getRuleContext(ConditionalExpContext.class,0);
		}
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atomic);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				digit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(LPAR);
				setState(451);
				expression();
				setState(452);
				match(RPAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				functioncall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(455);
				conditionalExp();
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
		public TerminalNode INC() { return getToken(Kotlin.INC, 0); }
		public TerminalNode DEC() { return getToken(Kotlin.DEC, 0); }
		public TerminalNode DOT() { return getToken(Kotlin.DOT, 0); }
		public PosttermContext postterm() {
			return getRuleContext(PosttermContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public PostoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postoperation; }
	}

	public final PostoperationContext postoperation() throws RecognitionException {
		PostoperationContext _localctx = new PostoperationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_postoperation);
		int _la;
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INC:
			case DEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
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
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(459);
					match(NL);
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(465);
				match(DOT);
				setState(466);
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
		public TerminalNode INT() { return getToken(Kotlin.INT, 0); }
		public TerminalNode REAL() { return getToken(Kotlin.REAL, 0); }
		public TerminalNode BOOL() { return getToken(Kotlin.BOOL, 0); }
		public TerminalNode HEXA() { return getToken(Kotlin.HEXA, 0); }
		public TerminalNode BINARY() { return getToken(Kotlin.BINARY, 0); }
		public TerminalNode LONG() { return getToken(Kotlin.LONG, 0); }
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
		enterRule(_localctx, 60, RULE_digit);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(INT);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(REAL);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(471);
				match(BOOL);
				}
				break;
			case HEXA:
				enterOuterAlt(_localctx, 4);
				{
				setState(472);
				match(HEXA);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				match(BINARY);
				}
				break;
			case LONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(474);
				match(LONG);
				}
				break;
			case Q_OPEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(475);
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
		public TerminalNode LPAR() { return getToken(Kotlin.LPAR, 0); }
		public List<InputparameterContext> inputparameter() {
			return getRuleContexts(InputparameterContext.class);
		}
		public InputparameterContext inputparameter(int i) {
			return getRuleContext(InputparameterContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(Kotlin.RPAR, 0); }
		public List<TerminalNode> COMM() { return getTokens(Kotlin.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(Kotlin.COMM, i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functioncall);
		int _la;
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				functionname();
				setState(479);
				match(LPAR);
				setState(480);
				inputparameter();
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMM) {
					{
					{
					setState(481);
					match(COMM);
					setState(482);
					inputparameter();
					}
					}
					setState(487);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(488);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				functionname();
				setState(491);
				match(LPAR);
				setState(492);
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

	public static class FunctionnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Kotlin.ID, 0); }
		public FunctionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionname; }
	}

	public final FunctionnameContext functionname() throws RecognitionException {
		FunctionnameContext _localctx = new FunctionnameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public InputparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputparameter; }
	}

	public final InputparameterContext inputparameter() throws RecognitionException {
		InputparameterContext _localctx = new InputparameterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_inputparameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			unaryexpression();
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
		enterRule(_localctx, 68, RULE_flowcontrol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
		enterRule(_localctx, 70, RULE_loopExp);
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				forExp();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				whileExp();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
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
		public TerminalNode FOR() { return getToken(Kotlin.FOR, 0); }
		public TerminalNode LPAR() { return getToken(Kotlin.LPAR, 0); }
		public VariableDeclareContext variableDeclare() {
			return getRuleContext(VariableDeclareContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Kotlin.RPAR, 0); }
		public TerminalNode INOP() { return getToken(Kotlin.INOP, 0); }
		public TerminalNode NOTIN() { return getToken(Kotlin.NOTIN, 0); }
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
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
		enterRule(_localctx, 72, RULE_forExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(FOR);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(508);
				match(NL);
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
			match(LPAR);
			setState(515);
			variableDeclare();
			setState(516);
			_la = _input.LA(1);
			if ( !(_la==INOP || _la==NOTIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(517);
			expression();
			setState(518);
			match(RPAR);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(519);
					match(NL);
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(525);
				block();
				}
				break;
			case 2:
				{
				setState(526);
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
		public TerminalNode LPAR() { return getToken(Kotlin.LPAR, 0); }
		public List<TerminalNode> ID() { return getTokens(Kotlin.ID); }
		public TerminalNode ID(int i) {
			return getToken(Kotlin.ID, i);
		}
		public TerminalNode RPAR() { return getToken(Kotlin.RPAR, 0); }
		public List<TerminalNode> COLON() { return getTokens(Kotlin.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Kotlin.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMM() { return getTokens(Kotlin.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(Kotlin.COMM, i);
		}
		public VariableDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclare; }
	}

	public final VariableDeclareContext variableDeclare() throws RecognitionException {
		VariableDeclareContext _localctx = new VariableDeclareContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclare);
		int _la;
		try {
			setState(552);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(LPAR);
				setState(530);
				match(ID);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(531);
					match(COLON);
					setState(532);
					type();
					}
				}

				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMM) {
					{
					{
					setState(535);
					match(COMM);
					{
					setState(536);
					match(ID);
					setState(539);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(537);
						match(COLON);
						setState(538);
						type();
						}
					}

					}
					}
					}
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(546);
				match(RPAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(ID);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(548);
					match(COLON);
					setState(549);
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
		public TerminalNode WHILE() { return getToken(Kotlin.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(Kotlin.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Kotlin.RPAR, 0); }
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
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
		enterRule(_localctx, 76, RULE_whileExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(WHILE);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(555);
				match(NL);
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(LPAR);
			setState(562);
			expression();
			setState(563);
			match(RPAR);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(564);
					match(NL);
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(570);
				block();
				}
				break;
			case 2:
				{
				setState(571);
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
		public TerminalNode DO() { return getToken(Kotlin.DO, 0); }
		public TerminalNode WHILE() { return getToken(Kotlin.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(Kotlin.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Kotlin.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InblockExpressionContext inblockExpression() {
			return getRuleContext(InblockExpressionContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public DowhileExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhileExp; }
	}

	public final DowhileExpContext dowhileExp() throws RecognitionException {
		DowhileExpContext _localctx = new DowhileExpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_dowhileExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(DO);
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LCURL:
				{
				setState(575);
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
			case INT:
			case BOOL:
			case LONG:
			case HEXA:
			case BINARY:
			case REAL:
			case ID:
			case Q_OPEN:
				{
				setState(576);
				inblockExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(579);
				match(NL);
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585);
			match(WHILE);
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(586);
				match(NL);
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(592);
			match(LPAR);
			setState(593);
			expression();
			setState(594);
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
		enterRule(_localctx, 80, RULE_conditionalExp);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				ifExp();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
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
		public TerminalNode IF() { return getToken(Kotlin.IF, 0); }
		public TerminalNode LPAR() { return getToken(Kotlin.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Kotlin.RPAR, 0); }
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<InblockExpressionContext> inblockExpression() {
			return getRuleContexts(InblockExpressionContext.class);
		}
		public InblockExpressionContext inblockExpression(int i) {
			return getRuleContext(InblockExpressionContext.class,i);
		}
		public TerminalNode ELSE_IF() { return getToken(Kotlin.ELSE_IF, 0); }
		public TerminalNode ELSE() { return getToken(Kotlin.ELSE, 0); }
		public IfExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExp; }
	}

	public final IfExpContext ifExp() throws RecognitionException {
		IfExpContext _localctx = new IfExpContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(IF);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(601);
				match(NL);
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			match(LPAR);
			setState(608);
			expression();
			setState(609);
			match(RPAR);
			setState(613);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(610);
					match(NL);
					}
					} 
				}
				setState(615);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(616);
				block();
				}
				break;
			case 2:
				{
				setState(617);
				inblockExpression();
				}
				break;
			}
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(620);
					match(NL);
					}
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(626);
				match(ELSE_IF);
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(627);
						match(NL);
						}
						} 
					}
					setState(632);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(633);
					block();
					}
					break;
				case 2:
					{
					setState(634);
					inblockExpression();
					}
					break;
				}
				}
				break;
			}
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(639);
					match(NL);
					}
					}
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(645);
				match(ELSE);
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(646);
						match(NL);
						}
						} 
					}
					setState(651);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				setState(654);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(652);
					block();
					}
					break;
				case 2:
					{
					setState(653);
					inblockExpression();
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

	public static class WhenExpContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(Kotlin.WHEN, 0); }
		public TerminalNode LCURL() { return getToken(Kotlin.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(Kotlin.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public TerminalNode LPAR() { return getToken(Kotlin.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Kotlin.RPAR, 0); }
		public List<WhenlistContext> whenlist() {
			return getRuleContexts(WhenlistContext.class);
		}
		public WhenlistContext whenlist(int i) {
			return getRuleContext(WhenlistContext.class,i);
		}
		public WhenExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExp; }
	}

	public final WhenExpContext whenExp() throws RecognitionException {
		WhenExpContext _localctx = new WhenExpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_whenExp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(WHEN);
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(659);
					match(NL);
					}
					} 
				}
				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(665);
				match(LPAR);
				setState(666);
				expression();
				setState(667);
				match(RPAR);
				}
			}

			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(671);
				match(NL);
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(677);
			match(LCURL);
			setState(681);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(678);
					match(NL);
					}
					} 
				}
				setState(683);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << INOP) | (1L << NOTIN) | (1L << ISOP) | (1L << NOTIS) | (1L << LPAR) | (1L << WHEN) | (1L << INC) | (1L << DEC) | (1L << IF) | (1L << ELSE) | (1L << MINUS) | (1L << PLUS))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (INT - 67)) | (1L << (BOOL - 67)) | (1L << (LONG - 67)) | (1L << (HEXA - 67)) | (1L << (BINARY - 67)) | (1L << (REAL - 67)) | (1L << (ID - 67)) | (1L << (Q_OPEN - 67)))) != 0)) {
				{
				{
				setState(684);
				whenlist();
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(685);
						match(NL);
						}
						} 
					}
					setState(690);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(696);
				match(NL);
				}
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(702);
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

	public static class WhenlistContext extends ParserRuleContext {
		public List<WhenConditionContext> whenCondition() {
			return getRuleContexts(WhenConditionContext.class);
		}
		public WhenConditionContext whenCondition(int i) {
			return getRuleContext(WhenConditionContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(Kotlin.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InblockExpressionContext inblockExpression() {
			return getRuleContext(InblockExpressionContext.class,0);
		}
		public List<TerminalNode> COMM() { return getTokens(Kotlin.COMM); }
		public TerminalNode COMM(int i) {
			return getToken(Kotlin.COMM, i);
		}
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public TerminalNode ELSE() { return getToken(Kotlin.ELSE, 0); }
		public WhenlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenlist; }
	}

	public final WhenlistContext whenlist() throws RecognitionException {
		WhenlistContext _localctx = new WhenlistContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_whenlist);
		int _la;
		try {
			int _alt;
			setState(764);
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
			case INT:
			case BOOL:
			case LONG:
			case HEXA:
			case BINARY:
			case REAL:
			case ID:
			case Q_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				whenCondition();
				setState(721);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(708);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(705);
							match(NL);
							}
							}
							setState(710);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(711);
						match(COMM);
						setState(715);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(712);
							match(NL);
							}
							}
							setState(717);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(718);
						whenCondition();
						}
						} 
					}
					setState(723);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(724);
					match(NL);
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(730);
				match(ARROW);
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(731);
					match(NL);
					}
					}
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(739);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LCURL:
					{
					setState(737);
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
				case INT:
				case BOOL:
				case LONG:
				case HEXA:
				case BINARY:
				case REAL:
				case ID:
				case Q_OPEN:
					{
					setState(738);
					inblockExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(742); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(741);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(744); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
				match(ELSE);
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(747);
					match(NL);
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(753);
				match(ARROW);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(754);
					match(NL);
					}
					}
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(762);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LCURL:
					{
					setState(760);
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
				case INT:
				case BOOL:
				case LONG:
				case HEXA:
				case BINARY:
				case REAL:
				case ID:
				case Q_OPEN:
					{
					setState(761);
					inblockExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class WhenConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RangeOperationContext rangeOperation() {
			return getRuleContext(RangeOperationContext.class,0);
		}
		public TypeOperationContext typeOperation() {
			return getRuleContext(TypeOperationContext.class,0);
		}
		public WhenConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenCondition; }
	}

	public final WhenConditionContext whenCondition() throws RecognitionException {
		WhenConditionContext _localctx = new WhenConditionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_whenCondition);
		try {
			setState(769);
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
			case INT:
			case BOOL:
			case LONG:
			case HEXA:
			case BINARY:
			case REAL:
			case ID:
			case Q_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				expression();
				}
				break;
			case INOP:
			case NOTIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				rangeOperation();
				}
				break;
			case ISOP:
			case NOTIS:
				enterOuterAlt(_localctx, 3);
				{
				setState(768);
				typeOperation();
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

	public static class RangeOperationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INOP() { return getToken(Kotlin.INOP, 0); }
		public TerminalNode NOTIN() { return getToken(Kotlin.NOTIN, 0); }
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public RangeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeOperation; }
	}

	public final RangeOperationContext rangeOperation() throws RecognitionException {
		RangeOperationContext _localctx = new RangeOperationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_rangeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			_la = _input.LA(1);
			if ( !(_la==INOP || _la==NOTIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(772);
				match(NL);
				}
				}
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(778);
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

	public static class TypeOperationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ISOP() { return getToken(Kotlin.ISOP, 0); }
		public TerminalNode NOTIS() { return getToken(Kotlin.NOTIS, 0); }
		public List<TerminalNode> NL() { return getTokens(Kotlin.NL); }
		public TerminalNode NL(int i) {
			return getToken(Kotlin.NL, i);
		}
		public TypeOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOperation; }
	}

	public final TypeOperationContext typeOperation() throws RecognitionException {
		TypeOperationContext _localctx = new TypeOperationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			_la = _input.LA(1);
			if ( !(_la==ISOP || _la==NOTIS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(781);
				match(NL);
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(787);
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
		public TerminalNode TYPE_INT() { return getToken(Kotlin.TYPE_INT, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(Kotlin.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_STRING() { return getToken(Kotlin.TYPE_STRING, 0); }
		public TerminalNode TYPE_ANY() { return getToken(Kotlin.TYPE_ANY, 0); }
		public TerminalNode TYPE_Double() { return getToken(Kotlin.TYPE_Double, 0); }
		public TerminalNode TYPE_Long() { return getToken(Kotlin.TYPE_Long, 0); }
		public TerminalNode TYPE_SHORT() { return getToken(Kotlin.TYPE_SHORT, 0); }
		public TerminalNode TYPE_BYTE() { return getToken(Kotlin.TYPE_BYTE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (TYPE_INT - 58)) | (1L << (TYPE_STRING - 58)) | (1L << (TYPE_FLOAT - 58)) | (1L << (TYPE_ANY - 58)) | (1L << (TYPE_Double - 58)) | (1L << (TYPE_Long - 58)) | (1L << (TYPE_SHORT - 58)) | (1L << (TYPE_BYTE - 58)))) != 0)) ) {
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Kotlin.ID, 0); }
		public TerminalNode COLON() { return getToken(Kotlin.COLON, 0); }
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
		enterRule(_localctx, 96, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(ID);
			setState(792);
			match(COLON);
			setState(793);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(Kotlin.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(Kotlin.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(Kotlin.MINUSEQ, 0); }
		public TerminalNode MULTEQ() { return getToken(Kotlin.MULTEQ, 0); }
		public TerminalNode DIVEQ() { return getToken(Kotlin.DIVEQ, 0); }
		public TerminalNode QEQ() { return getToken(Kotlin.QEQ, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
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
		public TerminalNode Q_OPEN() { return getToken(Kotlin.Q_OPEN, 0); }
		public TerminalNode Q_CLOSE() { return getToken(Kotlin.Q_CLOSE, 0); }
		public List<StringContentContext> stringContent() {
			return getRuleContexts(StringContentContext.class);
		}
		public StringContentContext stringContent(int i) {
			return getRuleContext(StringContentContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(Q_OPEN);
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (LineStrRef - 78)) | (1L << (LineStrText - 78)) | (1L << (LineStrEscapedChar - 78)))) != 0)) {
				{
				{
				setState(798);
				stringContent();
				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(804);
			match(Q_CLOSE);
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
		public TerminalNode LineStrText() { return getToken(Kotlin.LineStrText, 0); }
		public TerminalNode LineStrEscapedChar() { return getToken(Kotlin.LineStrEscapedChar, 0); }
		public TerminalNode LineStrRef() { return getToken(Kotlin.LineStrRef, 0); }
		public StringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringContent; }
	}

	public final StringContentContext stringContent() throws RecognitionException {
		StringContentContext _localctx = new StringContentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_stringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (LineStrRef - 78)) | (1L << (LineStrText - 78)) | (1L << (LineStrEscapedChar - 78)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return oroperation_sempred((OroperationContext)_localctx, predIndex);
		case 15:
			return andoperation_sempred((AndoperationContext)_localctx, predIndex);
		case 16:
			return inclusiveoroperation_sempred((InclusiveoroperationContext)_localctx, predIndex);
		case 17:
			return exclusiveoperation_sempred((ExclusiveoperationContext)_localctx, predIndex);
		case 18:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 19:
			return equalityExpr_sempred((EqualityExprContext)_localctx, predIndex);
		case 20:
			return comparableExpr_sempred((ComparableExprContext)_localctx, predIndex);
		case 22:
			return shiftExpr_sempred((ShiftExprContext)_localctx, predIndex);
		case 24:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 25:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u032b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\7\2s\n\2\f\2\16\2v\13"+
		"\2\7\2x\n\2\f\2\16\2{\13\2\3\3\3\3\3\3\3\3\5\3\u0081\n\3\3\3\3\3\7\3\u0085"+
		"\n\3\f\3\16\3\u0088\13\3\3\3\3\3\5\3\u008c\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4\u0094\n\4\f\4\16\4\u0097\13\4\5\4\u0099\n\4\3\4\3\4\7\4\u009d\n\4"+
		"\f\4\16\4\u00a0\13\4\3\4\3\4\3\5\3\5\3\5\5\5\u00a7\n\5\5\5\u00a9\n\5\3"+
		"\5\7\5\u00ac\n\5\f\5\16\5\u00af\13\5\3\5\3\5\3\5\5\5\u00b4\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\7\7\u00bb\n\7\f\7\16\7\u00be\13\7\3\7\3\7\6\7\u00c2\n\7\r"+
		"\7\16\7\u00c3\3\7\5\7\u00c7\n\7\7\7\u00c9\n\7\f\7\16\7\u00cc\13\7\5\7"+
		"\u00ce\n\7\3\b\3\b\7\b\u00d2\n\b\f\b\16\b\u00d5\13\b\3\b\5\b\u00d8\n\b"+
		"\3\t\3\t\5\t\u00dc\n\t\3\n\3\n\3\n\5\n\u00e1\n\n\3\13\3\13\5\13\u00e5"+
		"\n\13\3\f\3\f\5\f\u00e9\n\f\3\r\3\r\3\r\7\r\u00ee\n\r\f\r\16\r\u00f1\13"+
		"\r\3\r\3\r\3\r\5\r\u00f6\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u0100\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0108\n\20\f\20\16\20"+
		"\u010b\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0113\n\21\f\21\16\21"+
		"\u0116\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u011e\n\22\f\22\16\22"+
		"\u0121\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0129\n\23\f\23\16\23"+
		"\u012c\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0134\n\24\f\24\16\24"+
		"\u0137\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\7\25\u0148\n\25\f\25\16\25\u014b\13\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u015c"+
		"\n\26\f\26\16\26\u015f\13\26\3\27\3\27\3\27\7\27\u0164\n\27\f\27\16\27"+
		"\u0167\13\27\3\27\6\27\u016a\n\27\r\27\16\27\u016b\3\27\3\27\7\27\u0170"+
		"\n\27\f\27\16\27\u0173\13\27\3\27\5\27\u0176\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\7\30\u0181\n\30\f\30\16\30\u0184\13\30\3\31"+
		"\3\31\3\31\7\31\u0189\n\31\f\31\16\31\u018c\13\31\3\31\3\31\3\31\5\31"+
		"\u0191\n\31\5\31\u0193\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\7\32\u019e\n\32\f\32\16\32\u01a1\13\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u01af\n\33\f\33\16\33\u01b2\13"+
		"\33\3\34\7\34\u01b5\n\34\f\34\16\34\u01b8\13\34\3\34\3\34\3\35\3\35\7"+
		"\35\u01be\n\35\f\35\16\35\u01c1\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u01cb\n\36\3\37\3\37\7\37\u01cf\n\37\f\37\16\37\u01d2\13"+
		"\37\3\37\3\37\5\37\u01d6\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u01df\n \3!\3!\3"+
		"!\3!\3!\7!\u01e6\n!\f!\16!\u01e9\13!\3!\3!\3!\3!\3!\3!\5!\u01f1\n!\3\""+
		"\3\"\3#\3#\3$\3$\3%\3%\3%\5%\u01fc\n%\3&\3&\7&\u0200\n&\f&\16&\u0203\13"+
		"&\3&\3&\3&\3&\3&\3&\7&\u020b\n&\f&\16&\u020e\13&\3&\3&\5&\u0212\n&\3\'"+
		"\3\'\3\'\3\'\5\'\u0218\n\'\3\'\3\'\3\'\3\'\5\'\u021e\n\'\7\'\u0220\n\'"+
		"\f\'\16\'\u0223\13\'\3\'\3\'\3\'\3\'\5\'\u0229\n\'\5\'\u022b\n\'\3(\3"+
		"(\7(\u022f\n(\f(\16(\u0232\13(\3(\3(\3(\3(\7(\u0238\n(\f(\16(\u023b\13"+
		"(\3(\3(\5(\u023f\n(\3)\3)\3)\5)\u0244\n)\3)\7)\u0247\n)\f)\16)\u024a\13"+
		")\3)\3)\7)\u024e\n)\f)\16)\u0251\13)\3)\3)\3)\3)\3*\3*\5*\u0259\n*\3+"+
		"\3+\7+\u025d\n+\f+\16+\u0260\13+\3+\3+\3+\3+\7+\u0266\n+\f+\16+\u0269"+
		"\13+\3+\3+\5+\u026d\n+\3+\7+\u0270\n+\f+\16+\u0273\13+\3+\3+\7+\u0277"+
		"\n+\f+\16+\u027a\13+\3+\3+\5+\u027e\n+\5+\u0280\n+\3+\7+\u0283\n+\f+\16"+
		"+\u0286\13+\3+\3+\7+\u028a\n+\f+\16+\u028d\13+\3+\3+\5+\u0291\n+\5+\u0293"+
		"\n+\3,\3,\7,\u0297\n,\f,\16,\u029a\13,\3,\3,\3,\3,\5,\u02a0\n,\3,\7,\u02a3"+
		"\n,\f,\16,\u02a6\13,\3,\3,\7,\u02aa\n,\f,\16,\u02ad\13,\3,\3,\7,\u02b1"+
		"\n,\f,\16,\u02b4\13,\7,\u02b6\n,\f,\16,\u02b9\13,\3,\7,\u02bc\n,\f,\16"+
		",\u02bf\13,\3,\3,\3-\3-\7-\u02c5\n-\f-\16-\u02c8\13-\3-\3-\7-\u02cc\n"+
		"-\f-\16-\u02cf\13-\3-\7-\u02d2\n-\f-\16-\u02d5\13-\3-\7-\u02d8\n-\f-\16"+
		"-\u02db\13-\3-\3-\7-\u02df\n-\f-\16-\u02e2\13-\3-\3-\5-\u02e6\n-\3-\6"+
		"-\u02e9\n-\r-\16-\u02ea\3-\3-\7-\u02ef\n-\f-\16-\u02f2\13-\3-\3-\7-\u02f6"+
		"\n-\f-\16-\u02f9\13-\3-\3-\5-\u02fd\n-\5-\u02ff\n-\3.\3.\3.\5.\u0304\n"+
		".\3/\3/\7/\u0308\n/\f/\16/\u030b\13/\3/\3/\3\60\3\60\7\60\u0311\n\60\f"+
		"\60\16\60\u0314\13\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\7\64\u0322\n\64\f\64\16\64\u0325\13\64\3\64\3\64\3\65\3\65"+
		"\3\65\2\f\36 \"$&(*.\62\64\66\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\n\3\2\r\16\3\2\17\20"+
		"\4\2((\67\67\4\2*+:;\3\2*+\3\2<C\3\2\30\35\3\2PR\2\u0376\2y\3\2\2\2\4"+
		"|\3\2\2\2\6\u008d\3\2\2\2\b\u00a8\3\2\2\2\n\u00b5\3\2\2\2\f\u00bc\3\2"+
		"\2\2\16\u00d7\3\2\2\2\20\u00db\3\2\2\2\22\u00e0\3\2\2\2\24\u00e2\3\2\2"+
		"\2\26\u00e8\3\2\2\2\30\u00f5\3\2\2\2\32\u00f7\3\2\2\2\34\u00f9\3\2\2\2"+
		"\36\u0101\3\2\2\2 \u010c\3\2\2\2\"\u0117\3\2\2\2$\u0122\3\2\2\2&\u012d"+
		"\3\2\2\2(\u0138\3\2\2\2*\u014c\3\2\2\2,\u0160\3\2\2\2.\u0177\3\2\2\2\60"+
		"\u0185\3\2\2\2\62\u0194\3\2\2\2\64\u01a2\3\2\2\2\66\u01b6\3\2\2\28\u01bb"+
		"\3\2\2\2:\u01ca\3\2\2\2<\u01d5\3\2\2\2>\u01de\3\2\2\2@\u01f0\3\2\2\2B"+
		"\u01f2\3\2\2\2D\u01f4\3\2\2\2F\u01f6\3\2\2\2H\u01fb\3\2\2\2J\u01fd\3\2"+
		"\2\2L\u022a\3\2\2\2N\u022c\3\2\2\2P\u0240\3\2\2\2R\u0258\3\2\2\2T\u025a"+
		"\3\2\2\2V\u0294\3\2\2\2X\u02fe\3\2\2\2Z\u0303\3\2\2\2\\\u0305\3\2\2\2"+
		"^\u030e\3\2\2\2`\u0317\3\2\2\2b\u0319\3\2\2\2d\u031d\3\2\2\2f\u031f\3"+
		"\2\2\2h\u0328\3\2\2\2jl\7D\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2"+
		"np\3\2\2\2om\3\2\2\2pt\5\6\4\2qs\7D\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2"+
		"tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wm\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2"+
		"z\3\3\2\2\2{y\3\2\2\2|}\7\6\2\2}\u0080\7K\2\2~\177\7\21\2\2\177\u0081"+
		"\5`\61\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u008b\3\2\2\2\u0082"+
		"\u0086\5d\63\2\u0083\u0085\7D\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\5\34\17\2\u008a\u008c\3\2\2\2\u008b\u0082\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\5\3\2\2\2\u008d\u008e\79\2\2\u008e\u008f"+
		"\5B\"\2\u008f\u0098\7\23\2\2\u0090\u0095\5b\62\2\u0091\u0092\7\22\2\2"+
		"\u0092\u0094\5b\62\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0090\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009e\7\24"+
		"\2\2\u009b\u009d\7D\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\5\b\5\2\u00a2\7\3\2\2\2\u00a3\u00a4\7\21\2\2\u00a4\u00a6"+
		"\5`\61\2\u00a5\u00a7\7\25\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad"+
		"\3\2\2\2\u00aa\u00ac\7D\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b3\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b4\5\n\6\2\u00b1\u00b2\7\30\2\2\u00b2\u00b4\5\34\17\2\u00b3"+
		"\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\t\3\2\2\2\u00b5\u00b6\7\26\2"+
		"\2\u00b6\u00b7\5\f\7\2\u00b7\u00b8\7\27\2\2\u00b8\13\3\2\2\2\u00b9\u00bb"+
		"\7D\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00cd\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00ca\5\16"+
		"\b\2\u00c0\u00c2\7D\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7\5\16"+
		"\b\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c1\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00bf\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\r\3\2\2\2\u00cf\u00d8\5\20\t\2\u00d0\u00d2\7D\2\2"+
		"\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8\5\22\n\2"+
		"\u00d7\u00cf\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d8\17\3\2\2\2\u00d9\u00dc"+
		"\5\6\4\2\u00da\u00dc\5\4\3\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\21\3\2\2\2\u00dd\u00e1\5\26\f\2\u00de\u00e1\5F$\2\u00df\u00e1\5\24\13"+
		"\2\u00e0\u00dd\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\23"+
		"\3\2\2\2\u00e2\u00e4\7\7\2\2\u00e3\u00e5\5\26\f\2\u00e4\u00e3\3\2\2\2"+
		"\u00e4\u00e5\3\2\2\2\u00e5\25\3\2\2\2\u00e6\u00e9\5\34\17\2\u00e7\u00e9"+
		"\5\30\r\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\27\3\2\2\2\u00ea"+
		"\u00eb\5\32\16\2\u00eb\u00ef\5d\63\2\u00ec\u00ee\7D\2\2\u00ed\u00ec\3"+
		"\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\5\34\17\2\u00f3\u00f6\3"+
		"\2\2\2\u00f4\u00f6\5\4\3\2\u00f5\u00ea\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\31\3\2\2\2\u00f7\u00f8\58\35\2\u00f8\33\3\2\2\2\u00f9\u00ff\5\36\20\2"+
		"\u00fa\u00fb\7\25\2\2\u00fb\u00fc\5\34\17\2\u00fc\u00fd\7\21\2\2\u00fd"+
		"\u00fe\5\34\17\2\u00fe\u0100\3\2\2\2\u00ff\u00fa\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\35\3\2\2\2\u0101\u0102\b\20\1\2\u0102\u0103\5 \21\2\u0103"+
		"\u0109\3\2\2\2\u0104\u0105\f\3\2\2\u0105\u0106\7\b\2\2\u0106\u0108\5 "+
		"\21\2\u0107\u0104\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\37\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\b\21\1"+
		"\2\u010d\u010e\5\"\22\2\u010e\u0114\3\2\2\2\u010f\u0110\f\3\2\2\u0110"+
		"\u0111\7\t\2\2\u0111\u0113\5\"\22\2\u0112\u010f\3\2\2\2\u0113\u0116\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115!\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0117\u0118\b\22\1\2\u0118\u0119\5$\23\2\u0119\u011f\3\2\2\2"+
		"\u011a\u011b\f\3\2\2\u011b\u011c\7\n\2\2\u011c\u011e\5$\23\2\u011d\u011a"+
		"\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"#\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\b\23\1\2\u0123\u0124\5&\24\2"+
		"\u0124\u012a\3\2\2\2\u0125\u0126\f\3\2\2\u0126\u0127\7\f\2\2\u0127\u0129"+
		"\5&\24\2\u0128\u0125\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b%\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\b\24\1\2"+
		"\u012e\u012f\5(\25\2\u012f\u0135\3\2\2\2\u0130\u0131\f\3\2\2\u0131\u0132"+
		"\7\13\2\2\u0132\u0134\5(\25\2\u0133\u0130\3\2\2\2\u0134\u0137\3\2\2\2"+
		"\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\'\3\2\2\2\u0137\u0135\3"+
		"\2\2\2\u0138\u0139\b\25\1\2\u0139\u013a\5*\26\2\u013a\u0149\3\2\2\2\u013b"+
		"\u013c\f\6\2\2\u013c\u013d\7!\2\2\u013d\u0148\5*\26\2\u013e\u013f\f\5"+
		"\2\2\u013f\u0140\7\"\2\2\u0140\u0148\5*\26\2\u0141\u0142\f\4\2\2\u0142"+
		"\u0143\7#\2\2\u0143\u0148\5*\26\2\u0144\u0145\f\3\2\2\u0145\u0146\7 \2"+
		"\2\u0146\u0148\5*\26\2\u0147\u013b\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u0141"+
		"\3\2\2\2\u0147\u0144\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a)\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\b\26\1\2"+
		"\u014d\u014e\5,\27\2\u014e\u015d\3\2\2\2\u014f\u0150\f\6\2\2\u0150\u0151"+
		"\7\61\2\2\u0151\u015c\5,\27\2\u0152\u0153\f\5\2\2\u0153\u0154\7\62\2\2"+
		"\u0154\u015c\5,\27\2\u0155\u0156\f\4\2\2\u0156\u0157\7\63\2\2\u0157\u015c"+
		"\5,\27\2\u0158\u0159\f\3\2\2\u0159\u015a\7\64\2\2\u015a\u015c\5,\27\2"+
		"\u015b\u014f\3\2\2\2\u015b\u0152\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u0158"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"+\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0175\5.\30\2\u0161\u0165\t\2\2\2"+
		"\u0162\u0164\7D\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u016a\5.\30\2\u0169\u0161\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\u0176\3\2\2\2\u016d\u0171\t\3\2\2\u016e"+
		"\u0170\7D\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0176\5`\61\2\u0175\u0169\3\2\2\2\u0175\u016d\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176-\3\2\2\2\u0177\u0178\b\30\1\2\u0178\u0179\5\60\31\2\u0179\u0182"+
		"\3\2\2\2\u017a\u017b\f\4\2\2\u017b\u017c\7\65\2\2\u017c\u0181\5\60\31"+
		"\2\u017d\u017e\f\3\2\2\u017e\u017f\7\66\2\2\u017f\u0181\5\60\31\2\u0180"+
		"\u017a\3\2\2\2\u0180\u017d\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183/\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0192"+
		"\5\62\32\2\u0186\u018a\t\4\2\2\u0187\u0189\7D\2\2\u0188\u0187\3\2\2\2"+
		"\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0190\5\62\32\2\u018e\u018f\78\2\2"+
		"\u018f\u0191\5\62\32\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193"+
		"\3\2\2\2\u0192\u0186\3\2\2\2\u0192\u0193\3\2\2\2\u0193\61\3\2\2\2\u0194"+
		"\u0195\b\32\1\2\u0195\u0196\5\64\33\2\u0196\u019f\3\2\2\2\u0197\u0198"+
		"\f\4\2\2\u0198\u0199\7;\2\2\u0199\u019e\5\64\33\2\u019a\u019b\f\3\2\2"+
		"\u019b\u019c\7:\2\2\u019c\u019e\5\64\33\2\u019d\u0197\3\2\2\2\u019d\u019a"+
		"\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\63\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\b\33\1\2\u01a3\u01a4\5\66"+
		"\34\2\u01a4\u01b0\3\2\2\2\u01a5\u01a6\f\5\2\2\u01a6\u01a7\7%\2\2\u01a7"+
		"\u01af\5\66\34\2\u01a8\u01a9\f\4\2\2\u01a9\u01aa\7&\2\2\u01aa\u01af\5"+
		"\66\34\2\u01ab\u01ac\f\3\2\2\u01ac\u01ad\7\'\2\2\u01ad\u01af\5\66\34\2"+
		"\u01ae\u01a5\3\2\2\2\u01ae\u01a8\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b2"+
		"\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\65\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01b5\t\5\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2"+
		"\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01ba\58\35\2\u01ba\67\3\2\2\2\u01bb\u01bf\5:\36"+
		"\2\u01bc\u01be\5<\37\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c09\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01cb\5> \2\u01c3\u01cb\7K\2\2\u01c4\u01c5\7\23\2\2\u01c5\u01c6\5\26"+
		"\f\2\u01c6\u01c7\7\24\2\2\u01c7\u01cb\3\2\2\2\u01c8\u01cb\5@!\2\u01c9"+
		"\u01cb\5R*\2\u01ca\u01c2\3\2\2\2\u01ca\u01c3\3\2\2\2\u01ca\u01c4\3\2\2"+
		"\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb;\3\2\2\2\u01cc\u01d6"+
		"\t\6\2\2\u01cd\u01cf\7D\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2"+
		"\2\2\u01d3\u01d4\7\37\2\2\u01d4\u01d6\58\35\2\u01d5\u01cc\3\2\2\2\u01d5"+
		"\u01d0\3\2\2\2\u01d6=\3\2\2\2\u01d7\u01df\7E\2\2\u01d8\u01df\7J\2\2\u01d9"+
		"\u01df\7F\2\2\u01da\u01df\7H\2\2\u01db\u01df\7I\2\2\u01dc\u01df\7G\2\2"+
		"\u01dd\u01df\5f\64\2\u01de\u01d7\3\2\2\2\u01de\u01d8\3\2\2\2\u01de\u01d9"+
		"\3\2\2\2\u01de\u01da\3\2\2\2\u01de\u01db\3\2\2\2\u01de\u01dc\3\2\2\2\u01de"+
		"\u01dd\3\2\2\2\u01df?\3\2\2\2\u01e0\u01e1\5B\"\2\u01e1\u01e2\7\23\2\2"+
		"\u01e2\u01e7\5D#\2\u01e3\u01e4\7\22\2\2\u01e4\u01e6\5D#\2\u01e5\u01e3"+
		"\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb\7\24\2\2\u01eb\u01f1\3"+
		"\2\2\2\u01ec\u01ed\5B\"\2\u01ed\u01ee\7\23\2\2\u01ee\u01ef\7\24\2\2\u01ef"+
		"\u01f1\3\2\2\2\u01f0\u01e0\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f1A\3\2\2\2"+
		"\u01f2\u01f3\7K\2\2\u01f3C\3\2\2\2\u01f4\u01f5\5\32\16\2\u01f5E\3\2\2"+
		"\2\u01f6\u01f7\5H%\2\u01f7G\3\2\2\2\u01f8\u01fc\5J&\2\u01f9\u01fc\5N("+
		"\2\u01fa\u01fc\5P)\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa"+
		"\3\2\2\2\u01fcI\3\2\2\2\u01fd\u0201\7,\2\2\u01fe\u0200\7D\2\2\u01ff\u01fe"+
		"\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7\23\2\2\u0205\u0206\5"+
		"L\'\2\u0206\u0207\t\2\2\2\u0207\u0208\5\26\f\2\u0208\u020c\7\24\2\2\u0209"+
		"\u020b\7D\2\2\u020a\u0209\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u0211\3\2\2\2\u020e\u020c\3\2\2\2\u020f"+
		"\u0212\5\n\6\2\u0210\u0212\5\22\n\2\u0211\u020f\3\2\2\2\u0211\u0210\3"+
		"\2\2\2\u0211\u0212\3\2\2\2\u0212K\3\2\2\2\u0213\u0214\7\23\2\2\u0214\u0217"+
		"\7K\2\2\u0215\u0216\7\21\2\2\u0216\u0218\5`\61\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u0221\3\2\2\2\u0219\u021a\7\22\2\2\u021a\u021d\7"+
		"K\2\2\u021b\u021c\7\21\2\2\u021c\u021e\5`\61\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u0219\3\2\2\2\u0220\u0223\3\2"+
		"\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0224\u022b\7\24\2\2\u0225\u0228\7K\2\2\u0226\u0227\7\21"+
		"\2\2\u0227\u0229\5`\61\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022b\3\2\2\2\u022a\u0213\3\2\2\2\u022a\u0225\3\2\2\2\u022bM\3\2\2\2"+
		"\u022c\u0230\7-\2\2\u022d\u022f\7D\2\2\u022e\u022d\3\2\2\2\u022f\u0232"+
		"\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232"+
		"\u0230\3\2\2\2\u0233\u0234\7\23\2\2\u0234\u0235\5\26\f\2\u0235\u0239\7"+
		"\24\2\2\u0236\u0238\7D\2\2\u0237\u0236\3\2\2\2\u0238\u023b\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023e\3\2\2\2\u023b\u0239\3\2"+
		"\2\2\u023c\u023f\5\n\6\2\u023d\u023f\5\22\n\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023fO\3\2\2\2\u0240\u0243\7\36\2\2"+
		"\u0241\u0244\5\n\6\2\u0242\u0244\5\22\n\2\u0243\u0241\3\2\2\2\u0243\u0242"+
		"\3\2\2\2\u0244\u0248\3\2\2\2\u0245\u0247\7D\2\2\u0246\u0245\3\2\2\2\u0247"+
		"\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2"+
		"\2\2\u024a\u0248\3\2\2\2\u024b\u024f\7-\2\2\u024c\u024e\7D\2\2\u024d\u024c"+
		"\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u0252\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0253\7\23\2\2\u0253\u0254\5"+
		"\26\f\2\u0254\u0255\7\24\2\2\u0255Q\3\2\2\2\u0256\u0259\5T+\2\u0257\u0259"+
		"\5V,\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259S\3\2\2\2\u025a\u025e"+
		"\7.\2\2\u025b\u025d\7D\2\2\u025c\u025b\3\2\2\2\u025d\u0260\3\2\2\2\u025e"+
		"\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u025e\3\2"+
		"\2\2\u0261\u0262\7\23\2\2\u0262\u0263\5\26\f\2\u0263\u0267\7\24\2\2\u0264"+
		"\u0266\7D\2\2\u0265\u0264\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2"+
		"\2\2\u0267\u0268\3\2\2\2\u0268\u026c\3\2\2\2\u0269\u0267\3\2\2\2\u026a"+
		"\u026d\5\n\6\2\u026b\u026d\5\22\n\2\u026c\u026a\3\2\2\2\u026c\u026b\3"+
		"\2\2\2\u026c\u026d\3\2\2\2\u026d\u027f\3\2\2\2\u026e\u0270\7D\2\2\u026f"+
		"\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2"+
		"\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0278\7\60\2\2\u0275"+
		"\u0277\7D\2\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u027d\3\2\2\2\u027a\u0278\3\2\2\2\u027b"+
		"\u027e\5\n\6\2\u027c\u027e\5\22\n\2\u027d\u027b\3\2\2\2\u027d\u027c\3"+
		"\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u0271\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0292\3\2\2\2\u0281\u0283\7D\2\2\u0282\u0281\3\2"+
		"\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u028b\7/\2\2\u0288\u028a\7D\2"+
		"\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c"+
		"\3\2\2\2\u028c\u0290\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0291\5\n\6\2\u028f"+
		"\u0291\5\22\n\2\u0290\u028e\3\2\2\2\u0290\u028f\3\2\2\2\u0290\u0291\3"+
		"\2\2\2\u0291\u0293\3\2\2\2\u0292\u0284\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"U\3\2\2\2\u0294\u0298\7)\2\2\u0295\u0297\7D\2\2\u0296\u0295\3\2\2\2\u0297"+
		"\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029f\3\2"+
		"\2\2\u029a\u0298\3\2\2\2\u029b\u029c\7\23\2\2\u029c\u029d\5\26\f\2\u029d"+
		"\u029e\7\24\2\2\u029e\u02a0\3\2\2\2\u029f\u029b\3\2\2\2\u029f\u02a0\3"+
		"\2\2\2\u02a0\u02a4\3\2\2\2\u02a1\u02a3\7D\2\2\u02a2\u02a1\3\2\2\2\u02a3"+
		"\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\3\2"+
		"\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02ab\7\26\2\2\u02a8\u02aa\7D\2\2\u02a9"+
		"\u02a8\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2"+
		"\2\2\u02ac\u02b7\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b2\5X-\2\u02af\u02b1"+
		"\7D\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02ae\3\2"+
		"\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02bd\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bc\7D\2\2\u02bb\u02ba\3\2"+
		"\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c0\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\7\27\2\2\u02c1W\3\2\2\2"+
		"\u02c2\u02d3\5Z.\2\u02c3\u02c5\7D\2\2\u02c4\u02c3\3\2\2\2\u02c5\u02c8"+
		"\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c9\u02cd\7\22\2\2\u02ca\u02cc\7D\2\2\u02cb\u02ca\3\2"+
		"\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d2\5Z.\2\u02d1\u02c6\3\2\2"+
		"\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d9"+
		"\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d6\u02d8\7D\2\2\u02d7\u02d6\3\2\2\2\u02d8"+
		"\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2"+
		"\2\2\u02db\u02d9\3\2\2\2\u02dc\u02e0\7$\2\2\u02dd\u02df\7D\2\2\u02de\u02dd"+
		"\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02e5\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e6\5\n\6\2\u02e4\u02e6\5\22"+
		"\n\2\u02e5\u02e3\3\2\2\2\u02e5\u02e4\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7"+
		"\u02e9\7D\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2"+
		"\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ff\3\2\2\2\u02ec\u02f0\7/\2\2\u02ed"+
		"\u02ef\7D\2\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02ee\3\2"+
		"\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f3"+
		"\u02f7\7$\2\2\u02f4\u02f6\7D\2\2\u02f5\u02f4\3\2\2\2\u02f6\u02f9\3\2\2"+
		"\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fc\3\2\2\2\u02f9\u02f7"+
		"\3\2\2\2\u02fa\u02fd\5\n\6\2\u02fb\u02fd\5\22\n\2\u02fc\u02fa\3\2\2\2"+
		"\u02fc\u02fb\3\2\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02c2\3\2\2\2\u02fe\u02ec"+
		"\3\2\2\2\u02ffY\3\2\2\2\u0300\u0304\5\26\f\2\u0301\u0304\5\\/\2\u0302"+
		"\u0304\5^\60\2\u0303\u0300\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0302\3\2"+
		"\2\2\u0304[\3\2\2\2\u0305\u0309\t\2\2\2\u0306\u0308\7D\2\2\u0307\u0306"+
		"\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030c\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u030d\5\26\f\2\u030d]\3\2\2\2"+
		"\u030e\u0312\t\3\2\2\u030f\u0311\7D\2\2\u0310\u030f\3\2\2\2\u0311\u0314"+
		"\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0315\u0316\5`\61\2\u0316_\3\2\2\2\u0317\u0318\t\7\2\2"+
		"\u0318a\3\2\2\2\u0319\u031a\7K\2\2\u031a\u031b\7\21\2\2\u031b\u031c\5"+
		"`\61\2\u031cc\3\2\2\2\u031d\u031e\t\b\2\2\u031ee\3\2\2\2\u031f\u0323\7"+
		"M\2\2\u0320\u0322\5h\65\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2\2\2\u0323"+
		"\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2\2\2\u0325\u0323\3\2"+
		"\2\2\u0326\u0327\7O\2\2\u0327g\3\2\2\2\u0328\u0329\t\t\2\2\u0329i\3\2"+
		"\2\2lmty\u0080\u0086\u008b\u0095\u0098\u009e\u00a6\u00a8\u00ad\u00b3\u00bc"+
		"\u00c3\u00c6\u00ca\u00cd\u00d3\u00d7\u00db\u00e0\u00e4\u00e8\u00ef\u00f5"+
		"\u00ff\u0109\u0114\u011f\u012a\u0135\u0147\u0149\u015b\u015d\u0165\u016b"+
		"\u0171\u0175\u0180\u0182\u018a\u0190\u0192\u019d\u019f\u01ae\u01b0\u01b6"+
		"\u01bf\u01ca\u01d0\u01d5\u01de\u01e7\u01f0\u01fb\u0201\u020c\u0211\u0217"+
		"\u021d\u0221\u0228\u022a\u0230\u0239\u023e\u0243\u0248\u024f\u0258\u025e"+
		"\u0267\u026c\u0271\u0278\u027d\u027f\u0284\u028b\u0290\u0292\u0298\u029f"+
		"\u02a4\u02ab\u02b2\u02b7\u02bd\u02c6\u02cd\u02d3\u02d9\u02e0\u02e5\u02ea"+
		"\u02f0\u02f7\u02fc\u02fe\u0303\u0309\u0312\u0323";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}