package com.CarRental.FleetWebApp.Entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "capital")
    private String capital;


    @Column(name = "description")
    private String description;


    @Column(name = "natonality")
    private String nationality;


    @Column(name = "continent")
    private String continent;

    @OneToMany(mappedBy = "country")
    private List<State> states;
}
