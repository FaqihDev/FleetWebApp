package com.CarRental.FleetWebApp.Repository;

import com.CarRental.FleetWebApp.Entity.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
