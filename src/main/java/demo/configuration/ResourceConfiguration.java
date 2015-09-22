package demo.configuration;

import demo.resource.CustomerResource;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.apache.naming.factory.ResourceFactory;
import org.springframework.context.annotation.Bean;

/**
 * Created by scipio on 9/20/15.
 */
@org.springframework.context.annotation.Configuration
public class ResourceConfiguration {

    Logger logger = Logger.getLogger(ResourceFactory.class);

    @Bean
    public CustomerResource getCustomerResource(){
        logger.info("Creating Customer Resource Bean");
        return new CustomerResource();
    }
}
