package com.example.heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HerokuApplication {

    @RequestMapping("/im")
    @ResponseBody
    int[] home(){
        int[] num= {1,2,3};
        return num;
    }
    public static void main(String[] args) {
        SpringApplication.run(HerokuApplication.class, args);
    }

}
