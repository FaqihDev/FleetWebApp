package com.CarRental.FleetWebApp.Repository;

import com.CarRental.FleetWebApp.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
