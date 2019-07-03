// Generated from /Users/haseongjun/project/antlr_miniKotlin/KotlinLex.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KotlinLex extends Lexer {
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
		EnterString=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "EnterString"
	};

	public static final String[] ruleNames = {
		"StringExpr", "Escape", "FieldID", "VAR", "RETURN", "LOGICAL_OR", "LOGICAL_AND", 
		"BIT_OR", "BIT_AND", "BIT_XOR", "INOP", "NOTIN", "ISOP", "NOTIS", "COLON", 
		"COMM", "LPAR", "RPAR", "QUESTION", "LCURL", "RCURL", "EQ", "PLUSEQ", 
		"MINUSEQ", "MULTEQ", "DIVEQ", "QEQ", "DO", "DOT", "EQUAL_R", "EQUAL", 
		"NOT_EQUAL", "NOT_EQUAL_R", "ARROW", "DIV", "MUL", "QUAT", "RANGE_OP", 
		"WHEN", "INC", "DEC", "FOR", "WHILE", "IF", "ELSE", "ELSE_IF", "GT", "LT", 
		"GTE", "LTE", "SHIFT_R", "SHIFT_L", "DOWN_TO", "STEP", "FUNC", "MINUS", 
		"PLUS", "TYPE_INT", "TYPE_STRING", "TYPE_FLOAT", "TYPE_ANY", "TYPE_Double", 
		"TYPE_Long", "TYPE_SHORT", "TYPE_BYTE", "NL", "INT", "BOOL", "LONG", "HEXA", 
		"BINARY", "REAL", "ID", "WS", "Q_OPEN", "FieldIdentifier", "Q_CLOSE", 
		"LineStrRef", "LineStrText", "LineStrEscapedChar"
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


	public KotlinLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KotlinLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u01fb\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00b4\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\38\38\39\3"+
		"9\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3"+
		">\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3"+
		"B\3C\3C\3C\5C\u0194\nC\3D\6D\u0197\nD\rD\16D\u0198\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\5E\u01a4\nE\3F\6F\u01a7\nF\rF\16F\u01a8\3F\3F\3G\3G\3G\3G\6G\u01b1"+
		"\nG\rG\16G\u01b2\3H\3H\3H\3H\6H\u01b9\nH\rH\16H\u01ba\3I\6I\u01be\nI\r"+
		"I\16I\u01bf\3I\3I\6I\u01c4\nI\rI\16I\u01c5\3I\3I\6I\u01ca\nI\rI\16I\u01cb"+
		"\3I\7I\u01cf\nI\fI\16I\u01d2\13I\5I\u01d4\nI\3J\3J\7J\u01d8\nJ\fJ\16J"+
		"\u01db\13J\3K\6K\u01de\nK\rK\16K\u01df\3K\3K\3L\3L\3L\3L\3M\3M\3M\3N\3"+
		"N\3N\3N\3O\3O\3P\6P\u01f2\nP\rP\16P\u01f3\3P\5P\u01f7\nP\3Q\3Q\3Q\2\2"+
		"R\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20"+
		" \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<\37"+
		"> @!B\"D#F$H%J&L\'N(P)R*T+V,X-Z.\\/^\60`\61b\62d\63f\64h\65j\66l\67n8"+
		"p9r:t;v<x=z>|?~@\u0080A\u0082B\u0084C\u0086D\u0088E\u008aF\u008cG\u008e"+
		"H\u0090I\u0092J\u0094K\u0096L\u0098M\u009aN\u009cO\u009eP\u00a0Q\u00a2"+
		"R\4\2\3\f\3\2c|\3\2\62;\4\2\62;CH\4\2\62\63~~\3\2\63;\5\2C\\aac|\6\2\62"+
		";C\\aac|\5\2\13\13\16\16\"\"\5\2$$&&^^\5\2ddppvv\2\u0209\2\4\3\2\2\2\2"+
		"\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2"+
		"\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2"+
		"\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2"+
		"\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2"+
		"\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2"+
		"\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L"+
		"\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2"+
		"\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2"+
		"\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2"+
		"r\3\2\2\2\2t\3\2\2\2\2v\3\2\2\2\2x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3"+
		"\2\2\2\2\u0080\3\2\2\2\2\u0082\3\2\2\2\2\u0084\3\2\2\2\2\u0086\3\2\2\2"+
		"\2\u0088\3\2\2\2\2\u008a\3\2\2\2\2\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090"+
		"\3\2\2\2\2\u0092\3\2\2\2\2\u0094\3\2\2\2\2\u0096\3\2\2\2\2\u0098\3\2\2"+
		"\2\2\u009a\3\2\2\2\3\u009c\3\2\2\2\3\u009e\3\2\2\2\3\u00a0\3\2\2\2\3\u00a2"+
		"\3\2\2\2\4\u00a4\3\2\2\2\6\u00a7\3\2\2\2\b\u00aa\3\2\2\2\n\u00b3\3\2\2"+
		"\2\f\u00b5\3\2\2\2\16\u00bc\3\2\2\2\20\u00bf\3\2\2\2\22\u00c2\3\2\2\2"+
		"\24\u00c5\3\2\2\2\26\u00c9\3\2\2\2\30\u00cd\3\2\2\2\32\u00d0\3\2\2\2\34"+
		"\u00d4\3\2\2\2\36\u00d7\3\2\2\2 \u00db\3\2\2\2\"\u00dd\3\2\2\2$\u00df"+
		"\3\2\2\2&\u00e1\3\2\2\2(\u00e3\3\2\2\2*\u00e5\3\2\2\2,\u00e7\3\2\2\2."+
		"\u00e9\3\2\2\2\60\u00eb\3\2\2\2\62\u00ee\3\2\2\2\64\u00f1\3\2\2\2\66\u00f4"+
		"\3\2\2\28\u00f7\3\2\2\2:\u00fa\3\2\2\2<\u00fd\3\2\2\2>\u00ff\3\2\2\2@"+
		"\u0103\3\2\2\2B\u0106\3\2\2\2D\u0109\3\2\2\2F\u010d\3\2\2\2H\u0110\3\2"+
		"\2\2J\u0112\3\2\2\2L\u0114\3\2\2\2N\u0116\3\2\2\2P\u0119\3\2\2\2R\u011e"+
		"\3\2\2\2T\u0121\3\2\2\2V\u0124\3\2\2\2X\u0128\3\2\2\2Z\u012e\3\2\2\2\\"+
		"\u0131\3\2\2\2^\u0136\3\2\2\2`\u013e\3\2\2\2b\u0140\3\2\2\2d\u0142\3\2"+
		"\2\2f\u0145\3\2\2\2h\u0148\3\2\2\2j\u014c\3\2\2\2l\u0150\3\2\2\2n\u0157"+
		"\3\2\2\2p\u015c\3\2\2\2r\u0160\3\2\2\2t\u0162\3\2\2\2v\u0164\3\2\2\2x"+
		"\u0168\3\2\2\2z\u016f\3\2\2\2|\u0175\3\2\2\2~\u0179\3\2\2\2\u0080\u0180"+
		"\3\2\2\2\u0082\u0185\3\2\2\2\u0084\u018b\3\2\2\2\u0086\u0193\3\2\2\2\u0088"+
		"\u0196\3\2\2\2\u008a\u01a3\3\2\2\2\u008c\u01a6\3\2\2\2\u008e\u01ac\3\2"+
		"\2\2\u0090\u01b4\3\2\2\2\u0092\u01bd\3\2\2\2\u0094\u01d5\3\2\2\2\u0096"+
		"\u01dd\3\2\2\2\u0098\u01e3\3\2\2\2\u009a\u01e7\3\2\2\2\u009c\u01ea\3\2"+
		"\2\2\u009e\u01ee\3\2\2\2\u00a0\u01f6\3\2\2\2\u00a2\u01f8\3\2\2\2\u00a4"+
		"\u00a5\7&\2\2\u00a5\u00a6\7}\2\2\u00a6\5\3\2\2\2\u00a7\u00a8\7^\2\2\u00a8"+
		"\u00a9\t\2\2\2\u00a9\7\3\2\2\2\u00aa\u00ab\7&\2\2\u00ab\u00ac\5\u0094"+
		"J\2\u00ac\t\3\2\2\2\u00ad\u00ae\7x\2\2\u00ae\u00af\7c\2\2\u00af\u00b4"+
		"\7t\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b4\7n\2\2\u00b3"+
		"\u00ad\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\13\3\2\2\2\u00b5\u00b6\7t\2\2"+
		"\u00b6\u00b7\7g\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7w\2\2\u00b9\u00ba"+
		"\7t\2\2\u00ba\u00bb\7p\2\2\u00bb\r\3\2\2\2\u00bc\u00bd\7~\2\2\u00bd\u00be"+
		"\7~\2\2\u00be\17\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0\u00c1\7(\2\2\u00c1\21"+
		"\3\2\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7t\2\2\u00c4\23\3\2\2\2\u00c5"+
		"\u00c6\7c\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7f\2\2\u00c8\25\3\2\2\2\u00c9"+
		"\u00ca\7z\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7t\2\2\u00cc\27\3\2\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\31\3\2\2\2\u00d0\u00d1\7#\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\7k\2\2\u00d5"+
		"\u00d6\7u\2\2\u00d6\35\3\2\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9\7k\2\2\u00d9"+
		"\u00da\7u\2\2\u00da\37\3\2\2\2\u00db\u00dc\7<\2\2\u00dc!\3\2\2\2\u00dd"+
		"\u00de\7.\2\2\u00de#\3\2\2\2\u00df\u00e0\7*\2\2\u00e0%\3\2\2\2\u00e1\u00e2"+
		"\7+\2\2\u00e2\'\3\2\2\2\u00e3\u00e4\7A\2\2\u00e4)\3\2\2\2\u00e5\u00e6"+
		"\7}\2\2\u00e6+\3\2\2\2\u00e7\u00e8\7\177\2\2\u00e8-\3\2\2\2\u00e9\u00ea"+
		"\7?\2\2\u00ea/\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec\u00ed\7?\2\2\u00ed\61"+
		"\3\2\2\2\u00ee\u00ef\7/\2\2\u00ef\u00f0\7?\2\2\u00f0\63\3\2\2\2\u00f1"+
		"\u00f2\7,\2\2\u00f2\u00f3\7?\2\2\u00f3\65\3\2\2\2\u00f4\u00f5\7\61\2\2"+
		"\u00f5\u00f6\7?\2\2\u00f6\67\3\2\2\2\u00f7\u00f8\7\'\2\2\u00f8\u00f9\7"+
		"?\2\2\u00f99\3\2\2\2\u00fa\u00fb\7f\2\2\u00fb\u00fc\7q\2\2\u00fc;\3\2"+
		"\2\2\u00fd\u00fe\7\60\2\2\u00fe=\3\2\2\2\u00ff\u0100\7?\2\2\u0100\u0101"+
		"\7?\2\2\u0101\u0102\7?\2\2\u0102?\3\2\2\2\u0103\u0104\7?\2\2\u0104\u0105"+
		"\7?\2\2\u0105A\3\2\2\2\u0106\u0107\7#\2\2\u0107\u0108\7?\2\2\u0108C\3"+
		"\2\2\2\u0109\u010a\7#\2\2\u010a\u010b\7?\2\2\u010b\u010c\7?\2\2\u010c"+
		"E\3\2\2\2\u010d\u010e\7/\2\2\u010e\u010f\7@\2\2\u010fG\3\2\2\2\u0110\u0111"+
		"\7\61\2\2\u0111I\3\2\2\2\u0112\u0113\7,\2\2\u0113K\3\2\2\2\u0114\u0115"+
		"\7\'\2\2\u0115M\3\2\2\2\u0116\u0117\7\60\2\2\u0117\u0118\7\60\2\2\u0118"+
		"O\3\2\2\2\u0119\u011a\7y\2\2\u011a\u011b\7j\2\2\u011b\u011c\7g\2\2\u011c"+
		"\u011d\7p\2\2\u011dQ\3\2\2\2\u011e\u011f\7-\2\2\u011f\u0120\7-\2\2\u0120"+
		"S\3\2\2\2\u0121\u0122\7/\2\2\u0122\u0123\7/\2\2\u0123U\3\2\2\2\u0124\u0125"+
		"\7h\2\2\u0125\u0126\7q\2\2\u0126\u0127\7t\2\2\u0127W\3\2\2\2\u0128\u0129"+
		"\7y\2\2\u0129\u012a\7j\2\2\u012a\u012b\7k\2\2\u012b\u012c\7n\2\2\u012c"+
		"\u012d\7g\2\2\u012dY\3\2\2\2\u012e\u012f\7k\2\2\u012f\u0130\7h\2\2\u0130"+
		"[\3\2\2\2\u0131\u0132\7g\2\2\u0132\u0133\7n\2\2\u0133\u0134\7u\2\2\u0134"+
		"\u0135\7g\2\2\u0135]\3\2\2\2\u0136\u0137\7g\2\2\u0137\u0138\7n\2\2\u0138"+
		"\u0139\7u\2\2\u0139\u013a\7g\2\2\u013a\u013b\7\"\2\2\u013b\u013c\7k\2"+
		"\2\u013c\u013d\7h\2\2\u013d_\3\2\2\2\u013e\u013f\7@\2\2\u013fa\3\2\2\2"+
		"\u0140\u0141\7>\2\2\u0141c\3\2\2\2\u0142\u0143\7@\2\2\u0143\u0144\7?\2"+
		"\2\u0144e\3\2\2\2\u0145\u0146\7>\2\2\u0146\u0147\7?\2\2\u0147g\3\2\2\2"+
		"\u0148\u0149\7u\2\2\u0149\u014a\7j\2\2\u014a\u014b\7t\2\2\u014bi\3\2\2"+
		"\2\u014c\u014d\7u\2\2\u014d\u014e\7j\2\2\u014e\u014f\7n\2\2\u014fk\3\2"+
		"\2\2\u0150\u0151\7f\2\2\u0151\u0152\7q\2\2\u0152\u0153\7y\2\2\u0153\u0154"+
		"\7p\2\2\u0154\u0155\7V\2\2\u0155\u0156\7q\2\2\u0156m\3\2\2\2\u0157\u0158"+
		"\7u\2\2\u0158\u0159\7v\2\2\u0159\u015a\7g\2\2\u015a\u015b\7r\2\2\u015b"+
		"o\3\2\2\2\u015c\u015d\7h\2\2\u015d\u015e\7w\2\2\u015e\u015f\7p\2\2\u015f"+
		"q\3\2\2\2\u0160\u0161\7/\2\2\u0161s\3\2\2\2\u0162\u0163\7-\2\2\u0163u"+
		"\3\2\2\2\u0164\u0165\7K\2\2\u0165\u0166\7p\2\2\u0166\u0167\7v\2\2\u0167"+
		"w\3\2\2\2\u0168\u0169\7U\2\2\u0169\u016a\7v\2\2\u016a\u016b\7t\2\2\u016b"+
		"\u016c\7k\2\2\u016c\u016d\7p\2\2\u016d\u016e\7i\2\2\u016ey\3\2\2\2\u016f"+
		"\u0170\7H\2\2\u0170\u0171\7n\2\2\u0171\u0172\7q\2\2\u0172\u0173\7c\2\2"+
		"\u0173\u0174\7v\2\2\u0174{\3\2\2\2\u0175\u0176\7C\2\2\u0176\u0177\7p\2"+
		"\2\u0177\u0178\7{\2\2\u0178}\3\2\2\2\u0179\u017a\7F\2\2\u017a\u017b\7"+
		"q\2\2\u017b\u017c\7w\2\2\u017c\u017d\7d\2\2\u017d\u017e\7n\2\2\u017e\u017f"+
		"\7g\2\2\u017f\177\3\2\2\2\u0180\u0181\7N\2\2\u0181\u0182\7q\2\2\u0182"+
		"\u0183\7p\2\2\u0183\u0184\7i\2\2\u0184\u0081\3\2\2\2\u0185\u0186\7U\2"+
		"\2\u0186\u0187\7j\2\2\u0187\u0188\7q\2\2\u0188\u0189\7t\2\2\u0189\u018a"+
		"\7v\2\2\u018a\u0083\3\2\2\2\u018b\u018c\7D\2\2\u018c\u018d\7{\2\2\u018d"+
		"\u018e\7v\2\2\u018e\u018f\7g\2\2\u018f\u0085\3\2\2\2\u0190\u0194\7\f\2"+
		"\2\u0191\u0192\7\17\2\2\u0192\u0194\7\f\2\2\u0193\u0190\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0194\u0087\3\2\2\2\u0195\u0197\t\3\2\2\u0196\u0195\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u0089\3\2\2\2\u019a\u019b\7v\2\2\u019b\u019c\7t\2\2\u019c\u019d\7w\2"+
		"\2\u019d\u01a4\7g\2\2\u019e\u019f\7h\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1"+
		"\7n\2\2\u01a1\u01a2\7g\2\2\u01a2\u01a4\7u\2\2\u01a3\u019a\3\2\2\2\u01a3"+
		"\u019e\3\2\2\2\u01a4\u008b\3\2\2\2\u01a5\u01a7\t\3\2\2\u01a6\u01a5\3\2"+
		"\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\7N\2\2\u01ab\u008d\3\2\2\2\u01ac\u01ad\7\62"+
		"\2\2\u01ad\u01ae\7z\2\2\u01ae\u01b0\3\2\2\2\u01af\u01b1\t\4\2\2\u01b0"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3\u008f\3\2\2\2\u01b4\u01b5\7\62\2\2\u01b5\u01b6\7d\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b9\t\5\2\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u0091\3\2\2\2\u01bc"+
		"\u01be\t\3\2\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\7\60\2\2\u01c2"+
		"\u01c4\t\3\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01d3\3\2\2\2\u01c7\u01c9\7g\2\2\u01c8"+
		"\u01ca\t\6\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01cf\t\3\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01c7\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u0093\3\2\2\2\u01d5\u01d9\t\7\2\2\u01d6\u01d8\t\b"+
		"\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u0095\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\t\t"+
		"\2\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\bK\2\2\u01e2\u0097\3\2"+
		"\2\2\u01e3\u01e4\7$\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\bL\3\2\u01e6\u0099"+
		"\3\2\2\2\u01e7\u01e8\7&\2\2\u01e8\u01e9\5\u0094J\2\u01e9\u009b\3\2\2\2"+
		"\u01ea\u01eb\7$\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\bN\4\2\u01ed\u009d"+
		"\3\2\2\2\u01ee\u01ef\5\u009aM\2\u01ef\u009f\3\2\2\2\u01f0\u01f2\n\n\2"+
		"\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f7\7&\2\2\u01f6\u01f1\3\2\2\2\u01f6"+
		"\u01f5\3\2\2\2\u01f7\u00a1\3\2\2\2\u01f8\u01f9\7^\2\2\u01f9\u01fa\t\13"+
		"\2\2\u01fa\u00a3\3\2\2\2\24\2\3\u00b3\u0193\u0198\u01a3\u01a8\u01b2\u01ba"+
		"\u01bf\u01c5\u01cb\u01d0\u01d3\u01d9\u01df\u01f3\u01f6\5\b\2\2\7\3\2\6"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}