package anypet.ks44team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import anypet.ks44team01.service.GoodsServiceOsj;

@Controller
@RequestMapping("/user/goods")
public class UserGoodsPayController {
	
	private final GoodsServiceOsj goodsService;
	
	public UserGoodsPayController(GoodsServiceOsj goodsService) {
		this.goodsService = goodsService;
	}
	
	/**
	 * 상품 주문/결제정보 입력
	 */
	@GetMapping("/goodsPay")
	public String goodsPayform() {
		
		return "/user/goods/goodsPay";
	}
	@PostMapping("/goodsPay")
	public String goodsPay() {
		

		return "redirect:/user/goods/goodsPay";
	}
	
	
	/**
	 * 상품 주문/결제정보 테스트
	 */
	@GetMapping("/goodsPaySystemTest")
	public String goodsPaySystemTest() {
		
		return "/user/goods/goodsPaySystemTest";
	}
}