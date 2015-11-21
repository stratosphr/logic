package language.exprs.funs.predefined.arith;

import language.exprs.IArithExpr;
import language.exprs.funs.AbstractArithFun;
import visitors.IArithExprVisitor;
import visitors.IBoolExprVisitor;

/**
 * Created by stratosphr on 21/11/15.
 */
public class Sub extends AbstractArithFun {

    public Sub(IArithExpr... parameters) {
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
