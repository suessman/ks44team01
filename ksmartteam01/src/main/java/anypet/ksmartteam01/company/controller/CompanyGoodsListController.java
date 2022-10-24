package anypet.ksmartteam01.company.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	@RequestMapping("/goods")
	public class CompanyGoodsListController {
		
		@GetMapping("/goodsInsert")
		public String goodsInsertForm() {
		
			return "/user/goods/goodsInsert";
		}
		@PostMapping("/goodsInsert")
		public String goodsInsert() {
		
			return "redirect:/user/goods/goodsList";
		}

		@GetMapping("/goodsList")
		public String goodList() {
			
			return "/user/goods/goodsList";
		}
		
		@GetMapping("/goodsModify")
		public String goodsModify() {
		
			return "/user/goods/goodsModify";
		}


	}



