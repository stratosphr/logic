package visitors;

import language.exprs.funs.predefined.arith.Add;
import language.exprs.funs.predefined.arith.Div;
import language.exprs.funs.predefined.arith.Mul;
import language.exprs.funs.predefined.arith.Sub;
import language.exprs.variables.IntVar;

/**
 * Created by stratosphr on 20/11/15.
 */
public interface IArithExprVisitor extends IExprVisitor {

    Object visit(IntVar intVar);

    Object visit(Add add);

    Object visit(Sub sub);

    Object visit(Mul mul);

    Object visit(Div div);

}
