// Generated from Magic.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MagicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__16=1, T__15=2, T__14=3, T__13=4, T__12=5, T__11=6, T__10=7, T__9=8, 
		T__8=9, T__7=10, T__6=11, T__5=12, T__4=13, T__3=14, T__2=15, T__1=16, 
		T__0=17, WHILE=18, FOR=19, IF=20, ELIF=21, ELSE=22, BREAK=23, CONTINUE=24, 
		RET=25, NEW=26, NULL=27, LPAR=28, RPAR=29, LBRACK=30, RBRACK=31, AND=32, 
		OR=33, NOT=34, ADD=35, SUB=36, MUL=37, DIV=38, IDIV=39, REM=40, EXP=41, 
		ADD_ASSIGN=42, SUB_ASSIGN=43, MUL_ASSIGN=44, DIV_ASSIGN=45, IDIV_ASSIGN=46, 
		REM_ASSIGN=47, EXP_ASSIGN=48, AND_ASSIGN=49, OR_ASSIGN=50, NOT_ASSIGN=51, 
		EQ=52, NE=53, LE=54, GE=55, GT=56, LT=57, BOOL=58, INT=59, FLOAT=60, STRING=61, 
		CHAR=62, ID=63, EMPTY_LINE=64, COMMENT=65, LINE_ESCAPE=66, IGNORE_NEWLINE=67, 
		NL=68, LEADING_WS=69, WS=70, DIGIT=71;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'&'", "'bool'", "'.'", "'extern'", "'in'", "','", "':'", "'int'", "'--'", 
		"'='", "'void'", "'string'", "'~'", "'float'", "'|'", "'++'", "'char'", 
		"'while'", "'for'", "'if'", "'elif'", "'else'", "'break'", "'continue'", 
		"'return'", "'new'", "'null'", "'('", "')'", "'['", "']'", "AND", "OR", 
		"NOT", "'+'", "'-'", "'*'", "'/'", "'//'", "'%'", "'^'", "'+='", "'-='", 
		"'*='", "'/='", "'//='", "'%='", "'^='", "'&='", "'|='", "'~='", "'=='", 
		"'!='", "'<='", "'>='", "'>'", "'<'", "BOOL", "INT", "FLOAT", "STRING", 
		"CHAR", "ID", "EMPTY_LINE", "COMMENT", "LINE_ESCAPE", "IGNORE_NEWLINE", 
		"NL", "LEADING_WS", "WS", "DIGIT"
	};
	public static final String[] ruleNames = {
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"WHILE", "FOR", "IF", "ELIF", "ELSE", "BREAK", "CONTINUE", "RET", "NEW", 
		"NULL", "LPAR", "RPAR", "LBRACK", "RBRACK", "AND", "OR", "NOT", "ADD", 
		"SUB", "MUL", "DIV", "IDIV", "REM", "EXP", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "IDIV_ASSIGN", "REM_ASSIGN", "EXP_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "NOT_ASSIGN", "EQ", "NE", "LE", "GE", "GT", 
		"LT", "BOOL", "INT", "FLOAT", "STRING", "CHAR", "ID", "EMPTY_LINE", "COMMENT", 
		"LINE_ESCAPE", "IGNORE_NEWLINE", "NL", "LEADING_WS", "WS", "NUMBER", "DIGIT"
	};


	    int nesting = 0;


	public MagicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Magic.g4"; }

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
		case 27: LPAR_action((RuleContext)_localctx, actionIndex); break;

		case 28: RPAR_action((RuleContext)_localctx, actionIndex); break;

		case 29: LBRACK_action((RuleContext)_localctx, actionIndex); break;

		case 30: RBRACK_action((RuleContext)_localctx, actionIndex); break;

		case 63: EMPTY_LINE_action((RuleContext)_localctx, actionIndex); break;

		case 64: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 65: LINE_ESCAPE_action((RuleContext)_localctx, actionIndex); break;

		case 66: IGNORE_NEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 69: WS_action((RuleContext)_localctx, actionIndex); break;
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
		case 63: return EMPTY_LINE_sempred((RuleContext)_localctx, predIndex);

		case 66: return IGNORE_NEWLINE_sempred((RuleContext)_localctx, predIndex);

		case 68: return LEADING_WS_sempred((RuleContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2I\u01d2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\5!\u0119\n!\3\"\3"+
		"\"\3\"\3\"\5\"\u011f\n\"\3#\3#\3#\3#\5#\u0125\n#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\3"+
		"9\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u016e\n;\3<\3<\3=\3=\3=\7=\u0175"+
		"\n=\f=\16=\u0178\13=\3>\3>\3>\7>\u017d\n>\f>\16>\u0180\13>\3>\3>\3?\3"+
		"?\3?\3?\3@\3@\7@\u018a\n@\f@\16@\u018d\13@\3A\3A\7A\u0191\nA\fA\16A\u0194"+
		"\13A\3A\5A\u0197\nA\3A\3A\3A\3A\3B\3B\7B\u019f\nB\fB\16B\u01a2\13B\3B"+
		"\3B\3C\3C\3C\3C\3C\3D\5D\u01ac\nD\3D\3D\3D\3D\3D\3E\5E\u01b4\nE\3E\3E"+
		"\5E\u01b8\nE\3F\3F\6F\u01bc\nF\rF\16F\u01bd\3G\6G\u01c1\nG\rG\16G\u01c2"+
		"\3G\3G\3H\3H\3H\7H\u01ca\nH\fH\16H\u01cd\13H\5H\u01cf\nH\3I\3I\2J\3\3"+
		"\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1"+
		"\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1"+
		"-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\2;\37\3= \4?!\5A\"\1"+
		"C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62"+
		"\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\1\177"+
		"A\1\u0081B\6\u0083C\7\u0085D\b\u0087E\t\u0089F\1\u008bG\1\u008dH\n\u008f"+
		"\2\1\u0091I\1\3\2\n\3\2$$\3\2))\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\4"+
		"\2\f\f\17\17\3\2\63;\3\2\62;\u01e2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2"+
		"\2\5\u0095\3\2\2\2\7\u009a\3\2\2\2\t\u009c\3\2\2\2\13\u00a3\3\2\2\2\r"+
		"\u00a6\3\2\2\2\17\u00a8\3\2\2\2\21\u00aa\3\2\2\2\23\u00ae\3\2\2\2\25\u00b1"+
		"\3\2\2\2\27\u00b3\3\2\2\2\31\u00b8\3\2\2\2\33\u00bf\3\2\2\2\35\u00c1\3"+
		"\2\2\2\37\u00c7\3\2\2\2!\u00c9\3\2\2\2#\u00cc\3\2\2\2%\u00d1\3\2\2\2\'"+
		"\u00d7\3\2\2\2)\u00db\3\2\2\2+\u00de\3\2\2\2-\u00e3\3\2\2\2/\u00e8\3\2"+
		"\2\2\61\u00ee\3\2\2\2\63\u00f7\3\2\2\2\65\u00fe\3\2\2\2\67\u0102\3\2\2"+
		"\29\u0107\3\2\2\2;\u010a\3\2\2\2=\u010d\3\2\2\2?\u0110\3\2\2\2A\u0118"+
		"\3\2\2\2C\u011e\3\2\2\2E\u0124\3\2\2\2G\u0126\3\2\2\2I\u0128\3\2\2\2K"+
		"\u012a\3\2\2\2M\u012c\3\2\2\2O\u012e\3\2\2\2Q\u0131\3\2\2\2S\u0133\3\2"+
		"\2\2U\u0135\3\2\2\2W\u0138\3\2\2\2Y\u013b\3\2\2\2[\u013e\3\2\2\2]\u0141"+
		"\3\2\2\2_\u0145\3\2\2\2a\u0148\3\2\2\2c\u014b\3\2\2\2e\u014e\3\2\2\2g"+
		"\u0151\3\2\2\2i\u0154\3\2\2\2k\u0157\3\2\2\2m\u015a\3\2\2\2o\u015d\3\2"+
		"\2\2q\u0160\3\2\2\2s\u0162\3\2\2\2u\u016d\3\2\2\2w\u016f\3\2\2\2y\u0171"+
		"\3\2\2\2{\u0179\3\2\2\2}\u0183\3\2\2\2\177\u0187\3\2\2\2\u0081\u018e\3"+
		"\2\2\2\u0083\u019c\3\2\2\2\u0085\u01a5\3\2\2\2\u0087\u01ab\3\2\2\2\u0089"+
		"\u01b7\3\2\2\2\u008b\u01b9\3\2\2\2\u008d\u01c0\3\2\2\2\u008f\u01ce\3\2"+
		"\2\2\u0091\u01d0\3\2\2\2\u0093\u0094\7(\2\2\u0094\4\3\2\2\2\u0095\u0096"+
		"\7d\2\2\u0096\u0097\7q\2\2\u0097\u0098\7q\2\2\u0098\u0099\7n\2\2\u0099"+
		"\6\3\2\2\2\u009a\u009b\7\60\2\2\u009b\b\3\2\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7z\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7t\2\2"+
		"\u00a1\u00a2\7p\2\2\u00a2\n\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p"+
		"\2\2\u00a5\f\3\2\2\2\u00a6\u00a7\7.\2\2\u00a7\16\3\2\2\2\u00a8\u00a9\7"+
		"<\2\2\u00a9\20\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad"+
		"\7v\2\2\u00ad\22\3\2\2\2\u00ae\u00af\7/\2\2\u00af\u00b0\7/\2\2\u00b0\24"+
		"\3\2\2\2\u00b1\u00b2\7?\2\2\u00b2\26\3\2\2\2\u00b3\u00b4\7x\2\2\u00b4"+
		"\u00b5\7q\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7f\2\2\u00b7\30\3\2\2\2\u00b8"+
		"\u00b9\7u\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7k\2\2"+
		"\u00bc\u00bd\7p\2\2\u00bd\u00be\7i\2\2\u00be\32\3\2\2\2\u00bf\u00c0\7"+
		"\u0080\2\2\u00c0\34\3\2\2\2\u00c1\u00c2\7h\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"\u00c4\7q\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7v\2\2\u00c6\36\3\2\2\2\u00c7"+
		"\u00c8\7~\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7-\2\2\u00ca\u00cb\7-\2\2\u00cb"+
		"\"\3\2\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf\7c\2\2\u00cf"+
		"\u00d0\7t\2\2\u00d0$\3\2\2\2\u00d1\u00d2\7y\2\2\u00d2\u00d3\7j\2\2\u00d3"+
		"\u00d4\7k\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6&\3\2\2\2\u00d7"+
		"\u00d8\7h\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7t\2\2\u00da(\3\2\2\2\u00db"+
		"\u00dc\7k\2\2\u00dc\u00dd\7h\2\2\u00dd*\3\2\2\2\u00de\u00df\7g\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7h\2\2\u00e2,\3\2\2\2\u00e3"+
		"\u00e4\7g\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7g\2\2"+
		"\u00e7.\3\2\2\2\u00e8\u00e9\7d\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7g\2"+
		"\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7m\2\2\u00ed\60\3\2\2\2\u00ee\u00ef"+
		"\7e\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7g\2\2"+
		"\u00f6\62\3\2\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7"+
		"v\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7p\2\2\u00fd\64"+
		"\3\2\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7y\2\2\u0101"+
		"\66\3\2\2\2\u0102\u0103\7p\2\2\u0103\u0104\7w\2\2\u0104\u0105\7n\2\2\u0105"+
		"\u0106\7n\2\2\u01068\3\2\2\2\u0107\u0108\7*\2\2\u0108\u0109\b\35\2\2\u0109"+
		":\3\2\2\2\u010a\u010b\7+\2\2\u010b\u010c\b\36\3\2\u010c<\3\2\2\2\u010d"+
		"\u010e\7]\2\2\u010e\u010f\b\37\4\2\u010f>\3\2\2\2\u0110\u0111\7_\2\2\u0111"+
		"\u0112\b \5\2\u0112@\3\2\2\2\u0113\u0114\7(\2\2\u0114\u0119\7(\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7p\2\2\u0117\u0119\7f\2\2\u0118\u0113\3\2\2"+
		"\2\u0118\u0115\3\2\2\2\u0119B\3\2\2\2\u011a\u011b\7~\2\2\u011b\u011f\7"+
		"~\2\2\u011c\u011d\7q\2\2\u011d\u011f\7t\2\2\u011e\u011a\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011fD\3\2\2\2\u0120\u0125\7#\2\2\u0121\u0122\7p\2\2\u0122"+
		"\u0123\7q\2\2\u0123\u0125\7v\2\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2\2"+
		"\2\u0125F\3\2\2\2\u0126\u0127\7-\2\2\u0127H\3\2\2\2\u0128\u0129\7/\2\2"+
		"\u0129J\3\2\2\2\u012a\u012b\7,\2\2\u012bL\3\2\2\2\u012c\u012d\7\61\2\2"+
		"\u012dN\3\2\2\2\u012e\u012f\7\61\2\2\u012f\u0130\7\61\2\2\u0130P\3\2\2"+
		"\2\u0131\u0132\7\'\2\2\u0132R\3\2\2\2\u0133\u0134\7`\2\2\u0134T\3\2\2"+
		"\2\u0135\u0136\7-\2\2\u0136\u0137\7?\2\2\u0137V\3\2\2\2\u0138\u0139\7"+
		"/\2\2\u0139\u013a\7?\2\2\u013aX\3\2\2\2\u013b\u013c\7,\2\2\u013c\u013d"+
		"\7?\2\2\u013dZ\3\2\2\2\u013e\u013f\7\61\2\2\u013f\u0140\7?\2\2\u0140\\"+
		"\3\2\2\2\u0141\u0142\7\61\2\2\u0142\u0143\7\61\2\2\u0143\u0144\7?\2\2"+
		"\u0144^\3\2\2\2\u0145\u0146\7\'\2\2\u0146\u0147\7?\2\2\u0147`\3\2\2\2"+
		"\u0148\u0149\7`\2\2\u0149\u014a\7?\2\2\u014ab\3\2\2\2\u014b\u014c\7(\2"+
		"\2\u014c\u014d\7?\2\2\u014dd\3\2\2\2\u014e\u014f\7~\2\2\u014f\u0150\7"+
		"?\2\2\u0150f\3\2\2\2\u0151\u0152\7\u0080\2\2\u0152\u0153\7?\2\2\u0153"+
		"h\3\2\2\2\u0154\u0155\7?\2\2\u0155\u0156\7?\2\2\u0156j\3\2\2\2\u0157\u0158"+
		"\7#\2\2\u0158\u0159\7?\2\2\u0159l\3\2\2\2\u015a\u015b\7>\2\2\u015b\u015c"+
		"\7?\2\2\u015cn\3\2\2\2\u015d\u015e\7@\2\2\u015e\u015f\7?\2\2\u015fp\3"+
		"\2\2\2\u0160\u0161\7@\2\2\u0161r\3\2\2\2\u0162\u0163\7>\2\2\u0163t\3\2"+
		"\2\2\u0164\u0165\7h\2\2\u0165\u0166\7c\2\2\u0166\u0167\7n\2\2\u0167\u0168"+
		"\7u\2\2\u0168\u016e\7g\2\2\u0169\u016a\7v\2\2\u016a\u016b\7t\2\2\u016b"+
		"\u016c\7w\2\2\u016c\u016e\7g\2\2\u016d\u0164\3\2\2\2\u016d\u0169\3\2\2"+
		"\2\u016ev\3\2\2\2\u016f\u0170\5\u008fH\2\u0170x\3\2\2\2\u0171\u0172\5"+
		"\u008fH\2\u0172\u0176\7\60\2\2\u0173\u0175\5\u0091I\2\u0174\u0173\3\2"+
		"\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"z\3\2\2\2\u0178\u0176\3\2\2\2\u0179\u017e\7$\2\2\u017a\u017d\n\2\2\2\u017b"+
		"\u017d\5\u0089E\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d\u0180"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0182\7$\2\2\u0182|\3\2\2\2\u0183\u0184\7)\2\2\u0184"+
		"\u0185\n\3\2\2\u0185\u0186\7)\2\2\u0186~\3\2\2\2\u0187\u018b\t\4\2\2\u0188"+
		"\u018a\t\5\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u0080\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u0192\6A\2\2\u018f\u0191\t\6\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2"+
		"\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0196\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0197\5\u0083B\2\u0196\u0195\3\2\2\2\u0196\u0197"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\5\u0089E\2\u0199\u019a\3\2\2"+
		"\2\u019a\u019b\bA\6\2\u019b\u0082\3\2\2\2\u019c\u01a0\7%\2\2\u019d\u019f"+
		"\n\7\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\bB"+
		"\7\2\u01a4\u0084\3\2\2\2\u01a5\u01a6\7^\2\2\u01a6\u01a7\5\u0089E\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\bC\b\2\u01a9\u0086\3\2\2\2\u01aa\u01ac\7\17"+
		"\2\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ae\7\f\2\2\u01ae\u01af\6D\3\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\bD\t"+
		"\2\u01b1\u0088\3\2\2\2\u01b2\u01b4\7\17\2\2\u01b3\u01b2\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b8\7\f\2\2\u01b6\u01b8\7\17"+
		"\2\2\u01b7\u01b3\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u008a\3\2\2\2\u01b9"+
		"\u01bb\6F\4\2\u01ba\u01bc\t\6\2\2\u01bb\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u008c\3\2\2\2\u01bf"+
		"\u01c1\t\6\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c0\3\2"+
		"\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\bG\n\2\u01c5"+
		"\u008e\3\2\2\2\u01c6\u01cf\7\62\2\2\u01c7\u01cb\t\b\2\2\u01c8\u01ca\5"+
		"\u0091I\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2"+
		"\u01cb\u01cc\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01c6"+
		"\3\2\2\2\u01ce\u01c7\3\2\2\2\u01cf\u0090\3\2\2\2\u01d0\u01d1\t\t\2\2\u01d1"+
		"\u0092\3\2\2\2\25\2\u0118\u011e\u0124\u016d\u0176\u017c\u017e\u018b\u0192"+
		"\u0196\u01a0\u01ab\u01b3\u01b7\u01bd\u01c2\u01cb\u01ce";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}