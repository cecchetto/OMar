package com.omar.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.omar.model.CompanyEntity;

@Repository
@Transactional
public class CompanyDAOImpl implements CompanyDAO{

	@PersistenceContext
    private EntityManager manager;
	
	public List<CompanyEntity> getAllCompanies() {
		// TODO Auto-generated method stub
		return null;
	}

	public CompanyEntity getCompanyByName(String nameCompany) {
		TypedQuery<CompanyEntity> query = manager.createQuery(
				"SELECT ce FROM CompanyEntity ce WHERE ce.nameCompany = :nameCompany", CompanyEntity.class);
		query.setParameter("nameCompany", nameCompany);
		CompanyEntity componentReturn =  query.getSingleResult();
		return componentReturn;
	}

	public CompanyEntity getCompanyByCode(String code) {
		TypedQuery<CompanyEntity> query = manager.createQuery(
				"SELECT ce FROM CompanyEntity ce WHERE ce.codCompany = :codCompany", CompanyEntity.class);
		query.setParameter("codCompany", code);
		CompanyEntity componentReturn =  query.getSingleResult();
		return componentReturn;
	}

}
