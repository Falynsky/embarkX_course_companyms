package com.falynsky.companyms.app.repositories;

import com.falynsky.companyms.app.enities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
