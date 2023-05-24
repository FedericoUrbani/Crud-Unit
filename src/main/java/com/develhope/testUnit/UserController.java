package com.develhope.testUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String welcomeUser(){
        return "welcome in the user Controller";
    }

}
