// Generated from KotlinParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KotlinParser}.
 */
public interface KotlinParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KotlinParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(KotlinParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(KotlinParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(KotlinParser.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(KotlinParser.ChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#packages}.
	 * @param ctx the parse tree
	 */
	void enterPackages(KotlinParser.PackagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#packages}.
	 * @param ctx the parse tree
	 */
	void exitPackages(KotlinParser.PackagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#importing}.
	 * @param ctx the parse tree
	 */
	void enterImporting(KotlinParser.ImportingContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#importing}.
	 * @param ctx the parse tree
	 */
	void exitImporting(KotlinParser.ImportingContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#packagelist}.
	 * @param ctx the parse tree
	 */
	void enterPackagelist(KotlinParser.PackagelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#packagelist}.
	 * @param ctx the parse tree
	 */
	void exitPackagelist(KotlinParser.PackagelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(KotlinParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(KotlinParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(KotlinParser.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(KotlinParser.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#classbody}.
	 * @param ctx the parse tree
	 */
	void enterClassbody(KotlinParser.ClassbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classbody}.
	 * @param ctx the parse tree
	 */
	void exitClassbody(KotlinParser.ClassbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#classblock}.
	 * @param ctx the parse tree
	 */
	void enterClassblock(KotlinParser.ClassblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classblock}.
	 * @param ctx the parse tree
	 */
	void exitClassblock(KotlinParser.ClassblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#classbodymembers}.
	 * @param ctx the parse tree
	 */
	void enterClassbodymembers(KotlinParser.ClassbodymembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#classbodymembers}.
	 * @param ctx the parse tree
	 */
	void exitClassbodymembers(KotlinParser.ClassbodymembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(KotlinParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(KotlinParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#typestrict}.
	 * @param ctx the parse tree
	 */
	void enterTypestrict(KotlinParser.TypestrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typestrict}.
	 * @param ctx the parse tree
	 */
	void exitTypestrict(KotlinParser.TypestrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#class_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClass_stmt(KotlinParser.Class_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#class_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClass_stmt(KotlinParser.Class_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#extendlist}.
	 * @param ctx the parse tree
	 */
	void enterExtendlist(KotlinParser.ExtendlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#extendlist}.
	 * @param ctx the parse tree
	 */
	void exitExtendlist(KotlinParser.ExtendlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#variableDefine}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefine(KotlinParser.VariableDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#variableDefine}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefine(KotlinParser.VariableDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionDefine}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefine(KotlinParser.FunctionDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionDefine}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefine(KotlinParser.FunctionDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(KotlinParser.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(KotlinParser.FunctionbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(KotlinParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(KotlinParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_stmt(KotlinParser.Multiple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_stmt(KotlinParser.Multiple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(KotlinParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(KotlinParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#defining}.
	 * @param ctx the parse tree
	 */
	void enterDefining(KotlinParser.DefiningContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#defining}.
	 * @param ctx the parse tree
	 */
	void exitDefining(KotlinParser.DefiningContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#inblockExpression}.
	 * @param ctx the parse tree
	 */
	void enterInblockExpression(KotlinParser.InblockExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#inblockExpression}.
	 * @param ctx the parse tree
	 */
	void exitInblockExpression(KotlinParser.InblockExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#returning}.
	 * @param ctx the parse tree
	 */
	void enterReturning(KotlinParser.ReturningContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#returning}.
	 * @param ctx the parse tree
	 */
	void exitReturning(KotlinParser.ReturningContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KotlinParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KotlinParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignstmt(KotlinParser.AssignstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assignstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignstmt(KotlinParser.AssignstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpression(KotlinParser.UnaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpression(KotlinParser.UnaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#commonstmt}.
	 * @param ctx the parse tree
	 */
	void enterCommonstmt(KotlinParser.CommonstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#commonstmt}.
	 * @param ctx the parse tree
	 */
	void exitCommonstmt(KotlinParser.CommonstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#oroperation}.
	 * @param ctx the parse tree
	 */
	void enterOroperation(KotlinParser.OroperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#oroperation}.
	 * @param ctx the parse tree
	 */
	void exitOroperation(KotlinParser.OroperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#andoperation}.
	 * @param ctx the parse tree
	 */
	void enterAndoperation(KotlinParser.AndoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#andoperation}.
	 * @param ctx the parse tree
	 */
	void exitAndoperation(KotlinParser.AndoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#inclusiveoroperation}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveoroperation(KotlinParser.InclusiveoroperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#inclusiveoroperation}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveoroperation(KotlinParser.InclusiveoroperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#exclusiveoperation}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveoperation(KotlinParser.ExclusiveoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#exclusiveoperation}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveoperation(KotlinParser.ExclusiveoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(KotlinParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(KotlinParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(KotlinParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#equalityExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(KotlinParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#comparableExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparableExpr(KotlinParser.ComparableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#comparableExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparableExpr(KotlinParser.ComparableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#inisOperation}.
	 * @param ctx the parse tree
	 */
	void enterInisOperation(KotlinParser.InisOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#inisOperation}.
	 * @param ctx the parse tree
	 */
	void exitInisOperation(KotlinParser.InisOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#innotin}.
	 * @param ctx the parse tree
	 */
	void enterInnotin(KotlinParser.InnotinContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#innotin}.
	 * @param ctx the parse tree
	 */
	void exitInnotin(KotlinParser.InnotinContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpr(KotlinParser.ShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpr(KotlinParser.ShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#rangeExpr}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpr(KotlinParser.RangeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#rangeExpr}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpr(KotlinParser.RangeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(KotlinParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(KotlinParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#multiExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiExpr(KotlinParser.MultiExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#multiExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiExpr(KotlinParser.MultiExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(KotlinParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(KotlinParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#prefixop}.
	 * @param ctx the parse tree
	 */
	void enterPrefixop(KotlinParser.PrefixopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#prefixop}.
	 * @param ctx the parse tree
	 */
	void exitPrefixop(KotlinParser.PrefixopContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#postterm}.
	 * @param ctx the parse tree
	 */
	void enterPostterm(KotlinParser.PosttermContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#postterm}.
	 * @param ctx the parse tree
	 */
	void exitPostterm(KotlinParser.PosttermContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#posttermwithoutincdec}.
	 * @param ctx the parse tree
	 */
	void enterPosttermwithoutincdec(KotlinParser.PosttermwithoutincdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#posttermwithoutincdec}.
	 * @param ctx the parse tree
	 */
	void exitPosttermwithoutincdec(KotlinParser.PosttermwithoutincdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#dotoperation}.
	 * @param ctx the parse tree
	 */
	void enterDotoperation(KotlinParser.DotoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#dotoperation}.
	 * @param ctx the parse tree
	 */
	void exitDotoperation(KotlinParser.DotoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(KotlinParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(KotlinParser.AtomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#postoperation}.
	 * @param ctx the parse tree
	 */
	void enterPostoperation(KotlinParser.PostoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#postoperation}.
	 * @param ctx the parse tree
	 */
	void exitPostoperation(KotlinParser.PostoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(KotlinParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(KotlinParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(KotlinParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functioncall}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(KotlinParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#lambdaExpr}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(KotlinParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#lambdaExpr}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(KotlinParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#functionname}.
	 * @param ctx the parse tree
	 */
	void enterFunctionname(KotlinParser.FunctionnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#functionname}.
	 * @param ctx the parse tree
	 */
	void exitFunctionname(KotlinParser.FunctionnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#inputparameter}.
	 * @param ctx the parse tree
	 */
	void enterInputparameter(KotlinParser.InputparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#inputparameter}.
	 * @param ctx the parse tree
	 */
	void exitInputparameter(KotlinParser.InputparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#flowcontrol}.
	 * @param ctx the parse tree
	 */
	void enterFlowcontrol(KotlinParser.FlowcontrolContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#flowcontrol}.
	 * @param ctx the parse tree
	 */
	void exitFlowcontrol(KotlinParser.FlowcontrolContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#loopExp}.
	 * @param ctx the parse tree
	 */
	void enterLoopExp(KotlinParser.LoopExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#loopExp}.
	 * @param ctx the parse tree
	 */
	void exitLoopExp(KotlinParser.LoopExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#forExp}.
	 * @param ctx the parse tree
	 */
	void enterForExp(KotlinParser.ForExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#forExp}.
	 * @param ctx the parse tree
	 */
	void exitForExp(KotlinParser.ForExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#variableDeclare}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclare(KotlinParser.VariableDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#variableDeclare}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclare(KotlinParser.VariableDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#whileExp}.
	 * @param ctx the parse tree
	 */
	void enterWhileExp(KotlinParser.WhileExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whileExp}.
	 * @param ctx the parse tree
	 */
	void exitWhileExp(KotlinParser.WhileExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#dowhileExp}.
	 * @param ctx the parse tree
	 */
	void enterDowhileExp(KotlinParser.DowhileExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#dowhileExp}.
	 * @param ctx the parse tree
	 */
	void exitDowhileExp(KotlinParser.DowhileExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#conditionalExp}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExp(KotlinParser.ConditionalExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#conditionalExp}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExp(KotlinParser.ConditionalExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(KotlinParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(KotlinParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(KotlinParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(KotlinParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#whenExp}.
	 * @param ctx the parse tree
	 */
	void enterWhenExp(KotlinParser.WhenExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whenExp}.
	 * @param ctx the parse tree
	 */
	void exitWhenExp(KotlinParser.WhenExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#whenComponent}.
	 * @param ctx the parse tree
	 */
	void enterWhenComponent(KotlinParser.WhenComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whenComponent}.
	 * @param ctx the parse tree
	 */
	void exitWhenComponent(KotlinParser.WhenComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhenCondition(KotlinParser.WhenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#whenCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhenCondition(KotlinParser.WhenConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#rangeinWhen}.
	 * @param ctx the parse tree
	 */
	void enterRangeinWhen(KotlinParser.RangeinWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#rangeinWhen}.
	 * @param ctx the parse tree
	 */
	void exitRangeinWhen(KotlinParser.RangeinWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#typeinWhen}.
	 * @param ctx the parse tree
	 */
	void enterTypeinWhen(KotlinParser.TypeinWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#typeinWhen}.
	 * @param ctx the parse tree
	 */
	void exitTypeinWhen(KotlinParser.TypeinWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(KotlinParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(KotlinParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(KotlinParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(KotlinParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(KotlinParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(KotlinParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#stringcomponent}.
	 * @param ctx the parse tree
	 */
	void enterStringcomponent(KotlinParser.StringcomponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#stringcomponent}.
	 * @param ctx the parse tree
	 */
	void exitStringcomponent(KotlinParser.StringcomponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void enterStringContent(KotlinParser.StringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#stringContent}.
	 * @param ctx the parse tree
	 */
	void exitStringContent(KotlinParser.StringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KotlinParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(KotlinParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KotlinParser#stringExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(KotlinParser.StringExpressionContext ctx);
}