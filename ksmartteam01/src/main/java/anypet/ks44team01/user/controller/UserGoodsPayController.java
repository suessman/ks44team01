package anypet.ks44team01.user.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import anypet.ks44team01.dto.Cart;
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
	
	@PostMapping("/goodsPay")
	public String goodsPay(GoodsOrder goodsOrder) {
		
		goodsService.goodsPaymentInfoAdd(goodsOrder);
		
		return "redirect:/user/goods/goodsOrderListDetail";
	}
	 */
	@GetMapping("/goodsPay")
	public String goodsPay(@RequestParam (value="memberId", required = false) String memberId
										  ,Model model){
		
		String orderRegisterTime = "2022-10-04 00:13:02";
		
		
		//배송지 조회를 위한 특정 회원의 정보 조회
		Member memberInfo = goodsService.getMemberInfoById("id002");
		System.out.println("memberInfo->>>" + memberInfo);
		
		//특정 아이디, 특정 주문시간의 주문상세 조회
		List<Map<String,Object>> goodsOrderdetail = goodsService.getGoodsOrderDetailByIdAndDatetime(memberId, orderRegisterTime);
		System.out.println("goodsOrderdetail->>>" + goodsOrderdetail);
		
		//모델 세팅
		model.addAttribute("memberInfo", memberInfo);
		model.addAttribute("goodsOrderdetail", goodsOrderdetail);
		return "/user/goods/goodsPay";
	}
	
	/**
	 * 장바구니(주문상세)
	 */
	@GetMapping("/goodsCartList")
	public String goodsCartList(Model model) {
		
		String memberId = "id002";
		
		
		List<Map<String,Object>> cart = goodsService.getCartById(memberId);
		//List<Map<String,Object>> goodsOrderdetail = goodsService.getGoodsOrderDetailByIdAndDatetime(memberId, orderRegisterTime);
		
		model.addAttribute("title", "장바구니 목록");
		model.addAttribute("cart", cart );
		//model.addAttribute("goodsOrderdetail", goodsOrderdetail);
		
		//System.out.println("goodsOrderdetail->>>" + goodsOrderdetail);
		return "/user/goods/goodsCartList";
	}
	/**
	 * 장바구니 -> 주문상세에 입력
	 */
	@PostMapping("/goodsCartList/")
	public String goodsOrderDetailAdd(@RequestParam(value="checks[]", required=false, defaultValue="") List<Cart> cart) {
		
		goodsService.goodsOrderDetailAdd(cart);
		
		return "redirect:/user/goods/goodsPay";
	}
	/**
	 * 장바구니 수량 수정
	 
	@PostMapping("/goodsCartList/")
	public String modifyCartCount(GoodsOrderDetail goodsOrderDetail) {
		
		goodsService.modifyCartCount(goodsOrderDetail);
		
		return "redirect:/user/goods/goodsCartList";
	}
	*/
	
	/**
	 * 상품 주문/결제정보 테스트
	 */
	@GetMapping("/goodsPaySystemTest")
	public String goodsPaySystemTest() {
		
		return "/user/goods/goodsPaySystemTest";
	}
}