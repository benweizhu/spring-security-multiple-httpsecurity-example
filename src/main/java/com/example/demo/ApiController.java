package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping(value = "/api/get")
    public String getApi(){
        return "get";
    }

    @GetMapping(value = "/page/get")
    public String getPage(){
        return "get";
    }

}
