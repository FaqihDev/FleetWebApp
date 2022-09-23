package com.CarRental.FleetWebApp.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {


    @GetMapping("/user")
    public String getEmployee(){
        return "view/user";
    }

    @GetMapping("/user/addNew")
    public String register(){
        return "view/register";
    }

}
