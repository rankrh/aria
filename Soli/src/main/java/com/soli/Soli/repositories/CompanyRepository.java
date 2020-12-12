package com.soli.Soli.repositories;

import com.soli.Soli.models.Company;
import com.soli.Soli.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, String> {

}
