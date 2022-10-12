package anypet.ks44team01.admin.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import anypet.ks44team01.dto.GoodsLargeCategory;
import anypet.ks44team01.dto.GoodsMediumCategory;
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
		
		
		@GetMapping("/goodsMediumCategoryList")
		public String goodsMediumCategoryList(Model model) {
			List<GoodsMediumCategory> goodsMediumCategoryList = goodsService.getGoodsMediumCategoryList();
			
			model.addAttribute("title", "상품중분류목록");
			model.addAttribute("goodsMediumCategoryList", goodsMediumCategoryList);
		
			return "/admin/goods/goodsMediumCategoryList";
		}
		
		@GetMapping("/goodsMediumCategoryInsert")
		public String goodsMediumCategoryInsertForm() {
			
			return "/admin/goods/goodsMediumCategoryInsert";
		}
		@PostMapping("/goodsMediumCategoryInsert")
		public String goodsMediumCategoryInsert(GoodsMediumCategory goodsMediumCategory) {
			
			goodsService.goodsMediumCategoryInsert(goodsMediumCategory);
			
			return "redirect:/admin/goods/goodsMediumCategoryList";
		}
		
		@GetMapping("/goodsMediumCategoryModify")
		public String goodsMediumCategoryModify() {
			
			return "/admin/goods/goodsMediumCategoryModify";
		}
		
		
		@GetMapping("/goodsLargeCategoryList")
		public String goodsLargeCategoryList(Model model) {
			List<GoodsLargeCategory> goodsLargeCategoryList = goodsService.getGoodsLargeCategoryList();
			
			model.addAttribute("title", "상품대분류목록");
			model.addAttribute("goodsLargeCategoryList", goodsLargeCategoryList);
		
			return "/admin/goods/goodsLargeCategoryList";
		}
		
		@GetMapping("/goodsLargeCategoryInsert")
		public String goodsLargeCategoryInsertForm() {
			
			return "/admin/goods/goodsLargeCategoryInsert";
		}
		@PostMapping("/goodsLargeCategoryInsert")
		public String goodsLargeCategoryInsert(GoodsLargeCategory goodsLargeCategory) {
			
			goodsService.goodsLargeCategoryInsert(goodsLargeCategory);
			
			return "redirect:/admin/goods/goodsLargeCategoryList";
		}
		
		
		@GetMapping("/goodsLargeCategoryModify")
		public String goodsLargeCategoryModify() {
			
			return "/admin/goods/goodsLargeCategoryModify";
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
		//ajax 활용
		@GetMapping("/getLargeCategoryList")
		@ResponseBody
		public List<GoodsLargeCategory> getLargeCategoryList(Model model) {
			
			List<GoodsLargeCategory> goodsLargeCategoryList = goodsService.getGoodsLargeCategoryList();
			
			model.addAttribute("title", "상품대분류목록");
			model.addAttribute("goodsLargeCategoryList", goodsLargeCategoryList);
			
			return goodsLargeCategoryList;
		}

}