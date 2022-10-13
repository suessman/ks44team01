package anypet.ks44team01.user.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import anypet.ks44team01.dto.GoodsOrder;
import anypet.ks44team01.dto.GoodsOrderDetail;
import anypet.ks44team01.dto.Member;
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
	@PostMapping("/goodsPay")
	public String goodsPay(GoodsOrder goodsOrder) {
		
		goodsService.goodsPaymentInfoInsert(goodsOrder);
		
		return "redirect:/user/goods/goodsOrderListDetail";
	}
	
	@GetMapping("/goodsPay")
	public String goodsPay(Model model){
		
		String memberId = "id001";
		
		//배송지 조회를 위한 특정 회원의 정보 조회
		Member memberInfo = goodsService.getMemberInfoById(memberId);
		
		System.out.println("memberInfo->>>" + memberInfo);
		//주문상세 조회
		List<GoodsOrderDetail> goodsOrderDetail = goodsService.getGoodsOrderDetailList();
		
		System.out.println("goodsOrderDetail" + goodsOrderDetail);
		//모델 세팅
		model.addAttribute("memberInfo", memberInfo);
		model.addAttribute("goodsOrderDetail", goodsOrderDetail);
		
		return "/user/goods/goodsPay";
	}
	

	
	
	/**
	 * 상품 주문/결제정보 테스트
	 */
	@GetMapping("/goodsPaySystemTest")
	public String goodsPaySystemTest() {
		
		return "/user/goods/goodsPaySystemTest";
	}
}