package anypet.ksmartteam01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accommodation")
public class UserAccommodationPayController {
	
	/**
	 * 숙소 목록
	 */	
	@GetMapping("/accommodationList")
	public String getAccommodationList(Model model) {
		return "/user/accommodation/accommodationList";
	}

}
