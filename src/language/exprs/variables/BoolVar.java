package language.exprs.variables;

import language.sorts.BoolSort;
import visitors.IBoolExprVisitor;

/**
 * Created by stratosphr on 20/11/15.
 */
public class BoolVar extends AbstractVar implements IBoolVar {

    public BoolVar(String name) {
        super(name, new BoolSort());
    }

    @Override
    public Object accept(IBoolExprVisitor visitor) {
        return visitor.visit(this);
    }

}
