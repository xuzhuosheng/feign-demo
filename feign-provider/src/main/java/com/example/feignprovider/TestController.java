package com.example.feignprovider;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(String name, String sex) {
        Student student = new Student(name, sex);
        return student.toString();
    }

}
