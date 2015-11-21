package exprs.variables;

import sorts.IntSort;
import visitors.IArithExprVisitor;

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

}
