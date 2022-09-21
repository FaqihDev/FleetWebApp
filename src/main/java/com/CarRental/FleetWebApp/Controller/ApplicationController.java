package com.CarRental.FleetWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fleetApp")
public class ApplicationController {

    @GetMapping("/index")
    public String home(){
        return "view/index";
    }

}

