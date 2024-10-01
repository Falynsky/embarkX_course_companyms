package com.falynsky.companyms.app.services;


import com.falynsky.companyms.app.enities.Company;

import java.util.List;

public interface CompanyService {

    List<Company> findAll();

    void createCompany(Company company);

    void deleteCompany(Long id);

    void updateCompany(Company company, Long id);

}
