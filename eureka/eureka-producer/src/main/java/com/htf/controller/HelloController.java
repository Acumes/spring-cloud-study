package com.htf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author acumes
 * @date 2018/9/29 16:16
 */
@RestController
public class HelloController {

    @Value("${config.producer.instance:0}")
    private int instance;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "[" + instance + "]" + "Hello, " + name + " " + new Date();
    }
}
