package com.knowledgewalls.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.knowledgewalls.models.Company;
import com.knowledgewalls.models.CompanyRepository;
import com.knowledgewalls.models.Person;
import com.knowledgewalls.models.PersonRepository;
import com.knowledgewalls.models.User;
import com.knowledgewalls.models.UserRepository;

@Controller
public class UserController {

  // ==============
  // PRIVATE FIELDS
  // ==============

  @Autowired
  private CompanyRepository companyRepository;

  @Autowired
  private PersonRepository personRepository;

  @Autowired
  private UserRepository userRepository;

  // ==============
  // PUBLIC METHODS
  // ==============
  

  @RequestMapping("/user/create/person")
  @ResponseBody
  public String createPerson(String email, String firstName) {
    try {
      Person person = new Person();
      person.setEmail(email);
      person.setFirstName(firstName);
      personRepository.save(person);
    }
    catch (Exception ex) {
      return "Error creating the person: " + ex.toString();
    }
    return "Person succesfully created!";
  }


  @RequestMapping("/user/create/company")
  @ResponseBody
  public String createCompany(String email, String name) {
    try {
      Company company = new Company();
      company.setEmail(email);
      company.setName(name);
      companyRepository.save(company);
    }
    catch (Exception ex) {
      return "Error creating the company: " + ex.toString();
    }
    return "Company succesfully created!";
  }


 /* @RequestMapping("/user/delete")
  @ResponseBody
  public String deleteUser(long id) {
    try {
      userRepository.delete(userRepository.findOne(id));
    }
    catch (Exception ex) {
      return "Error deleting the user:" + ex.toString();
    }
    return "User succesfully deleted!";
  }
  */

  @RequestMapping("/user/delete/person")
  @ResponseBody
  public String deletePerson(long id) {
    try {
      personRepository.delete(new Person(id));
    }
    catch (Exception ex) {
      return "Error deleting the user:" + ex.toString();
    }
    return "User succesfully deleted!";
  }
  

  @RequestMapping("/user/get")
  @ResponseBody
  public String getUser(String email) {
    String userId = "";
    String userType = "";
    try {
      User user = userRepository.findByEmail(email);
      userId = String.valueOf(user.getId());
      
      // get the user type
      if (user instanceof Person)
        userType = "Person";
      else if (user instanceof Company)
        userType = "Company";
      
    }
    catch (Exception ex) {
      return "User not found";
    }
    return "The " + userType + " id is: " + userId;
  }
  

/*  @RequestMapping("/user/update")
  @ResponseBody
  public String update(Long id, String email, String name) {
    try {
      User user = userRepository.findOne(id);
      user.setEmail(email);
      
      // switch on the user type
      if (user instanceof Person) {
        Person person = (Person)user;
        person.setFirstName(name);
      }
      if (user instanceof Company) {
        Company company = (Company)user;
        company.setName(name);
      }
      
      // updates the user accordingly to its type (Person or Company)
      userRepository.save(user);
    }
    catch (Exception ex) {
      return "Error: " + ex.toString();
    }
    return "User successfully updated.";
  }
  */
} // class UserController