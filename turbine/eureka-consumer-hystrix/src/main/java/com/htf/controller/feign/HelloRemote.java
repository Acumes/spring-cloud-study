package com.htf.controller.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author acumes
 * @date 2018/9/30 10:00
 */
@FeignClient(name = "producer", fallback = HelloRemote.HelloHystrix.class)
public interface HelloRemote {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name") String name);

    @Component
    class HelloHystrix implements HelloRemote {

        @Override
        public String hello(String name) {
            return "Hello World!";
        }
    }

}