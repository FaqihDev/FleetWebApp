package com.CarRental.FleetWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/profile")
    public String getProfile(){
        return "view/profile";
    }

    @GetMapping("/login")
    public String Login(){
        return "view/login";
    }

    @GetMapping("/logout")
    public String logout(){
        return "view/login";
    }

    @GetMapping("/register")
    public String register(){
        return "view/register";
    }

}

