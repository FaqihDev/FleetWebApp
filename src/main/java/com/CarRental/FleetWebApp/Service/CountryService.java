package com.CarRental.FleetWebApp.Service;
import com.CarRental.FleetWebApp.Entity.Country;
import com.CarRental.FleetWebApp.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;


   public List<Country> getCountries(){
       return countryRepository.findAll();
    }

    public void addCountry(Country country){
       countryRepository.save(country);
    }

}
