package com.example.serviseA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service-a")
public class ServiceAController {

    @GetMapping("/endpoint")
    public String endpoint() {
        return "Response from Service A";
    }
}
