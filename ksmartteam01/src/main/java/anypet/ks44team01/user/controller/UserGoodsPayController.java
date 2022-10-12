package anypet.ks44team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import anypet.ks44team01.service.GoodsServiceOsj;

@Controller
@RequestMapping("/user/goods")
public class UserGoodsPayController {
	
	private final GoodsServiceOsj goodsService;
	
	public UserGoodsPayController(GoodsServiceOsj goodsService) {
		this.goodsService = goodsService;
	}

	@GetMapping("/goodsPay")
	public String goodsPay() {
		
		return "/user/goods/goodsPay";
	}
	
	@GetMapping("/goodsPaySystemTest")
	public String goodsPaySystemTest() {
		
		return "/user/goods/goodsPaySystemTest";
	}
}