package com.knowledgewalls.models;

import javax.transaction.Transactional;


@Transactional
public interface CompanyRepository extends UserBaseRepository<Company> { }