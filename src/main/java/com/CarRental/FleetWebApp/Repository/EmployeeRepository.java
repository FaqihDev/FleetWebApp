package com.CarRental.FleetWebApp.Repository;

import java.util.Optional;

import com.CarRental.FleetWebApp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public Employee findByUsername(String un);
}
