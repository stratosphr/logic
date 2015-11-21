package exprs.variables;

import sorts.ISort;

/**
 * Created by stratosphr on 20/11/15.
 */
public abstract class AbstractVar implements IVar {

    private final String name;
    private final ISort sort;

    public AbstractVar(String name, ISort sort) {
        this.name = name;
        this.sort = sort;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ISort getSort() {
        return sort;
    }

}
