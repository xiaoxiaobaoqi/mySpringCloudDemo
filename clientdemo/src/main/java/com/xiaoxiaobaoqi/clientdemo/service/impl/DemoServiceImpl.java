package com.xiaoxiaobaoqi.clientdemo.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xiaoxiaobaoqi.clientdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yidonge
 * @date 22:13
 * @description
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    RestTemplate restTemplate;


    @Override
    @HystrixCommand(fallbackMethod = "testFallbackMethod")
    public String test() {
        return restTemplate.getForEntity("http://DEMO2-SERVICE/hello",String.class).getBody();
    }

    public String testFallbackMethod() {
        return "hah error";
    }
}
