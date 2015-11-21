package visitors;

import exprs.variables.BoolVar;

/**
 * Created by stratosphr on 20/11/15.
 */
public interface IBoolExprVisitor extends IExprVisitor {

    Object visit(BoolVar boolVar);

}
