// Generated from Simplang.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplangParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, WHILE=26, FOR=27, IF=28, ELIF=29, ELSE=30, BREAK=31, CONTINUE=32, 
		RET=33, NEW=34, NULL=35, LPAR=36, RPAR=37, LBRACK=38, RBRACK=39, AND=40, 
		OR=41, NOT=42, MUL=43, DIV=44, IDIV=45, REM=46, ADD=47, SUB=48, EXP=49, 
		EQ=50, NE=51, LE=52, GE=53, GT=54, LT=55, BOOL=56, INT=57, FLOAT=58, STRING=59, 
		CHAR=60, ID=61, EMPTY_LINE=62, COMMENT=63, LINE_ESCAPE=64, IGNORE_NEWLINE=65, 
		NL=66, LEADING_WS=67, WS=68, DIGIT=69, INDENT=70, DEDENT=71;
	public static final String[] tokenNames = {
		"<INVALID>", "'-='", "'&'", "','", "':'", "'&='", "'--'", "'int'", "'void'", 
		"'~='", "'+='", "'float'", "'++'", "'char'", "'*='", "'bool'", "'.'", 
		"'='", "'%='", "':='", "'string'", "'/='", "'|='", "'~'", "'//='", "'|'", 
		"'while'", "'for'", "'if'", "'elif'", "'else'", "'break'", "'continue'", 
		"'return'", "'new'", "'null'", "'('", "')'", "'['", "']'", "AND", "OR", 
		"NOT", "'*'", "'/'", "'//'", "'%'", "'+'", "'-'", "'^'", "'=='", "'!='", 
		"'<='", "'>='", "'>'", "'<'", "BOOL", "INT", "FLOAT", "STRING", "CHAR", 
		"ID", "EMPTY_LINE", "COMMENT", "LINE_ESCAPE", "IGNORE_NEWLINE", "NL", 
		"LEADING_WS", "WS", "DIGIT", "INDENT", "DEDENT"
	};
	public static final int
		RULE_init = 0, RULE_block = 1, RULE_statement = 2, RULE_simple_statement = 3, 
		RULE_block_statement = 4, RULE_var = 5, RULE_val = 6, RULE_simple_assignment = 7, 
		RULE_complex_assignment = 8, RULE_assignment = 9, RULE_if_statement = 10, 
		RULE_while_statement = 11, RULE_for_statement = 12, RULE_list = 13, RULE_range = 14, 
		RULE_param_list = 15, RULE_func_def = 16, RULE_arglist = 17, RULE_func_call = 18, 
		RULE_construct = 19, RULE_member = 20, RULE_attribute_ref = 21, RULE_slicing = 22, 
		RULE_var_def = 23, RULE_ret = 24, RULE_type = 25, RULE_increment = 26, 
		RULE_decrement = 27, RULE_expression = 28;
	public static final String[] ruleNames = {
		"init", "block", "statement", "simple_statement", "block_statement", "var", 
		"val", "simple_assignment", "complex_assignment", "assignment", "if_statement", 
		"while_statement", "for_statement", "list", "range", "param_list", "func_def", 
		"arglist", "func_call", "construct", "member", "attribute_ref", "slicing", 
		"var_def", "ret", "type", "increment", "decrement", "expression"
	};

	@Override
	public String getGrammarFileName() { return "Simplang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimplangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (7 - 7)) | (1L << (8 - 7)) | (1L << (11 - 7)) | (1L << (13 - 7)) | (1L << (15 - 7)) | (1L << (20 - 7)) | (1L << (23 - 7)) | (1L << (WHILE - 7)) | (1L << (FOR - 7)) | (1L << (IF - 7)) | (1L << (BREAK - 7)) | (1L << (CONTINUE - 7)) | (1L << (RET - 7)) | (1L << (NEW - 7)) | (1L << (NULL - 7)) | (1L << (LPAR - 7)) | (1L << (LBRACK - 7)) | (1L << (NOT - 7)) | (1L << (SUB - 7)) | (1L << (EXP - 7)) | (1L << (BOOL - 7)) | (1L << (INT - 7)) | (1L << (FLOAT - 7)) | (1L << (STRING - 7)) | (1L << (CHAR - 7)) | (1L << (ID - 7)) | (1L << (INDENT - 7)))) != 0)) {
				{
				{
				setState(58); statement();
				}
				}
				setState(63);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode INDENT() { return getToken(SimplangParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(SimplangParser.DEDENT, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(INDENT);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65); statement();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & ((1L << (7 - 7)) | (1L << (8 - 7)) | (1L << (11 - 7)) | (1L << (13 - 7)) | (1L << (15 - 7)) | (1L << (20 - 7)) | (1L << (23 - 7)) | (1L << (WHILE - 7)) | (1L << (FOR - 7)) | (1L << (IF - 7)) | (1L << (BREAK - 7)) | (1L << (CONTINUE - 7)) | (1L << (RET - 7)) | (1L << (NEW - 7)) | (1L << (NULL - 7)) | (1L << (LPAR - 7)) | (1L << (LBRACK - 7)) | (1L << (NOT - 7)) | (1L << (SUB - 7)) | (1L << (EXP - 7)) | (1L << (BOOL - 7)) | (1L << (INT - 7)) | (1L << (FLOAT - 7)) | (1L << (STRING - 7)) | (1L << (CHAR - 7)) | (1L << (ID - 7)) | (1L << (INDENT - 7)))) != 0) );
			setState(70); match(DEDENT);
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

	public static class StatementContext extends ParserRuleContext {
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public TerminalNode NL() { return getToken(SimplangParser.NL, 0); }
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); simple_statement();
				setState(73); match(NL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); block_statement();
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

	public static class Simple_statementContext extends ParserRuleContext {
		public Token stat;
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(SimplangParser.BREAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(SimplangParser.CONTINUE, 0); }
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitSimple_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitSimple_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_statement);
		int _la;
		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); var_def();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); expression(0);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(81); ret();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				((Simple_statementContext)_localctx).stat = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BREAK || _la==CONTINUE) ) {
					((Simple_statementContext)_localctx).stat = (Token)_errHandler.recoverInline(this);
				}
				consume();
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

	public static class Block_statementContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_statement);
		try {
			setState(90);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(87); for_statement();
				}
				break;
			case 7:
			case 8:
			case 11:
			case 13:
			case 15:
			case 20:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(88); func_def();
				}
				break;
			case INDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(89); block();
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

	public static class VarContext extends ParserRuleContext {
		public int _p;
		public VarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class VarListContext extends VarContext {
		public TerminalNode RBRACK() { return getToken(SimplangParser.RBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SimplangParser.LBRACK, 0); }
		public VarListContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIDContext extends VarContext {
		public TerminalNode ID() { return getToken(SimplangParser.ID, 0); }
		public VarIDContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterVarID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitVarID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarContext _localctx = new VarContext(_ctx, _parentState, _p);
		VarContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VarIDContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(93); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarListContext(new VarContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_var);
					setState(95);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(96); match(LBRACK);
					setState(97); expression(0);
					setState(98); match(RBRACK);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	 
		public ValContext() { }
		public void copyFrom(ValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValListContext extends ValContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ValListContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterValList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitValList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitValList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValRangeContext extends ValContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ValRangeContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterValRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitValRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitValRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValNullContext extends ValContext {
		public TerminalNode NULL() { return getToken(SimplangParser.NULL, 0); }
		public ValNullContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterValNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitValNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitValNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValBoolContext extends ValContext {
		public TerminalNode BOOL() { return getToken(SimplangParser.BOOL, 0); }
		public ValBoolContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterValBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitValBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValVarContext extends ValContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValVarContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterValVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitValVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitValVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValFloatContext extends ValContext {
		public TerminalNode FLOAT() { return getToken(SimplangParser.FLOAT, 0); }
		public ValFloatContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterValFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitValFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitValFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValIntContext extends ValContext {
		public TerminalNode INT() { return getToken(SimplangParser.INT, 0); }
		public ValIntContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterValInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitValInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitValInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValStringContext extends ValContext {
		public TerminalNode STRING() { return getToken(SimplangParser.STRING, 0); }
		public ValStringContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterValString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitValString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitValString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValCharContext extends ValContext {
		public TerminalNode CHAR() { return getToken(SimplangParser.CHAR, 0); }
		public ValCharContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterValChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitValChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitValChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_val);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ValVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105); var(0);
				}
				break;

			case 2:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(INT);
				}
				break;

			case 3:
				_localctx = new ValFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(107); match(FLOAT);
				}
				break;

			case 4:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108); match(STRING);
				}
				break;

			case 5:
				_localctx = new ValCharContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(109); match(CHAR);
				}
				break;

			case 6:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(110); match(BOOL);
				}
				break;

			case 7:
				_localctx = new ValNullContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(111); match(NULL);
				}
				break;

			case 8:
				_localctx = new ValListContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(112); list();
				}
				break;

			case 9:
				_localctx = new ValRangeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(113); range();
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

	public static class Simple_assignmentContext extends ParserRuleContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Simple_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterSimple_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitSimple_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitSimple_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_assignmentContext simple_assignment() throws RecognitionException {
		Simple_assignmentContext _localctx = new Simple_assignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); var(0);
			setState(117);
			((Simple_assignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==17 || _la==19) ) {
				((Simple_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(118); expression(0);
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

	public static class Complex_assignmentContext extends ParserRuleContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Complex_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterComplex_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitComplex_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitComplex_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_assignmentContext complex_assignment() throws RecognitionException {
		Complex_assignmentContext _localctx = new Complex_assignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_complex_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); var(0);
			setState(121);
			((Complex_assignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 5) | (1L << 9) | (1L << 10) | (1L << 14) | (1L << 18) | (1L << 21) | (1L << 22) | (1L << 24))) != 0)) ) {
				((Complex_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(122); expression(0);
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
		public Simple_assignmentContext simple_assignment() {
			return getRuleContext(Simple_assignmentContext.class,0);
		}
		public Complex_assignmentContext complex_assignment() {
			return getRuleContext(Complex_assignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); simple_assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); complex_assignment();
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

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(SimplangParser.NL); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(SimplangParser.IF, 0); }
		public TerminalNode NL(int i) {
			return getToken(SimplangParser.NL, i);
		}
		public TerminalNode ELSE() { return getToken(SimplangParser.ELSE, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ELIF(int i) {
			return getToken(SimplangParser.ELIF, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public List<TerminalNode> ELIF() { return getTokens(SimplangParser.ELIF); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(IF);
			setState(129); expression(0);
			setState(130); match(NL);
			setState(131); block();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(132); match(ELIF);
				setState(133); expression(0);
				setState(134); match(NL);
				setState(135); block();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(142); match(ELSE);
				setState(143); match(NL);
				setState(144); block();
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SimplangParser.WHILE, 0); }
		public TerminalNode NL() { return getToken(SimplangParser.NL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(WHILE);
			setState(148); expression(0);
			setState(149); match(NL);
			setState(150); block();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SimplangParser.NL, 0); }
		public TerminalNode FOR() { return getToken(SimplangParser.FOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_assignmentContext simple_assignment() {
			return getRuleContext(Simple_assignmentContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(FOR);
			setState(153); simple_assignment();
			setState(154); match(NL);
			setState(155); block();
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(SimplangParser.RBRACK, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SimplangParser.LBRACK, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(LBRACK);
			setState(158); param_list();
			setState(159); match(RBRACK);
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

	public static class RangeContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(SimplangParser.RBRACK, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LBRACK() { return getToken(SimplangParser.LBRACK, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(LBRACK);
			setState(162); expression(0);
			setState(163); match(4);
			setState(164); expression(0);
			setState(167);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(165); match(4);
				setState(166); expression(0);
				}
			}

			setState(169); match(RBRACK);
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

	public static class Param_listContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 23) | (1L << NEW) | (1L << NULL) | (1L << LPAR) | (1L << LBRACK) | (1L << NOT) | (1L << SUB) | (1L << EXP) | (1L << BOOL) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << ID))) != 0)) {
				{
				setState(171); expression(0);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(172); match(3);
					setState(173); expression(0);
					}
					}
					setState(178);
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SimplangParser.NL, 0); }
		public TerminalNode RPAR() { return getToken(SimplangParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(SimplangParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(SimplangParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); type(0);
			setState(182); match(ID);
			setState(183); match(LPAR);
			setState(184); arglist();
			setState(185); match(RPAR);
			setState(186); match(NL);
			setState(187); block();
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

	public static class ArglistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimplangParser.ID); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode ID(int i) {
			return getToken(SimplangParser.ID, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 8) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 20) | (1L << ID))) != 0)) {
				{
				setState(189); type(0);
				setState(190); match(ID);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(191); match(3);
					setState(192); type(0);
					setState(193); match(ID);
					}
					}
					setState(199);
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

	public static class Func_callContext extends ParserRuleContext {
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SimplangParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(SimplangParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(SimplangParser.ID, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(ID);
			setState(203); match(LPAR);
			setState(204); param_list();
			setState(205); match(RPAR);
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

	public static class ConstructContext extends ParserRuleContext {
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode NEW() { return getToken(SimplangParser.NEW, 0); }
		public TerminalNode RPAR() { return getToken(SimplangParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(SimplangParser.LPAR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_construct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterConstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitConstruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitConstruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructContext construct() throws RecognitionException {
		ConstructContext _localctx = new ConstructContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_construct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(NEW);
			setState(208); type(0);
			setState(209); match(LPAR);
			setState(210); param_list();
			setState(211); match(RPAR);
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

	public static class MemberContext extends ParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_member);
		try {
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); var(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); func_call();
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

	public static class Attribute_refContext extends ParserRuleContext {
		public TerminalNode RPAR() { return getToken(SimplangParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(SimplangParser.LPAR, 0); }
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Attribute_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterAttribute_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitAttribute_ref(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitAttribute_ref(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_refContext attribute_ref() throws RecognitionException {
		Attribute_refContext _localctx = new Attribute_refContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attribute_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			switch (_input.LA(1)) {
			case LPAR:
				{
				{
				setState(217); match(LPAR);
				setState(218); expression(0);
				setState(219); match(RPAR);
				}
				}
				break;
			case ID:
				{
				setState(221); var(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(224); match(16);
			setState(225); member();
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

	public static class SlicingContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(SimplangParser.RBRACK, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(SimplangParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(SimplangParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SimplangParser.LBRACK, 0); }
		public SlicingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterSlicing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitSlicing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitSlicing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlicingContext slicing() throws RecognitionException {
		SlicingContext _localctx = new SlicingContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_slicing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			switch (_input.LA(1)) {
			case LPAR:
				{
				{
				setState(227); match(LPAR);
				setState(228); expression(0);
				setState(229); match(RPAR);
				}
				}
				break;
			case ID:
				{
				setState(231); var(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(234); match(LBRACK);
			setState(235); expression(0);
			setState(236); match(4);
			setState(237); expression(0);
			setState(240);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(238); match(4);
				setState(239); expression(0);
				}
			}

			setState(242); match(RBRACK);
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

	public static class Var_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimplangParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); type(0);
			setState(245); match(ID);
			setState(248);
			_la = _input.LA(1);
			if (_la==17) {
				{
				setState(246); match(17);
				setState(247); expression(0);
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(SimplangParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(RET);
			setState(252);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 23) | (1L << NEW) | (1L << NULL) | (1L << LPAR) | (1L << LBRACK) | (1L << NOT) | (1L << SUB) | (1L << EXP) | (1L << BOOL) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << ID))) != 0)) {
				{
				setState(251); expression(0);
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

	public static class TypeContext extends ParserRuleContext {
		public int _p;
		public TypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypeContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class TypeRangeContext extends TypeContext {
		public TerminalNode RBRACK() { return getToken(SimplangParser.RBRACK, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SimplangParser.LBRACK, 0); }
		public TypeRangeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterTypeRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitTypeRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitTypeRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeBasicContext extends TypeContext {
		public TypeBasicContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterTypeBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitTypeBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitTypeBasic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeListContext extends TypeContext {
		public TerminalNode RBRACK() { return getToken(SimplangParser.RBRACK, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SimplangParser.LBRACK, 0); }
		public TypeListContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeIdContext extends TypeContext {
		public TerminalNode ID() { return getToken(SimplangParser.ID, 0); }
		public TypeIdContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterTypeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitTypeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState, _p);
		TypeContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new TypeIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(255); match(ID);
				}
				break;
			case 7:
			case 8:
			case 11:
			case 13:
			case 15:
			case 20:
				{
				_localctx = new TypeBasicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 8) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 20))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(266);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new TypeListContext(new TypeContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(259);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(260); match(LBRACK);
						setState(261); match(RBRACK);
						}
						break;

					case 2:
						{
						_localctx = new TypeRangeContext(new TypeContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(262);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(263); match(LBRACK);
						setState(264); match(4);
						setState(265); match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class IncrementContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); var(0);
			setState(272); match(12);
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

	public static class DecrementContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); var(0);
			setState(275); match(6);
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
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class BoolOrContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(SimplangParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BoolOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterBoolOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitBoolOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitBoolOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueContext extends ExpressionContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrContext extends ExpressionContext {
		public Attribute_refContext attribute_ref() {
			return getRuleContext(Attribute_refContext.class,0);
		}
		public AttrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncContext extends ExpressionContext {
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public IncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitOrContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BitOrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterBitOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitBitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitBitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolAndContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SimplangParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BoolAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterBoolAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitBoolAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitBoolAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(SimplangParser.LT, 0); }
		public TerminalNode LE() { return getToken(SimplangParser.LE, 0); }
		public TerminalNode NE() { return getToken(SimplangParser.NE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(SimplangParser.GT, 0); }
		public TerminalNode GE() { return getToken(SimplangParser.GE, 0); }
		public TerminalNode EQ() { return getToken(SimplangParser.EQ, 0); }
		public CompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExpressionContext {
		public TerminalNode RPAR() { return getToken(SimplangParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(SimplangParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitAndContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BitAndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterBitAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitBitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitBitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SliceContext extends ExpressionContext {
		public SlicingContext slicing() {
			return getRuleContext(SlicingContext.class,0);
		}
		public SliceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitSlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitSlice(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolNotContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(SimplangParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BoolNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterBoolNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitBoolNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitBoolNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitNotContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BitNotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterBitNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitBitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitBitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends ExpressionContext {
		public TerminalNode EXP() { return getToken(SimplangParser.EXP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(SimplangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SimplangParser.DIV, 0); }
		public TerminalNode IDIV() { return getToken(SimplangParser.IDIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode REM() { return getToken(SimplangParser.REM, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexContext extends ExpressionContext {
		public TerminalNode RBRACK() { return getToken(SimplangParser.RBRACK, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LBRACK() { return getToken(SimplangParser.LBRACK, 0); }
		public IndexContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncContext extends ExpressionContext {
		public ConstructContext construct() {
			return getRuleContext(ConstructContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public FuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUB() { return getToken(SimplangParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(SimplangParser.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecContext extends ExpressionContext {
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public DecContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplangListener ) ((SimplangListener)listener).exitDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplangVisitor ) return ((SimplangVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(278); match(EXP);
				setState(279); expression(12);
				}
				break;

			case 2:
				{
				_localctx = new BitNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280); match(23);
				setState(281); expression(11);
				}
				break;

			case 3:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282); match(SUB);
				setState(283); expression(10);
				}
				break;

			case 4:
				{
				_localctx = new BoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284); match(NOT);
				setState(285); expression(4);
				}
				break;

			case 5:
				{
				_localctx = new IncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286); increment();
				}
				break;

			case 6:
				{
				_localctx = new DecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287); decrement();
				}
				break;

			case 7:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288); match(LPAR);
				setState(289); expression(0);
				setState(290); match(RPAR);
				}
				break;

			case 8:
				{
				_localctx = new FuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(292); func_call();
					}
					break;
				case NEW:
					{
					setState(293); construct();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 9:
				{
				_localctx = new SliceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296); slicing();
				}
				break;

			case 10:
				{
				_localctx = new AttrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297); attribute_ref();
				}
				break;

			case 11:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298); val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(325);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(301);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(302);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << IDIV) | (1L << REM))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(303); expression(10);
						}
						break;

					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(304);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(305);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(306); expression(9);
						}
						break;

					case 3:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(307);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(308);
						((CompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(309); expression(6);
						}
						break;

					case 4:
						{
						_localctx = new BoolAndContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(310);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(311); ((BoolAndContext)_localctx).op = match(AND);
						setState(312); expression(4);
						}
						break;

					case 5:
						{
						_localctx = new BoolOrContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(313);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(314); ((BoolOrContext)_localctx).op = match(OR);
						setState(315); expression(3);
						}
						break;

					case 6:
						{
						_localctx = new IndexContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(317); match(LBRACK);
						setState(318); expression(0);
						setState(319); match(RBRACK);
						}
						break;

					case 7:
						{
						_localctx = new BitAndContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(322); match(2);
						}
						break;

					case 8:
						{
						_localctx = new BitOrContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(323);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(324); match(25);
						}
						break;
					}
					} 
				}
				setState(329);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return var_sempred((VarContext)_localctx, predIndex);

		case 25: return type_sempred((TypeContext)_localctx, predIndex);

		case 28: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 9 >= _localctx._p;

		case 4: return 8 >= _localctx._p;

		case 5: return 5 >= _localctx._p;

		case 6: return 3 >= _localctx._p;

		case 7: return 2 >= _localctx._p;

		case 8: return 14 >= _localctx._p;

		case 9: return 7 >= _localctx._p;

		case 10: return 6 >= _localctx._p;
		}
		return true;
	}
	private boolean var_sempred(VarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 3 >= _localctx._p;

		case 2: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3I\u014d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\6\3E\n\3\r\3\16\3F\3\3\3\3\3\4\3\4\3\4\3\4\5\4O\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\5\5V\n\5\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7g\n\7\f\7\16\7j\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bu\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0081"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f"+
		"\13\f\3\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00aa\n\20"+
		"\3\20\3\20\3\21\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4\13\21\5\21"+
		"\u00b6\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00c6\n\23\f\23\16\23\u00c9\13\23\5\23\u00cb\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00da"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u00e1\n\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u00eb\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00f3"+
		"\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00fb\n\31\3\32\3\32\5\32\u00ff"+
		"\n\32\3\33\3\33\3\33\5\33\u0104\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u010d\n\33\f\33\16\33\u0110\13\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0129\n\36\3\36\3\36\3\36\5\36\u012e\n\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0148\n\36\f\36\16\36"+
		"\u014b\13\36\3\36\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:\2\t\3\2!\"\4\2\23\23\25\25\t\2\3\3\7\7\13\f\20\20\24\24"+
		"\27\30\32\32\7\2\t\n\r\r\17\17\21\21\26\26\3\2-\60\3\2\61\62\3\2\649\u0167"+
		"\2?\3\2\2\2\4B\3\2\2\2\6N\3\2\2\2\bU\3\2\2\2\n\\\3\2\2\2\f^\3\2\2\2\16"+
		"t\3\2\2\2\20v\3\2\2\2\22z\3\2\2\2\24\u0080\3\2\2\2\26\u0082\3\2\2\2\30"+
		"\u0095\3\2\2\2\32\u009a\3\2\2\2\34\u009f\3\2\2\2\36\u00a3\3\2\2\2 \u00b5"+
		"\3\2\2\2\"\u00b7\3\2\2\2$\u00ca\3\2\2\2&\u00cc\3\2\2\2(\u00d1\3\2\2\2"+
		"*\u00d9\3\2\2\2,\u00e0\3\2\2\2.\u00ea\3\2\2\2\60\u00f6\3\2\2\2\62\u00fc"+
		"\3\2\2\2\64\u0103\3\2\2\2\66\u0111\3\2\2\28\u0114\3\2\2\2:\u012d\3\2\2"+
		"\2<>\5\6\4\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2"+
		"\2\2BD\7H\2\2CE\5\6\4\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2"+
		"\2\2HI\7I\2\2I\5\3\2\2\2JK\5\b\5\2KL\7D\2\2LO\3\2\2\2MO\5\n\6\2NJ\3\2"+
		"\2\2NM\3\2\2\2O\7\3\2\2\2PV\5\24\13\2QV\5\60\31\2RV\5:\36\2SV\5\62\32"+
		"\2TV\t\2\2\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2\2V\t\3\2"+
		"\2\2W]\5\26\f\2X]\5\30\r\2Y]\5\32\16\2Z]\5\"\22\2[]\5\4\3\2\\W\3\2\2\2"+
		"\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\13\3\2\2\2^_\b\7\1\2_`\7"+
		"?\2\2`h\3\2\2\2ab\6\7\2\3bc\7(\2\2cd\5:\36\2de\7)\2\2eg\3\2\2\2fa\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\r\3\2\2\2jh\3\2\2\2ku\5\f\7\2lu\7"+
		";\2\2mu\7<\2\2nu\7=\2\2ou\7>\2\2pu\7:\2\2qu\7%\2\2ru\5\34\17\2su\5\36"+
		"\20\2tk\3\2\2\2tl\3\2\2\2tm\3\2\2\2tn\3\2\2\2to\3\2\2\2tp\3\2\2\2tq\3"+
		"\2\2\2tr\3\2\2\2ts\3\2\2\2u\17\3\2\2\2vw\5\f\7\2wx\t\3\2\2xy\5:\36\2y"+
		"\21\3\2\2\2z{\5\f\7\2{|\t\4\2\2|}\5:\36\2}\23\3\2\2\2~\u0081\5\20\t\2"+
		"\177\u0081\5\22\n\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\25\3\2\2\2"+
		"\u0082\u0083\7\36\2\2\u0083\u0084\5:\36\2\u0084\u0085\7D\2\2\u0085\u008d"+
		"\5\4\3\2\u0086\u0087\7\37\2\2\u0087\u0088\5:\36\2\u0088\u0089\7D\2\2\u0089"+
		"\u008a\5\4\3\2\u008a\u008c\3\2\2\2\u008b\u0086\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0093\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7 \2\2\u0091\u0092\7D\2\2\u0092\u0094\5\4\3"+
		"\2\u0093\u0090\3\2\2\2\u0093\u0094\3\2\2\2\u0094\27\3\2\2\2\u0095\u0096"+
		"\7\34\2\2\u0096\u0097\5:\36\2\u0097\u0098\7D\2\2\u0098\u0099\5\4\3\2\u0099"+
		"\31\3\2\2\2\u009a\u009b\7\35\2\2\u009b\u009c\5\20\t\2\u009c\u009d\7D\2"+
		"\2\u009d\u009e\5\4\3\2\u009e\33\3\2\2\2\u009f\u00a0\7(\2\2\u00a0\u00a1"+
		"\5 \21\2\u00a1\u00a2\7)\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\7(\2\2\u00a4"+
		"\u00a5\5:\36\2\u00a5\u00a6\7\6\2\2\u00a6\u00a9\5:\36\2\u00a7\u00a8\7\6"+
		"\2\2\u00a8\u00aa\5:\36\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7)\2\2\u00ac\37\3\2\2\2\u00ad\u00b2\5:\36\2"+
		"\u00ae\u00af\7\5\2\2\u00af\u00b1\5:\36\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6!\3\2\2\2"+
		"\u00b7\u00b8\5\64\33\2\u00b8\u00b9\7?\2\2\u00b9\u00ba\7&\2\2\u00ba\u00bb"+
		"\5$\23\2\u00bb\u00bc\7\'\2\2\u00bc\u00bd\7D\2\2\u00bd\u00be\5\4\3\2\u00be"+
		"#\3\2\2\2\u00bf\u00c0\5\64\33\2\u00c0\u00c7\7?\2\2\u00c1\u00c2\7\5\2\2"+
		"\u00c2\u00c3\5\64\33\2\u00c3\u00c4\7?\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00bf\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb%\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd\u00ce\7&\2\2\u00ce\u00cf"+
		"\5 \21\2\u00cf\u00d0\7\'\2\2\u00d0\'\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2"+
		"\u00d3\5\64\33\2\u00d3\u00d4\7&\2\2\u00d4\u00d5\5 \21\2\u00d5\u00d6\7"+
		"\'\2\2\u00d6)\3\2\2\2\u00d7\u00da\5\f\7\2\u00d8\u00da\5&\24\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da+\3\2\2\2\u00db\u00dc\7&\2\2\u00dc\u00dd"+
		"\5:\36\2\u00dd\u00de\7\'\2\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5\f\7\2\u00e0"+
		"\u00db\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\22"+
		"\2\2\u00e3\u00e4\5*\26\2\u00e4-\3\2\2\2\u00e5\u00e6\7&\2\2\u00e6\u00e7"+
		"\5:\36\2\u00e7\u00e8\7\'\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00eb\5\f\7\2\u00ea"+
		"\u00e5\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7("+
		"\2\2\u00ed\u00ee\5:\36\2\u00ee\u00ef\7\6\2\2\u00ef\u00f2\5:\36\2\u00f0"+
		"\u00f1\7\6\2\2\u00f1\u00f3\5:\36\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7)\2\2\u00f5/\3\2\2\2\u00f6\u00f7"+
		"\5\64\33\2\u00f7\u00fa\7?\2\2\u00f8\u00f9\7\23\2\2\u00f9\u00fb\5:\36\2"+
		"\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\61\3\2\2\2\u00fc\u00fe"+
		"\7#\2\2\u00fd\u00ff\5:\36\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\63\3\2\2\2\u0100\u0101\b\33\1\2\u0101\u0104\7?\2\2\u0102\u0104\t\5\2"+
		"\2\u0103\u0100\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u010e\3\2\2\2\u0105\u0106"+
		"\6\33\3\3\u0106\u0107\7(\2\2\u0107\u010d\7)\2\2\u0108\u0109\6\33\4\3\u0109"+
		"\u010a\7(\2\2\u010a\u010b\7\6\2\2\u010b\u010d\7)\2\2\u010c\u0105\3\2\2"+
		"\2\u010c\u0108\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\65\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\5\f\7\2\u0112"+
		"\u0113\7\16\2\2\u0113\67\3\2\2\2\u0114\u0115\5\f\7\2\u0115\u0116\7\b\2"+
		"\2\u01169\3\2\2\2\u0117\u0118\b\36\1\2\u0118\u0119\7\63\2\2\u0119\u012e"+
		"\5:\36\2\u011a\u011b\7\31\2\2\u011b\u012e\5:\36\2\u011c\u011d\7\62\2\2"+
		"\u011d\u012e\5:\36\2\u011e\u011f\7,\2\2\u011f\u012e\5:\36\2\u0120\u012e"+
		"\5\66\34\2\u0121\u012e\58\35\2\u0122\u0123\7&\2\2\u0123\u0124\5:\36\2"+
		"\u0124\u0125\7\'\2\2\u0125\u012e\3\2\2\2\u0126\u0129\5&\24\2\u0127\u0129"+
		"\5(\25\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012e\3\2\2\2\u012a"+
		"\u012e\5.\30\2\u012b\u012e\5,\27\2\u012c\u012e\5\16\b\2\u012d\u0117\3"+
		"\2\2\2\u012d\u011a\3\2\2\2\u012d\u011c\3\2\2\2\u012d\u011e\3\2\2\2\u012d"+
		"\u0120\3\2\2\2\u012d\u0121\3\2\2\2\u012d\u0122\3\2\2\2\u012d\u0128\3\2"+
		"\2\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e"+
		"\u0149\3\2\2\2\u012f\u0130\6\36\5\3\u0130\u0131\t\6\2\2\u0131\u0148\5"+
		":\36\2\u0132\u0133\6\36\6\3\u0133\u0134\t\7\2\2\u0134\u0148\5:\36\2\u0135"+
		"\u0136\6\36\7\3\u0136\u0137\t\b\2\2\u0137\u0148\5:\36\2\u0138\u0139\6"+
		"\36\b\3\u0139\u013a\7*\2\2\u013a\u0148\5:\36\2\u013b\u013c\6\36\t\3\u013c"+
		"\u013d\7+\2\2\u013d\u0148\5:\36\2\u013e\u013f\6\36\n\3\u013f\u0140\7("+
		"\2\2\u0140\u0141\5:\36\2\u0141\u0142\7)\2\2\u0142\u0148\3\2\2\2\u0143"+
		"\u0144\6\36\13\3\u0144\u0148\7\4\2\2\u0145\u0146\6\36\f\3\u0146\u0148"+
		"\7\33\2\2\u0147\u012f\3\2\2\2\u0147\u0132\3\2\2\2\u0147\u0135\3\2\2\2"+
		"\u0147\u0138\3\2\2\2\u0147\u013b\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u0143"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a;\3\2\2\2\u014b\u0149\3\2\2\2\36?FNU\\ht\u0080\u008d"+
		"\u0093\u00a9\u00b2\u00b5\u00c7\u00ca\u00d9\u00e0\u00ea\u00f2\u00fa\u00fe"+
		"\u0103\u010c\u010e\u0128\u012d\u0147\u0149";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}