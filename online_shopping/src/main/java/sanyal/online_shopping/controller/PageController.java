package sanyal.online_shopping.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
//This annotation says that it is a controller and it controls stuff
@Controller 

public class PageController {

	
	@RequestMapping(value= {"/","/home","/index"})
	
	public ModelAndView index()   //this method helps the model and view name
	{
	   ModelAndView mv=new ModelAndView("page");
	   mv.addObject("greeting","Welcome to spring web MVC");
	   
	   return mv;
	}
	
	/*@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value="greeting",required=false)String greeting)
	{
		if(greeting==null)
		{
			greeting="Hey there!";
		}
		ModelAndView mv=new ModelAndView("page");
		   mv.addObject("greeting",greeting);
		   
		   return mv;
		
	}*/
	
	@RequestMapping(value="/test/{greeting}")   //{} braces makes the value passed inside dynamic
	public ModelAndView test(@PathVariable("greeting")String greeting)
	{
		if(greeting==null)
		{
			greeting="Hey there!";
		}
		ModelAndView mv=new ModelAndView("page");
		   mv.addObject("greeting",greeting);
		   
		   return mv;
		
	}
	
}
