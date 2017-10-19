package springmvc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.Spittle;
import springmvc.data.Repository;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	private Repository repository;
	
	private final String MAX_LONG_AS_STRING = "9223372036854775807"; 
	
	@Autowired
	public SpittleController(Repository repository){
		this.repository = repository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Spittle> spittles(@RequestParam(value="max",defaultValue=MAX_LONG_AS_STRING) long max,
				@RequestParam(value="count",defaultValue="20") int count){
		return repository.findSpittles(max, count);
	}
}
