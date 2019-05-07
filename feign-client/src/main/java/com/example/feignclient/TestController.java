package com.example.feignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    IProviderService iProviderService;


    @RequestMapping("/cs")
    public String ceshi(){
        return  iProviderService.test("xiehui","nv");
    }

}
