package anypet.ks44team01.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import anypet.ks44team01.dto.GoodsCategory;
import anypet.ks44team01.dto.GoodsCategorySub;
import anypet.ks44team01.dto.GoodsInquiry;
import anypet.ks44team01.dto.GoodsList;
import anypet.ks44team01.service.GoodsService;


@Controller
@RequestMapping("/admin/goods")
public class AdminGoodsController {
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	private final GoodsService goodsService;
	
	public AdminGoodsController(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	
	//상품목록
	@GetMapping("/goodsList")
	public String goodsList(Model model) {
		List<GoodsList> goodsList = goodsService.getGoodsList();
		
		
		
		model.addAttribute("title", "상품목록");
		model.addAttribute("goodsList", goodsList);
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
		//대분류
		List<GoodsCategory> goodsCategory = goodsService.getGoodsCategory();
		
		//중분류
		List<GoodsCategorySub> goodsCategorySub = goodsService.getGoodsCategorySub();
		
		
		model.addAttribute("title", "상품 등록");
		model.addAttribute("goodsCategory", goodsCategory);
		model.addAttribute("goodsCategorySub", goodsCategorySub);
		
		return "/admin/goods/goodsInsert";
	}
	
	//상품문의목록
	@GetMapping("/goodsInquiryModify")
	public String goodsInquiryModify(Model model) {
		
		List<GoodsInquiry> goodsInquiry = goodsService.getGoodsInquiryModify();
		
		model.addAttribute("title", "상품문의목록");
		model.addAttribute("goodsInquiryModify", goodsInquiry);
		return "/admin/goods/goodsInquiryModify";
	}
	
	//상품문의상세
	@GetMapping("/goodsInquiryModifyDetail")
	public String goodsInquiryModifyDetail(Model model) {
		
		return "/admin/goods/goodsInquiryModifyDetail";
	}
	
}