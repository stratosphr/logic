package utilities;

import java.util.Arrays;
import java.util.List;

/**
 * Created by stratosphr on 03/11/15.
 */
public class UArrays {

    @SuppressWarnings("unchecked")
    public static <T> List<T> asList(T... elements) {
        if (elements == null) {
            elements = (T[]) new Object[0];
        }
        return Arrays.asList(elements);
    }

}
