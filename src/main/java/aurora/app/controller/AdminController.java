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

import aurora.app.model.Adminlogin;
import aurora.app.repository.AdminloginRepository;

@Controller
@RequestMapping("/")
public class AdminController {
	
	
	@Autowired
	private final AdminloginRepository adminsigninrepository;

	public AdminController(AdminloginRepository adminsigninrepository) {
		super();
		this.adminsigninrepository = adminsigninrepository;
	}
	
	@GetMapping("adminsignin")
	public String userSearchShow(Adminlogin adminlogin) {
		return "adminsignin";
	}

	@PostMapping("adminsignin")
	public String userSearch(@Valid Adminlogin adminlogin, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "adminsignin";
		}

		List<Adminlogin> list = adminsigninrepository.findByUserAndPassword(adminlogin.getUserid(),adminlogin.getPassword());
		if (list.size() < 1) {
			return "adminsignin";
		} else {
			model.addAttribute("adminlogins", list);
			return "adminpage";
		}

	}
	@GetMapping("adminsignup")
	public String gdfdfgv(Adminlogin adminlogin) {
		return "adminsignup";
	}
	
	@PostMapping("adminsignup")
	public String hSignUp(@Valid Adminlogin adminlogin,BindingResult result,Model model) {
		if(result.hasErrors()) {
		return "adminsignup";	 
	 }
		adminsigninrepository.save(adminlogin);
		model.addAttribute("adminlogins",  adminsigninrepository.findAll());
		return "redirect:adminpage";
	}

}
