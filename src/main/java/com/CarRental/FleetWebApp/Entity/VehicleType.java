package com.CarRental.FleetWebApp.Entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class VehicleType extends CommonObject{


}
