package com.CarRental.FleetWebApp.Controller;

import com.CarRental.FleetWebApp.Entity.Country;
import com.CarRental.FleetWebApp.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;


    @GetMapping("/country")
    public String getCountries(Model model){
        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries",countryList);
        return "view/country";
    }

    @PostMapping("/country/addCountry")
    public String addCountry(Model model, Country country){
        countryService.addCountry(country);
        model.addAttribute("country",country);
        return "redirect:/country";
    }

    @RequestMapping("/country/update")
    @ResponseBody
    public Optional<Country> update(int id,Model model){
        model.addAttribute("id",id);
        return countryService.getCountry(id);
    }

}
