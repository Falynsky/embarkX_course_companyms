package com.falynsky.companyms.app.services.impl;

import com.falynsky.companyms.app.enities.Company;
import com.falynsky.companyms.app.repositories.CompanyRepository;
import com.falynsky.companyms.app.services.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@AllArgsConstructor
@Service
public class CompanyServiceImp implements CompanyService {

    private final CompanyRepository companyRepository;


    @Override
    public Company findById(Long id) {
        Optional<Company> copmpany = companyRepository.findById(id);

        if (copmpany.isEmpty()) {
            throw new NoSuchElementException("Company not found");
        }

        return copmpany.get();
    }

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

    @Override
    public void updateCompany(Company company, Long id) {
        Optional<Company> byId = companyRepository.findById(id);
        if (byId.isEmpty()) {
            throw new NoSuchElementException("Company not found");
        }
        Company updatedCompany = byId.get();
        updatedCompany.setName(company.getName() == null ? updatedCompany.getName() : company.getName());
        updatedCompany.setCity(company.getCity() == null ? updatedCompany.getCity() : company.getCity());
        companyRepository.save(updatedCompany);
    }
}
