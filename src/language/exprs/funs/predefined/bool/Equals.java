package language.exprs.funs.predefined.bool;

import language.exprs.IArithExpr;
import language.exprs.IBoolExpr;
import language.exprs.IExpr;
import language.exprs.funs.AbstractBoolFun;
import utilities.UArrays;
import utilities.ULists;
import visitors.IBoolExprVisitor;

/**
 * Created by stratosphr on 21/11/15.
 */
public class Equals extends AbstractBoolFun {

    public Equals(IBoolExpr first, IBoolExpr second, IBoolExpr... others) {
        super((IExpr[]) ULists.concatenate(UArrays.asList(first, second), UArrays.asList(others)).toArray(new IExpr[2 + others.length]));
    }

    public Equals(IArithExpr first, IArithExpr second, IArithExpr... others) {
        super((IExpr[]) ULists.concatenate(UArrays.asList(first, second), UArrays.asList(others)).toArray(new IExpr[2 + others.length]));
    }

    @Override
    public Object accept(IBoolExprVisitor visitor) {
        return visitor.visit(this);
    }

}
