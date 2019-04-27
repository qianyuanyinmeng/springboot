package com.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Controller
@SpringBootApplication
public class SpringbootApplication {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Hello World";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
