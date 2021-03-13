package com.example.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


    }

    @RequestMapping(path = "/test")
    public String test(){
        return  "hello world "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

}
