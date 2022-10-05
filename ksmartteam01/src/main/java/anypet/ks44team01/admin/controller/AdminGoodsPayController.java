package anypet.ks44team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/goods")
public class AdminGoodsPayController {
	
		@GetMapping("/goodsOrderList")
		public String goodsOrderList() {
		
			return "/admin/goods/goodsLargeCategoryModify";
		}
		
		@GetMapping("/goodsMediumCategoryModify")
		public String goodsMediumCategoryModify() {
			
			return "/admin/goods/goodsMediumCategoryModify";
		}
		
		@GetMapping("/goodsLargeCategoryList")
		public String goodsLargeCategoryList() {
			
			return "/admin/goods/goodsLargeCategoryList";
		}
		
		@GetMapping("/goodsMediumCategoryList")
		public String goodsMediumCategoryList() {
			
			return "/admin/goods/goodsMediumCategoryList";
		}
		@GetMapping("/goodsReviewList")
		public String goodsReviewList() {
			
			return "/admin/goods/goodsReviewList";
		}
		
		@GetMapping("/goodsPaymentCancle")
		public String goodsPaymentCancle() {
			
			return "/admin/goods/goodsPaymentCancle";
		}
		
		@GetMapping("/goodsReturn")
		public String goodsReturn() {
			
			return "/admin/goods/goodsReturn";
		}

	@GetMapping("/goodsMediumCategoryInsert")
	public String goodsMediumCategoryInsert() {
		
		return "/admin/goods/goodsMediumCategoryInsert";
	}
}