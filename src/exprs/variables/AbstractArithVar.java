package exprs.variables;

import sorts.IArithSort;

/**
 * Created by stratosphr on 20/11/15.
 */
public abstract class AbstractArithVar extends AbstractVar implements IArithVar {

    public AbstractArithVar(String name, IArithSort sort) {
        super(name, sort);
    }

}
