package com.oauth2;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @RequestMapping("/")
    public String home(){
        return "Welcome";
    }

    @RequestMapping("/users")
    public Principal users(Principal users){
        return users;
    }
}
