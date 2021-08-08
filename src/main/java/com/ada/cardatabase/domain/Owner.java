/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ada.cardatabase.domain;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


// happens on account of one-to-many relationship between the car and owner tables.
//First, the car is serialized, and it contains an owner who is then serialized, and that, in turn, contains cars
//that are then serialized and so on. To avoid this, we have to add the @JsonIgnore annotation to the cars 
//field in the Owner class:
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Owner {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ownerid;
	private String firstname, lastname;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="owner")
        @JsonIgnore
	private List<Car> cars;
	
	public Owner() {}
	
	public Owner(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public List<Car> getCars() {
		return cars;
	}
	
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public long getOwnerid() {
		return ownerid;
	}
	
	public void setOwnerid(long ownerid) {
		this.ownerid = ownerid;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	
}
