import language.Examples;
import utilities.UChars;
import visitors.predefined.BoolExprPrettyPrinter;

/**
 * Created by stratosphr on 20/11/15.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(Examples.getFullLanguageUsage().accept(new BoolExprPrettyPrinter()));
        System.out.println(UChars.andChar);
    }

}
