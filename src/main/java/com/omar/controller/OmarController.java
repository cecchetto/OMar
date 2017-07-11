package com.omar.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.omar.model.CompanyEntity;
import com.omar.model.LineEntity;
import com.omar.service.CompanyManager;
import com.omar.service.LineManager;
import com.omar.util.GetCurrentWorkingDay;

/**
 * @author Cecchetto
 *
 */
@Controller
public class OmarController {
	
	@Autowired
	LineManager lineService;
	
	@Autowired
	CompanyManager companyService;
	
	
	/**
	 * RETRIEVE ALL LINES BELONG TO SPECIFIC CompanyCode Value
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value= "/loadingPartureSubmit", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView loadingPartureSubmit(HttpServletRequest request, 
	        @RequestParam(value="code", required=false) String code){
		
		/*initMapDayOfWeek();
		Date date = new Date(); // actual date
		SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy");
		String dateToday = dt1.format(date);
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    int day = cal.get(Calendar.DAY_OF_WEEK);*/
	    
		Date date = new Date(); // actual date
		SimpleDateFormat dt1 = new SimpleDateFormat("dd/MM/yyyy");
		String dateToday = dt1.format(date);
		
		List<LineEntity> lines = lineService.getAllLineByCompanyAndDay(code, GetCurrentWorkingDay.getCurrentWorkingDay());
		CompanyEntity company = companyService.getCompanyByCode(code);
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("dateToday", dateToday);
		mv.addObject("company", company);
		mv.addObject("lineSegregated", lines);
		return mv;
		
	}
	
	@RequestMapping("/loadingParture")
	public ModelAndView loadingPartenza() throws Exception {
	
		//List<LineEntity> lines = lineService.getAllLine();
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping(value= "/loadingFormSubmit", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView loadingFormSubmit(HttpServletRequest request, 
	        @RequestParam(value="code", required=false) String code){
		
		CompanyEntity company = companyService.getCompanyByCode(code);
		ModelAndView mv = new ModelAndView("form");
		mv.addObject("company", company);
		return mv;
		
	}
	@RequestMapping("/loadingForm")
	public ModelAndView loadingForm() throws Exception {
		
		ModelAndView mv = new ModelAndView("form");
		return mv;
	}
	
	@RequestMapping(value = "/loadingPopUp/{idLine}", method=RequestMethod.GET)
	public ModelAndView loadingPopUp(@PathVariable int idLine,Model model) throws Exception {
		
		/*List<LineEntity> lines = lineDAO.getAllLineByCompanyAndDay("abc", "LUNEDI");*/
		/*List<LineEntity> lines = lineService.getAllLineByWorkinDay("LUNEDI");*/
		/*List<LineEntity> lines = lineService.getAllLine();*/
		ModelAndView mv = new ModelAndView("form");
		return mv;
	}
	
	@RequestMapping("/addForm")
	public ModelAndView addForm(@RequestBody String paremeters) throws Exception {
		LineEntity lineEntity = new LineEntity();
		paremeters = paremeters.substring(1,paremeters.length()-1);
		String[] parameters = paremeters.split("&");
		lineEntity.setTimeDeparture(parameters[0]+":"+parameters[1]);
		lineEntity.setWorkinDay(parameters[2]);
		lineEntity.setLeaveFrom(parameters[3]);
		lineEntity.setGate(Integer.parseInt(parameters[4]));
		CompanyEntity companyEntity = companyService.getCompanyByName(parameters[5]);
		lineEntity.setCodRefCompany(companyEntity);
		lineEntity.setState(parameters[6]);
		if(parameters.length > 7)
			lineEntity.setNote(parameters[7]);
		lineService.addNewLine(lineEntity);
		
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
}
