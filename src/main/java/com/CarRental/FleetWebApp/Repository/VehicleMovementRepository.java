package com.CarRental.FleetWebApp.Repository;

import com.CarRental.FleetWebApp.Entity.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
