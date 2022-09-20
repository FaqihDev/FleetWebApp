package com.CarRental.FleetWebApp.Repository;

import com.CarRental.FleetWebApp.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
