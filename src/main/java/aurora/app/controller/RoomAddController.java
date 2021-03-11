package aurora.app.controller;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aurora.app.model.Roomadd;
import aurora.app.model.Roombooking;
import aurora.app.repository.RoomAddRepository;
import aurora.app.repository.RoomBookingRepository;

@Controller
@RequestMapping("/")
public class RoomAddController<RoomAdd> {
	private final RoomAddRepository roomaddrepository;
	private final RoomBookingRepository roomBookingRepository;

	public RoomAddController(RoomAddRepository roomaddrepository,RoomBookingRepository roomBookingRepository) {
		super();
		this.roomaddrepository = roomaddrepository;
		this.roomBookingRepository = roomBookingRepository;
	}
	@GetMapping("roomadd")
	public String RoomAdd(Roomadd roomadd) {
		return "roomadd";
	}
	@PostMapping("roomadd")
	public String RoomAdd(@Valid Roomadd roomadd,BindingResult result,Model model) {
		if(result.hasErrors()) {
		return "home";	 
	 }
		roomaddrepository.save(roomadd);
		return "redirect:/home";
	}
	
	@GetMapping("bookBookingStatus")
	public String RoomAdd(Model model, Roombooking roombooking) {
		model.addAttribute("roombooking", roomBookingRepository.findAll());
		return "bookingstatus";
	}
	
	
	@GetMapping("delete{id}")
	public String RoomBookingRemove(@PathVariable("id") Long id, Model model) {
		Roombooking roombooking = roomBookingRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid User Id:" + id));
		roomBookingRepository.delete(roombooking);
		model.addAttribute("roombooking", roomBookingRepository.findAll());
		return "redirect:/bookBookingStatus";
	}
	
	@GetMapping("edit{id}")
	public String RoomBookingUpdate(@PathVariable("id") Long id, Model model) {
		Roombooking roombooking = roomBookingRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid Product Id:" + id));
		model.addAttribute("roombooking", roombooking );
		return "roombookingupdate";
	}

	@PostMapping("update{id}")
	public String RoomBookingUpdate(@PathVariable ("id") Long id, @Valid Roombooking roombooking, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			roombooking = roomBookingRepository.findById(id)
					.orElseThrow(() -> new IllegalArgumentException("Invalid Product Id:" + id));
			return "roombookingupdate";
		}
		roomBookingRepository.save(roombooking);
		model.addAttribute("roombooking", roomBookingRepository.findAll());
		return "redirect:/bookBookingStatus";
	}
	
	
	@GetMapping("details{id}")
	public String UserDetails(@PathVariable("id") Long id, Model model) {
		Roombooking roombooking = roomBookingRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid Product Id:" + id));
		model.addAttribute("roombooking", roombooking );
		return "userdetails";
	}
	
	@GetMapping("preview")
	public String Preview() {
		return "preview";
	}
	

}
