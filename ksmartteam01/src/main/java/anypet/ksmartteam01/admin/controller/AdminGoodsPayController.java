package anypet.ksmartteam01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/goods")
public class AdminGoodsPayController {
	
		@GetMapping("/goodsOrderList")
		public String goodsOrderList() {
			
			return "/admin/goods/goodsOrderList";
		}
		
		@GetMapping("/goodsLargeCategoryInsert")
		public String goodsLargeCategoryInsert() {
			
			return "/admin/goods/goodsLargeCategoryInsert";
		}
		@GetMapping("/goodsMediumCategoryInsert")
		public String goodsMediumCategoryInsert() {
			
			return "/admin/goods/goodsMediumCategoryInsert";
		}
		
		@GetMapping("/goodsCategoryList")
		public String goodsCategoryList() {
			
			return "/admin/goods/goodsCategoryList";
		}
	}
