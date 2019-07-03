import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import java.util.Queue;

import java.io.IOException;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

import java.lang.ArrayIndexOutOfBoundsException;
import java.nio.file.NoSuchFileException;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;








class Kotlin2javaVisitor extends KotlinParserBaseVisitor<String> {

	File file;
	String mainname;
	FileWriter fw;
	static int functionDepth= 0;
	Map<String, String> functionMap = new HashMap<String, String>();
	Map<String, String> methodMap = new HashMap<String, String>();
	Map<String, String> SettingMap = new HashMap<String, String>();
	Map<String, String> ListingMap = new HashMap<String, String>();
	Map<String, String> passingargument = new HashMap<String, String>();
	Map<String, String> argumenttype = new HashMap<String, String>();
	Kotlin2javaVisitor(String main_) {
		int index = main_.indexOf('.');
		mainname= main_.substring(0,index);


	}
	

	@Override 
	public String visitProg(KotlinParser.ProgContext ctx) { 
		int i = 0;
		String result = "";
		ArrayList<String> functions = new ArrayList<String>();
		ArrayList<String> classes = new ArrayList<String>();
		ArrayList<String> importings = new ArrayList<String>();

		try{
			file = new File("out.txt");
			fw = new FileWriter(file);
		}
		catch(IOException e){
		}
		List<KotlinParser.ChunkContext> chunklist = ctx.chunk();
		for(i=0;i<chunklist.size();i++){
			try{
				chunklist.get(i).functionDefine().getText();
				functions.add(visit(chunklist.get(i)));
			}
			catch(NullPointerException e){
				try{
					chunklist.get(i).classDefine().getText();
					classes.add(visit(chunklist.get(i)));
				}
				catch(NullPointerException e2){
					importings.add(visit(chunklist.get(i)));
				}
			}

			
		}
		for(i=0;i<importings.size();i++){
			if(importings.get(i).contains("java.util.")){
				continue;
			}
			result = result + importings.get(i);
			
		}
		result = result + "import java.util.*;";

		result = result + '\n';
		result = result + "class " + mainname+" {\n";
		for(i=0;i<functions.size();i++){
			result = result + functions.get(i);
		}
		result = result + "}\n";

		return result;
	}
	@Override 
	public String visitChunk(KotlinParser.ChunkContext ctx) {
		
		return visitChildren(ctx);
	}

	@Override 
	public String visitPackages(KotlinParser.PackagesContext ctx) { 
		String result = "";
		return ctx.PACKAGE().getText() + " " + ctx.packagelist().getText() +";\n";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitImporting(KotlinParser.ImportingContext ctx) { 
		String result = "";
		return ctx.IMPORT().getText() + " " + ctx.packagelist().getText() +";\n";
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitPackagelist(KotlinParser.PackagelistContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitParameter(KotlinParser.ParameterContext ctx) 
	{ 
		String type = ctx.type().getText();
		if(type.equals("Int")){
			type = "int";
		}
		if(type.equals("Double")){
			type = "double";
		}
		if(type.equals("Any")){
			type = "Object";
		}
		
		return type + " " + ctx.ID().getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitClassDefine(KotlinParser.ClassDefineContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitClassbody(KotlinParser.ClassbodyContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitClassblock(KotlinParser.ClassblockContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitClassbodymembers(KotlinParser.ClassbodymembersContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitGetter(KotlinParser.GetterContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitTypestrict(KotlinParser.TypestrictContext ctx) { 
		//System.out.println("TypeStrict!");
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitClass_stmt(KotlinParser.Class_stmtContext ctx) { 
		//System.out.println("class_stmt");
		return visitChildren(ctx); 
	}
	public void fileclose(){
		try{
			fw.close();
		}
		catch(IOException e){

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitExtendlist(KotlinParser.ExtendlistContext ctx) {
		 return visitChildren(ctx);
		 }
	public String functionReturntypeCheck(KotlinParser.FunctioncallContext func){
		if(func.functionname().getText().equals("listOf")){
			String absttype = typecheking(func.inputparameter().get(0).commonstmt().oroperation().andoperation().inclusiveoroperation().exclusiveoperation().andExpr().equalityExpr().comparableExpr().inisOperation().shiftExpr().get(0).rangeExpr().addExpr().get(0).multiExpr().term().postterm().atomic());
			if(absttype.equals("int")){
				absttype = "Integer";
			}
			else if (absttype.equals("double")){
				absttype = "Double";
			}
			
			return "List<" + absttype + ">";
		}else if(func.functionname().getText().equals("setOf")){
			String absttype = typecheking(func.inputparameter().get(0).commonstmt().oroperation().andoperation().inclusiveoroperation().exclusiveoperation().andExpr().equalityExpr().comparableExpr().inisOperation().shiftExpr().get(0).rangeExpr().addExpr().get(0).multiExpr().term().postterm().atomic());
			if(absttype.equals("int")){
				absttype = "Integer";
			}
			else if (absttype.equals("double")){
				absttype = "Double";
			}
			return "Set<" + absttype + ">";

		}
		else{
			return functionMap.get(func.functionname().getText());
		}
	}
	public String typecheking(KotlinParser.AtomicContext atomicterm){
		try{
			KotlinParser.DigitContext a = atomicterm.digit();
			String test = atomicterm.digit().getText();
			try{
				String type = a.INT().getText();
				return "int";
			}
			catch(NullPointerException e1){
				try{
					String type = a.string().getText();
					return "String";
				}
				catch(NullPointerException e3){
					return "double";
				}
				
			}
		}catch(NullPointerException e){
			try{
				String test = atomicterm.functioncall().getText();
				return "functioncall";
			}catch(NullPointerException e2){
				try{
					return atomicterm.ID().getText();
				}catch(NullPointerException e5){
					
					String test= atomicterm.expression().get(0).getText();
					return typecheking(atomicterm.expression().get(0).commonstmt().oroperation().andoperation().inclusiveoroperation().exclusiveoperation().andExpr().equalityExpr().comparableExpr().inisOperation().shiftExpr().get(0).rangeExpr().addExpr().get(0).multiExpr().term().postterm().atomic());
				}
			}
			
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitVariableDefine(KotlinParser.VariableDefineContext ctx) { 
		String result ="";
		String final_or_not = ctx.VAR().getText();
		int isFinal = 0;
		if(final_or_not.equals("val")){

			result = result + "final ";
		}
		String typecheck ="";
		try{
			typecheck = ctx.type().getText();
			if(typecheck.equals("Int")){
				typecheck = "int";
			}
			else if(typecheck.equals("Double")){
				typecheck = "double";
			}
			else if(typecheck.equals("String")){
				typecheck = "String";
			}
			result = result + typecheck + " ";
		}
		catch (NullPointerException e){
			String test;
			KotlinParser.AtomicContext atomicterm = ctx.commonstmt().oroperation().andoperation().inclusiveoroperation().exclusiveoperation().andExpr().equalityExpr().comparableExpr().inisOperation().shiftExpr().get(0).rangeExpr().addExpr().get(0).multiExpr().term().postterm().atomic();
			String typed = typecheking(atomicterm);
			if(typed.equals("functioncall")){
				typed = functionReturntypeCheck(atomicterm.functioncall());
				if(typed.contains("List")){
					ListingMap.put(ctx.ID().getText(),typed);
				}else if(typed.contains("Set")){
					SettingMap.put(ctx.ID().getText(),typed);
				}
			}
			result = result + typed + " ";
			
		}
		result = result + ctx.ID().getText() + " ";

		try{

			result = result + ctx.assignment().getText() + " ";

			result = result + visit(ctx.commonstmt()) + " ";
		}
		catch(NullPointerException e){
		}
		result = result + ";\n";

		
		return result;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitFunctionDefine(KotlinParser.FunctionDefineContext ctx) { 
		functionDepth = functionDepth + 1;


		String result ="";
		int flag = 0;
		String name = ctx.functionname().getText();
		if(functionDepth== 1){
			
			//fucntion name define
			if(name.equals("main")){
				result = result + "public static ";
			}else{
				result = result + "static ";
			}
			// return type define
			try{
				String type = ctx.functionbody().type().getText();
				if(type.equals("Int")){
					try{
						String nullable = ctx.functionbody().QUESTION().getText();
						result = result + "Integer ";
						functionMap.put(name,"Integer");
						
					}
					catch (NullPointerException e){
						result = result + "int ";
						functionMap.put(name,"int");
					}
					
				}
				if(type.equals("Double")){
					try{
						String nullable = ctx.functionbody().QUESTION().getText();
						result = result + "Double ";
						functionMap.put(name,"Double");
					}
					catch (NullPointerException e){
						result = result + "double ";
						functionMap.put(name,"double");
					}
					
				}
				if(type.equals("String")){
					result = result + "String ";
					functionMap.put(name,"String");
				}
				if(type.equals("Unit")){
					result = result + "void ";
					functionMap.put(name,"void");
				}
			}
			catch(NullPointerException e){
				try{

					String texttest = ctx.functionbody().commonstmt().getText();

					
					String returnedtype =  typecheking(ctx.functionbody().commonstmt().oroperation().andoperation().inclusiveoroperation().
						exclusiveoperation().andExpr().equalityExpr().comparableExpr().inisOperation().shiftExpr().get(0).rangeExpr().addExpr().get(0).multiExpr().term().postterm().atomic());
						
					if(!returnedtype.equals("String") &&!returnedtype.equals("double")&&!returnedtype.equals("int") &&!returnedtype.equals("functioncall")){
						List<KotlinParser.ParameterContext> parameterlist = ctx.parameter();
						for (int i = 0 ; i < parameterlist.size() ; i++){
							String[] param = visit(parameterlist.get(i)).split(" ");
							if(param[1].equals(returnedtype)){
								result = result + param[0] + " ";
							}
						}
					}
					
				//	result = result + returnedtype + " ";
				}catch(NullPointerException e6){
					result = result + "void ";
					functionMap.put(name,"void");
				}

			}
			//function name
			result = result + ctx.functionname().getText() + " ";
			List<KotlinParser.ParameterContext> parameterlist = ctx.parameter();

			int i = 0;
			result = result + "( ";
			if(ctx.functionname().getText().equals("main")){
				result= result + "String[] args";
			}else{
				for (i = 0 ; i < parameterlist.size() ; i++){
					String[] param = visit(parameterlist.get(i)).split(" ");

					List<String> keyString = List.of(ctx.functionname().getText(),param[1]);
					argumenttype.put(param[1] , param[0]);
					if(i == parameterlist.size() -1){
						result = result + visit(parameterlist.get(i)) + " ";
					}
					else{
						result = result + visit(parameterlist.get(i)) + ", ";
					}
				}
			}
			result = result + ") ";
			result = result + " { \n";
			result = result + visit(ctx.functionbody());

			
			result = result + "}\n";
		}else{
			result = result + "class " + ctx.functionname().getText() + " {\n";
			methodMap.put(ctx.functionname().getText(),"exit");
			try{
				String type = ctx.functionbody().type().getText();
				methodMap.put(name, "ex");
				if(type.equals("Int")){
					try{
						String nullable = ctx.functionbody().QUESTION().getText();
						result = result + "Integer ";
						functionMap.put(name,"Integer");
					}
					catch (NullPointerException e){
						result = result + "int ";
						functionMap.put(name,"int");
					}
					
				}
				if(type.equals("Double")){
					try{
						String nullable = ctx.functionbody().QUESTION().getText();
						result = result + "Double ";
						functionMap.put(name,"Double");
					}
					catch (NullPointerException e){
						result = result + "double ";
						functionMap.put(name,"double");
					}
					
				}
				if(type.equals("String")){
					result = result + "String ";
					functionMap.put(name,"String");

				}
			}
			catch(NullPointerException e){
				try{

					String texttest = ctx.functionbody().commonstmt().getText();

					
					String returnedtype =  typecheking(ctx.functionbody().commonstmt().oroperation().andoperation().inclusiveoroperation().
						exclusiveoperation().andExpr().equalityExpr().comparableExpr().inisOperation().shiftExpr().get(0).rangeExpr().addExpr().get(0).multiExpr().term().postterm().atomic());
						
					if(!returnedtype.equals("String") &&!returnedtype.equals("double")&&!returnedtype.equals("int") &&!returnedtype.equals("functioncall")){
						List<KotlinParser.ParameterContext> parameterlist = ctx.parameter();
						for (int i = 0 ; i < parameterlist.size() ; i++){
							String[] param = visit(parameterlist.get(i)).split(" ");
							if(param[1].equals(returnedtype)){
								result = result + param[0] + " ";
							}
						}
					}
					
				//	result = result + returnedtype + " ";
				}catch(NullPointerException e6){
					result = result + "void ";
					functionMap.put(name,"void");
				}
			}
			//function name
			result = result + ctx.functionname().getText() + " ";
			//input parameter
			List<KotlinParser.ParameterContext> parameterlist = ctx.parameter();
			int i = 0;
			result = result + "( ";
			for (i = 0 ; i < parameterlist.size() ; i++){
				String[] param = visit(parameterlist.get(i)).split(" ");

				List<String> keyString = List.of(ctx.functionname().getText(),param[1]);
				argumenttype.put(param[1] , param[0]);
				if(i == parameterlist.size() -1){
					result = result + visit(parameterlist.get(i)) + " ";
				}
				else{
					result = result + visit(parameterlist.get(i)) + ", ";
				}
			}
			result = result + ") ";
			result = result + " { \n";
			result = result + visit(ctx.functionbody());
			result = result +"\n}\n}\n";

		}


		//System.out.println(argumenttype);
		functionDepth = functionDepth -1;
		return result;
 	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitFunctionbody(KotlinParser.FunctionbodyContext ctx) { 
		String result ="";
		String test = "";
		try{
			test= test + ctx.block().getText();
			result = result + visit(ctx.block());
		}
		catch(NullPointerException e){
			test = visit(ctx.commonstmt());
			result = result + "return (" + test +") ;\n";
		}
		return result;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitBlock(KotlinParser.BlockContext ctx) {
		return visit(ctx.multiple_stmt());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitMultiple_stmt(KotlinParser.Multiple_stmtContext ctx) { 
		
		String result = "";
		int i = 0;
		List<KotlinParser.StmtContext> stmtlist = ctx.stmt();
		for (i=0;i<stmtlist.size() ; i++){
			result = result + visit(stmtlist.get(i)) + "\n";
		}
		return result;
		
	}

	@Override public String visitStmt(KotlinParser.StmtContext ctx) { 
		String result = "";
		String test = "";
		try{
			test = ctx.defining().getText();
			return visit(ctx.defining());

		}catch(NullPointerException e){
			return visit(ctx.inblockExpression());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitDefining(KotlinParser.DefiningContext ctx) {

		String result = "";
		String test = "";
		try{
			test = ctx.functionDefine().getText();
			return visit(ctx.functionDefine());

		}catch(NullPointerException e){
			return visit(ctx.variableDefine());
		}
	}
	
	@Override public String visitInblockExpression(KotlinParser.InblockExpressionContext ctx) { 
		String result = "";
		try{
			try{
				String test = ctx.expression().commonstmt().oroperation().andoperation().inclusiveoroperation().
						exclusiveoperation().andExpr().equalityExpr().comparableExpr().inisOperation().shiftExpr().get(0).rangeExpr().addExpr().get(0).multiExpr().term().postterm().atomic().conditionalExp().getText();
				return visit(ctx.expression());
			}catch(NullPointerException e4){
				return visit(ctx.expression()) + ";";
			}


		}catch(NullPointerException e){
			try{
				return visit(ctx.flowcontrol());
			}
			catch(NullPointerException e2){
				return visit(ctx.returning()) + ";";
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitReturning(KotlinParser.ReturningContext ctx) {
		String result = "return ";
		try{
			result = result + visit(ctx.expression());
			return result;
		}catch(NullPointerException e){
			return result;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitExpression(KotlinParser.ExpressionContext ctx) { 
		try{
			return visit(ctx.commonstmt()) ;
		}catch(NullPointerException e){
			return visit(ctx.assignstmt()) ;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitAssignstmt(KotlinParser.AssignstmtContext ctx) { 

		String result = "";
		try{
			result = result + visit(ctx.unaryexpression()) + " ";
			result = result + ctx.assignment().getText() + " ";
			result = result + visit(ctx.commonstmt());
			return result;
		}catch(NullPointerException e){
			result = visit(ctx.variableDefine());
			return result;
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitUnaryexpression(KotlinParser.UnaryexpressionContext ctx) {
		return visit(ctx.posttermwithoutincdec());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitCommonstmt(KotlinParser.CommonstmtContext ctx) {
		String result = "";
		String test = "";
		try{
			test = ctx.QUESTION().getText();
			List<KotlinParser.CommonstmtContext> commonstmtlist = ctx.commonstmt();
			result = result + visit(ctx.oroperation()) + " ";
			result = result + "? ";
			result = result + visit(commonstmtlist.get(0)) + " ";
			result = result + ": ";
			result = result + visit(commonstmtlist.get(1)) + " ";
			return result;
			
		}catch(NullPointerException e){
			return visit(ctx.oroperation());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitOroperation(KotlinParser.OroperationContext ctx) { 
		String test="";
		String result = "";
		try{
			test = ctx.oroperation().getText();
			result = result + visit(ctx.oroperation()) + " ";
			result = result + ctx.LOGICAL_OR().getText()  + " ";
			result = result + visit(ctx.andoperation()) + " ";
			return result;

		}catch(NullPointerException e){
			return visit(ctx.andoperation());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitAndoperation(KotlinParser.AndoperationContext ctx) { 
		String test="";
		String result = "";
		try{
			test = ctx.andoperation().getText();
			result = result + visit(ctx.andoperation()) + " ";
			result = result + ctx.LOGICAL_AND().getText()  + " ";
			result = result + visit(ctx.inclusiveoroperation()) + " ";
			return result;

		}catch(NullPointerException e){
			return visit(ctx.inclusiveoroperation());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitInclusiveoroperation(KotlinParser.InclusiveoroperationContext ctx) {
		String test="";
		String result = "";
		try{
			test = ctx.inclusiveoroperation().getText();
			result = result + visit(ctx.inclusiveoroperation()) + " ";
			result = result + "|"  + " ";
			result = result + visit(ctx.exclusiveoperation()) + " ";
			return result;

		}catch(NullPointerException e){
			return visit(ctx.exclusiveoperation());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitExclusiveoperation(KotlinParser.ExclusiveoperationContext ctx) {
		String test="";
		String result = "";
		try{
			test = ctx.exclusiveoperation().getText();
			result = result + visit(ctx.exclusiveoperation()) + " ";
			result = result + "^"  + " ";
			result = result + visit(ctx.andExpr()) + " ";
			return result;

		}catch(NullPointerException e){
			return visit(ctx.andExpr());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitAndExpr(KotlinParser.AndExprContext ctx) {
		
		String test="";
		String result = "";
		try{
			test = ctx.andExpr().getText();
			result = result + visit(ctx.andExpr()) + " ";
			result = result + "&"  + " ";
			result = result + visit(ctx.equalityExpr()) + " ";
			return result;

		}catch(NullPointerException e){
			return visit(ctx.equalityExpr());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitEqualityExpr(KotlinParser.EqualityExprContext ctx) {
		String test="";
		String result = "";
		String equalizer = "";
		try{
			try{
				equalizer = ctx.EQUAL().getText();

			}catch(NullPointerException e2){
				try{
					equalizer = ctx.NOT_EQUAL().getText();
				}catch(NullPointerException e3){
					try{
						equalizer = ctx.NOT_EQUAL_R().getText();
					}catch(NullPointerException e4){
						equalizer = ctx.EQUAL_R().getText();
					}
				}
			}
			
			test = ctx.equalityExpr().getText();
			result = result + visit(ctx.equalityExpr()) + " ";
			result = result + equalizer  + " ";
			result = result + visit(ctx.comparableExpr()) + " ";
			return result;

		}catch(NullPointerException e){
			return visit(ctx.comparableExpr());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitComparableExpr(KotlinParser.ComparableExprContext ctx) {
		String test="";
		String result = "";
		String equalizer = "";
		try{
			try{
				equalizer = ctx.GT().getText();

			}catch(NullPointerException e2){
				try{
					equalizer = ctx.LT().getText();
				}catch(NullPointerException e3){
					try{
						equalizer = ctx.GTE().getText();
					}catch(NullPointerException e4){
						equalizer = ctx.LTE().getText();
					}
				}
			}
			
			test = ctx.comparableExpr().getText();
			result = result + visit(ctx.comparableExpr()) + " ";
			result = result + equalizer  + " ";
			result = result + visit(ctx.inisOperation()) + " ";
			return result;

		}catch(NullPointerException e){
			return visit(ctx.inisOperation());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitInisOperation(KotlinParser.InisOperationContext ctx) { 
		String result = "";
		String test = "";
		String inop = "";
		List<KotlinParser.ShiftExprContext> shiftlist = ctx.shiftExpr();
		result = result + visit(shiftlist.get(0)) + " ";
		try{
			test =  visit(ctx.type());
			try{
				inop = ctx.ISOP().getText();
				result = result + "instanceof" + " " + test + " ";
			}catch(NullPointerException e2){
				inop = ctx.NOTIS().getText();
				result = "( " +result + "instanceof" + " " + test + " ) ";
			}
			
			return result;
		}catch(NullPointerException e){
			if(shiftlist.size() > 1){
				List<KotlinParser.InnotinContext> ioplist = ctx.innotin();
				for(int i = 1; i<shiftlist.size() ; i++){
					result = result + visit(ioplist.get(i-1))+ " " + visit(shiftlist.get(i))  + " ";

				}
				return result;
			}else{
				return result;
			}
		}
		
	}
	@Override public String visitInnotin(KotlinParser.InnotinContext ctx) {
		 return ctx.getText();
		}
	
	@Override public String visitShiftExpr(KotlinParser.ShiftExprContext ctx) {
		 String result = "";
		 String test = "";
		 String shiftop ="";
		 try{
			test = ctx.shiftExpr().getText();
			result = result + visit(ctx.shiftExpr()) + " ";
			try{
				shiftop = ctx.SHIFT_R().getText();
				shiftop = ">>";

			}
			catch(NullPointerException e3){
				shiftop = "<<";
			}
			result = result + shiftop + " ";
			result = result + visit(ctx.rangeExpr()) + " ";
			return result;

		 }catch(NullPointerException e){
			return visit(ctx.rangeExpr());
		 }
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitRangeExpr(KotlinParser.RangeExprContext ctx) {
		return visit(ctx.addExpr().get(0));
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitAddExpr(KotlinParser.AddExprContext ctx) {
		String result = "";
		String test = "";
		String op ="";
		try{
			test = ctx.addExpr().getText();
			result = result + visit(ctx.addExpr()) + " ";
			try{
				op = ctx.PLUS().getText();
			}
			catch(NullPointerException e3){
				op = ctx.MINUS().getText();
			}
			result = result + op + " ";
			result = result + visit(ctx.multiExpr()) + " ";
			return result;

		}catch(NullPointerException e){
			return visit(ctx.multiExpr());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitMultiExpr(KotlinParser.MultiExprContext ctx) {
		String result = "";
		String test = "";
		String op ="";
		try{
			test = ctx.multiExpr().getText();
			result = result + visit(ctx.multiExpr()) + " ";
			try{
				op = ctx.DIV().getText();
			}
			catch(NullPointerException e3){
				try{				
					op = ctx.MUL().getText();
				}catch(NullPointerException e4){
					op = ctx.QUAT().getText();
				}

			}
			result = result + op + " ";
			result = result + visit(ctx.term()) + " ";
			return result;

		}catch(NullPointerException e){
			return visit(ctx.term());
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitTerm(KotlinParser.TermContext ctx) {
		String result = "";
		List<KotlinParser.PrefixopContext> prefixlist = ctx.prefixop();
		for(int i = 0 ; i<prefixlist.size() ; i++){
			result = result + prefixlist.get(i).getText();
		}
		result = result + visit(ctx.postterm());
		return result;
	}
	@Override public String visitPrefixop(KotlinParser.PrefixopContext ctx) {
		return ctx.getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitPostterm(KotlinParser.PosttermContext ctx) {
		String result = "";
		String id ="";
		if(argumenttype.get(ctx.atomic().getText()) != null && argumenttype.get(ctx.atomic().getText()).equals("Object") ){
			try{
				
				if(ctx.postoperation().size() > 0 ){
					if(ctx.postoperation().get(0).getText().equals(".length")){
						
						id = id + "((String )"+visit(ctx.atomic()) + ")";
					}
					else{
						id= visit(ctx.atomic());
					}
					
				}
				else{
					id = visit(ctx.atomic());
				}

			}catch(NullPointerException e){
				id =visit(ctx.atomic());
			}

		}
		else{
			id = visit(ctx.atomic());
		}

		result = result + id;
		List<KotlinParser.PostoperationContext> postoplist = ctx.postoperation();
		

		for(int i = 0 ; i<postoplist.size() ; i++){
			result = result +visit((postoplist.get(i)));
		}
		return result;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitPosttermwithoutincdec(KotlinParser.PosttermwithoutincdecContext ctx) {
		String result = "";
		String test = "";
		result = result + ctx.ID().getText();
		try{
			List<KotlinParser.ExpressionContext> expressionlist = ctx.expression();
			for(int i = 0 ; i < expressionlist.size(); i++){

				result=result+"["+visit(expressionlist.get(i))+"]";

			}
		}catch (NullPointerException e){
			
		}
		try{
			List<KotlinParser.DotoperationContext> dotlist = ctx.dotoperation();
			for(int i = 0 ; i<dotlist.size();i++){
				result= result + visit(dotlist.get(i));
			}
			return result;
		}
		catch(NullPointerException e ){
			return result;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitDotoperation(KotlinParser.DotoperationContext ctx) {
		return ctx.DOT().getText() + visit(ctx.posttermwithoutincdec());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitAtomic(KotlinParser.AtomicContext ctx) { 
		String result = "";
		try{
			return visit(ctx.digit()); //digit
		}catch(NullPointerException e){
			try{
				return visit(ctx.functioncall()); //functioncall
			}catch(NullPointerException e1){
				try{
					return visit(ctx.conditionalExp()); //condition
				}catch(NullPointerException e2){
					try{
						result = visit(ctx.type()); //type
						return result + "()";
					}catch(NullPointerException e3){ //[expression]
						try{
							String test = ctx.ID().getText();
							int flag = 0;
							if(SettingMap.get(test) != null){
								flag = 1;
							}else if(ListingMap.get(test) != null){
								flag =1;
							}
							result = result + test;
							List<KotlinParser.ExpressionContext> expressionlist = ctx.expression();
							for(int i = 0 ; i < expressionlist.size(); i++){
								if(flag != 1){
									result=result+"["+visit(expressionlist.get(i))+"]";
								}
								else{
									result = result + ".get(" + visit(expressionlist.get(i)) + ")";
								}

							}
							return result;

						}catch(NullPointerException e4){ //(expression)
							List<KotlinParser.ExpressionContext> expressionlist = ctx.expression();
							result = result + "(";
							for(int i = 0 ; i < expressionlist.size(); i++){

								result=result+visit(expressionlist.get(i));

							}
							result = result + ")";
							return result;
						}

					}

				}

			}

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitPostoperation(KotlinParser.PostoperationContext ctx) {
		String test = "";
		String result = "";
		try{
			result = ctx.INC().getText();
			return result;
		}catch(NullPointerException e){
			try{
				result =ctx.DEC().getText();
				return result;
			}catch(NullPointerException e2){
				//System.out.println(ctx.postterm().getText());
				if(ctx.postterm().getText().equals("size")){
					return ".size()";
				}
				else if(ctx.postterm().getText().equals("length")){
					return ".length()";
				}
				result = '.' + visit(ctx.postterm());
				return result;
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitDigit(KotlinParser.DigitContext ctx) {
		try{
			return visit(ctx.string());
		}catch(NullPointerException e){
			return ctx.getText();
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitFunctioncall(KotlinParser.FunctioncallContext ctx) {
		String result = "";
		String name = "";
		name = ctx.functionname().getText();

		if(name.equals("print")){
			name = "System.out.print";
		}
		else if(name.equals("listOf")){
			name = "List.of";
		}
		else if(name.equals("setOf")){
			name = "Set.of";
		}
		else if(name.equals("println")){
			name = "System.out.println";
		}
		if(methodMap.containsKey(name)){
			name = "new " + name + "()."+name;
		}
		result = result + name ;
		try{
			List<KotlinParser.InputparameterContext> inputparams = ctx.inputparameter();
			result = result + "(";
			for (int i = 0 ; i < inputparams.size() ; i++){
				if(i ==inputparams.size()-1 ){
					result= result + " " +visit(inputparams.get(i)) +" ";
				}
				else{
					result= result + " " +visit(inputparams.get(i)) +", ";
				}
			}
			result = result + ")";

		}
		catch(NullPointerException e){
			result = result + "()";
		}
		return result;


	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitLambdaExpr(KotlinParser.LambdaExprContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitFunctionname(KotlinParser.FunctionnameContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitInputparameter(KotlinParser.InputparameterContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitFlowcontrol(KotlinParser.FlowcontrolContext ctx) {
		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitLoopExp(KotlinParser.LoopExpContext ctx) {
		try{
			return visit(ctx.forExp());
		}catch(NullPointerException e){
			try{
				return visit(ctx.whileExp());
			}catch(NullPointerException e2){
				return visit(ctx.dowhileExp());
			}

		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitForExp(KotlinParser.ForExpContext ctx) {
		String result = "";
		String iterator = "";
		result = result + "for ( ";
		iterator = ctx.variableDeclare().ID().get(0).getText();
		KotlinParser.RangeExprContext rangeinfor = ctx.expression().commonstmt().oroperation().andoperation().inclusiveoroperation().
		exclusiveoperation().andExpr().equalityExpr().comparableExpr().inisOperation().shiftExpr().get(0).rangeExpr();
		List<KotlinParser.AddExprContext> contantslist = rangeinfor.addExpr();
		if(contantslist.size() > 1){
			try{
				String op = rangeinfor.RANGE_OP().getText();
				result = result + "int " + iterator + "=" + visit(contantslist.get(0))+"; " + iterator+ "<=" +visit(contantslist.get(1)) + "; ";
				try{
					String inc = rangeinfor.STEP().getText();
					result = result + iterator +"=" +iterator + "+" + visit(contantslist.get(2));
				}catch(NullPointerException e1){
					result = result + iterator +"++ ";

				}
			}
			catch(NullPointerException e){
				result = result + "int " + iterator + "=" + visit(contantslist.get(0))+ "; " + iterator+ ">=" +visit(contantslist.get(1)) + "; ";
				try{
					String inc = rangeinfor.STEP().getText();
					result = result + iterator +"=" +iterator + "-" + visit(contantslist.get(2));
				}catch(NullPointerException e3){
					result = result + iterator +"++ ";

				}
			}
		}
		else{
 
			if(SettingMap.get(visit(contantslist.get(0))) == null){
				String type = ListingMap.get(visit(contantslist.get(0)));
				int first_index = type.indexOf("<");
				int last_index = type.indexOf(">");
				type =type.substring(first_index+1, last_index);
				result = result + type + " " ;
			}
			else{
				String type = SettingMap.get(visit(contantslist.get(0)));
				int first_index = type.indexOf("<");
				int last_index = type.indexOf(">");
				type =type.substring(first_index+1, last_index);
				result = result + type + " ";
			}
			result = result + iterator + " : " +visit(contantslist.get(0)) ;
			

		}
		//System.out.println(result);
		
		result = result + ")";
		try{
			String test =  visit(ctx.block());
			result = result + "{\n" + test + "\n}\n";

		}catch(NullPointerException e){
			result = result + visit(ctx.inblockExpression());
		}
		return result;
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitVariableDeclare(KotlinParser.VariableDeclareContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitWhileExp(KotlinParser.WhileExpContext ctx) {
		String result = "";
		result = result + "while (" + visit(ctx.commonstmt()) + ") ";
		try{
			String test = ctx.block().getText();
			result = result + "{\n";
			result = result + visit(ctx.block());
			result = result + "\n}\n";
			
		}catch(NullPointerException e){
			result = result + visit(ctx.inblockExpression()) + "\n";
		}
		return result;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitDowhileExp(KotlinParser.DowhileExpContext ctx) {
		String result = "";
		result = result + "do\n";
		try{
			String test = ctx.block().getText();
			result = result + "{\n";
			result = result + visit(ctx.block());
			result = result + "\n}";
			
		}catch(NullPointerException e){
			result = result + visit(ctx.inblockExpression()) + "\n";
		}
				result = result + "while (" + visit(ctx.commonstmt()) + ") ";
		return result;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitConditionalExp(KotlinParser.ConditionalExpContext ctx) {
		try{
			return visit(ctx.ifExp());
		}catch(NullPointerException e){
			return visit(ctx.whenExp());
		}
	} 
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitIfExp(KotlinParser.IfExpContext ctx) {
		String result = "";
		result = result + "if ( ";
		result = result + visit(ctx.commonstmt());
		result = result + " ) ";
		List<KotlinParser.IfstmtContext> ifblock = ctx.ifstmt();
		if(ifblock.size()>1){
			result = result + "{\n"+ visit(ifblock.get(0)) + "\n}\n";
			result = result + "\nelse\n";
			result = result + "{\n"+ visit(ifblock.get(1)) + "\n}\n";
		}
		else{
			result = result + "{\n"+ visit(ifblock.get(0)) +"\n}\n";
		}
		return result;

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitIfstmt(KotlinParser.IfstmtContext ctx){
		String result = "";

		try{
			result = result +visit(ctx.inblockExpression());
		}
		catch(NullPointerException e){
			result = result + visit(ctx.block());
		}

		return result;
	}
	@Override public String visitWhenExp(KotlinParser.WhenExpContext ctx) { 
		String result = "";
		String test = "";
		List<KotlinParser.WhenComponentContext> components = ctx.whenComponent();
		try{
			test = ctx.expression().getText();

			result = result + "switch (" + ctx.expression().getText()+" ) {\n";
			for (int i = 0; i<components.size() ; i++){
				
			
				try{
					
					String gd = components.get(i).ELSE().getText();
				//	System.out.print("default!\n");
					result = result + "default : ";

				}
				catch(NullPointerException e3){
				
					String temp = visit(components.get(i).whenCondition().get(0).expression());
				//	System.out.print("case\n");
					result = result + "case ";
					result = result + temp + ": ";
				}
				result = result +visit(components.get(i).ifstmt()) +"\n";
			}
			result = result +"}\n";


		}catch(NullPointerException e){
			for (int i = 0; i<components.size() ; i++){
				result = result +"if ( ";
				result = result +visit(components.get(i).whenCondition().get(0).expression()) +" )";
				result = result +"{\n"+visit(components.get(i).ifstmt()) + "\n}\n";
			}
		}
		return result;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitWhenComponent(KotlinParser.WhenComponentContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitWhenCondition(KotlinParser.WhenConditionContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitRangeinWhen(KotlinParser.RangeinWhenContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitTypeinWhen(KotlinParser.TypeinWhenContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitType(KotlinParser.TypeContext ctx) {
		return ctx.getText();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} 
	 * on {@code ctx}.</p>
	 */
	@Override public String visitAssignment(KotlinParser.AssignmentContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitString(KotlinParser.StringContext ctx) {
		String result = "";
		List<KotlinParser.StringcomponentContext> stringcomplist = ctx.stringcomponent();
		if(stringcomplist.size() == 0){
			result = "\"\"";
			return result;
		}
		for(int i = 0 ; i<stringcomplist.size() ; i++){
			if(i == stringcomplist.size() -1){
				result = result + visit(stringcomplist.get(i));
			}
			else{
				result = result + visit(stringcomplist.get(i)) + " + ";
			}

		}
		return result;
		
	}
	@Override public String visitStringcomponent(KotlinParser.StringcomponentContext ctx) {
		try{
			return  visit(ctx.stringContent()); 
		}
		catch(NullPointerException e){
			return visit(ctx.stringExpression());
		}
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitStringContent(KotlinParser.StringContentContext ctx) {
		try{
			return "\"" + ctx.StrCommonText().getText() + "\"";

		}catch(NullPointerException e){
			try{
				return "\"" + ctx.StrEscape().getText() + "\"";
			}catch(NullPointerException e1){
				return  ctx.StrFieldReference().getText().substring(1);
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>Stringhe default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public String visitStringExpression(KotlinParser.StringExpressionContext ctx) {
		return "(" + visit(ctx.expression()) +")";
	}

}








public class Kotlin2java {
	public static void main(String[] args) throws IOException {
		String a = "";
		File f_out;
		FileWriter fw;

		KotlinLexer lexer = new KotlinLexer(CharStreams.fromFileName(args[0]));
				// Get a list of matched tokens
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// Pass tokens to parser
		KotlinParser parser = new KotlinParser(tokens);
		// Walk parse-tree and attach our listener
		//ParseTreeWalker walker = new ParseTreeWalker();
		String mainname ="";
		try{
			mainname = args[1];
		}catch(ArrayIndexOutOfBoundsException e){
			mainname = "output.java";
		}
		
	
		Kotlin2javaVisitor visitor = new Kotlin2javaVisitor(mainname);
		a = visitor.visit(parser.prog());
		visitor.fileclose();


		f_out = new File(mainname);
		fw = new FileWriter(f_out); 
		fw.write(a);


		fw.close();

	}
}
