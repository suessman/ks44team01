package anypet.ksmartteam01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/goods")
public class UserGoodsPayController {

	@GetMapping("/goodsPay")
	public String goodsPay() {
		return "/user/goods/goodsPay";
	}
}