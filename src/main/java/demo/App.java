package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by brianklein on 9/18/15.
 */
@EnableAutoConfiguration
@ComponentScan("demo")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
