package com.eCommerce.RunwayRacks;

import org.springframework.web.bind.annotation.*;

@RestController
public class test {
    @RequestMapping("/")
    public String getHome() {
        return "<h1>Hello World Home Page</h1>";
    }
}
