package language.exprs.funs;

import language.exprs.IArithExpr;

import java.util.List;

/**
 * Created by stratosphr on 20/11/15.
 */
public interface IArithFun extends IFun, IArithExpr {

    List<IArithExpr> getParameters();

}
