package com.htf.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author acumes
 * @date 2018/9/29 17:39
 */
@Component
@FeignClient(name = "eureka-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    /**
     * 绑定 eureka-producer 服务的 /hello/ 接口
     *
     * @param name
     * @return
     */
    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);

}
