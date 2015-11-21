package sorts;

/**
 * Created by stratosphr on 20/11/15.
 */
public class Sort implements ISort {

    private String representation;

    public Sort(String representation) {
        this.representation = representation;
    }

    @Override
    public String getRepresentation() {
        return representation;
    }

}
