package com.CarRental.FleetWebApp.Repository;

import com.CarRental.FleetWebApp.Entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
