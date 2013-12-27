// Generated from Simplang.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplangLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		WHILE=25, FOR=26, IF=27, ELIF=28, ELSE=29, BREAK=30, CONTINUE=31, RET=32, 
		NEW=33, NULL=34, LPAR=35, RPAR=36, LBRACK=37, RBRACK=38, AND=39, OR=40, 
		NOT=41, MUL=42, DIV=43, IDIV=44, REM=45, ADD=46, SUB=47, EXP=48, EQ=49, 
		NE=50, LE=51, GE=52, GT=53, LT=54, BOOL=55, INT=56, FLOAT=57, STRING=58, 
		CHAR=59, ID=60, EMPTY_LINE=61, COMMENT=62, LINE_ESCAPE=63, IGNORE_NEWLINE=64, 
		NL=65, LEADING_WS=66, WS=67, DIGIT=68;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'&'", "'-='", "','", "':'", "'&='", "'--'", "'int'", "'void'", "'~='", 
		"'+='", "'float'", "'++'", "'char'", "'*='", "'bool'", "'.'", "'='", "'%='", 
		"'string'", "'/='", "'|='", "'~'", "'//='", "'|'", "'while'", "'for'", 
		"'if'", "'elif'", "'else'", "'break'", "'continue'", "'return'", "'new'", 
		"'null'", "'('", "')'", "'['", "']'", "AND", "OR", "NOT", "'*'", "'/'", 
		"'//'", "'%'", "'+'", "'-'", "'^'", "'=='", "'!='", "'<='", "'>='", "'>'", 
		"'<'", "BOOL", "INT", "FLOAT", "STRING", "CHAR", "ID", "EMPTY_LINE", "COMMENT", 
		"LINE_ESCAPE", "IGNORE_NEWLINE", "NL", "LEADING_WS", "WS", "DIGIT"
	};
	public static final String[] ruleNames = {
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WHILE", 
		"FOR", "IF", "ELIF", "ELSE", "BREAK", "CONTINUE", "RET", "NEW", "NULL", 
		"LPAR", "RPAR", "LBRACK", "RBRACK", "AND", "OR", "NOT", "MUL", "DIV", 
		"IDIV", "REM", "ADD", "SUB", "EXP", "EQ", "NE", "LE", "GE", "GT", "LT", 
		"BOOL", "INT", "FLOAT", "STRING", "CHAR", "ID", "EMPTY_LINE", "COMMENT", 
		"LINE_ESCAPE", "IGNORE_NEWLINE", "NL", "LEADING_WS", "WS", "NUMBER", "DIGIT"
	};


	    int nesting = 0;


	public SimplangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simplang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 34: LPAR_action((RuleContext)_localctx, actionIndex); break;

		case 35: RPAR_action((RuleContext)_localctx, actionIndex); break;

		case 36: LBRACK_action((RuleContext)_localctx, actionIndex); break;

		case 37: RBRACK_action((RuleContext)_localctx, actionIndex); break;

		case 60: EMPTY_LINE_action((RuleContext)_localctx, actionIndex); break;

		case 61: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 62: LINE_ESCAPE_action((RuleContext)_localctx, actionIndex); break;

		case 63: IGNORE_NEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 66: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void EMPTY_LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: skip();  break;
		}
	}
	private void RBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: nesting--; break;
		}
	}
	private void RPAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: nesting--; break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: skip();  break;
		}
	}
	private void LBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: nesting++; break;
		}
	}
	private void LPAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: nesting++; break;
		}
	}
	private void LINE_ESCAPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: skip();  break;
		}
	}
	private void IGNORE_NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: skip();  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 60: return EMPTY_LINE_sempred((RuleContext)_localctx, predIndex);

		case 63: return IGNORE_NEWLINE_sempred((RuleContext)_localctx, predIndex);

		case 65: return LEADING_WS_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean EMPTY_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return getCharPositionInLine()==0;
		}
		return true;
	}
	private boolean IGNORE_NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return nesting>0;
		}
		return true;
	}
	private boolean LEADING_WS_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return getCharPositionInLine()==0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2F\u01bf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\5(\u0125\n(\3)\3)\3)\3)\5)\u012b\n)\3*\3*\3*\3*\5*\u0131\n*\3+\3+\3,"+
		"\3,\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\3"+
		"8\38\38\38\38\58\u015b\n8\39\39\3:\3:\3:\7:\u0162\n:\f:\16:\u0165\13:"+
		"\3;\3;\3;\7;\u016a\n;\f;\16;\u016d\13;\3;\3;\3<\3<\3<\3<\3=\3=\7=\u0177"+
		"\n=\f=\16=\u017a\13=\3>\3>\7>\u017e\n>\f>\16>\u0181\13>\3>\5>\u0184\n"+
		">\3>\3>\3>\3>\3?\3?\7?\u018c\n?\f?\16?\u018f\13?\3?\3?\3@\3@\3@\3@\3@"+
		"\3A\5A\u0199\nA\3A\3A\3A\3A\3A\3B\5B\u01a1\nB\3B\3B\5B\u01a5\nB\3C\3C"+
		"\6C\u01a9\nC\rC\16C\u01aa\3D\6D\u01ae\nD\rD\16D\u01af\3D\3D\3E\3E\3E\7"+
		"E\u01b7\nE\fE\16E\u01ba\13E\5E\u01bc\nE\3F\3F\2G\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35"+
		"\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1"+
		"\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\2I&\3K\'\4"+
		"M(\5O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i"+
		"\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\6}@\7\177A\b\u0081B\t\u0083"+
		"C\1\u0085D\1\u0087E\n\u0089\2\1\u008bF\1\3\2\n\3\2$$\3\2))\4\2C\\c|\5"+
		"\2\62;C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\3\2\63;\3\2\62;\u01cf\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2"+
		"\7\u0092\3\2\2\2\t\u0094\3\2\2\2\13\u0096\3\2\2\2\r\u0099\3\2\2\2\17\u009c"+
		"\3\2\2\2\21\u00a0\3\2\2\2\23\u00a5\3\2\2\2\25\u00a8\3\2\2\2\27\u00ab\3"+
		"\2\2\2\31\u00b1\3\2\2\2\33\u00b4\3\2\2\2\35\u00b9\3\2\2\2\37\u00bc\3\2"+
		"\2\2!\u00c1\3\2\2\2#\u00c3\3\2\2\2%\u00c5\3\2\2\2\'\u00c8\3\2\2\2)\u00cf"+
		"\3\2\2\2+\u00d2\3\2\2\2-\u00d5\3\2\2\2/\u00d7\3\2\2\2\61\u00db\3\2\2\2"+
		"\63\u00dd\3\2\2\2\65\u00e3\3\2\2\2\67\u00e7\3\2\2\29\u00ea\3\2\2\2;\u00ef"+
		"\3\2\2\2=\u00f4\3\2\2\2?\u00fa\3\2\2\2A\u0103\3\2\2\2C\u010a\3\2\2\2E"+
		"\u010e\3\2\2\2G\u0113\3\2\2\2I\u0116\3\2\2\2K\u0119\3\2\2\2M\u011c\3\2"+
		"\2\2O\u0124\3\2\2\2Q\u012a\3\2\2\2S\u0130\3\2\2\2U\u0132\3\2\2\2W\u0134"+
		"\3\2\2\2Y\u0136\3\2\2\2[\u0139\3\2\2\2]\u013b\3\2\2\2_\u013d\3\2\2\2a"+
		"\u013f\3\2\2\2c\u0141\3\2\2\2e\u0144\3\2\2\2g\u0147\3\2\2\2i\u014a\3\2"+
		"\2\2k\u014d\3\2\2\2m\u014f\3\2\2\2o\u015a\3\2\2\2q\u015c\3\2\2\2s\u015e"+
		"\3\2\2\2u\u0166\3\2\2\2w\u0170\3\2\2\2y\u0174\3\2\2\2{\u017b\3\2\2\2}"+
		"\u0189\3\2\2\2\177\u0192\3\2\2\2\u0081\u0198\3\2\2\2\u0083\u01a4\3\2\2"+
		"\2\u0085\u01a6\3\2\2\2\u0087\u01ad\3\2\2\2\u0089\u01bb\3\2\2\2\u008b\u01bd"+
		"\3\2\2\2\u008d\u008e\7(\2\2\u008e\4\3\2\2\2\u008f\u0090\7/\2\2\u0090\u0091"+
		"\7?\2\2\u0091\6\3\2\2\2\u0092\u0093\7.\2\2\u0093\b\3\2\2\2\u0094\u0095"+
		"\7<\2\2\u0095\n\3\2\2\2\u0096\u0097\7(\2\2\u0097\u0098\7?\2\2\u0098\f"+
		"\3\2\2\2\u0099\u009a\7/\2\2\u009a\u009b\7/\2\2\u009b\16\3\2\2\2\u009c"+
		"\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7v\2\2\u009f\20\3\2\2\2\u00a0"+
		"\u00a1\7x\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7f\2\2"+
		"\u00a4\22\3\2\2\2\u00a5\u00a6\7\u0080\2\2\u00a6\u00a7\7?\2\2\u00a7\24"+
		"\3\2\2\2\u00a8\u00a9\7-\2\2\u00a9\u00aa\7?\2\2\u00aa\26\3\2\2\2\u00ab"+
		"\u00ac\7h\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7c\2\2"+
		"\u00af\u00b0\7v\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7-\2\2\u00b2\u00b3\7"+
		"-\2\2\u00b3\32\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7"+
		"\7c\2\2\u00b7\u00b8\7t\2\2\u00b8\34\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba\u00bb"+
		"\7?\2\2\u00bb\36\3\2\2\2\u00bc\u00bd\7d\2\2\u00bd\u00be\7q\2\2\u00be\u00bf"+
		"\7q\2\2\u00bf\u00c0\7n\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7\60\2\2\u00c2\""+
		"\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4$\3\2\2\2\u00c5\u00c6\7\'\2\2\u00c6\u00c7"+
		"\7?\2\2\u00c7&\3\2\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb"+
		"\7t\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7i\2\2\u00ce"+
		"(\3\2\2\2\u00cf\u00d0\7\61\2\2\u00d0\u00d1\7?\2\2\u00d1*\3\2\2\2\u00d2"+
		"\u00d3\7~\2\2\u00d3\u00d4\7?\2\2\u00d4,\3\2\2\2\u00d5\u00d6\7\u0080\2"+
		"\2\u00d6.\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8\u00d9\7\61\2\2\u00d9\u00da"+
		"\7?\2\2\u00da\60\3\2\2\2\u00db\u00dc\7~\2\2\u00dc\62\3\2\2\2\u00dd\u00de"+
		"\7y\2\2\u00de\u00df\7j\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7n\2\2\u00e1"+
		"\u00e2\7g\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7q\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6\66\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7h\2\2\u00e9"+
		"8\3\2\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7k\2\2\u00ed"+
		"\u00ee\7h\2\2\u00ee:\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7n\2\2\u00f1"+
		"\u00f2\7u\2\2\u00f2\u00f3\7g\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7d\2\2\u00f5"+
		"\u00f6\7t\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7m\2\2"+
		"\u00f9>\3\2\2\2\u00fa\u00fb\7e\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7p\2"+
		"\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7p\2\2\u0100\u0101"+
		"\7w\2\2\u0101\u0102\7g\2\2\u0102@\3\2\2\2\u0103\u0104\7t\2\2\u0104\u0105"+
		"\7g\2\2\u0105\u0106\7v\2\2\u0106\u0107\7w\2\2\u0107\u0108\7t\2\2\u0108"+
		"\u0109\7p\2\2\u0109B\3\2\2\2\u010a\u010b\7p\2\2\u010b\u010c\7g\2\2\u010c"+
		"\u010d\7y\2\2\u010dD\3\2\2\2\u010e\u010f\7p\2\2\u010f\u0110\7w\2\2\u0110"+
		"\u0111\7n\2\2\u0111\u0112\7n\2\2\u0112F\3\2\2\2\u0113\u0114\7*\2\2\u0114"+
		"\u0115\b$\2\2\u0115H\3\2\2\2\u0116\u0117\7+\2\2\u0117\u0118\b%\3\2\u0118"+
		"J\3\2\2\2\u0119\u011a\7]\2\2\u011a\u011b\b&\4\2\u011bL\3\2\2\2\u011c\u011d"+
		"\7_\2\2\u011d\u011e\b\'\5\2\u011eN\3\2\2\2\u011f\u0120\7(\2\2\u0120\u0125"+
		"\7(\2\2\u0121\u0122\7c\2\2\u0122\u0123\7p\2\2\u0123\u0125\7f\2\2\u0124"+
		"\u011f\3\2\2\2\u0124\u0121\3\2\2\2\u0125P\3\2\2\2\u0126\u0127\7~\2\2\u0127"+
		"\u012b\7~\2\2\u0128\u0129\7q\2\2\u0129\u012b\7t\2\2\u012a\u0126\3\2\2"+
		"\2\u012a\u0128\3\2\2\2\u012bR\3\2\2\2\u012c\u0131\7#\2\2\u012d\u012e\7"+
		"p\2\2\u012e\u012f\7q\2\2\u012f\u0131\7v\2\2\u0130\u012c\3\2\2\2\u0130"+
		"\u012d\3\2\2\2\u0131T\3\2\2\2\u0132\u0133\7,\2\2\u0133V\3\2\2\2\u0134"+
		"\u0135\7\61\2\2\u0135X\3\2\2\2\u0136\u0137\7\61\2\2\u0137\u0138\7\61\2"+
		"\2\u0138Z\3\2\2\2\u0139\u013a\7\'\2\2\u013a\\\3\2\2\2\u013b\u013c\7-\2"+
		"\2\u013c^\3\2\2\2\u013d\u013e\7/\2\2\u013e`\3\2\2\2\u013f\u0140\7`\2\2"+
		"\u0140b\3\2\2\2\u0141\u0142\7?\2\2\u0142\u0143\7?\2\2\u0143d\3\2\2\2\u0144"+
		"\u0145\7#\2\2\u0145\u0146\7?\2\2\u0146f\3\2\2\2\u0147\u0148\7>\2\2\u0148"+
		"\u0149\7?\2\2\u0149h\3\2\2\2\u014a\u014b\7@\2\2\u014b\u014c\7?\2\2\u014c"+
		"j\3\2\2\2\u014d\u014e\7@\2\2\u014el\3\2\2\2\u014f\u0150\7>\2\2\u0150n"+
		"\3\2\2\2\u0151\u0152\7h\2\2\u0152\u0153\7c\2\2\u0153\u0154\7n\2\2\u0154"+
		"\u0155\7u\2\2\u0155\u015b\7g\2\2\u0156\u0157\7v\2\2\u0157\u0158\7t\2\2"+
		"\u0158\u0159\7w\2\2\u0159\u015b\7g\2\2\u015a\u0151\3\2\2\2\u015a\u0156"+
		"\3\2\2\2\u015bp\3\2\2\2\u015c\u015d\5\u0089E\2\u015dr\3\2\2\2\u015e\u015f"+
		"\5\u0089E\2\u015f\u0163\7\60\2\2\u0160\u0162\5\u008bF\2\u0161\u0160\3"+
		"\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"t\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u016b\7$\2\2\u0167\u016a\n\2\2\2\u0168"+
		"\u016a\5\u0083B\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u016f\7$\2\2\u016fv\3\2\2\2\u0170\u0171\7)\2\2\u0171"+
		"\u0172\n\3\2\2\u0172\u0173\7)\2\2\u0173x\3\2\2\2\u0174\u0178\t\4\2\2\u0175"+
		"\u0177\t\5\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2"+
		"\2\2\u0178\u0179\3\2\2\2\u0179z\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017f"+
		"\6>\2\2\u017c\u017e\t\6\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0184\5}?\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0186\5\u0083B\2\u0186\u0187\3\2\2\2\u0187\u0188\b>\6\2"+
		"\u0188|\3\2\2\2\u0189\u018d\7%\2\2\u018a\u018c\n\7\2\2\u018b\u018a\3\2"+
		"\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e"+
		"\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\b?\7\2\u0191~\3\2\2\2\u0192"+
		"\u0193\7^\2\2\u0193\u0194\5\u0083B\2\u0194\u0195\3\2\2\2\u0195\u0196\b"+
		"@\b\2\u0196\u0080\3\2\2\2\u0197\u0199\7\17\2\2\u0198\u0197\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\7\f\2\2\u019b\u019c\6A"+
		"\3\2\u019c\u019d\3\2\2\2\u019d\u019e\bA\t\2\u019e\u0082\3\2\2\2\u019f"+
		"\u01a1\7\17\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3"+
		"\2\2\2\u01a2\u01a5\7\f\2\2\u01a3\u01a5\7\17\2\2\u01a4\u01a0\3\2\2\2\u01a4"+
		"\u01a3\3\2\2\2\u01a5\u0084\3\2\2\2\u01a6\u01a8\6C\4\2\u01a7\u01a9\t\6"+
		"\2\2\u01a8\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01ab\3\2\2\2\u01ab\u0086\3\2\2\2\u01ac\u01ae\t\6\2\2\u01ad\u01ac\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b2\bD\n\2\u01b2\u0088\3\2\2\2\u01b3\u01bc\7\62"+
		"\2\2\u01b4\u01b8\t\b\2\2\u01b5\u01b7\5\u008bF\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bc\3\2"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01b3\3\2\2\2\u01bb\u01b4\3\2\2\2\u01bc"+
		"\u008a\3\2\2\2\u01bd\u01be\t\t\2\2\u01be\u008c\3\2\2\2\25\2\u0124\u012a"+
		"\u0130\u015a\u0163\u0169\u016b\u0178\u017f\u0183\u018d\u0198\u01a0\u01a4"+
		"\u01aa\u01af\u01b8\u01bb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}