package com.CarRental.FleetWebApp.Repository;

import com.CarRental.FleetWebApp.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer>{

}
