package com.CarRental.FleetWebApp.Service;
import com.CarRental.FleetWebApp.Entity.Country;
import com.CarRental.FleetWebApp.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


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

    public void editCountry(Country country){
        countryRepository.save(country);
    }

    public Country getCountry (Integer id){
        Optional<Country> result = countryRepository.findById(id);
        Country country = null;

        if (result.isPresent()){
            country = result.get();
        } else {
            throw new RuntimeException("Did not find employee id - " + id);
        }
        return country;
    }


    public void deleteCountry(Integer id){
        countryRepository.deleteById(id);
    }

}
