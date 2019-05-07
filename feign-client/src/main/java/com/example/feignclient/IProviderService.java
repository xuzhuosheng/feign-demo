package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient("feign-provider")
public interface IProviderService {


    @RequestMapping("/test")
     String test(@RequestParam("name") String name,@RequestParam("sex") String sex);

}
