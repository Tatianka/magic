// Generated from Magic.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MagicParser}.
 */
public interface MagicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MagicParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull MagicParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull MagicParser.ArglistContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#ValBool}.
	 * @param ctx the parse tree
	 */
	void enterValBool(@NotNull MagicParser.ValBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#ValBool}.
	 * @param ctx the parse tree
	 */
	void exitValBool(@NotNull MagicParser.ValBoolContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#VarID}.
	 * @param ctx the parse tree
	 */
	void enterVarID(@NotNull MagicParser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#VarID}.
	 * @param ctx the parse tree
	 */
	void exitVarID(@NotNull MagicParser.VarIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(@NotNull MagicParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(@NotNull MagicParser.AttrContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#ValFloat}.
	 * @param ctx the parse tree
	 */
	void enterValFloat(@NotNull MagicParser.ValFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#ValFloat}.
	 * @param ctx the parse tree
	 */
	void exitValFloat(@NotNull MagicParser.ValFloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#simple_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSimple_assignment(@NotNull MagicParser.Simple_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#simple_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSimple_assignment(@NotNull MagicParser.Simple_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#UnaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(@NotNull MagicParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#UnaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(@NotNull MagicParser.UnaryMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#ValChar}.
	 * @param ctx the parse tree
	 */
	void enterValChar(@NotNull MagicParser.ValCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#ValChar}.
	 * @param ctx the parse tree
	 */
	void exitValChar(@NotNull MagicParser.ValCharContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#BoolNot}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(@NotNull MagicParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#BoolNot}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(@NotNull MagicParser.BoolNotContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#ValRange}.
	 * @param ctx the parse tree
	 */
	void enterValRange(@NotNull MagicParser.ValRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#ValRange}.
	 * @param ctx the parse tree
	 */
	void exitValRange(@NotNull MagicParser.ValRangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull MagicParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull MagicParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#attribute_ref}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_ref(@NotNull MagicParser.Attribute_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#attribute_ref}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_ref(@NotNull MagicParser.Attribute_refContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull MagicParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull MagicParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void enterTypeBasic(@NotNull MagicParser.TypeBasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void exitTypeBasic(@NotNull MagicParser.TypeBasicContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull MagicParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull MagicParser.FuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull MagicParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull MagicParser.For_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(@NotNull MagicParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(@NotNull MagicParser.DecrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(@NotNull MagicParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(@NotNull MagicParser.IncrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull MagicParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull MagicParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#ValNull}.
	 * @param ctx the parse tree
	 */
	void enterValNull(@NotNull MagicParser.ValNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#ValNull}.
	 * @param ctx the parse tree
	 */
	void exitValNull(@NotNull MagicParser.ValNullContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(@NotNull MagicParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(@NotNull MagicParser.Var_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull MagicParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull MagicParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#BoolAnd}.
	 * @param ctx the parse tree
	 */
	void enterBoolAnd(@NotNull MagicParser.BoolAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#BoolAnd}.
	 * @param ctx the parse tree
	 */
	void exitBoolAnd(@NotNull MagicParser.BoolAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Paren}.
	 * @param ctx the parse tree
	 */
	void enterParen(@NotNull MagicParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Paren}.
	 * @param ctx the parse tree
	 */
	void exitParen(@NotNull MagicParser.ParenContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(@NotNull MagicParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(@NotNull MagicParser.Param_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#complex_assignment}.
	 * @param ctx the parse tree
	 */
	void enterComplex_assignment(@NotNull MagicParser.Complex_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#complex_assignment}.
	 * @param ctx the parse tree
	 */
	void exitComplex_assignment(@NotNull MagicParser.Complex_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MagicParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MagicParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull MagicParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull MagicParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#ValString}.
	 * @param ctx the parse tree
	 */
	void enterValString(@NotNull MagicParser.ValStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#ValString}.
	 * @param ctx the parse tree
	 */
	void exitValString(@NotNull MagicParser.ValStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(@NotNull MagicParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(@NotNull MagicParser.Simple_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(@NotNull MagicParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(@NotNull MagicParser.TypeListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#typeId}.
	 * @param ctx the parse tree
	 */
	void enterTypeId(@NotNull MagicParser.TypeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#typeId}.
	 * @param ctx the parse tree
	 */
	void exitTypeId(@NotNull MagicParser.TypeIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(@NotNull MagicParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(@NotNull MagicParser.RetContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#ValList}.
	 * @param ctx the parse tree
	 */
	void enterValList(@NotNull MagicParser.ValListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#ValList}.
	 * @param ctx the parse tree
	 */
	void exitValList(@NotNull MagicParser.ValListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#typeRange}.
	 * @param ctx the parse tree
	 */
	void enterTypeRange(@NotNull MagicParser.TypeRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#typeRange}.
	 * @param ctx the parse tree
	 */
	void exitTypeRange(@NotNull MagicParser.TypeRangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull MagicParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull MagicParser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull MagicParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull MagicParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MagicParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MagicParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull MagicParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull MagicParser.While_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(@NotNull MagicParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(@NotNull MagicParser.CompareContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(@NotNull MagicParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(@NotNull MagicParser.Func_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#BitAnd}.
	 * @param ctx the parse tree
	 */
	void enterBitAnd(@NotNull MagicParser.BitAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#BitAnd}.
	 * @param ctx the parse tree
	 */
	void exitBitAnd(@NotNull MagicParser.BitAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#BitNot}.
	 * @param ctx the parse tree
	 */
	void enterBitNot(@NotNull MagicParser.BitNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#BitNot}.
	 * @param ctx the parse tree
	 */
	void exitBitNot(@NotNull MagicParser.BitNotContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull MagicParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull MagicParser.ExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(@NotNull MagicParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(@NotNull MagicParser.DecContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#BoolOr}.
	 * @param ctx the parse tree
	 */
	void enterBoolOr(@NotNull MagicParser.BoolOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#BoolOr}.
	 * @param ctx the parse tree
	 */
	void exitBoolOr(@NotNull MagicParser.BoolOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(@NotNull MagicParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(@NotNull MagicParser.MemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#ValVar}.
	 * @param ctx the parse tree
	 */
	void enterValVar(@NotNull MagicParser.ValVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#ValVar}.
	 * @param ctx the parse tree
	 */
	void exitValVar(@NotNull MagicParser.ValVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#ValInt}.
	 * @param ctx the parse tree
	 */
	void enterValInt(@NotNull MagicParser.ValIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#ValInt}.
	 * @param ctx the parse tree
	 */
	void exitValInt(@NotNull MagicParser.ValIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull MagicParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull MagicParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(@NotNull MagicParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(@NotNull MagicParser.IncContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#BitOr}.
	 * @param ctx the parse tree
	 */
	void enterBitOr(@NotNull MagicParser.BitOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#BitOr}.
	 * @param ctx the parse tree
	 */
	void exitBitOr(@NotNull MagicParser.BitOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#Slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(@NotNull MagicParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#Slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(@NotNull MagicParser.SliceContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull MagicParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull MagicParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#VarList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(@NotNull MagicParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#VarList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(@NotNull MagicParser.VarListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull MagicParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull MagicParser.Func_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(@NotNull MagicParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(@NotNull MagicParser.Block_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MagicParser#construct}.
	 * @param ctx the parse tree
	 */
	void enterConstruct(@NotNull MagicParser.ConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link MagicParser#construct}.
	 * @param ctx the parse tree
	 */
	void exitConstruct(@NotNull MagicParser.ConstructContext ctx);
}