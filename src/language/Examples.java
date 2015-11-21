package language;

import language.exprs.IBoolExpr;
import language.exprs.funs.predefined.arith.Div;
import language.exprs.funs.predefined.arith.Mul;
import language.exprs.funs.predefined.bool.*;
import language.exprs.variables.BoolVar;
import language.exprs.variables.IntVar;

/**
 * Created by stratosphr on 21/11/15.
 */
public class Examples {

    public static IBoolExpr getFullLanguageUsage() {
        return new And(
                new BoolVar("b1"),
                new Not(
                        new Or(
                                new Not(
                                        new BoolVar("b2")
                                ),
                                new Not(
                                        new And(
                                                new Equals(
                                                        new IntVar("42"),
                                                        new IntVar("v1"),
                                                        new IntVar("v2")
                                                ),
                                                new Or(
                                                        new BoolVar("true"),
                                                        new BoolVar("b3")
                                                )
                                        )
                                ),
                                new Equals(
                                        new Implies(
                                                new Equivalent(
                                                        new GreaterOrEqualTo(
                                                                new IntVar("v3"),
                                                                new IntVar("v4")
                                                        ),
                                                        new BoolVar("b4"),
                                                        new LowerThan(
                                                                new IntVar("v5"),
                                                                new IntVar("v6")
                                                        )
                                                ),
                                                new LowerThan(
                                                        new IntVar("v7"),
                                                        new IntVar("64")
                                                )
                                        ),
                                        new GreaterThan(
                                                new Mul(
                                                        new IntVar("v8"),
                                                        new IntVar("12"),
                                                        new IntVar("32")
                                                ),
                                                new Div(
                                                        new IntVar("v9"),
                                                        new IntVar("4")
                                                )
                                        )
                                )
                        )
                ),
                new BoolVar("b5")
        );
    }

}
