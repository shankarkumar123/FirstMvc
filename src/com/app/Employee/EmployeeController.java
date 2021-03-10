package com.app.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import com.app.model.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/show")
	public String showMsg() {
		return ("home");
		
	}
	@RequestMapping(value="/check",method=RequestMethod.POST)
	public ModelAndView checklogin(@ModelAttribute("employee")Employee emp) {
		ModelAndView mav=new ModelAndView();
		System.out.println(emp);
		if(emp.getUname().equals("shankar")) {
			
			mav.setViewName("welcome");
		}else {
			mav.setViewName("errors");
		}
		return mav;
		
	}

}
