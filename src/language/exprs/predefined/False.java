package language.exprs.predefined;

import language.exprs.IBoolExpr;
import visitors.IBoolExprVisitor;
import visitors.IVisitor;

/**
 * Created by stratosphr on 21/11/15.
 */
public class False implements IBoolExpr {

    @Override
    public Object accept(IBoolExprVisitor visitor) {
        return visitor.visit(this);
    }

}
