package com.CarRental.FleetWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VehicleMakeController {

    @GetMapping("/vehicleMake")
    public String getEmployee(){
        return "view/vehicle/vehicleMake";
    }

}
