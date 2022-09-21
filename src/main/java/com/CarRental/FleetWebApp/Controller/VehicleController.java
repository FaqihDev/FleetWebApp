package com.CarRental.FleetWebApp.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/vehicle")
public class VehicleController {

    @GetMapping("/page")
    public String getEmployee(){
        return "view/vehicle/vehicle";
    }
}
