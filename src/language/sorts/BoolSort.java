package language.sorts;

import visitors.ISortVisitor;

/**
 * Created by stratosphr on 20/11/15.
 */
public class BoolSort extends Sort {

    public BoolSort() {
        super("BOOL");
    }

    @Override
    public Object accept(ISortVisitor visitor) {
        return visitor.visit(this);
    }

}
