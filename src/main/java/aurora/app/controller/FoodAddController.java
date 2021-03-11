package aurora.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import aurora.app.model.Foodadd;
import aurora.app.repository.FoodAddRepository;
import aurora.app.repository.FoodRepository;

@Controller
@RequestMapping("/")
public class FoodAddController {
	private final FoodAddRepository foodaddrepository;
	private final FoodRepository foodrepository;
	
	@Autowired
	public FoodAddController(FoodAddRepository foodaddrepository, FoodRepository foodrepository) {
		super();
		this.foodaddrepository = foodaddrepository;
		this.foodrepository = foodrepository;
	}

	@GetMapping("foodadd")
	public String FoodAdd() {
		return "foodadd";
	}
	
	@GetMapping("FoodOrderStatus")
	public String FoodAdd(Model model, Foodadd foodadd ) {
		model.addAttribute("foodadd", foodrepository.findAll());
		return "foodbookingstatus";
	}
	

}
