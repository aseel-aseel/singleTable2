package com.knowledgewalls.models;

import javax.persistence.Entity;


@Entity
public class Person extends User {

  // ==============
  // PRIVATE FIELDS
  // ==============
  
  // Person's first name
  private String firstName;

  //Person's last name
  private String lastName;
 
  // ==============
  // PUBLIC METHODS
  // ==============
  
  public Person() { }


  public Person(Long id) {
    this.setId(id);
  }
  

  public String getFirstName() {
    return firstName;
  }


  public String getLastName() {
    return lastName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

 
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

} // class Person