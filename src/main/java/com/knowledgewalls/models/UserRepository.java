package com.knowledgewalls.models;


import javax.transaction.Transactional;


@Transactional
public interface UserRepository extends UserBaseRepository<User> { }