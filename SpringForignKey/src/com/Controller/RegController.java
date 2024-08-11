package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.RegDAO;
import com.VO.LoginVO;
import com.VO.RegVO;

@Controller
public class RegController {

	@Autowired
	RegDAO regDAO;

	@RequestMapping(value = "load.html", method = RequestMethod.GET)
	public ModelAndView load() {
		return new ModelAndView("Registration", "reg", new RegVO());
	}

	@RequestMapping(value = "insert.html", method = RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute RegVO v) {

		LoginVO lg = v.getLoginVO();
		regDAO.insert(lg);
		regDAO.insert(v);
		return new ModelAndView("redirect:/load.html");
	}
	
	@RequestMapping(value="search.html" , method= RequestMethod.GET)
	public ModelAndView search()
	{
		List ls = regDAO.search();
		return new ModelAndView("Search", "SearchList", ls);
	}
	
	
	@RequestMapping(value = "delete.html", method = RequestMethod.GET)
	public ModelAndView delete(@RequestParam int id) {
		
		RegVO rg = new RegVO();
		rg.setId(id);
		regDAO.delete(rg);
		return new ModelAndView("redirect:/search.html");
			
	}
	
	@RequestMapping(value="edit.html" , method=RequestMethod.GET)
	public ModelAndView edit(@RequestParam int id)
	{
		RegVO rg = new RegVO();
		rg.setId(id);
		List ls = regDAO.edit(rg);
				
		return new ModelAndView("Registration", "reg", ls.get(0));
	}

}
