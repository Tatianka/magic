// Generated from Simplang.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimplangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimplangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimplangParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(@NotNull SimplangParser.ArglistContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#ValBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(@NotNull SimplangParser.ValBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(@NotNull SimplangParser.AttrContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#VarID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(@NotNull SimplangParser.VarIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#ValFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValFloat(@NotNull SimplangParser.ValFloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#simple_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_assignment(@NotNull SimplangParser.Simple_assignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull SimplangParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#UnaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(@NotNull SimplangParser.UnaryMinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#ValChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValChar(@NotNull SimplangParser.ValCharContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#BoolNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(@NotNull SimplangParser.BoolNotContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#ValRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValRange(@NotNull SimplangParser.ValRangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull SimplangParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#attribute_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_ref(@NotNull SimplangParser.Attribute_refContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull SimplangParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull SimplangParser.FuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull SimplangParser.For_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#slicing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlicing(@NotNull SimplangParser.SlicingContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(@NotNull SimplangParser.DecrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#indexation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexation(@NotNull SimplangParser.IndexationContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(@NotNull SimplangParser.IncrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull SimplangParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#ValNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValNull(@NotNull SimplangParser.ValNullContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(@NotNull SimplangParser.Var_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull SimplangParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#BoolAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAnd(@NotNull SimplangParser.BoolAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(@NotNull SimplangParser.ParenContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(@NotNull SimplangParser.Param_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#complex_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_assignment(@NotNull SimplangParser.Complex_assignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull SimplangParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull SimplangParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#ValString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValString(@NotNull SimplangParser.ValStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(@NotNull SimplangParser.Simple_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull SimplangParser.RetContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#ValList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValList(@NotNull SimplangParser.ValListContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(@NotNull SimplangParser.RangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#indexed_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_id(@NotNull SimplangParser.Indexed_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull SimplangParser.If_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull SimplangParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull SimplangParser.While_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(@NotNull SimplangParser.CompareContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(@NotNull SimplangParser.Func_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#BitAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAnd(@NotNull SimplangParser.BitAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#BitNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitNot(@NotNull SimplangParser.BitNotContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull SimplangParser.ExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(@NotNull SimplangParser.DecContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#BoolOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOr(@NotNull SimplangParser.BoolOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(@NotNull SimplangParser.MemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#ValVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValVar(@NotNull SimplangParser.ValVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#ValInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValInt(@NotNull SimplangParser.ValIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull SimplangParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(@NotNull SimplangParser.IncContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#BitOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOr(@NotNull SimplangParser.BitOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#Slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(@NotNull SimplangParser.SliceContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull SimplangParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#VarList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(@NotNull SimplangParser.VarListContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull SimplangParser.Func_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(@NotNull SimplangParser.Block_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimplangParser#construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstruct(@NotNull SimplangParser.ConstructContext ctx);
}