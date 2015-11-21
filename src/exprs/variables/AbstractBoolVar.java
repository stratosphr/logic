package exprs.variables;

import sorts.ISort;

/**
 * Created by stratosphr on 20/11/15.
 */
public abstract class AbstractBoolVar extends AbstractVar implements IBoolVar {

    public AbstractBoolVar(String name, ISort sort) {
        super(name, sort);
    }

}
