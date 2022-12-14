package com.CarRental.FleetWebApp.Repository;

import com.CarRental.FleetWebApp.Entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
