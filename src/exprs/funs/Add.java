package exprs.funs;

import visitors.IArithExprVisitor;

/**
 * Created by stratosphr on 20/11/15.
 */
public class Add extends AbstractArithFun {

    @Override
    public Object accept(IArithExprVisitor visitor) {
        return visitor.visit(this);
    }

}
