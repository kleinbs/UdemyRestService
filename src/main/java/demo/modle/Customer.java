package demo.modle;

import org.springframework.data.annotation.Id;

/**
 * Created by Brian Klein on 9/18/15.
 */
public class Customer {

    @Id
    private long id;
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return String.format("Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);

    }
}
