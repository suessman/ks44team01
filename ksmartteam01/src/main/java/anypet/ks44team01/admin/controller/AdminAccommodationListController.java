package anypet.ks44team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.AccommodationList;
import anypet.ks44team01.dto.Region;
import anypet.ks44team01.service.AccommodationListService;



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
		
		return "/admin/accommodation/accommodationList";
	}
	
	
	//숙소등록 
	@PostMapping("/insertAccommodation")
	public String insertAccommodation(AccommodationList accommodationList) {
		accommodationListService.addAccommodation(accommodationList);
		
		return "redirect:/admin/accommodation/accommodationList";
	}
	
	@GetMapping("/insertAccommodation")
	public String insertAccommodation(Model model) {
		List<AccommodationList> accommodationList = accommodationListService.getAccommodationList();
		model.addAttribute("accommodationList", accommodationList);
		
		model.addAttribute("title", "숙소등록");
		List<AccommodationCategory> accommodationCategoryList = accommodationListService.getCategoryList();
		List<Region> region = accommodationListService.getRegionList();
		model.addAttribute("accommodationCategoryList", accommodationCategoryList);
		model.addAttribute("region", region);
		
		return "/admin/accommodation/insertAccommodation";
	}	
	
	@GetMapping("/updateAccommodation")
	public String updateAccommodation() {
		return "/admin/accommodation/updateAccommodation";
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
