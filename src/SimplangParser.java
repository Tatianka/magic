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
		"<INVALID>", "'-='", "'&'", "'in'", "','", "':'", "'&='", "'--'", "'int'", 
		"'void'", "'~='", "'+='", "'float'", "'++'", "'char'", "'*='", "'bool'", 
		"'.'", "'='", "'%='", "'string'", "'/='", "'|='", "'~'", "'//='", "'|'", 
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
		RULE_construct = 19, RULE_member = 20, RULE_attribute_ref = 21, RULE_var_def = 22, 
		RULE_ret = 23, RULE_type = 24, RULE_increment = 25, RULE_decrement = 26, 
		RULE_expression = 27;
	public static final String[] ruleNames = {
		"init", "block", "statement", "simple_statement", "block_statement", "var", 
		"val", "simple_assignment", "complex_assignment", "assignment", "if_statement", 
		"while_statement", "for_statement", "list", "range", "param_list", "func_def", 
		"arglist", "func_call", "construct", "member", "attribute_ref", "var_def", 
		"ret", "type", "increment", "decrement", "expression"
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (9 - 8)) | (1L << (12 - 8)) | (1L << (14 - 8)) | (1L << (16 - 8)) | (1L << (20 - 8)) | (1L << (23 - 8)) | (1L << (WHILE - 8)) | (1L << (FOR - 8)) | (1L << (IF - 8)) | (1L << (BREAK - 8)) | (1L << (CONTINUE - 8)) | (1L << (RET - 8)) | (1L << (NEW - 8)) | (1L << (NULL - 8)) | (1L << (LPAR - 8)) | (1L << (LBRACK - 8)) | (1L << (NOT - 8)) | (1L << (SUB - 8)) | (1L << (EXP - 8)) | (1L << (BOOL - 8)) | (1L << (INT - 8)) | (1L << (FLOAT - 8)) | (1L << (STRING - 8)) | (1L << (CHAR - 8)) | (1L << (ID - 8)) | (1L << (INDENT - 8)))) != 0)) {
				{
				{
				setState(56); statement();
				}
				}
				setState(61);
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
			setState(62); match(INDENT);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63); statement();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (9 - 8)) | (1L << (12 - 8)) | (1L << (14 - 8)) | (1L << (16 - 8)) | (1L << (20 - 8)) | (1L << (23 - 8)) | (1L << (WHILE - 8)) | (1L << (FOR - 8)) | (1L << (IF - 8)) | (1L << (BREAK - 8)) | (1L << (CONTINUE - 8)) | (1L << (RET - 8)) | (1L << (NEW - 8)) | (1L << (NULL - 8)) | (1L << (LPAR - 8)) | (1L << (LBRACK - 8)) | (1L << (NOT - 8)) | (1L << (SUB - 8)) | (1L << (EXP - 8)) | (1L << (BOOL - 8)) | (1L << (INT - 8)) | (1L << (FLOAT - 8)) | (1L << (STRING - 8)) | (1L << (CHAR - 8)) | (1L << (ID - 8)) | (1L << (INDENT - 8)))) != 0) );
			setState(68); match(DEDENT);
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
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); simple_statement();
				setState(71); match(NL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); block_statement();
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
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); var_def();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); expression(0);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79); ret();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
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
			setState(88);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); while_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(85); for_statement();
				}
				break;
			case 8:
			case 9:
			case 12:
			case 14:
			case 16:
			case 20:
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(86); func_def();
				}
				break;
			case INDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(87); block();
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

			setState(91); match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
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
					setState(93);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(94); match(LBRACK);
					setState(95); expression(0);
					setState(96); match(RBRACK);
					}
					} 
				}
				setState(102);
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
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ValVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103); var(0);
				}
				break;

			case 2:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104); match(INT);
				}
				break;

			case 3:
				_localctx = new ValFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105); match(FLOAT);
				}
				break;

			case 4:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(106); match(STRING);
				}
				break;

			case 5:
				_localctx = new ValCharContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(107); match(CHAR);
				}
				break;

			case 6:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(108); match(BOOL);
				}
				break;

			case 7:
				_localctx = new ValNullContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(109); match(NULL);
				}
				break;

			case 8:
				_localctx = new ValListContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(110); list();
				}
				break;

			case 9:
				_localctx = new ValRangeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(111); range();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); var(0);
			setState(115); match(18);
			setState(116); expression(0);
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
			setState(118); var(0);
			setState(119);
			((Complex_assignmentContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 10) | (1L << 11) | (1L << 15) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 24))) != 0)) ) {
				((Complex_assignmentContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(120); expression(0);
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
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); simple_assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); complex_assignment();
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
			setState(126); match(IF);
			setState(127); expression(0);
			setState(128); match(NL);
			setState(129); block();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(130); match(ELIF);
				setState(131); expression(0);
				setState(132); match(NL);
				setState(133); block();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(140); match(ELSE);
				setState(141); match(NL);
				setState(142); block();
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
			setState(145); match(WHILE);
			setState(146); expression(0);
			setState(147); match(NL);
			setState(148); block();
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
		public TerminalNode ID() { return getToken(SimplangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
			setState(150); match(FOR);
			setState(151); match(ID);
			setState(152); match(3);
			setState(153); expression(0);
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
			setState(163); match(5);
			setState(164); expression(0);
			setState(167);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(165); match(5);
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
				while (_la==4) {
					{
					{
					setState(172); match(4);
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 9) | (1L << 12) | (1L << 14) | (1L << 16) | (1L << 20) | (1L << ID))) != 0)) {
				{
				setState(189); type(0);
				setState(190); match(ID);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(191); match(4);
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
			setState(224); match(17);
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
		enterRule(_localctx, 44, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); type(0);
			setState(228); match(ID);
			setState(231);
			_la = _input.LA(1);
			if (_la==18) {
				{
				setState(229); match(18);
				setState(230); expression(0);
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
		enterRule(_localctx, 46, RULE_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(RET);
			setState(235);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 23) | (1L << NEW) | (1L << NULL) | (1L << LPAR) | (1L << LBRACK) | (1L << NOT) | (1L << SUB) | (1L << EXP) | (1L << BOOL) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << ID))) != 0)) {
				{
				setState(234); expression(0);
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
		int _startState = 48;
		enterRecursionRule(_localctx, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new TypeIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(238); match(ID);
				}
				break;
			case 8:
			case 9:
			case 12:
			case 14:
			case 16:
			case 20:
				{
				_localctx = new TypeBasicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 9) | (1L << 12) | (1L << 14) | (1L << 16) | (1L << 20))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(249);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new TypeListContext(new TypeContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(242);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(243); match(LBRACK);
						setState(244); match(RBRACK);
						}
						break;

					case 2:
						{
						_localctx = new TypeRangeContext(new TypeContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(245);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(246); match(LBRACK);
						setState(247); match(5);
						setState(248); match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 50, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); var(0);
			setState(255); match(13);
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
		enterRule(_localctx, 52, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); var(0);
			setState(258); match(7);
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
		public TerminalNode RBRACK() { return getToken(SimplangParser.RBRACK, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LBRACK() { return getToken(SimplangParser.LBRACK, 0); }
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
		int _startState = 54;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261); match(EXP);
				setState(262); expression(12);
				}
				break;

			case 2:
				{
				_localctx = new BitNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263); match(23);
				setState(264); expression(11);
				}
				break;

			case 3:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265); match(SUB);
				setState(266); expression(10);
				}
				break;

			case 4:
				{
				_localctx = new BoolNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267); match(NOT);
				setState(268); expression(4);
				}
				break;

			case 5:
				{
				_localctx = new IncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269); increment();
				}
				break;

			case 6:
				{
				_localctx = new DecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270); decrement();
				}
				break;

			case 7:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271); match(LPAR);
				setState(272); expression(0);
				setState(273); match(RPAR);
				}
				break;

			case 8:
				{
				_localctx = new FuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(275); func_call();
					}
					break;
				case NEW:
					{
					setState(276); construct();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 9:
				{
				_localctx = new AttrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279); attribute_ref();
				}
				break;

			case 10:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280); val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(284);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << IDIV) | (1L << REM))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(285); expression(10);
						}
						break;

					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(286);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(287);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(288); expression(9);
						}
						break;

					case 3:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(290);
						((CompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(291); expression(6);
						}
						break;

					case 4:
						{
						_localctx = new BoolAndContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(292);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(293); ((BoolAndContext)_localctx).op = match(AND);
						setState(294); expression(4);
						}
						break;

					case 5:
						{
						_localctx = new BoolOrContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(296); ((BoolOrContext)_localctx).op = match(OR);
						setState(297); expression(3);
						}
						break;

					case 6:
						{
						_localctx = new SliceContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(298);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(299); match(LBRACK);
						setState(300); expression(0);
						setState(301); match(5);
						setState(302); expression(0);
						setState(305);
						_la = _input.LA(1);
						if (_la==5) {
							{
							setState(303); match(5);
							setState(304); expression(0);
							}
						}

						setState(307); match(RBRACK);
						}
						break;

					case 7:
						{
						_localctx = new IndexContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(309);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(310); match(LBRACK);
						setState(311); expression(0);
						setState(312); match(RBRACK);
						}
						break;

					case 8:
						{
						_localctx = new BitAndContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(315); match(2);
						}
						break;

					case 9:
						{
						_localctx = new BitOrContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(317); match(25);
						}
						break;
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

		case 24: return type_sempred((TypeContext)_localctx, predIndex);

		case 27: return expression_sempred((ExpressionContext)_localctx, predIndex);
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

		case 8: return 15 >= _localctx._p;

		case 9: return 14 >= _localctx._p;

		case 10: return 7 >= _localctx._p;

		case 11: return 6 >= _localctx._p;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3I\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\3\3\3\6\3C\n\3\r\3\16\3D\3\3\3\3\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\5\5T\n\5\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7e\n\7\f\7\16\7h\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bs\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13\177\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008a\n\f\f\f\16\f\u008d\13\f\3\f\3"+
		"\f\3\f\5\f\u0092\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00aa\n\20"+
		"\3\20\3\20\3\21\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4\13\21\5\21"+
		"\u00b6\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u00c6\n\23\f\23\16\23\u00c9\13\23\5\23\u00cb\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u00da"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u00e1\n\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\5\30\u00ea\n\30\3\31\3\31\5\31\u00ee\n\31\3\32\3\32\3\32\5"+
		"\32\u00f3\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00fc\n\32\f\32"+
		"\16\32\u00ff\13\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0118"+
		"\n\35\3\35\3\35\5\35\u011c\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0134\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u0141\n\35\f\35\16\35\u0144\13\35\3\35\2\36\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\b\3\2!\"\t\2\3\3\b\b\f\r\21"+
		"\21\25\25\27\30\32\32\7\2\n\13\16\16\20\20\22\22\26\26\3\2-\60\3\2\61"+
		"\62\3\2\649\u0160\2=\3\2\2\2\4@\3\2\2\2\6L\3\2\2\2\bS\3\2\2\2\nZ\3\2\2"+
		"\2\f\\\3\2\2\2\16r\3\2\2\2\20t\3\2\2\2\22x\3\2\2\2\24~\3\2\2\2\26\u0080"+
		"\3\2\2\2\30\u0093\3\2\2\2\32\u0098\3\2\2\2\34\u009f\3\2\2\2\36\u00a3\3"+
		"\2\2\2 \u00b5\3\2\2\2\"\u00b7\3\2\2\2$\u00ca\3\2\2\2&\u00cc\3\2\2\2(\u00d1"+
		"\3\2\2\2*\u00d9\3\2\2\2,\u00e0\3\2\2\2.\u00e5\3\2\2\2\60\u00eb\3\2\2\2"+
		"\62\u00f2\3\2\2\2\64\u0100\3\2\2\2\66\u0103\3\2\2\28\u011b\3\2\2\2:<\5"+
		"\6\4\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?=\3\2\2\2@B"+
		"\7H\2\2AC\5\6\4\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG"+
		"\7I\2\2G\5\3\2\2\2HI\5\b\5\2IJ\7D\2\2JM\3\2\2\2KM\5\n\6\2LH\3\2\2\2LK"+
		"\3\2\2\2M\7\3\2\2\2NT\5\24\13\2OT\5.\30\2PT\58\35\2QT\5\60\31\2RT\t\2"+
		"\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2\2T\t\3\2\2\2U[\5"+
		"\26\f\2V[\5\30\r\2W[\5\32\16\2X[\5\"\22\2Y[\5\4\3\2ZU\3\2\2\2ZV\3\2\2"+
		"\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\13\3\2\2\2\\]\b\7\1\2]^\7?\2\2^f\3\2"+
		"\2\2_`\6\7\2\3`a\7(\2\2ab\58\35\2bc\7)\2\2ce\3\2\2\2d_\3\2\2\2eh\3\2\2"+
		"\2fd\3\2\2\2fg\3\2\2\2g\r\3\2\2\2hf\3\2\2\2is\5\f\7\2js\7;\2\2ks\7<\2"+
		"\2ls\7=\2\2ms\7>\2\2ns\7:\2\2os\7%\2\2ps\5\34\17\2qs\5\36\20\2ri\3\2\2"+
		"\2rj\3\2\2\2rk\3\2\2\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2"+
		"\2rq\3\2\2\2s\17\3\2\2\2tu\5\f\7\2uv\7\24\2\2vw\58\35\2w\21\3\2\2\2xy"+
		"\5\f\7\2yz\t\3\2\2z{\58\35\2{\23\3\2\2\2|\177\5\20\t\2}\177\5\22\n\2~"+
		"|\3\2\2\2~}\3\2\2\2\177\25\3\2\2\2\u0080\u0081\7\36\2\2\u0081\u0082\5"+
		"8\35\2\u0082\u0083\7D\2\2\u0083\u008b\5\4\3\2\u0084\u0085\7\37\2\2\u0085"+
		"\u0086\58\35\2\u0086\u0087\7D\2\2\u0087\u0088\5\4\3\2\u0088\u008a\3\2"+
		"\2\2\u0089\u0084\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u0091\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7 "+
		"\2\2\u008f\u0090\7D\2\2\u0090\u0092\5\4\3\2\u0091\u008e\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\27\3\2\2\2\u0093\u0094\7\34\2\2\u0094\u0095\58\35"+
		"\2\u0095\u0096\7D\2\2\u0096\u0097\5\4\3\2\u0097\31\3\2\2\2\u0098\u0099"+
		"\7\35\2\2\u0099\u009a\7?\2\2\u009a\u009b\7\5\2\2\u009b\u009c\58\35\2\u009c"+
		"\u009d\7D\2\2\u009d\u009e\5\4\3\2\u009e\33\3\2\2\2\u009f\u00a0\7(\2\2"+
		"\u00a0\u00a1\5 \21\2\u00a1\u00a2\7)\2\2\u00a2\35\3\2\2\2\u00a3\u00a4\7"+
		"(\2\2\u00a4\u00a5\58\35\2\u00a5\u00a6\7\7\2\2\u00a6\u00a9\58\35\2\u00a7"+
		"\u00a8\7\7\2\2\u00a8\u00aa\58\35\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7)\2\2\u00ac\37\3\2\2\2\u00ad\u00b2"+
		"\58\35\2\u00ae\u00af\7\6\2\2\u00af\u00b1\58\35\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"!\3\2\2\2\u00b7\u00b8\5\62\32\2\u00b8\u00b9\7?\2\2\u00b9\u00ba\7&\2\2"+
		"\u00ba\u00bb\5$\23\2\u00bb\u00bc\7\'\2\2\u00bc\u00bd\7D\2\2\u00bd\u00be"+
		"\5\4\3\2\u00be#\3\2\2\2\u00bf\u00c0\5\62\32\2\u00c0\u00c7\7?\2\2\u00c1"+
		"\u00c2\7\6\2\2\u00c2\u00c3\5\62\32\2\u00c3\u00c4\7?\2\2\u00c4\u00c6\3"+
		"\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00bf\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb%\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd\u00ce"+
		"\7&\2\2\u00ce\u00cf\5 \21\2\u00cf\u00d0\7\'\2\2\u00d0\'\3\2\2\2\u00d1"+
		"\u00d2\7$\2\2\u00d2\u00d3\5\62\32\2\u00d3\u00d4\7&\2\2\u00d4\u00d5\5 "+
		"\21\2\u00d5\u00d6\7\'\2\2\u00d6)\3\2\2\2\u00d7\u00da\5\f\7\2\u00d8\u00da"+
		"\5&\24\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da+\3\2\2\2\u00db"+
		"\u00dc\7&\2\2\u00dc\u00dd\58\35\2\u00dd\u00de\7\'\2\2\u00de\u00e1\3\2"+
		"\2\2\u00df\u00e1\5\f\7\2\u00e0\u00db\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\7\23\2\2\u00e3\u00e4\5*\26\2\u00e4-\3\2\2\2"+
		"\u00e5\u00e6\5\62\32\2\u00e6\u00e9\7?\2\2\u00e7\u00e8\7\24\2\2\u00e8\u00ea"+
		"\58\35\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea/\3\2\2\2\u00eb"+
		"\u00ed\7#\2\2\u00ec\u00ee\58\35\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\61\3\2\2\2\u00ef\u00f0\b\32\1\2\u00f0\u00f3\7?\2\2\u00f1\u00f3"+
		"\t\4\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00fd\3\2\2\2\u00f4"+
		"\u00f5\6\32\3\3\u00f5\u00f6\7(\2\2\u00f6\u00fc\7)\2\2\u00f7\u00f8\6\32"+
		"\4\3\u00f8\u00f9\7(\2\2\u00f9\u00fa\7\7\2\2\u00fa\u00fc\7)\2\2\u00fb\u00f4"+
		"\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\63\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\5\f\7"+
		"\2\u0101\u0102\7\17\2\2\u0102\65\3\2\2\2\u0103\u0104\5\f\7\2\u0104\u0105"+
		"\7\t\2\2\u0105\67\3\2\2\2\u0106\u0107\b\35\1\2\u0107\u0108\7\63\2\2\u0108"+
		"\u011c\58\35\2\u0109\u010a\7\31\2\2\u010a\u011c\58\35\2\u010b\u010c\7"+
		"\62\2\2\u010c\u011c\58\35\2\u010d\u010e\7,\2\2\u010e\u011c\58\35\2\u010f"+
		"\u011c\5\64\33\2\u0110\u011c\5\66\34\2\u0111\u0112\7&\2\2\u0112\u0113"+
		"\58\35\2\u0113\u0114\7\'\2\2\u0114\u011c\3\2\2\2\u0115\u0118\5&\24\2\u0116"+
		"\u0118\5(\25\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u011c\3\2"+
		"\2\2\u0119\u011c\5,\27\2\u011a\u011c\5\16\b\2\u011b\u0106\3\2\2\2\u011b"+
		"\u0109\3\2\2\2\u011b\u010b\3\2\2\2\u011b\u010d\3\2\2\2\u011b\u010f\3\2"+
		"\2\2\u011b\u0110\3\2\2\2\u011b\u0111\3\2\2\2\u011b\u0117\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u0142\3\2\2\2\u011d\u011e\6\35"+
		"\5\3\u011e\u011f\t\5\2\2\u011f\u0141\58\35\2\u0120\u0121\6\35\6\3\u0121"+
		"\u0122\t\6\2\2\u0122\u0141\58\35\2\u0123\u0124\6\35\7\3\u0124\u0125\t"+
		"\7\2\2\u0125\u0141\58\35\2\u0126\u0127\6\35\b\3\u0127\u0128\7*\2\2\u0128"+
		"\u0141\58\35\2\u0129\u012a\6\35\t\3\u012a\u012b\7+\2\2\u012b\u0141\58"+
		"\35\2\u012c\u012d\6\35\n\3\u012d\u012e\7(\2\2\u012e\u012f\58\35\2\u012f"+
		"\u0130\7\7\2\2\u0130\u0133\58\35\2\u0131\u0132\7\7\2\2\u0132\u0134\58"+
		"\35\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\7)\2\2\u0136\u0141\3\2\2\2\u0137\u0138\6\35\13\3\u0138\u0139\7"+
		"(\2\2\u0139\u013a\58\35\2\u013a\u013b\7)\2\2\u013b\u0141\3\2\2\2\u013c"+
		"\u013d\6\35\f\3\u013d\u0141\7\4\2\2\u013e\u013f\6\35\r\3\u013f\u0141\7"+
		"\33\2\2\u0140\u011d\3\2\2\2\u0140\u0120\3\2\2\2\u0140\u0123\3\2\2\2\u0140"+
		"\u0126\3\2\2\2\u0140\u0129\3\2\2\2\u0140\u012c\3\2\2\2\u0140\u0137\3\2"+
		"\2\2\u0140\u013c\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u01439\3\2\2\2\u0144\u0142\3\2\2\2"+
		"\35=DLSZfr~\u008b\u0091\u00a9\u00b2\u00b5\u00c7\u00ca\u00d9\u00e0\u00e9"+
		"\u00ed\u00f2\u00fb\u00fd\u0117\u011b\u0133\u0140\u0142";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}