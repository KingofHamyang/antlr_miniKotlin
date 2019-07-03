// Generated from KotlinParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KotlinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KotlinParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KotlinParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(KotlinParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(KotlinParser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#packages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackages(KotlinParser.PackagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#importing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImporting(KotlinParser.ImportingContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#packagelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackagelist(KotlinParser.PackagelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(KotlinParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefine(KotlinParser.ClassDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassbody(KotlinParser.ClassbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassblock(KotlinParser.ClassblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#classbodymembers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassbodymembers(KotlinParser.ClassbodymembersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(KotlinParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typestrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypestrict(KotlinParser.TypestrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#class_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_stmt(KotlinParser.Class_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#extendlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendlist(KotlinParser.ExtendlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#variableDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefine(KotlinParser.VariableDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefine(KotlinParser.FunctionDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionbody(KotlinParser.FunctionbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(KotlinParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#multiple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_stmt(KotlinParser.Multiple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(KotlinParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#defining}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefining(KotlinParser.DefiningContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#inblockExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInblockExpression(KotlinParser.InblockExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#returning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturning(KotlinParser.ReturningContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KotlinParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#assignstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignstmt(KotlinParser.AssignstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#unaryexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryexpression(KotlinParser.UnaryexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#commonstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonstmt(KotlinParser.CommonstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#oroperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOroperation(KotlinParser.OroperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#andoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndoperation(KotlinParser.AndoperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#inclusiveoroperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveoroperation(KotlinParser.InclusiveoroperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#exclusiveoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveoperation(KotlinParser.ExclusiveoperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(KotlinParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#equalityExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(KotlinParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#comparableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparableExpr(KotlinParser.ComparableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#inisOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInisOperation(KotlinParser.InisOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#innotin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnotin(KotlinParser.InnotinContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#shiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpr(KotlinParser.ShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#rangeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpr(KotlinParser.RangeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(KotlinParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#multiExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiExpr(KotlinParser.MultiExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(KotlinParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#prefixop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixop(KotlinParser.PrefixopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#postterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostterm(KotlinParser.PosttermContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#posttermwithoutincdec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosttermwithoutincdec(KotlinParser.PosttermwithoutincdecContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#dotoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotoperation(KotlinParser.DotoperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic(KotlinParser.AtomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#postoperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostoperation(KotlinParser.PostoperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(KotlinParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(KotlinParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#lambdaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(KotlinParser.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#functionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionname(KotlinParser.FunctionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#inputparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputparameter(KotlinParser.InputparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#flowcontrol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlowcontrol(KotlinParser.FlowcontrolContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#loopExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopExp(KotlinParser.LoopExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#forExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExp(KotlinParser.ForExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#variableDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclare(KotlinParser.VariableDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#whileExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExp(KotlinParser.WhileExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#dowhileExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhileExp(KotlinParser.DowhileExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#conditionalExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExp(KotlinParser.ConditionalExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#ifExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(KotlinParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#ifstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstmt(KotlinParser.IfstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#whenExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenExp(KotlinParser.WhenExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#whenComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenComponent(KotlinParser.WhenComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#whenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenCondition(KotlinParser.WhenConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#rangeinWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeinWhen(KotlinParser.RangeinWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#typeinWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeinWhen(KotlinParser.TypeinWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(KotlinParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(KotlinParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(KotlinParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#stringcomponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringcomponent(KotlinParser.StringcomponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#stringContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringContent(KotlinParser.StringContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KotlinParser#stringExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(KotlinParser.StringExpressionContext ctx);
}