package anypet.ks44team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/accommodation")
public class AdminAccommodationListController {
	@GetMapping("/accommodationList")
	public String accommodationList() {
		return "/admin/accommodation/accommodationList";

	}
	
	@GetMapping("/insertAccommodation")
	public String insertAccommodation() {
		return "/admin/accommodation/insertAccommodation";
	}	
	
	@GetMapping("/updateAccommodation")
	public String updateAccommodation() {
		return "/admin/accommodation/updateAccommodation";
	}	
}
