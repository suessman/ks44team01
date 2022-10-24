package anypet.ks44team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/goods")
public class UserGoodsListController {
	
	@GetMapping("/goodsListUser")
	public String goodsList() {
		
		return  "/user/goods/goodsListUser";
	}

	@GetMapping("/goodsDetail")
	public String goodsDetail(Model model) {
		
		return "/user/goods/goodsDetail";
	}
	
	
	@GetMapping("/goodsShippingInfoInsert")
	public String goodsShippingInfoInsert() {
		
		return "/user/goods/goodsShippingInfoInsert";
	}
	
	@GetMapping("/goodsShippingInfoModify")
	public String goodsShippingInfoModify() {
		
		return "/user/goods/goodsShippingInfoModify";
	}
	
	@GetMapping("/goodsPaymentListSearch")
	public String goodsPaymentListSearch(){	
		
		return "/user/goods/goodsPaymentListSearch";			
	}
	
	//상품 주문 완료 페이지
	@GetMapping("/goodsCompleteOrder")
	public String goodsCompleteOrder(){	
		
		return "/user/goods/goodsCompleteOrder";			
	}
}
