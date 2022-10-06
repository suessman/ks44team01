package anypet.ks44team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user/accommodation")
public class UserAccommodationListController {
	
	//숙소목록
	@GetMapping("/accommodationList")
	public String getAccommodationList(Model model) {
		return "/user/accommodation/accommodationList";
	}
	
	
	@GetMapping("/accommodationDetail")
	public String accommodationDetail() {
		return "/user/accommodation/accommodationDetail";
	}
	
	//숙소예약
	@GetMapping("/insertReservation")
	public String insertReservation() {
		return "/user/accommodation/insertReservation";
	}
		
}

