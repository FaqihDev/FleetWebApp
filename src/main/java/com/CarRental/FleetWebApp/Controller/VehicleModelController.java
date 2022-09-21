package com.CarRental.FleetWebApp.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VehicleModelController {

    @GetMapping("/vehicleModel")
    public String getEmployee(){
        return "view/vehicle/vehicleModel";
    }

}
