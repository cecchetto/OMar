package com.omar.dao;

import java.util.List;

import com.omar.model.CompanyEntity;

public interface CompanyDAO {

	public List<CompanyEntity> getAllCompanies();
    public CompanyEntity getCompanyByName(String name);
    public CompanyEntity getCompanyByCode(String code);
}
