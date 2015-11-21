package language.exprs.funs;

import language.exprs.IExpr;
import utilities.UArrays;

import java.util.List;

/**
 * Created by stratosphr on 20/11/15.
 */
public abstract class AbstractFun implements IFun {

    private final List<IExpr> parameters;

    public AbstractFun(IExpr... parameters) {
        this.parameters = UArrays.asList(parameters);
    }

    @Override
    public List<? extends IExpr> getParameters() {
        return parameters;
    }

}
