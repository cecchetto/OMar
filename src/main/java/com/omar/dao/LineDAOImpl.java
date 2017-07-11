package com.omar.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.omar.model.LineEntity;
import com.omar.util.CSVUtils;
import com.omar.util.GetCurrentWorkingDay;

@Repository
@Transactional
public class LineDAOImpl implements LineDAO{
	
	/*@PersistenceUnit
	EntityManagerFactory factoryManager;
	EntityManager manager = factoryManager.createEntityManager();*/
	@PersistenceContext
	private EntityManager manager;
	
	
	public List<LineEntity> getAllLineByCompanyAndDay(String codeCompany, String workinDay) {
		TypedQuery<LineEntity> query = manager.createQuery(
				"SELECT le FROM LineEntity le WHERE le.codRefCompany.codCompany =:codeCompany AND le.workinDay =:dayWork order by le.timeDeparture", LineEntity.class);
		query.setParameter("codeCompany", codeCompany);
		query.setParameter("dayWork", workinDay);
		return query.getResultList();
	}

	public List<LineEntity> getAllLineByWorkinDay(String workingDay) {
		TypedQuery<LineEntity> query = manager.createQuery(
				"SELECT le FROM LineEntity le WHERE le.workinDay =:dayWork", LineEntity.class);
		query.setParameter("dayWork", "'"+workingDay+"'");
		List<LineEntity> listReturn =  query.getResultList();
		return listReturn;

	}
	
	public LineEntity[] getAllLine() { 
		String csvFile = "\\Users\\User\\Desktop\\OmarBatch\\timeDeparture.csv";
		try {
		FileWriter writer = new FileWriter(csvFile);
		CSVUtils cvsUtil = new CSVUtils();
		EntityManagerFactory  emf = Persistence.createEntityManagerFactory("persistenceUnit");
		EntityManager manager = emf.createEntityManager();
		
		TypedQuery<LineEntity> query = manager.createQuery(
				"SELECT le FROM LineEntity le order by le.timeDeparture", LineEntity.class);
		List<LineEntity> listReturn =  query.getResultList();
		for(LineEntity le : listReturn)
		{
			if(le.getWorkinDay().equals(GetCurrentWorkingDay.getCurrentWorkingDay()))
				cvsUtil.writeLine(writer, le.toString());
		}
		
		writer.flush();
        writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public void addNewLine(LineEntity lineEntity) {
		manager.persist(lineEntity);
	}



}
