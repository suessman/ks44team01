package anypet.ks44team01.admin.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	//상품 삭제
	@GetMapping("/goodsRemove")
	public String goodsRemove(@RequestParam(value = "goodsCode") String goodsCode) {
		Map<String,Object> resultMap = new LinkedHashMap<String, Object>();
		goodsService.goodsRemove(goodsCode);
		
		return "redirect:/admin/goods/goodsList";
	}
	
	@PostConstruct
	public void goodsControllerInit() {
		log.info("goodsController 생성");
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
	
	//상품 수정 쿼리 실행
	@PostMapping("/goodsModify")
	public String goodsModify(GoodsList goodsList) {
		goodsService.goodsModify(goodsList);
		log.info("사용자가 상품 수정한 정보 ::: {}", goodsList);
		
		return "redirect:/admin/goods/goodsList";
	}
	
	//상품 수정 페이지에 정보 불러오기
	@GetMapping("/goodsModify")
	public String goodsModify(@RequestParam(name="goodsCode", required = false) String goodsCode,
							  Model model) {
		
		GoodsList goodsInfo = goodsService.getGoodsInfoByCode(goodsCode);
		
		log.info("특정 상품의 정보 ::: {}", goodsInfo);
		//model 셋팅
		
		//대분류
		List<GoodsCategory> goodsCategory = goodsService.getGoodsCategory();
		
		//중분류
		List<GoodsCategorySub> goodsCategorySub = goodsService.getGoodsCategorySub();
		
		List<GoodsList> goodsList = goodsService.getGoodsList();
		
		model.addAttribute("title", "상품수정");
		model.addAttribute("goodsInfo", goodsInfo);
		model.addAttribute("goodsCategory", goodsCategory);
		model.addAttribute("goodsCategorySub", goodsCategorySub);
		model.addAttribute("goodsList", goodsList);
		
		return "/admin/goods/goodsModify";
	}
	
	
	@PostMapping("/goodsInsert")
	public String goodsInsert(GoodsList goodsList) {
		
		goodsService.goodsInsert(goodsList);	
		return "redirect:/admin/goods/goodsList";
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