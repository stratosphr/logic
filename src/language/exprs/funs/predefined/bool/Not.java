package language.exprs.funs.predefined.bool;

import language.exprs.IBoolExpr;
import language.exprs.IExpr;
import language.exprs.funs.AbstractBoolFun;
import visitors.IBoolExprVisitor;

/**
 * Created by stratosphr on 21/11/15.
 */
public class Not extends AbstractBoolFun {

    public Not(IBoolExpr parameter) {
        super((IExpr) parameter);
    }

    @Override
    public Object accept(IBoolExprVisitor visitor) {
        return visitor.visit(this);
    }

}
