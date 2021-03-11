package aurora.app.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aurora.app.model.Sign;
import aurora.app.repository.SignRepository;

@Controller
@RequestMapping("/")
public class SignController {
	
	@GetMapping("/")
	public String Index() {
		return "index";
	}
	@GetMapping("home")
	public String Home() {
		return "home";
	}
	@GetMapping("signin")
	public String SignIn(Sign sign) {
		return "signin";
	}
	
	private final SignRepository signrepository;
	
	@Autowired
	public SignController(SignRepository signrepository) {
		super();
		this.signrepository = signrepository;
	}
	@GetMapping("signup")
	public String SignUn(Sign sign) {
		return "signup";
	}
	@PostMapping("signup")
	public String SignUp(@Valid Sign sign,BindingResult result,Model model) {
		if(result.hasErrors()) {
		return "signin";	 
	 }
		signrepository.save(sign);
		model.addAttribute("indexs",  signrepository.findAll());
		return "redirect:home";
	}
	
	@PostMapping("signin")
	public String userSearch(@Valid Sign sign, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "signin";
		}

		List<Sign> list = signrepository.findByEmailAndPassword(sign.getEmail(), sign.getPassword());
		if (list.size() < 1) {
			return "signin";
		} else {
			model.addAttribute("signs", list);
			return "home";
		}

	}
		

}
