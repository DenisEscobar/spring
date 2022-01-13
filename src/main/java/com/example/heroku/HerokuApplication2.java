package com.example.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HerokuApplication2 {

    @RequestMapping("/imprimirArray")
    @ResponseBody
    String[] home(){
        String array[]={"pedro", "juan"};
        return array;
    }
    public static void main(String[] args) {
        SpringApplication.run(com.example.heroku.HerokuApplication.class, args);
    }

}

