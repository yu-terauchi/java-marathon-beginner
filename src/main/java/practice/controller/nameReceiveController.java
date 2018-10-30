package practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nameReceive")
public class nameReceiveController {

	@RequestMapping("/toInput")
	public String toInput() {
		System.out.println("inputへ飛びます");
		return "1km/inputname";
	}

	@RequestMapping("/toOutput")
	public String toOutput(String name) {
		System.out.println("outputへ飛びます");
		return "1km/outputname";
	}
}
