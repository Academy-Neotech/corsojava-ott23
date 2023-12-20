package srl.neotech.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/greeting")
	public String greeting() {
		return "greeting2";
	}

}