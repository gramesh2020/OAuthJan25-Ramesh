package com.ecommerce.oauthjan25ramesh.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello, this is home";
    }

    @GetMapping("/secured")
    public String secured()
    {
        return "This is secured url";
    }
}
