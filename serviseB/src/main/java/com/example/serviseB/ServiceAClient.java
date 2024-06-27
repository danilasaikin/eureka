package com.example.serviseB;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-a")
public interface ServiceAClient {
    @GetMapping("/api/service-a/endpoint")
    String callServiceAEndpoint();
}
