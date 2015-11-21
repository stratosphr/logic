package utilities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stratosphr on 21/11/15.
 */
public class ULists {

    @SafeVarargs
    public static <T> List<T> concatenate(List<T>... lists) {
        List<T> ret = new ArrayList<>();
        if (lists != null) {
            for (List<T> list : lists) {
                ret.addAll(list);
            }
        }
        return ret;
    }

}
