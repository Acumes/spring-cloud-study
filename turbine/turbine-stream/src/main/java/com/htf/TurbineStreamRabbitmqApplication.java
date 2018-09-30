package com.htf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * @author acumes
 * @date 2018/9/30 9:49
 */
@EnableTurbineStream
@SpringBootApplication
public class TurbineStreamRabbitmqApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineStreamRabbitmqApplication.class, args);
    }
}
