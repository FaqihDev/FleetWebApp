package com.CarRental.FleetWebApp.Repository;

import com.CarRental.FleetWebApp.Entity.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
