package visitors;

/**
 * Created by stratosphr on 20/11/15.
 */
public interface IVisitedArithExpr extends IVisitedExpr {

    Object accept(IArithExprVisitor visitor);

}
