package com.omar.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="line_entity")
public class LineEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idLine")
	@GeneratedValue
	private int idLine;

	@Column(name="leaveFrom")
	private String leaveFrom;
	
	@ManyToOne(cascade = CascadeType.MERGE , fetch = FetchType.LAZY)
	@JoinColumn(name = "id_company_ref", referencedColumnName = "codCompany")
	private CompanyEntity codRefCompany;
	
	@Column(name="state")
	private String state;
	
	@Column(name="gate")
	private int gate;
	
	@Column(name="dayWork")
	private String workinDay;
	
	@Column(name="note")
	private String note;
	
	@Column(name="timeDeparture")
	private String timeDeparture;

	public int getIdLine() {
		return idLine;
	}

	public void setIdLine(int idLine) {
		this.idLine = idLine;
	}

	public String getLeaveFrom() {
		return leaveFrom;
	}

	public void setLeaveFrom(String leaveFrom) {
		this.leaveFrom = leaveFrom;
	}

	public CompanyEntity getCodRefCompany() {
		return codRefCompany;
	}

	public void setCodRefCompany(CompanyEntity codRefCompany) {
		this.codRefCompany = codRefCompany;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getGate() {
		return gate;
	}

	public void setGate(int gate) {
		this.gate = gate;
	}

	public String getWorkinDay() {
		return workinDay;
	}

	public void setWorkinDay(String workinDay) {
		this.workinDay = workinDay;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getTimeDeparture() {
		return timeDeparture;
	}

	public void setTimeDeparture(String timeDeparture) {
		this.timeDeparture = timeDeparture;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.timeDeparture+","+this.leaveFrom+","+this.codRefCompany.getNameCompany()+","+this.state+","+this.gate+","+this.note;
	}
}
