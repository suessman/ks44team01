package anypet.ksmartteam01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import anypet.ksmartteam01.dto.GoodsLargeCategory;
import anypet.ksmartteam01.dto.GoodsMediumCategory;
import anypet.ksmartteam01.service.GoodsServiceOsj;

@Controller
@RequestMapping("/admin/goods")
public class AdminGoodsPayController {
	
		private final GoodsServiceOsj goodsService;
		
		public AdminGoodsPayController(GoodsServiceOsj goodsService) {
			this.goodsService = goodsService;
		}

		
		/**
		 * 상품 대분류 목록
		 */	
		@GetMapping("/goodsLargeCategoryList")
		public String goodsLargeCategoryList(Model model) {
			List<GoodsLargeCategory> goodsLargeCategoryList = goodsService.getGoodsLargeCategoryList();
			
			model.addAttribute("title", "상품대분류목록");
			model.addAttribute("goodsLargeCategoryList", goodsLargeCategoryList);
		
			return "/admin/goods/goodsLargeCategoryList";
		}
		/**
		 * 상품 중분류 목록
		 */	
		@GetMapping("/goodsMediumCategoryList")
		public String goodsMediumCategoryList(Model model) {
			List<GoodsMediumCategory> goodsMediumCategoryList = goodsService.getGoodsMediumCategoryList();
			
			model.addAttribute("title", "상품중분류목록");
			model.addAttribute("goodsMediumCategoryList", goodsMediumCategoryList);
		
			return "/admin/goods/goodsMediumCategoryList";
		}
		
		
		/**
		 * 상품 대분류 등록
		 */	
		@GetMapping("/goodsLargeCategoryAdd")
		public String goodsLargeCategoryAdd() {
			
			return "/admin/goods/goodsLargeCategoryAdd";
		}
		@PostMapping("/goodsLargeCategoryAdd")
		public String goodsLargeCategoryAdd(GoodsLargeCategory goodsLargeCategory) {
			
			goodsService.goodsLargeCategoryAdd(goodsLargeCategory);
			
			return "redirect:/admin/goods/goodsLargeCategoryList";
		}
		/**
		 * 상품 중분류 등록
		 */	
		@GetMapping("/goodsMediumCategoryAdd")
		public String goodsMediumCategoryAdd() {
			
			return "/admin/goods/goodsMediumCategoryAdd";
		}
		@PostMapping("/goodsMediumCategoryAdd")
		public String goodsMediumCategoryAdd(GoodsMediumCategory goodsMediumCategory) {
			
			goodsService.goodsMediumCategoryAdd(goodsMediumCategory);
			
			return "redirect:/admin/goods/goodsMediumCategoryList";
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
		
		/**
		 * 상품 대분류 수정
		 */	
		@PostMapping("/goodsLargeCategoryModify")
		public String goodsLargeCategoryModify(GoodsLargeCategory goodsLargeCategory) {
			
			goodsService.goodsLargeCategoryModify(goodsLargeCategory);
			
			return "redirect:/admin/goods/goodsLargeCategoryList";
		}
		
		@GetMapping("/goodsLargeCategoryModify")
		public String goodsLargeCategoryModify(@RequestParam(value="categoryCode", required = false) String categoryCode
												,Model model) {
			//특정카테고리의 정보
			GoodsLargeCategory largeCategoryInfo = goodsService.getLargeCategoryInfoByCategoryCode(categoryCode);
			System.out.println(">>>>>>>" + largeCategoryInfo);
			//model 세팅
			model.addAttribute("title", "대분류수정");
			model.addAttribute("largeCategoryInfo", largeCategoryInfo);
			return "/admin/goods/goodsLargeCategoryModify";
		}
		/**
		 * 상품 중분류 수정
		 */	
		@PostMapping("/goodsMediumCategoryModify")
		public String goodsMediumMediumCategoryModify(GoodsMediumCategory goodsMediumCategory) {
			
			goodsService.goodsMediumCategoryModify(goodsMediumCategory);
			
			return "redirect:/admin/goods/goodsMediumCategoryList";
		}
		
		@GetMapping("/goodsMediumCategoryModify")
		public String goodsMediumCategoryModify(@RequestParam(value="categoryCodeSub", required = false) String categoryCodeSub
												,Model model) {
			//특정카테고리의 정보
			GoodsMediumCategory mediumCategoryInfo = goodsService.getMediumCategoryInfoByCategoryCodeSub(categoryCodeSub);
			System.out.println(">>>>>>>" + mediumCategoryInfo);
			//model 세팅
			model.addAttribute("title", "대분류수정");
			model.addAttribute("mediumCategoryInfo", mediumCategoryInfo);
			return "/admin/goods/goodsMediumCategoryModify";
		}
		
		
		


		
		

		
		
		@GetMapping("/goodsOrderList")
		public String goodsOrderList() {
		
			return "/admin/goods/goodsOrderList";
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