package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nameReceive")
public class nameReceiveController {
	
	@RequestMapping("/index")
	public String index(String name,Model model) {
		model.addAttribute(name);
		return "inputname";
	}
}
