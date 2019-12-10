package com.iamsoo.spring.security.springsecurityjwt.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!!!";
    }

}
