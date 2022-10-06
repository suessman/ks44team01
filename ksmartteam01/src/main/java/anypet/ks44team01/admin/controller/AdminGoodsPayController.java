package anypet.ks44team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import anypet.ks44team01.dto.GoodsLargeCategory;
import anypet.ks44team01.service.GoodsServiceOsj;

@Controller
@RequestMapping("/admin/goods")
public class AdminGoodsPayController {
	
		private final GoodsServiceOsj goodsService;
		
		public AdminGoodsPayController(GoodsServiceOsj goodsService) {
			this.goodsService = goodsService;
		}
	
		@GetMapping("/goodsOrderList")
		public String goodsOrderList() {
		
			return "/admin/goods/goodsOrderList";
		}
		
		@GetMapping("/goodsMediumCategoryModify")
		public String goodsMediumCategoryModify() {
			
			return "/admin/goods/goodsMediumCategoryModify";
		}
		
		@GetMapping("/goodsMediumCategoryInsert")
		public String goodsMediumCategoryInsert() {
			
			return "/admin/goods/goodsMediumCategoryInsert";
		}
		
		@GetMapping("/goodsMediumCategoryList")
		public String goodsMediumCategoryList() {
			
			return "/admin/goods/goodsMediumCategoryList";
		}
		
		@GetMapping("/goodsLargeCategoryList")
		public String goodsLargeCategoryList(Model model) {
			List<GoodsLargeCategory> goodsLargeCategoryList = goodsService.getGoodsLargeCategoryList();
			
			model.addAttribute("title", "상품대분류목록");
			model.addAttribute("goodsLargeCategoryList", goodsLargeCategoryList);
		
			return "/admin/goods/goodsLargeCategoryList";
		}
		
		@GetMapping("/goodsLargeCategoryModify")
		public String goodsLargeCategoryModify() {
			
			return "/admin/goods/goodsLargeCategoryModify";
		}
		
		@GetMapping("/goodsLargeCategoryInsert")
		public String goodsLargeCategoryInsert() {
			
			return "/admin/goods/goodsLargeCategoryInsert";
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


}