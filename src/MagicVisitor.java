// Generated from Magic.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MagicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MagicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MagicParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(@NotNull MagicParser.ArglistContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#ValBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValBool(@NotNull MagicParser.ValBoolContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#VarID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(@NotNull MagicParser.VarIDContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(@NotNull MagicParser.AttrContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#ValFloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValFloat(@NotNull MagicParser.ValFloatContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#simple_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_assignment(@NotNull MagicParser.Simple_assignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#UnaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(@NotNull MagicParser.UnaryMinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#ValChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValChar(@NotNull MagicParser.ValCharContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#BoolNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(@NotNull MagicParser.BoolNotContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#ValRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValRange(@NotNull MagicParser.ValRangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull MagicParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#attribute_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_ref(@NotNull MagicParser.Attribute_refContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull MagicParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#typeBasic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBasic(@NotNull MagicParser.TypeBasicContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(@NotNull MagicParser.FuncContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull MagicParser.For_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(@NotNull MagicParser.DecrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#increment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(@NotNull MagicParser.IncrementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull MagicParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#ValNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValNull(@NotNull MagicParser.ValNullContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(@NotNull MagicParser.Var_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull MagicParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#BoolAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolAnd(@NotNull MagicParser.BoolAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(@NotNull MagicParser.ParenContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_list(@NotNull MagicParser.Param_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#complex_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplex_assignment(@NotNull MagicParser.Complex_assignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MagicParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull MagicParser.IndexContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#ValString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValString(@NotNull MagicParser.ValStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_statement(@NotNull MagicParser.Simple_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(@NotNull MagicParser.TypeListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeId(@NotNull MagicParser.TypeIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull MagicParser.RetContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#ValList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValList(@NotNull MagicParser.ValListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#typeRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRange(@NotNull MagicParser.TypeRangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(@NotNull MagicParser.RangeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull MagicParser.If_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull MagicParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull MagicParser.While_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(@NotNull MagicParser.CompareContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(@NotNull MagicParser.Func_defContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#BitAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitAnd(@NotNull MagicParser.BitAndContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#BitNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitNot(@NotNull MagicParser.BitNotContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull MagicParser.ExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(@NotNull MagicParser.DecContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#BoolOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOr(@NotNull MagicParser.BoolOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#member}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMember(@NotNull MagicParser.MemberContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#ValVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValVar(@NotNull MagicParser.ValVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#ValInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValInt(@NotNull MagicParser.ValIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull MagicParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(@NotNull MagicParser.IncContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#BitOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOr(@NotNull MagicParser.BitOrContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#Slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(@NotNull MagicParser.SliceContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull MagicParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#VarList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(@NotNull MagicParser.VarListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(@NotNull MagicParser.Func_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(@NotNull MagicParser.Block_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MagicParser#construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstruct(@NotNull MagicParser.ConstructContext ctx);
}