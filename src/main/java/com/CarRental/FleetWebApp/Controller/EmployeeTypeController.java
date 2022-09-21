package com.CarRental.FleetWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employeeType")
public class EmployeeTypeController {
    @GetMapping("/page")
    public String getEmployee(){
        return "view/employee/employeeType";
    }
}
