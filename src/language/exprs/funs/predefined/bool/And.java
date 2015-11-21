package language.exprs.funs.predefined.bool;

import language.exprs.IBoolExpr;
import language.exprs.IExpr;
import language.exprs.funs.AbstractBoolFun;
import utilities.UArrays;
import utilities.ULists;
import visitors.IBoolExprVisitor;

/**
 * Created by stratosphr on 21/11/15.
 */
public class And extends AbstractBoolFun {

    public And(IBoolExpr first, IBoolExpr... others) {
        super((IExpr[]) ULists.concatenate(UArrays.asList(first), UArrays.asList(others)).toArray(new IExpr[1 + others.length]));
    }

    @Override
    public Object accept(IBoolExprVisitor visitor) {
        return visitor.visit(this);
    }

}
