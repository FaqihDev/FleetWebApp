package com.CarRental.FleetWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/vehicleMake")
public class VehicleMakeController {

    @GetMapping("/page")
    public String getEmployee(){
        return "view/vehicle/vehicleMake";
    }

}
