/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ada.cardatabase.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author vatra
 */
@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ownerid;
    private String firstName, lastName;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "car_owner", joinColumns = {
        @JoinColumn(name
                = "ownerid")}, inverseJoinColumns = {
        @JoinColumn(name = "id")})
    private Set<Car> cars;

    public Owner() {
    }

    public Owner(long ownerid, String firstName, String lastName, Set<Car> cars) {
        this.ownerid = ownerid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cars = cars;
    }

    
    
   

    public long getId() {
        return ownerid;
    }

    public void setId(long ownerid) {
        this.ownerid = ownerid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    public Set<Car> getCars() {
        return cars;
    }

    
}
