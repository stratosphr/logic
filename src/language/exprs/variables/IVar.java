package language.exprs.variables;

import language.exprs.IExpr;
import language.sorts.ISort;

/**
 * Created by stratosphr on 20/11/15.
 */
public interface IVar extends IExpr {

    String getName();

    ISort getSort();

}
