package demo.controller;

import demo.modle.Customer;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@EnableAutoConfiguration
@Controller
@RequestMapping("/customers")
public class CustomerController {

    private static List<Customer> customerList = new ArrayList<Customer>();

    static {
        customerList.add(new Customer(1l, "John Johnny"));
        customerList.add(new Customer(2l, "Sally Sallyey"));
        customerList.add(new Customer(3l, "Bob, Bobby"));
    }

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Customer> getAllCustomers(){
        return customerList;
    }

}
