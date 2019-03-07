package org.tools.expr.boot;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.tools.expr.core.entity.DescriptiveErrorListener;
import org.tools.expr.core.entity.INode;
import org.tools.expr.core.entity.ParseFailureException;
import org.tools.expr.synthesis.Analyzer;
import org.tools.expr.synthesis.grammar.ExpressionLexer;
import org.tools.expr.synthesis.grammar.ExpressionParser;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ExpressionMain {

    public static void main(String[] args) throws Exception {

        try {
        
            ExpressionMain em = new ExpressionMain();
            em.getTree("a = b");
        } catch (ParseFailureException pfe) {
          String message = String.format("sourcename: %s line: %s charPos: %s  offendingtoken: %s", pfe.getSourceName(), pfe.getLine(), pfe.getCharPositionInLine(), pfe.getOffendingToken());
          System.err.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }

    public INode getTree(String expression) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(expression);
        ExpressionLexer selectLexer = new ExpressionLexer(input);
        selectLexer.removeErrorListeners();
        selectLexer.addErrorListener(DescriptiveErrorListener.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(selectLexer);
        ExpressionParser expressionParser = new ExpressionParser(tokens);
        //selectParser.setErrorHandler(new BailErrorStrategy());
        expressionParser.removeErrorListeners();
        expressionParser.addErrorListener(DescriptiveErrorListener.INSTANCE);

        ParseTree tree = expressionParser.root();
        Analyzer analyzer = new Analyzer();
        INode node = (INode)analyzer.visit(tree);
        ObjectMapper jsonMapper = new ObjectMapper();
        System.out.println(jsonMapper.writeValueAsString(node));
        return node;
    }
}
