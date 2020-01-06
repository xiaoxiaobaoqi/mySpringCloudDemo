package com.xiaoxiaobaoqi.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yidonge
 * @date 21:55
 * @description
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(){
        System.out.println("haa");
        return "hello my friends!";
    }
}
