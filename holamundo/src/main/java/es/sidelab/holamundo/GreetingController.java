package es.sidelab.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
	
	@RequestMapping("/greeting")
	public ModelAndView greeting(@RequestParam String name, @RequestParam String asunto, @RequestParam String cuerpo){
		
		return new ModelAndView("greeting_template").addObject("name", name)
													.addObject("asunto", asunto)
													.addObject("cuerpo", cuerpo);
	}

}
