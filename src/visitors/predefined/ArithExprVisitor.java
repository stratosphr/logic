package visitors.predefined;

import language.exprs.funs.predefined.arith.Add;
import language.exprs.funs.predefined.arith.Div;
import language.exprs.funs.predefined.arith.Mul;
import language.exprs.funs.predefined.arith.Sub;
import language.exprs.variables.IntVar;
import visitors.IArithExprVisitor;

/**
 * Created by stratosphr on 21/11/15.
 */
public class ArithExprVisitor implements IArithExprVisitor {

    @Override
    public Object visit(IntVar intVar) {
        return null;
    }

    @Override
    public Object visit(Add add) {
        return null;
    }

    @Override
    public Object visit(Sub sub) {
        return null;
    }

    @Override
    public Object visit(Mul mul) {
        return null;
    }

    @Override
    public Object visit(Div div) {
        return null;
    }

}
