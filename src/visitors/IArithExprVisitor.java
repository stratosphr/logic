package visitors;

import exprs.funs.Add;
import exprs.variables.IntVar;

/**
 * Created by stratosphr on 20/11/15.
 */
public interface IArithExprVisitor extends IExprVisitor {

    Object visit(IntVar intVar);

    Object visit(Add add);
    
}
