package language.exprs.funs;

import language.exprs.IExpr;

import java.util.List;

/**
 * Created by stratosphr on 20/11/15.
 */
public interface IFun extends IExpr {

    List<? extends IExpr> getParameters();

}
