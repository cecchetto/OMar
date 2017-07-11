package com.omar.service;

import java.util.List;

import com.omar.model.LineEntity;

public interface LineManager {
	public List<LineEntity> getAllLineByCompanyAndDay(String codeCompany, String workinDay);
    public List<LineEntity> getAllLineByWorkinDay(String workingDay);
    public LineEntity[] getAllLine();
    
    public void addNewLine(LineEntity lineEntity);
}
