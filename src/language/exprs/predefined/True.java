package language.exprs.predefined;

import language.exprs.IBoolExpr;
import visitors.IBoolExprVisitor;

/**
 * Created by stratosphr on 21/11/15.
 */
public class True implements IBoolExpr {

    @Override
    public Object accept(IBoolExprVisitor visitor) {
        return visitor.visit(this);
    }

}
