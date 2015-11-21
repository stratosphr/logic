package visitors;

/**
 * Created by stratosphr on 20/11/15.
 */
public interface IVisitedExpr {

    Object accept(IBoolExprVisitor visitor);

}
