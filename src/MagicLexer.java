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
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		WHILE=17, FOR=18, IF=19, ELIF=20, ELSE=21, BREAK=22, CONTINUE=23, RET=24, 
		NEW=25, NULL=26, LPAR=27, RPAR=28, LBRACK=29, RBRACK=30, AND=31, OR=32, 
		NOT=33, ADD=34, SUB=35, MUL=36, DIV=37, IDIV=38, REM=39, EXP=40, ADD_ASSIGN=41, 
		SUB_ASSIGN=42, MUL_ASSIGN=43, DIV_ASSIGN=44, IDIV_ASSIGN=45, REM_ASSIGN=46, 
		EXP_ASSIGN=47, AND_ASSIGN=48, OR_ASSIGN=49, NOT_ASSIGN=50, EQ=51, NE=52, 
		LE=53, GE=54, GT=55, LT=56, BOOL=57, INT=58, FLOAT=59, STRING=60, CHAR=61, 
		ID=62, EMPTY_LINE=63, COMMENT=64, LINE_ESCAPE=65, IGNORE_NEWLINE=66, NL=67, 
		LEADING_WS=68, WS=69, DIGIT=70;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'&'", "'bool'", "'.'", "'in'", "','", "':'", "'int'", "'--'", "'='", 
		"'void'", "'string'", "'~'", "'float'", "'|'", "'++'", "'char'", "'while'", 
		"'for'", "'if'", "'elif'", "'else'", "'break'", "'continue'", "'return'", 
		"'new'", "'null'", "'('", "')'", "'['", "']'", "AND", "OR", "NOT", "'+'", 
		"'-'", "'*'", "'/'", "'//'", "'%'", "'^'", "'+='", "'-='", "'*='", "'/='", 
		"'//='", "'%='", "'^='", "'&='", "'|='", "'~='", "'=='", "'!='", "'<='", 
		"'>='", "'>'", "'<'", "BOOL", "INT", "FLOAT", "STRING", "CHAR", "ID", 
		"EMPTY_LINE", "COMMENT", "LINE_ESCAPE", "IGNORE_NEWLINE", "NL", "LEADING_WS", 
		"WS", "DIGIT"
	};
	public static final String[] ruleNames = {
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WHILE", 
		"FOR", "IF", "ELIF", "ELSE", "BREAK", "CONTINUE", "RET", "NEW", "NULL", 
		"LPAR", "RPAR", "LBRACK", "RBRACK", "AND", "OR", "NOT", "ADD", "SUB", 
		"MUL", "DIV", "IDIV", "REM", "EXP", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "IDIV_ASSIGN", "REM_ASSIGN", "EXP_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "NOT_ASSIGN", "EQ", "NE", "LE", "GE", "GT", "LT", "BOOL", 
		"INT", "FLOAT", "STRING", "CHAR", "ID", "EMPTY_LINE", "COMMENT", "LINE_ESCAPE", 
		"IGNORE_NEWLINE", "NL", "LEADING_WS", "WS", "NUMBER", "DIGIT"
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
		case 26: LPAR_action((RuleContext)_localctx, actionIndex); break;

		case 27: RPAR_action((RuleContext)_localctx, actionIndex); break;

		case 28: LBRACK_action((RuleContext)_localctx, actionIndex); break;

		case 29: RBRACK_action((RuleContext)_localctx, actionIndex); break;

		case 62: EMPTY_LINE_action((RuleContext)_localctx, actionIndex); break;

		case 63: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 64: LINE_ESCAPE_action((RuleContext)_localctx, actionIndex); break;

		case 65: IGNORE_NEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 68: WS_action((RuleContext)_localctx, actionIndex); break;
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
		case 62: return EMPTY_LINE_sempred((RuleContext)_localctx, predIndex);

		case 65: return IGNORE_NEWLINE_sempred((RuleContext)_localctx, predIndex);

		case 67: return LEADING_WS_sempred((RuleContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2H\u01c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \5 \u0110\n \3!\3!\3!\3!\5!\u0116\n!\3\"\3\"\3"+
		"\"\3\"\5\"\u011c\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3:\3:\3:\3:\3:\3"+
		":\3:\5:\u0165\n:\3;\3;\3<\3<\3<\7<\u016c\n<\f<\16<\u016f\13<\3=\3=\3="+
		"\7=\u0174\n=\f=\16=\u0177\13=\3=\3=\3>\3>\3>\3>\3?\3?\7?\u0181\n?\f?\16"+
		"?\u0184\13?\3@\3@\7@\u0188\n@\f@\16@\u018b\13@\3@\5@\u018e\n@\3@\3@\3"+
		"@\3@\3A\3A\7A\u0196\nA\fA\16A\u0199\13A\3A\3A\3B\3B\3B\3B\3B\3C\5C\u01a3"+
		"\nC\3C\3C\3C\3C\3C\3D\5D\u01ab\nD\3D\3D\5D\u01af\nD\3E\3E\6E\u01b3\nE"+
		"\rE\16E\u01b4\3F\6F\u01b8\nF\rF\16F\u01b9\3F\3F\3G\3G\3G\7G\u01c1\nG\f"+
		"G\16G\u01c4\13G\5G\u01c6\nG\3H\3H\2I\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\29\36\3;\37\4= \5?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*"+
		"\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1"+
		"m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\1\177A\6\u0081B\7\u0083C\b\u0085D\t"+
		"\u0087E\1\u0089F\1\u008bG\n\u008d\2\1\u008fH\1\3\2\n\3\2$$\3\2))\4\2C"+
		"\\c|\5\2\62;C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\3\2\63;\3\2\62;\u01d9\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008f\3\2\2"+
		"\2\3\u0091\3\2\2\2\5\u0093\3\2\2\2\7\u0098\3\2\2\2\t\u009a\3\2\2\2\13"+
		"\u009d\3\2\2\2\r\u009f\3\2\2\2\17\u00a1\3\2\2\2\21\u00a5\3\2\2\2\23\u00a8"+
		"\3\2\2\2\25\u00aa\3\2\2\2\27\u00af\3\2\2\2\31\u00b6\3\2\2\2\33\u00b8\3"+
		"\2\2\2\35\u00be\3\2\2\2\37\u00c0\3\2\2\2!\u00c3\3\2\2\2#\u00c8\3\2\2\2"+
		"%\u00ce\3\2\2\2\'\u00d2\3\2\2\2)\u00d5\3\2\2\2+\u00da\3\2\2\2-\u00df\3"+
		"\2\2\2/\u00e5\3\2\2\2\61\u00ee\3\2\2\2\63\u00f5\3\2\2\2\65\u00f9\3\2\2"+
		"\2\67\u00fe\3\2\2\29\u0101\3\2\2\2;\u0104\3\2\2\2=\u0107\3\2\2\2?\u010f"+
		"\3\2\2\2A\u0115\3\2\2\2C\u011b\3\2\2\2E\u011d\3\2\2\2G\u011f\3\2\2\2I"+
		"\u0121\3\2\2\2K\u0123\3\2\2\2M\u0125\3\2\2\2O\u0128\3\2\2\2Q\u012a\3\2"+
		"\2\2S\u012c\3\2\2\2U\u012f\3\2\2\2W\u0132\3\2\2\2Y\u0135\3\2\2\2[\u0138"+
		"\3\2\2\2]\u013c\3\2\2\2_\u013f\3\2\2\2a\u0142\3\2\2\2c\u0145\3\2\2\2e"+
		"\u0148\3\2\2\2g\u014b\3\2\2\2i\u014e\3\2\2\2k\u0151\3\2\2\2m\u0154\3\2"+
		"\2\2o\u0157\3\2\2\2q\u0159\3\2\2\2s\u0164\3\2\2\2u\u0166\3\2\2\2w\u0168"+
		"\3\2\2\2y\u0170\3\2\2\2{\u017a\3\2\2\2}\u017e\3\2\2\2\177\u0185\3\2\2"+
		"\2\u0081\u0193\3\2\2\2\u0083\u019c\3\2\2\2\u0085\u01a2\3\2\2\2\u0087\u01ae"+
		"\3\2\2\2\u0089\u01b0\3\2\2\2\u008b\u01b7\3\2\2\2\u008d\u01c5\3\2\2\2\u008f"+
		"\u01c7\3\2\2\2\u0091\u0092\7(\2\2\u0092\4\3\2\2\2\u0093\u0094\7d\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0096\7q\2\2\u0096\u0097\7n\2\2\u0097\6\3\2\2\2\u0098"+
		"\u0099\7\60\2\2\u0099\b\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2"+
		"\u009c\n\3\2\2\2\u009d\u009e\7.\2\2\u009e\f\3\2\2\2\u009f\u00a0\7<\2\2"+
		"\u00a0\16\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7"+
		"v\2\2\u00a4\20\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\u00a7\7/\2\2\u00a7\22"+
		"\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9\24\3\2\2\2\u00aa\u00ab\7x\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7f\2\2\u00ae\26\3\2\2\2\u00af"+
		"\u00b0\7u\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7k\2\2"+
		"\u00b3\u00b4\7p\2\2\u00b4\u00b5\7i\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7"+
		"\u0080\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7n\2\2\u00ba"+
		"\u00bb\7q\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7v\2\2\u00bd\34\3\2\2\2\u00be"+
		"\u00bf\7~\2\2\u00bf\36\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1\u00c2\7-\2\2\u00c2"+
		" \3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5\7j\2\2\u00c5\u00c6\7c\2\2\u00c6"+
		"\u00c7\7t\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\7y\2\2\u00c9\u00ca\7j\2\2\u00ca"+
		"\u00cb\7k\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd$\3\2\2\2\u00ce"+
		"\u00cf\7h\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7t\2\2\u00d1&\3\2\2\2\u00d2"+
		"\u00d3\7k\2\2\u00d3\u00d4\7h\2\2\u00d4(\3\2\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7h\2\2\u00d9*\3\2\2\2\u00da"+
		"\u00db\7g\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7g\2\2"+
		"\u00de,\3\2\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7g\2"+
		"\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7m\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7"+
		"e\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea"+
		"\7k\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"\60\3\2\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7v\2\2\u00f1"+
		"\u00f2\7w\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7p\2\2\u00f4\62\3\2\2\2\u00f5"+
		"\u00f6\7p\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7y\2\2\u00f8\64\3\2\2\2\u00f9"+
		"\u00fa\7p\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7n\2\2"+
		"\u00fd\66\3\2\2\2\u00fe\u00ff\7*\2\2\u00ff\u0100\b\34\2\2\u01008\3\2\2"+
		"\2\u0101\u0102\7+\2\2\u0102\u0103\b\35\3\2\u0103:\3\2\2\2\u0104\u0105"+
		"\7]\2\2\u0105\u0106\b\36\4\2\u0106<\3\2\2\2\u0107\u0108\7_\2\2\u0108\u0109"+
		"\b\37\5\2\u0109>\3\2\2\2\u010a\u010b\7(\2\2\u010b\u0110\7(\2\2\u010c\u010d"+
		"\7c\2\2\u010d\u010e\7p\2\2\u010e\u0110\7f\2\2\u010f\u010a\3\2\2\2\u010f"+
		"\u010c\3\2\2\2\u0110@\3\2\2\2\u0111\u0112\7~\2\2\u0112\u0116\7~\2\2\u0113"+
		"\u0114\7q\2\2\u0114\u0116\7t\2\2\u0115\u0111\3\2\2\2\u0115\u0113\3\2\2"+
		"\2\u0116B\3\2\2\2\u0117\u011c\7#\2\2\u0118\u0119\7p\2\2\u0119\u011a\7"+
		"q\2\2\u011a\u011c\7v\2\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011c"+
		"D\3\2\2\2\u011d\u011e\7-\2\2\u011eF\3\2\2\2\u011f\u0120\7/\2\2\u0120H"+
		"\3\2\2\2\u0121\u0122\7,\2\2\u0122J\3\2\2\2\u0123\u0124\7\61\2\2\u0124"+
		"L\3\2\2\2\u0125\u0126\7\61\2\2\u0126\u0127\7\61\2\2\u0127N\3\2\2\2\u0128"+
		"\u0129\7\'\2\2\u0129P\3\2\2\2\u012a\u012b\7`\2\2\u012bR\3\2\2\2\u012c"+
		"\u012d\7-\2\2\u012d\u012e\7?\2\2\u012eT\3\2\2\2\u012f\u0130\7/\2\2\u0130"+
		"\u0131\7?\2\2\u0131V\3\2\2\2\u0132\u0133\7,\2\2\u0133\u0134\7?\2\2\u0134"+
		"X\3\2\2\2\u0135\u0136\7\61\2\2\u0136\u0137\7?\2\2\u0137Z\3\2\2\2\u0138"+
		"\u0139\7\61\2\2\u0139\u013a\7\61\2\2\u013a\u013b\7?\2\2\u013b\\\3\2\2"+
		"\2\u013c\u013d\7\'\2\2\u013d\u013e\7?\2\2\u013e^\3\2\2\2\u013f\u0140\7"+
		"`\2\2\u0140\u0141\7?\2\2\u0141`\3\2\2\2\u0142\u0143\7(\2\2\u0143\u0144"+
		"\7?\2\2\u0144b\3\2\2\2\u0145\u0146\7~\2\2\u0146\u0147\7?\2\2\u0147d\3"+
		"\2\2\2\u0148\u0149\7\u0080\2\2\u0149\u014a\7?\2\2\u014af\3\2\2\2\u014b"+
		"\u014c\7?\2\2\u014c\u014d\7?\2\2\u014dh\3\2\2\2\u014e\u014f\7#\2\2\u014f"+
		"\u0150\7?\2\2\u0150j\3\2\2\2\u0151\u0152\7>\2\2\u0152\u0153\7?\2\2\u0153"+
		"l\3\2\2\2\u0154\u0155\7@\2\2\u0155\u0156\7?\2\2\u0156n\3\2\2\2\u0157\u0158"+
		"\7@\2\2\u0158p\3\2\2\2\u0159\u015a\7>\2\2\u015ar\3\2\2\2\u015b\u015c\7"+
		"h\2\2\u015c\u015d\7c\2\2\u015d\u015e\7n\2\2\u015e\u015f\7u\2\2\u015f\u0165"+
		"\7g\2\2\u0160\u0161\7v\2\2\u0161\u0162\7t\2\2\u0162\u0163\7w\2\2\u0163"+
		"\u0165\7g\2\2\u0164\u015b\3\2\2\2\u0164\u0160\3\2\2\2\u0165t\3\2\2\2\u0166"+
		"\u0167\5\u008dG\2\u0167v\3\2\2\2\u0168\u0169\5\u008dG\2\u0169\u016d\7"+
		"\60\2\2\u016a\u016c\5\u008fH\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2"+
		"\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016ex\3\2\2\2\u016f\u016d\3"+
		"\2\2\2\u0170\u0175\7$\2\2\u0171\u0174\n\2\2\2\u0172\u0174\5\u0087D\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u0179\7$\2\2\u0179z\3\2\2\2\u017a\u017b\7)\2\2\u017b\u017c\n\3\2\2\u017c"+
		"\u017d\7)\2\2\u017d|\3\2\2\2\u017e\u0182\t\4\2\2\u017f\u0181\t\5\2\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183~\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0189\6@\2\2\u0186\u0188"+
		"\t\6\2\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\5\u0081"+
		"A\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\5\u0087D\2\u0190\u0191\3\2\2\2\u0191\u0192\b@\6\2\u0192\u0080\3"+
		"\2\2\2\u0193\u0197\7%\2\2\u0194\u0196\n\7\2\2\u0195\u0194\3\2\2\2\u0196"+
		"\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2"+
		"\2\2\u0199\u0197\3\2\2\2\u019a\u019b\bA\7\2\u019b\u0082\3\2\2\2\u019c"+
		"\u019d\7^\2\2\u019d\u019e\5\u0087D\2\u019e\u019f\3\2\2\2\u019f\u01a0\b"+
		"B\b\2\u01a0\u0084\3\2\2\2\u01a1\u01a3\7\17\2\2\u01a2\u01a1\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\7\f\2\2\u01a5\u01a6\6C"+
		"\3\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\bC\t\2\u01a8\u0086\3\2\2\2\u01a9"+
		"\u01ab\7\17\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3"+
		"\2\2\2\u01ac\u01af\7\f\2\2\u01ad\u01af\7\17\2\2\u01ae\u01aa\3\2\2\2\u01ae"+
		"\u01ad\3\2\2\2\u01af\u0088\3\2\2\2\u01b0\u01b2\6E\4\2\u01b1\u01b3\t\6"+
		"\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u008a\3\2\2\2\u01b6\u01b8\t\6\2\2\u01b7\u01b6\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bc\bF\n\2\u01bc\u008c\3\2\2\2\u01bd\u01c6\7\62"+
		"\2\2\u01be\u01c2\t\b\2\2\u01bf\u01c1\5\u008fH\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01bd\3\2\2\2\u01c5\u01be\3\2\2\2\u01c6"+
		"\u008e\3\2\2\2\u01c7\u01c8\t\t\2\2\u01c8\u0090\3\2\2\2\25\2\u010f\u0115"+
		"\u011b\u0164\u016d\u0173\u0175\u0182\u0189\u018d\u0197\u01a2\u01aa\u01ae"+
		"\u01b4\u01b9\u01c2\u01c5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}