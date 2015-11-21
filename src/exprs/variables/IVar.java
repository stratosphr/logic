package exprs.variables;

import exprs.IExpr;
import sorts.ISort;

/**
 * Created by stratosphr on 20/11/15.
 */
public interface IVar extends IExpr {

    String getName();

    ISort getSort();

}
