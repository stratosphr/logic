package language.exprs.funs;

import language.exprs.IArithExpr;

import java.util.List;

/**
 * Created by stratosphr on 20/11/15.
 */
@SuppressWarnings("unchecked")
public abstract class AbstractArithFun extends AbstractFun implements IArithFun {

    public AbstractArithFun(IArithExpr... parameters) {
        super(parameters);
    }

    @Override
    public List<IArithExpr> getParameters() {
        return (List<IArithExpr>) super.getParameters();
    }

}

