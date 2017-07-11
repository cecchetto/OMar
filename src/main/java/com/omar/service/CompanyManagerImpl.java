package com.omar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omar.dao.CompanyDAO;
import com.omar.model.CompanyEntity;

@Service
public class CompanyManagerImpl implements CompanyManager{

	@Autowired
    CompanyDAO companyDAO;
	
	public List<CompanyEntity> getAllCompanies() {
		// TODO Auto-generated method stub
		return null;
	}

	public CompanyEntity getCompanyByName(String name) {
		return companyDAO.getCompanyByName(name);
	}

	public CompanyEntity getCompanyByCode(String code) {
		return companyDAO.getCompanyByCode(code);
	}

}
