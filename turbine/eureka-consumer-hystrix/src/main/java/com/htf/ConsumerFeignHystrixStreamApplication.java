package com.htf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author acumes
 * @date 2018/9/30 9:59
 */
@EnableFeignClients
@EnableHystrix
@SpringBootApplication
public class ConsumerFeignHystrixStreamApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrixStreamApplication.class, args);
    }
}
