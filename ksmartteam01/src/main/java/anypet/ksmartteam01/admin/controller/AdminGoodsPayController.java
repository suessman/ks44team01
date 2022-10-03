package anypet.ksmartteam01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class AdminGoodsPayController {
	@Controller
	@RequestMapping("/admin/goods")
	public class AdminGoodsListController {
		
		@GetMapping("/goodsOrderList")
		public String goodsOrderList(Model model) {
			
			return "/admin/goods/goodsOrderList";
		}
		
		@GetMapping("/goodsLargeCategoryInsert")
		public String goodsLargeCategoryInsert(Model model) {
			
			return "/admin/goods/goodsLargeCategoryInsert";
		}
		@GetMapping("/goodsMediumCategoryInsert")
		public String goodsMediumCategoryInsert(Model model) {
			
			return "/admin/goods/goodsMediumCategoryInsert";
		}
	}
}
