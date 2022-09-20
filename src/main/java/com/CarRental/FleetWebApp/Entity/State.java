package com.CarRental.FleetWebApp.Entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;
    @Column(name = "capital")
    private String capital;

    @Column(name = "code")
    private String code;

    @ManyToOne
    @JoinColumn(name = "country_id", insertable = false,updatable = false)
    private Country country;

    private Integer countryId;

    @Column(name = "details")
    private String details;
}
