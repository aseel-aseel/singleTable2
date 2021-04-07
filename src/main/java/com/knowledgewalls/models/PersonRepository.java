package com.knowledgewalls.models;

import javax.transaction.Transactional;


@Transactional
public interface PersonRepository extends UserBaseRepository<Person> { }