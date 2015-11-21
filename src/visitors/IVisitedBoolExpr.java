package visitors;

/**
 * Created by stratosphr on 20/11/15.
 */
public interface IVisitedBoolExpr extends IVisitedExpr {

    Object accept(IBoolExprVisitor visitor);

}
