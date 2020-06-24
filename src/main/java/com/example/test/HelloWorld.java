package com.example.test;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWorld {

    @RequestMapping("/index")

    public String sayHello(){

        return "index";

    }
}
