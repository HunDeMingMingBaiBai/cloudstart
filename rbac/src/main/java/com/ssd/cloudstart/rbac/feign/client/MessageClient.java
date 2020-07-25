package com.ssd.cloudstart.rbac.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "message", fallback = MessageClient.HystrixFallback.class)
public interface MessageClient {

    @GetMapping("/feign/getMessage")
    String getMessage();

    @Component
    class HystrixFallback implements MessageClient {

        @Override
        public String getMessage() {
            return "feign -> message getMessage() fail";
        }
    }

}
