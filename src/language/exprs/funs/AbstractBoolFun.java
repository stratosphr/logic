package language.exprs.funs;

import language.exprs.IExpr;

/**
 * Created by stratosphr on 20/11/15.
 */
public abstract class AbstractBoolFun extends AbstractFun implements IBoolFun {

    public AbstractBoolFun(IExpr... parameters) {
        super(parameters);
    }

}
