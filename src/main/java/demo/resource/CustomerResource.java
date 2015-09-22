package demo.resource;

import demo.modle.Customer;
import demo.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by scipio on 9/20/15.
 */
public class CustomerResource {

    @Autowired
    ICustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(long id){
        return customerRepository.findById(id);
    }

    public List<Customer> getCustomersByFirstName(String firstName){
        return customerRepository.findByFirstName(firstName);
    }

    public List<Customer> getCustomersByLastName(String lastName){
        return customerRepository.findByLastName(lastName);
    }

    public Customer createCustomer(String firstName, String lastName){
        return customerRepository.save(new Customer(firstName, lastName));
    }
}
