package com.omar.dao;

import java.util.List;

import com.omar.model.LineEntity;

public interface LineDAO {
	
	
	public List<LineEntity> getAllLineByCompanyAndDay(String codeCompany, String workinDay);
    public List<LineEntity> getAllLineByWorkinDay(String workingDay);
    public LineEntity[] getAllLine();
    
    public void addNewLine(LineEntity lineEntity);
}
