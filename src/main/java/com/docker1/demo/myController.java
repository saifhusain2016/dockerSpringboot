package com.docker1.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world this is sample test...";
    }

}
