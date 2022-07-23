package com.xplago.xmessclientprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class XMessClientProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XMessClientProviderApplication.class, args);
    }

    @GetMapping("/")
    public String client() {
        return "index";
    }
}
