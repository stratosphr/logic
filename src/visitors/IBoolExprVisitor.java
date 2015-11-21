package visitors;

import language.exprs.funs.predefined.bool.*;
import language.exprs.predefined.False;
import language.exprs.predefined.True;
import language.exprs.variables.BoolVar;

/**
 * Created by stratosphr on 20/11/15.
 */
public interface IBoolExprVisitor extends IArithExprVisitor {

    Object visit(BoolVar boolVar);

    Object visit(False aFalse);

    Object visit(True aTrue);

    Object visit(And and);

    Object visit(Or or);

    Object visit(Not not);

    Object visit(LowerThan lowerThan);

    Object visit(LowerOrEqualTo lowerOrEqualTo);

    Object visit(Equals equals);

    Object visit(GreaterOrEqualTo greaterOrEqualTo);

    Object visit(GreaterThan greaterThan);

    Object visit(Implies implies);

    Object visit(IfThenElse ifThenElse);

    Object visit(Equivalent equivalent);

}
