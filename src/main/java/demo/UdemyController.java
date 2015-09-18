package demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
@RequestMapping("/hello")
public class UdemyController {

    @RequestMapping("")
    @ResponseBody
    public String hello(){
        return "Hello World";
    }
}
