package aurora.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aurora.app.model.Carrent;
import aurora.app.repository.CarrentRepository;

@Controller
@RequestMapping("/")
public class CarAddController {
	private final CarrentRepository caraddrepository;
	private final CarrentRepository carrentepository;
	@Autowired
	public CarAddController(CarrentRepository caraddrepository, CarrentRepository carrentepository) {
		super();
		this.caraddrepository = caraddrepository;
		this.carrentepository = carrentepository;
	}
	@GetMapping("caradd")
	public String CarAdd() {
		return "caradd";
	}
	
	@GetMapping("CarBookingStatus")
	public String CarAdd(Model model, Carrent carrent) {
		model.addAttribute("carrent", carrentepository.findAll());
		return "carbookingstatus";
	}
	

}
