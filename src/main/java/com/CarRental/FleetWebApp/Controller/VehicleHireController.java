package com.CarRental.FleetWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/vehicleHire")
public class VehicleHireController {

    @GetMapping("/page")
    public String getEmployee(){
        return "view/vehicle/vehicleHire";
    }


}
