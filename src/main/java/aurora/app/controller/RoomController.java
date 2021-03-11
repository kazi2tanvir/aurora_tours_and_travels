package aurora.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aurora.app.model.Roombooking;
import aurora.app.repository.RoomBookingRepository;



@Controller
@RequestMapping("/")
public class RoomController {
	private final RoomBookingRepository roomrepository;
	@Autowired
	public RoomController(RoomBookingRepository roomrepository) {
		super();
		this.roomrepository = roomrepository;
	}
	@GetMapping("roombooking")
	public String roomBooking(Roombooking roombooking) {
		return "roombooking";
	}
	
	@PostMapping("roombooking")
	public String roomBooking(@Valid Roombooking roombooking,BindingResult result,Model model) {
		if(result.hasErrors()) {
		return "roombooking";	 
	 }
		roomrepository.save(roombooking);
		model.addAttribute("roombookings",  roomrepository.findAll());
		return "redirect:/home";
	}
	
	
	

}
