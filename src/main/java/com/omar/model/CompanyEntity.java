package com.omar.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="company_entity")
public class CompanyEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="idCompany")
    @GeneratedValue
    private int idCompany;
    
	@Column(name="codCompany")
    private String codCompany;
	
	@Column(name="nameCompany")
    private String nameCompany;
	
	@OneToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER,
		    mappedBy = "codRefCompany")
    private Set<LineEntity> entitiesLine;

	public int getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}

	public String getCodCompany() {
		return codCompany;
	}

	public void setCodCompany(String codCompany) {
		this.codCompany = codCompany;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public Set<LineEntity> getEntitiesLine() {
		return entitiesLine;
	}

	public void setEntitiesLine(Set<LineEntity> entitiesLine) {
		this.entitiesLine = entitiesLine;
	}
}
