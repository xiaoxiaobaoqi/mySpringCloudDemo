package com.xiaoxiaobaoqi.kfeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KfeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KfeurekaApplication.class, args);
//        new SpringApplicationBuilder(KfeurekaApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

}
