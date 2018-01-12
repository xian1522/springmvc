package springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String home(){
		return "index";
	}
	
	@RequestMapping(value="/fileupload",method=RequestMethod.GET)
	public String fileupload(){
		return "redirect:/fileupload/fileupload";
	}
	
	@RequestMapping(value="/stackoverflow",method=RequestMethod.GET)
	public String stackoverflow(){
		return "redirect:/stackoverflow/managerlist";
	}
}
