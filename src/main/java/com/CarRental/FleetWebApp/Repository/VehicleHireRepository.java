package com.CarRental.FleetWebApp.Repository;

import com.CarRental.FleetWebApp.Entity.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {

}
