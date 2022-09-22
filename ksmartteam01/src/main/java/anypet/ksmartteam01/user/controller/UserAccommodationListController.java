package anypet.ksmartteam01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/accommodation")
public class UserAccommodationListController {
	@GetMapping("/accommodationDetail")
	public String accommodationDetail() {
		return "/user/accommodation/accommodationDetail";
	}
}
