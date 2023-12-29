package com.example.cicdproject.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CicdController {
    @GetMapping("/")
    public String cicdGet(){
        return "hello cicd";
    }
}
