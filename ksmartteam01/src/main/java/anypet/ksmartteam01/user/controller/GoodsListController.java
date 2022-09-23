package anypet.ksmartteam01.user.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GoodsListController {

	@GetMapping("/goodsInsert")
	public String goodsInsert() {
	
		return "/user/goods/goodsInsert";
	}
	@GetMapping("/goodsList")
	public String goodList() {
		
		return "/user/goods/goodsList";
	}
	@GetMapping("/goodsListUser")
	public String goodsList() {
		
		return  "/user/goods/goodsListUser";
	}
	@GetMapping("/goodsModify")
	public String goodsModify() {
	
		return "/user/goods/goodsModify";
	}
	@GetMapping("/goodsShippingInfoInsert")
	public String goodsShippingInfoInsert() {
		
		return "/user/goods/goodsShippingInfoInsert";
	}
	@GetMapping("/goodsShippingInfoModify")
	public String goodsShippingInfoModify() {
		
		return "/user/goods/goodsShippingInfoModify";
	}
	@GetMapping("/goodsCartList")
	public String goodsCartList() {
		
		return "/user/goods/goodsCartList";
	}
}

