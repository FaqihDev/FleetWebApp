package com.CarRental.FleetWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/vehicleType")
public class VehicleTypeController {

    @GetMapping("/page")
    public String getEmployee(){
        return "view/vehicle/vehicleType";
    }

}
