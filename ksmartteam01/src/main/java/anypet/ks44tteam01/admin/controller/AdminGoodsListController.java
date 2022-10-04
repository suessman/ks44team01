package anypet.ks44tteam01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/goods")
public class AdminGoodsListController {
	/*
	@GetMapping("/goodsCategoryList")
	public String goodsLargeCategoryList() {
		
		return "/user/goods/goodsCategoryList";
	}
	*/
	
	//상품목록
	@GetMapping("/goodsList")
	public String goodsList(Model model) {
		
		return "/admin/goods/goodsList";
	}
	
	
	//상품상세
	@GetMapping("/goodsDetail")
	public String goodsDetail(Model model) {
		
		return "/admin/goods/goodsDetail";
	}
	
	//상품수정
	@GetMapping("/goodsModify")
	public String goodsModify(Model model) {
		
		return "/admin/goods/goodsModify";
	}
	
	//상품등록
	@GetMapping("/goodsInsert")
	public String goodsInsert(Model model) {
		
		return "/admin/goods/goodsInsert";
	}
	
	//상품문의목록
	@GetMapping("/goodsInquryModify")
	public String goodsInquryModify(Model model) {
		
		return "/admin/goods/goodsInquryModify";
	}
	
	//상품문의상세
	@GetMapping("/goodsInquryModifyDetail")
	public String goodsInquryModifyDetail(Model model) {
		
		return "/admin/goods/goodsInquryModifyDetail";
	}
	
}
