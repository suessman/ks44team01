package anypet.ks44tteam01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/accommodation")
public class AdminAccommodationListController {
	@GetMapping("/accommodationList")
	public String accommodationList() {
		return "/admin/accommodation_/accommodationList";
	}
}
