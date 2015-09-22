package demo.repository;

import demo.modle.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by scipio on 9/20/15.
 */
public interface ICustomerRepository extends MongoRepository<Customer, String> {

    Customer findById(long id);
    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);

}
