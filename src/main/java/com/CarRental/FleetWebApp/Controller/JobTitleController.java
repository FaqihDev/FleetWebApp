package com.CarRental.FleetWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobTitleController {
    @GetMapping("/jobTitle")
    public String getEmployee(){
        return "view/jobTitle";
    }
}
