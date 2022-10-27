package anypet.ksmartteam01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import anypet.ksmartteam01.dto.AccommodationCategory;
import anypet.ksmartteam01.dto.AccommodationList;
import anypet.ksmartteam01.dto.CompanyMember;
import anypet.ksmartteam01.dto.Region;
import anypet.ksmartteam01.service.AccommodationListService;



@Controller
@RequestMapping("/admin/accommodation")
public class AdminAccommodationListController {
	
	
	private AccommodationListService accommodationListService;
	
	public AdminAccommodationListController(AccommodationListService accommodationListService) {
		this.accommodationListService = accommodationListService;
	}
	
	

	
	//숙소목록
	@GetMapping("/accommodationList")
	public String accommodationList(Model model) {
		List<AccommodationList> accommodationList = accommodationListService.getAccommodationList();
		model.addAttribute("accommodationList", accommodationList);
		
		System.out.println(accommodationList);
		
		return "/admin/accommodation/accommodationList";
	}
	
	
	//숙소등록 
	@PostMapping("/insertAccommodation")
	public String insertAccommodation(AccommodationList accommodationList) {
		accommodationListService.addAccommodation(accommodationList);
		
		return "redirect:/admin/accommodation/accommodationList";
	}
	
	//숙소등록
	@GetMapping("/insertAccommodation")
	public String insertAccommodation(Model model) {
		List<AccommodationList> accommodationList = accommodationListService.getAccommodationList();
		
		model.addAttribute("accommodationList", accommodationList);
		System.out.println("start숙소데이터목록");
		System.out.println(accommodationList);
		System.out.println("end숙소데이터목록");
		
		model.addAttribute("title", "숙소등록");
		List<AccommodationCategory> accommodationCategoryList = accommodationListService.getCategoryList();
		List<Region> region = accommodationListService.getRegionList();
		List<CompanyMember> companyMember = accommodationListService.getCompanyMember();
		
		model.addAttribute("accommodationCategoryList", accommodationCategoryList);
		model.addAttribute("region", region);
		model.addAttribute("companyMember", companyMember);
		
		return "/admin/accommodation/insertAccommodation";
	}		
	
	//숙소수정
	@GetMapping("/updateAccommodation")
	public String updateAccommodation(@RequestParam(value="accommodationDetailCode", required = false) String accommodationDetailCode
			, Model model) {
		
		//숙소의 정보
		AccommodationList accommodationListInfo = accommodationListService.getAccommodationInfoByCode(accommodationDetailCode);
		model.addAttribute("accommodationListInfo", accommodationListInfo);
		
		List<AccommodationCategory> accommodationCategoryList = accommodationListService.getCategoryList();
		List<Region> region = accommodationListService.getRegionList();
		model.addAttribute("accommodationCategoryList", accommodationCategoryList);
		model.addAttribute("region", region);
		
		return "/admin/accommodation/updateAccommodation";
	}
	
	//숙소수정
	@PostMapping("/updateAccommodation")
	public String updateAccommodation(AccommodationList accommodationList) {
		
		
		accommodationListService.updateAccommodationList(accommodationList);
		
		return "redirect:/admin/accommodation/accommodationList";
	}
	
	
	//숙소삭제
	@GetMapping("/deleteAccommodation")
	public String deleteAccommodation(String accommodationDetailCode) {
		accommodationListService.deleteAccommodationList(accommodationDetailCode);		
		System.out.println(accommodationDetailCode);
		return "redirect:/admin/accommodation/accommodationList";
	}
					
							
	
	@GetMapping("/accommodationDetail")
	public String accommodationDetail() {
		return "/admin/accommodation/accommodationDetail";
	}
	
	@GetMapping("/reviewList")
	public String reviewList() {
		return "/admin/accommodation/review/reviewList";
	}
	
	@GetMapping("/reviewDetail")
	public String reviewDetail() {
		return "/admin/accommodation/review/reviewDetail";
	}
}
