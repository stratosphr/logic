package language.exprs.funs.predefined.bool;

import language.exprs.IBoolExpr;
import language.exprs.IExpr;
import language.exprs.funs.AbstractBoolFun;
import utilities.UArrays;
import utilities.ULists;
import visitors.IBoolExprVisitor;

import java.util.ArrayList;

/**
 * Created by stratosphr on 21/11/15.
 */
public class Equivalent extends AbstractBoolFun {

    public Equivalent(IBoolExpr first, IBoolExpr second, IBoolExpr... others) {
        super((IExpr[]) ULists.concatenate(UArrays.asList(first, second), UArrays.asList(others)).toArray(new IExpr[2 + others.length]));
    }

    @Override
    public Object accept(IBoolExprVisitor visitor) {
        return visitor.visit(this);
    }

}
