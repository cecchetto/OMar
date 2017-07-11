package com.omar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omar.dao.LineDAO;
import com.omar.dao.LineDAOImpl;
import com.omar.model.LineEntity;

@Service
public class LineManagerImpl implements LineManager{

	@Autowired
	LineDAO lineDAO;

	public List<LineEntity> getAllLineByCompanyAndDay(String codeCompany,
			String workinDay) {
		return lineDAO.getAllLineByCompanyAndDay(codeCompany, workinDay);
	}

	public List<LineEntity> getAllLineByWorkinDay(String workingDay) {
		return lineDAO.getAllLineByWorkinDay(workingDay);
	}

	public void addNewLine(LineEntity lineEntity) {
		lineDAO.addNewLine(lineEntity);
	}

	/**
	 * Web Service SOAP implemented for batch development 
	 */
	public LineEntity[] getAllLine() {
		lineDAO = new LineDAOImpl();
		return lineDAO.getAllLine();
	}

}
