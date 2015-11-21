package language.exprs.funs.predefined.bool;

import language.exprs.IArithExpr;
import language.exprs.IExpr;
import language.exprs.funs.AbstractBoolFun;
import visitors.IBoolExprVisitor;

/**
 * Created by stratosphr on 21/11/15.
 */
public class LowerOrEqualTo extends AbstractBoolFun {

    public LowerOrEqualTo(IArithExpr first, IArithExpr second) {
        super(first, second);
    }

    @Override
    public Object accept(IBoolExprVisitor visitor) {
        return visitor.visit(this);
    }

}
