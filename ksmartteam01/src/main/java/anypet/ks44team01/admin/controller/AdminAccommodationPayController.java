package anypet.ks44team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/accommodation")
public class AdminAccommodationPayController {
	
	/**
	 * 숙소 카테고리 수정
	 */	
	@GetMapping("/accommodationCategoryModify")
	public String getAccommodationCategoryModify() {
		return "/admin/accommodation/accommodationCategoryModify";
	}
	
	/**
	 * 숙소 카테고리 등록
	 */	
	@GetMapping("/accommodationCategoryInsert")
	public String getAccommodationCategoryInsert() {
		return "/admin/accommodation/accommodationCategoryInsert";
	}
	
	/**
	 * 숙소 카테고리 목록
	 */
	@GetMapping("/accommodationCategory")
	public String getAccommodationCategory() {
		return "/admin/accommodation/accommodationCategory";
	}
	
	/**
	 * 숙소 예약 내역 목록/상세
	 */
	@GetMapping("/accommodationReservationList")
	public String getAccommodationReservationList() {
		return "/admin/accommodation/accommodationReservationList";
	}
	
	/**
	 * 숙소 문의 목록/상세
	 */
	@GetMapping("/accommodationInquiryList")
	public String getAccommodationInquiryList() {
		return "/admin/accommodation/accommodationInquiryList";
	}
}
