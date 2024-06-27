package com.example.serviseC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service-c")
public class ServiceCController {

    @Autowired
    private ServiceBClient serviceBClient;

    @GetMapping("/endpoint")
    public String endpoint() {
        return "Response from Service C";
    }

    @GetMapping("/call-service-b")
    public String callServiceB() {
        return serviceBClient.callServiceBEndpoint();
    }
    @GetMapping("/call-service-a-through-service-b")
    public String callServiceAThroughServiceB() {
        return serviceBClient.callServiceAThroughServiceB();
    }
}
