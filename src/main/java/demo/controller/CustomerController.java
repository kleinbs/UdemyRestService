package demo.controller;

import demo.modle.Customer;
import demo.resource.CustomerResource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.naming.factory.ResourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@EnableAutoConfiguration
@Controller
@RequestMapping("/customers")
public class CustomerController {

    final Logger logger = LogManager.getLogger(CustomerController.class);

    @Autowired
    CustomerResource customerResource;

    private static List<Customer> customerList = new ArrayList<Customer>();

    static {
        customerList.add(new Customer("John", "Johnny"));
        customerList.add(new Customer("Sally", "Sallyey"));
        customerList.add(new Customer("Bob", "Bobby"));
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Customer> getAllCustomers(){
        logger.info("getting all customers");
        return customerResource.getAllCustomers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Customer getCustomer(@PathVariable("id") long id) {
        logger.info("getting customer " + id);
        return customerResource.getCustomerById(id);
    }

    @RequestMapping(value = "firstName/{firstName}/lastName/{lastName}",
            method = RequestMethod.PUT)
    @ResponseBody
    public Customer createCustomer(@PathVariable("firstName") String firstName,
                                   @PathVariable("lastName") String lastName){
        logger.info("Creating customer FirstName " + firstName + " LastName " + lastName);
        return customerResource.createCustomer(firstName, lastName);
    }
}
