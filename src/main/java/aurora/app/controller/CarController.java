package aurora.app.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aurora.app.model.Carrent;
import aurora.app.repository.CarrentRepository;

@Controller
@RequestMapping("/")
public class CarController {
	
	@GetMapping("carrent")
	public String carrent(Carrent carrent) {
		return("carrent");
	}
	private final CarrentRepository carrentepository;
	public CarController(CarrentRepository carrentepository) {
		super();
		this.carrentepository = carrentepository;
	}
	@PostMapping("carrent")
	public String carrent(@Valid Carrent carrent,BindingResult result,Model model) {
		if(result.hasErrors()) {
		return "carrent";	 
	 }
		carrentepository.save(carrent);
		return "redirect:/home";
	}
	

}
