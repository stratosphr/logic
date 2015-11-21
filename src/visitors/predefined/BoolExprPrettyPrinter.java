package visitors.predefined;

import language.exprs.funs.predefined.arith.Add;
import language.exprs.funs.predefined.arith.Div;
import language.exprs.funs.predefined.arith.Mul;
import language.exprs.funs.predefined.arith.Sub;
import language.exprs.funs.predefined.bool.*;
import language.exprs.predefined.False;
import language.exprs.predefined.True;
import language.exprs.variables.BoolVar;
import language.exprs.variables.IntVar;
import visitors.IBoolExprVisitor;
import visitors.IVisitedExpr;

import java.util.List;

/**
 * Created by stratosphr on 21/11/15.
 */
public class BoolExprPrettyPrinter extends AbstractBoolExprVisitor {

    private Object fun(String representation, List<? extends IVisitedExpr> parameters) {
        String str = "(";
        if (parameters.size() == 1) {
            str += representation + " " + parameters.get(0).accept(this);
        } else {
            for (IVisitedExpr parameter : parameters.subList(0, parameters.size() - 1)) {
                str += parameter.accept(this) + " " + representation + " ";
            }
            str += parameters.get(parameters.size() - 1).accept(this);
        }
        str += ")";
        return str;
    }

    @Override
    public Object visit(BoolVar boolVar) {
        return boolVar.getName();
    }

    @Override
    public Object visit(False aFalse) {
        return "FALSE";
    }

    @Override
    public Object visit(True aTrue) {
        return "TRUE";
    }

    @Override
    public Object visit(And and) {
        return fun("and", and.getParameters());
    }

    @Override
    public Object visit(Or or) {
        return fun("or", or.getParameters());
    }

    @Override
    public Object visit(Not not) {
        return fun("not", not.getParameters());
    }

    @Override
    public Object visit(LowerThan lowerThan) {
        return fun("<", lowerThan.getParameters());
    }

    @Override
    public Object visit(LowerOrEqualTo lowerOrEqualTo) {
        return fun("<=", lowerOrEqualTo.getParameters());
    }

    @Override
    public Object visit(Equals equals) {
        return fun("=", equals.getParameters());
    }

    @Override
    public Object visit(GreaterOrEqualTo greaterOrEqualTo) {
        return fun(">=", greaterOrEqualTo.getParameters());
    }

    @Override
    public Object visit(GreaterThan greaterThan) {
        return fun(">", greaterThan.getParameters());
    }

    @Override
    public Object visit(Implies implies) {
        return fun("==>", implies.getParameters());
    }

    @Override
    public Object visit(IfThenElse ifThenElse) {
        return fun("ite", ifThenElse.getParameters());
    }

    @Override
    public Object visit(Equivalent equivalent) {
        return fun("<==>", equivalent.getParameters());
    }

    @Override
    public Object visit(IntVar intVar) {
        return intVar.getName();
    }

    @Override
    public Object visit(Add add) {
        return fun("+", add.getParameters());
    }

    @Override
    public Object visit(Sub sub) {
        return fun("-", sub.getParameters());
    }

    @Override
    public Object visit(Mul mul) {
        return fun("*", mul.getParameters());
    }

    @Override
    public Object visit(Div div) {
        return fun("/", div.getParameters());
    }

}
