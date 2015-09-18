package demo.modle;

/**
 * Created by brianklein on 9/18/15.
 */
public class Customer {

    private long id;
    private String name;

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
