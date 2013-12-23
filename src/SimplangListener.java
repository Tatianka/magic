// Generated from Simplang.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimplangParser}.
 */
public interface SimplangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimplangParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(@NotNull SimplangParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(@NotNull SimplangParser.ArglistContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#ValBool}.
	 * @param ctx the parse tree
	 */
	void enterValBool(@NotNull SimplangParser.ValBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#ValBool}.
	 * @param ctx the parse tree
	 */
	void exitValBool(@NotNull SimplangParser.ValBoolContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(@NotNull SimplangParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(@NotNull SimplangParser.AttrContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#VarID}.
	 * @param ctx the parse tree
	 */
	void enterVarID(@NotNull SimplangParser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#VarID}.
	 * @param ctx the parse tree
	 */
	void exitVarID(@NotNull SimplangParser.VarIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#ValFloat}.
	 * @param ctx the parse tree
	 */
	void enterValFloat(@NotNull SimplangParser.ValFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#ValFloat}.
	 * @param ctx the parse tree
	 */
	void exitValFloat(@NotNull SimplangParser.ValFloatContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#simple_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSimple_assignment(@NotNull SimplangParser.Simple_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#simple_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSimple_assignment(@NotNull SimplangParser.Simple_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull SimplangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull SimplangParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#UnaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(@NotNull SimplangParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#UnaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(@NotNull SimplangParser.UnaryMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#ValChar}.
	 * @param ctx the parse tree
	 */
	void enterValChar(@NotNull SimplangParser.ValCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#ValChar}.
	 * @param ctx the parse tree
	 */
	void exitValChar(@NotNull SimplangParser.ValCharContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#BoolNot}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(@NotNull SimplangParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#BoolNot}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(@NotNull SimplangParser.BoolNotContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#ValRange}.
	 * @param ctx the parse tree
	 */
	void enterValRange(@NotNull SimplangParser.ValRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#ValRange}.
	 * @param ctx the parse tree
	 */
	void exitValRange(@NotNull SimplangParser.ValRangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(@NotNull SimplangParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(@NotNull SimplangParser.MulContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#attribute_ref}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_ref(@NotNull SimplangParser.Attribute_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#attribute_ref}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_ref(@NotNull SimplangParser.Attribute_refContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(@NotNull SimplangParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(@NotNull SimplangParser.AddContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(@NotNull SimplangParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(@NotNull SimplangParser.FuncContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull SimplangParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull SimplangParser.For_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#slicing}.
	 * @param ctx the parse tree
	 */
	void enterSlicing(@NotNull SimplangParser.SlicingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#slicing}.
	 * @param ctx the parse tree
	 */
	void exitSlicing(@NotNull SimplangParser.SlicingContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#decrement}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(@NotNull SimplangParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#decrement}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(@NotNull SimplangParser.DecrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#indexation}.
	 * @param ctx the parse tree
	 */
	void enterIndexation(@NotNull SimplangParser.IndexationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#indexation}.
	 * @param ctx the parse tree
	 */
	void exitIndexation(@NotNull SimplangParser.IndexationContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#increment}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(@NotNull SimplangParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#increment}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(@NotNull SimplangParser.IncrementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull SimplangParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull SimplangParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#ValNull}.
	 * @param ctx the parse tree
	 */
	void enterValNull(@NotNull SimplangParser.ValNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#ValNull}.
	 * @param ctx the parse tree
	 */
	void exitValNull(@NotNull SimplangParser.ValNullContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(@NotNull SimplangParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(@NotNull SimplangParser.Var_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull SimplangParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull SimplangParser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#BoolAnd}.
	 * @param ctx the parse tree
	 */
	void enterBoolAnd(@NotNull SimplangParser.BoolAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#BoolAnd}.
	 * @param ctx the parse tree
	 */
	void exitBoolAnd(@NotNull SimplangParser.BoolAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Paren}.
	 * @param ctx the parse tree
	 */
	void enterParen(@NotNull SimplangParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Paren}.
	 * @param ctx the parse tree
	 */
	void exitParen(@NotNull SimplangParser.ParenContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#param_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_list(@NotNull SimplangParser.Param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#param_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_list(@NotNull SimplangParser.Param_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#complex_assignment}.
	 * @param ctx the parse tree
	 */
	void enterComplex_assignment(@NotNull SimplangParser.Complex_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#complex_assignment}.
	 * @param ctx the parse tree
	 */
	void exitComplex_assignment(@NotNull SimplangParser.Complex_assignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SimplangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SimplangParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(@NotNull SimplangParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(@NotNull SimplangParser.IndexContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#ValString}.
	 * @param ctx the parse tree
	 */
	void enterValString(@NotNull SimplangParser.ValStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#ValString}.
	 * @param ctx the parse tree
	 */
	void exitValString(@NotNull SimplangParser.ValStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_statement(@NotNull SimplangParser.Simple_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#simple_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_statement(@NotNull SimplangParser.Simple_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(@NotNull SimplangParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(@NotNull SimplangParser.RetContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#ValList}.
	 * @param ctx the parse tree
	 */
	void enterValList(@NotNull SimplangParser.ValListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#ValList}.
	 * @param ctx the parse tree
	 */
	void exitValList(@NotNull SimplangParser.ValListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(@NotNull SimplangParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(@NotNull SimplangParser.RangeContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#indexed_id}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_id(@NotNull SimplangParser.Indexed_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#indexed_id}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_id(@NotNull SimplangParser.Indexed_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull SimplangParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull SimplangParser.If_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SimplangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SimplangParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull SimplangParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull SimplangParser.While_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(@NotNull SimplangParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(@NotNull SimplangParser.CompareContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(@NotNull SimplangParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(@NotNull SimplangParser.Func_defContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#BitAnd}.
	 * @param ctx the parse tree
	 */
	void enterBitAnd(@NotNull SimplangParser.BitAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#BitAnd}.
	 * @param ctx the parse tree
	 */
	void exitBitAnd(@NotNull SimplangParser.BitAndContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#BitNot}.
	 * @param ctx the parse tree
	 */
	void enterBitNot(@NotNull SimplangParser.BitNotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#BitNot}.
	 * @param ctx the parse tree
	 */
	void exitBitNot(@NotNull SimplangParser.BitNotContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull SimplangParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull SimplangParser.ExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(@NotNull SimplangParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(@NotNull SimplangParser.DecContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#BoolOr}.
	 * @param ctx the parse tree
	 */
	void enterBoolOr(@NotNull SimplangParser.BoolOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#BoolOr}.
	 * @param ctx the parse tree
	 */
	void exitBoolOr(@NotNull SimplangParser.BoolOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(@NotNull SimplangParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(@NotNull SimplangParser.MemberContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#ValVar}.
	 * @param ctx the parse tree
	 */
	void enterValVar(@NotNull SimplangParser.ValVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#ValVar}.
	 * @param ctx the parse tree
	 */
	void exitValVar(@NotNull SimplangParser.ValVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#ValInt}.
	 * @param ctx the parse tree
	 */
	void enterValInt(@NotNull SimplangParser.ValIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#ValInt}.
	 * @param ctx the parse tree
	 */
	void exitValInt(@NotNull SimplangParser.ValIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull SimplangParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull SimplangParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(@NotNull SimplangParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(@NotNull SimplangParser.IncContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#BitOr}.
	 * @param ctx the parse tree
	 */
	void enterBitOr(@NotNull SimplangParser.BitOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#BitOr}.
	 * @param ctx the parse tree
	 */
	void exitBitOr(@NotNull SimplangParser.BitOrContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#Slice}.
	 * @param ctx the parse tree
	 */
	void enterSlice(@NotNull SimplangParser.SliceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#Slice}.
	 * @param ctx the parse tree
	 */
	void exitSlice(@NotNull SimplangParser.SliceContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull SimplangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull SimplangParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#VarList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(@NotNull SimplangParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#VarList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(@NotNull SimplangParser.VarListContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(@NotNull SimplangParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(@NotNull SimplangParser.Func_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(@NotNull SimplangParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(@NotNull SimplangParser.Block_statementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimplangParser#construct}.
	 * @param ctx the parse tree
	 */
	void enterConstruct(@NotNull SimplangParser.ConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimplangParser#construct}.
	 * @param ctx the parse tree
	 */
	void exitConstruct(@NotNull SimplangParser.ConstructContext ctx);
}