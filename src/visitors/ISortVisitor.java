package visitors;

import language.sorts.BoolSort;
import language.sorts.IntSort;
import language.sorts.Sort;

/**
 * Created by stratosphr on 21/11/15.
 */
public interface ISortVisitor {

    Object visit(BoolSort sort);

    Object visit(IntSort sort);

    Object visit(Sort sort);

}
