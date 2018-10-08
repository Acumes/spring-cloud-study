package com.htf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author acumes
 * @date 2018/10/8 10:25
 */
@RestController
@SpringBootApplication
public class TraceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraceApplication.class, args);
    }

    @GetMapping("/trace-b")
    public Mono<String> trace() {
        System.out.println("===call trace-b===");

        return Mono.just("Trace");
    }

}

