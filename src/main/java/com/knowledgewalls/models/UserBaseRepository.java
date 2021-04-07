package com.knowledgewalls.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface UserBaseRepository<T extends User> 
extends CrudRepository<T, Long> {


  public T findByEmail(String email);
} // UserBaseRepository