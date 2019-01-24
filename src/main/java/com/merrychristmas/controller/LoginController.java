package com.merrychristmas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/")
    public String defaultLogin(){
        return "Merry Chrismas' Day";
    }
    }
