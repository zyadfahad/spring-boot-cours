package com.example.ass1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class cotroller {

    @GetMapping("/name")
    public String name(){
        return"my name is ziyad";
    }
    @GetMapping("/age")
    public String age(){
        return "my Age is 22";
    }
    @GetMapping("/check/status")
    public String isok(){
        return "Evrething is OK";
    }
    @GetMapping("/health")
    public String ishealthy(){
        return "server health is up and runing";
    }

}


