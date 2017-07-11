package com.omar.service;

import java.util.List;

import com.omar.model.CompanyEntity;

public interface CompanyManager {
	public List<CompanyEntity> getAllCompanies();
    public CompanyEntity getCompanyByName(String name);
    public CompanyEntity getCompanyByCode(String code);
}
