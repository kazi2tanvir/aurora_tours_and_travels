package aurora.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
	
	@GetMapping("index")
	public String IndexHome() {
		return "index";
	}
	@GetMapping("review")
	public String review() {
		return "review";
	}
	@GetMapping("platform")
	public String platform() {
		return "platform";
	}
	@GetMapping("blog")
	public String blog() {
		return "blog";
	}
	@GetMapping("admin")
	public String Adminpage() {
		return "adminpage";
	}

}
