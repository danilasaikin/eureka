package com.example.serviseB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service-b")
public class ServiceBController {

    @Autowired
    private ServiceAClient serviceAClient;

    @GetMapping("/endpoint")
    public String endpoint() {
        return "Response from Service B";
    }

    @GetMapping("/call-service-a")
    public String callServiceA() {
        return serviceAClient.callServiceAEndpoint();
    }
}
