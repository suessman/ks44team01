package anypet.ks44team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.AccommodationInquiry;
import anypet.ks44team01.dto.AccommodationReservationList;
import anypet.ks44team01.service.AccommodationService;

@Controller
@RequestMapping("/admin/accommodation")
public class AdminAccommodationPayController {
	
	private AccommodationService accommodationService;
	
	public AdminAccommodationPayController(AccommodationService accommodationService) {
		this.accommodationService = accommodationService;
	}
	
	/**
	 * 숙소 카테고리 수정
	 */	
	@GetMapping("/accommodationCategoryModify")
	public String getAccommodationCategoryModify() {
		return "/admin/accommodation/category/accommodationCategoryModify";
	}
	
	/**
	 * 숙소 카테고리 등록
	 */	
	@GetMapping("/accommodationCategoryInsert")
	public String getAccommodationCategoryInsert() {
		return "/admin/accommodation/category/accommodationCategoryInsert";
	}
	
	/**
	 * 숙소 카테고리 목록
	 */
	@GetMapping("/accommodationCategory")
	public String getAccommodationCategory(Model model) {
		List<AccommodationCategory> accommodationCategoryList = accommodationService.getAccomodationCategoryList();
		model.addAttribute("accommodationCategoryList", accommodationCategoryList);
		
		return "/admin/accommodation/category/accommodationCategory";
	}
	
	/**
	 * 숙소 예약 내역 목록/상세
	 */
	@GetMapping("/accommodationReservationList")
	public String getAccommodationReservationList(Model model) {
		List<AccommodationReservationList> accommodationReservationList = accommodationService.getAccommodationReservationList();
		model.addAttribute("accommodationReservationList", accommodationReservationList);
		
		return "/admin/accommodation/reservation/accommodationReservationList";
	}
	
	/**
	 * 숙소 문의 목록/상세
	 */
	@GetMapping("/accommodationInquiryList")
	public String getAccommodationInquiryList(Model model) {
		List<AccommodationInquiry> accommodationInquiryList = accommodationService.getAccommodationInquiryList();
		model.addAttribute("accommodationInquiryList", accommodationInquiryList);
		
		return "/admin/accommodation/inquiry/accommodationInquiryList";
	}
}
