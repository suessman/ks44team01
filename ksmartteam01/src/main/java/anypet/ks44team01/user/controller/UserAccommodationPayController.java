package anypet.ks44team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/accommodation")
public class UserAccommodationPayController {
	
	/**
	 * 숙소 목록
	 */
	
	@GetMapping("/accommodationPay")
	public String accommodationPay(Model model) {
		return "/user/accommodation/accommodationPay";
	}
}
