package language.exprs.funs.predefined.bool;

import language.exprs.IBoolExpr;
import language.exprs.IExpr;
import language.exprs.funs.AbstractBoolFun;
import utilities.UArrays;
import visitors.IBoolExprVisitor;

/**
 * Created by stratosphr on 21/11/15.
 */
public class Implies extends AbstractBoolFun {

    public Implies(IBoolExpr condition, IBoolExpr then) {
        super((IExpr[]) UArrays.asList(condition, then).toArray(new IExpr[2]));
    }

    @Override
    public Object accept(IBoolExprVisitor visitor) {
        return visitor.visit(this);
    }

}
