package com.CarRental.FleetWebApp.Repository;

import com.CarRental.FleetWebApp.Entity.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
