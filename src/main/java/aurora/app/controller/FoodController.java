package aurora.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aurora.app.model.Food;
import aurora.app.repository.FoodRepository;

@Controller
@RequestMapping("/")
public class FoodController {
	@GetMapping("foodorder")
	public String food(Food food) {
		return("foodorder");
	}
	private final FoodRepository foodepository;
	
	@Autowired
	public FoodController(FoodRepository foodepository) {
		super();
		this.foodepository = foodepository;
	}


	@PostMapping("foodorder")
	public String food(@Valid Food food,BindingResult result,Model model) {
		if(result.hasErrors()) {
		return "foodorder";	 
	 }
		foodepository.save(food);
		return "redirect:/home";
	}
	

}
