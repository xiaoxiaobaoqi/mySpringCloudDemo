package com.xiaoxiaobaoqi.clientdemo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xiaoxiaobaoqi.clientdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author yidonge
 * @date 22:52
 * @description
 */
@Controller
@ResponseBody
public class MyController {

    @Autowired
    DemoService demoService;

    @GetMapping("ribbonTest")
    public String test(){
        return demoService.test();
    }

    public String helloFallback(){
        return "error";
    }
}
