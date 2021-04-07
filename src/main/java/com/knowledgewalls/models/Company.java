package com.knowledgewalls.models;

import javax.persistence.Entity;


@Entity
public class Company extends User {

  // ==============
  // PRIVATE FIELDS
  // ==============
  
  // Company's name
  private String name;

  // Company's headquarters city
  private String hqCity;
 
  // ==============
  // PUBLIC METHODS
  // ==============
  
  public String getName() {
    return name;
  }

  public String getHqCity() {
    return hqCity;
  }


  public void setName(String name) {
    this.name = name;
  }


  public void setHqCity(String hqCity) {
    this.hqCity = hqCity;
  }

} // class Company