package language.exprs.funs.predefined.bool;

import language.exprs.IBoolExpr;
import language.exprs.IExpr;
import language.exprs.funs.AbstractBoolFun;
import utilities.UArrays;
import visitors.IBoolExprVisitor;

/**
 * Created by stratosphr on 21/11/15.
 */
public class IfThenElse extends AbstractBoolFun {

    public IfThenElse(IBoolExpr condition, IBoolExpr then, IBoolExpr otherwise) {
        super((IExpr[]) UArrays.asList(condition, then, otherwise).toArray(new IExpr[3]));
    }

    @Override
    public Object accept(IBoolExprVisitor visitor) {
        return visitor.visit(this);
    }

}
