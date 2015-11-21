package language.exprs.variables;

import language.sorts.IntSort;
import visitors.IArithExprVisitor;
import visitors.IBoolExprVisitor;

/**
 * Created by stratosphr on 20/11/15.
 */
public class IntVar extends AbstractArithVar implements IArithVar {

    public IntVar(String name) {
        super(name, new IntSort());
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
