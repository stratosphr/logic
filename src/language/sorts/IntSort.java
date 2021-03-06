package language.sorts;

import visitors.ISortVisitor;

/**
 * Created by stratosphr on 20/11/15.
 */
public class IntSort extends Sort implements IArithSort {

    public IntSort() {
        super("INT");
    }

    @Override
    public Object accept(ISortVisitor visitor) {
        return visitor.visit(this);
    }

}
