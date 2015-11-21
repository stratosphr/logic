package language.exprs.funs.predefined.arith;

import language.exprs.IArithExpr;
import language.exprs.funs.AbstractArithFun;
import visitors.IArithExprVisitor;
import visitors.IBoolExprVisitor;

/**
 * Created by stratosphr on 20/11/15.
 */
public class Add extends AbstractArithFun {

    public Add(IArithExpr... parameters) {
        super(parameters);
    }

    @Override
    public Object accept(IArithExprVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public Object accept(IBoolExprVisitor visitor) {
        return visitor.visit(this);
    }

}
