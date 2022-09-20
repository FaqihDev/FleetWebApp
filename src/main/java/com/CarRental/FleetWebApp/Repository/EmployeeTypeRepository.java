package com.CarRental.FleetWebApp.Repository;

import com.CarRental.FleetWebApp.Entity.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}
