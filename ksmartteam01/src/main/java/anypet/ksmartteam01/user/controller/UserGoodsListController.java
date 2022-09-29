package anypet.ksmartteam01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class UserGoodsListController {

	@GetMapping("/goodsDetail")
	public String goodsDetail(Model model) {
		
		return "/user/goods/goodsDetail";
	}
}
