package com.omar.util;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GetCurrentWorkingDay {
	private static Map<Integer, String> mapDayWeek = new HashMap<Integer, String>();
	
	public static String getCurrentWorkingDay()
	{
		initMapDayOfWeek();
		
		Date date = new Date(); // actual date
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    int day = cal.get(Calendar.DAY_OF_WEEK);
	    
		return mapDayWeek.get(day);

	}

	private static void initMapDayOfWeek()
	{
		mapDayWeek.put(1, "DOMENICA");
		mapDayWeek.put(2, "LUNEDI");
		mapDayWeek.put(3, "MARTEDI");
		mapDayWeek.put(4, "MERCOLEDI");
		mapDayWeek.put(5, "GIOVEDI");
		mapDayWeek.put(6, "VENERDI");
		mapDayWeek.put(7, "SABATO");
	}
}
