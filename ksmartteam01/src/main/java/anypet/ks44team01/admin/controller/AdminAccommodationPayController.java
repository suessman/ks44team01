package anypet.ks44team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.AccommodationDetail;
import anypet.ks44team01.dto.AccommodationInquiry;
import anypet.ks44team01.dto.AccommodationPayment;
import anypet.ks44team01.dto.AccommodationPaymentCancel;
import anypet.ks44team01.dto.AccommodationReservationList;
import anypet.ks44team01.dto.Member;
import anypet.ks44team01.service.AccommodationService;

@Controller
@RequestMapping("/admin/accommodation")
public class AdminAccommodationPayController {
	
	private AccommodationService accommodationService;
	
	public AdminAccommodationPayController(AccommodationService accommodationService) {
		this.accommodationService = accommodationService;
	}
	
	/**
	 * 숙소 카테고리 삭제
	 * */
	@GetMapping("/deleteAccommodationCategory")
	public String removeCategory(String accommodationCategoryCode) {
	
		accommodationService.removeCategory(accommodationCategoryCode);
		
		System.out.println("카테고리 삭제 정보: " + accommodationCategoryCode);
		
		return "redirect:accommodationCategory";
	}
	
	/**
	 * 숙소 카테고리 수정
	 */	
	@PostMapping("/accommodationCategoryModify")
	public String updateCategory(AccommodationCategory accommodationCategory) {
		
		accommodationService.updateCategory(accommodationCategory);
		
		System.out.println("카테고리 수정 정보: " + accommodationCategory);
		
		return "redirect:accommodationCategory";
	}
	
	@GetMapping("/accommodationCategoryModify")
	public String updateCategory(@RequestParam(value="accommodationCategoryCode", required = false) String accommodationCategoryCode, Model model) {
		
		//특정 카테고리 정보
		AccommodationCategory categoryInfo = accommodationService.getCategoryInfo(accommodationCategoryCode);
		
		List<AccommodationCategory> accommodationCategoryList = accommodationService.categoryList();
		
		model.addAttribute("categoryInfo", categoryInfo);
		model.addAttribute("accommodationCategoryList", accommodationCategoryList);
		
		return "/admin/accommodation/category/accommodationCategoryModify";
	}
	
	/**
	 * 숙소 카테고리 등록
	 */	
	@PostMapping("/accommodationCategoryInsert")
	public String insertCategory(AccommodationCategory accommodationCategory) {
		
		System.out.println("카테고리 등록 정보: " + accommodationCategory);
		accommodationService.insertCategory(accommodationCategory);
		
		return "redirect:accommodationCategory";
	}

	@GetMapping("/accommodationCategoryInsert")
	public String getAccommodationCategoryInsert(Model model) {
		List<AccommodationCategory> accommodationCategoryList = accommodationService.categoryList();
		model.addAttribute("accommodationCategoryList", accommodationCategoryList);
		
		return "/admin/accommodation/category/accommodationCategoryInsert";
	}
	
	/**
	 * 숙소 카테고리 목록
	 */
	@GetMapping("/accommodationCategory")
	public String categoryList(Model model) {
		List<AccommodationCategory> accommodationCategoryList = accommodationService.categoryList();
		model.addAttribute("accommodationCategoryList", accommodationCategoryList);
		
		return "/admin/accommodation/category/accommodationCategory";
	}
	
	
	/**
	 * 숙소 결제취소 
	 */
	@PostMapping("/adminPaymentCancel")
	public String adminPaymentCancel(AccommodationPaymentCancel accommodationPaymentCancel) {
		
		accommodationService.adminPaymentCancel(accommodationPaymentCancel);
		
		System.out.println("결제취소: " + accommodationPaymentCancel);
		
		return "redirect:accommodationReservationList";
	}
	
	/**
	 * 숙소 예약내역 삭제 
	 */
	@PostMapping("/removeReservationList")
	public String removeReservationList(AccommodationReservationList accommodationReservationCode) {
		
		accommodationService.removeReservationList(accommodationReservationCode);
		
		System.out.println("예약내역삭제: " + accommodationReservationCode);
		
		return "redirect:accommodationReservationList";
	}
	
	/**
	 * 결제취소 승인 
	 */
	@PostMapping("/accommodationApproval")
	public String updatePaymentCancel(AccommodationPaymentCancel accommodationPaymentCancelCode) {
		
		accommodationService.updatePaymentCancel(accommodationPaymentCancelCode);
		
		System.out.println("관리자승인: " + accommodationPaymentCancelCode);
		
		return "redirect:accommodationReservationList";
	}
	
	/**
	 * 숙소 정보 조회
	 */
	@PostMapping("/reservationAccommodationDetailInfo")
	@ResponseBody
	public AccommodationDetail getAccommodationDetailInfo(@RequestParam(value="goodsAccommodationOptionCode") String goodsAccommodationOptionCode) {
		
		AccommodationDetail accommodationDetailInfo = accommodationService.getAccommodationDetailInfo(goodsAccommodationOptionCode);
		System.out.println(accommodationDetailInfo);
		
		return accommodationDetailInfo;
	}
	
	/**
	 * 회원 정보 조회
	 */
	@PostMapping("/accommodationReservationMemberInfo")
	@ResponseBody
	public Member getReservaionMemberInfo(@RequestParam(value="memberId") String memberId) {
		
		Member memberInfo = accommodationService.getReservaionMemberInfo(memberId);
		System.out.println(memberInfo);
		
		return memberInfo;
	}
	
	/**
	 * 결제 내역 조회
	 */
	@PostMapping("/accommodationPaymentDetail")
	@ResponseBody
	public AccommodationPayment getAccommodationPaymnetDetail(@RequestParam(value="accommodationPaymentCode") String accommodationPaymentCode) {
		
		AccommodationPayment accommodationPaymentDetail = accommodationService.getAccommodationPayment(accommodationPaymentCode);
		System.out.println("결제 내역 조회: "+accommodationPaymentDetail);
		
		return accommodationPaymentDetail;
	}
	
	/**
	 * 숙소 예약 내역 목록/상세
	 */
	@GetMapping("/accommodationReservationList")
	public String reservationList(Model model) {
		
		List<AccommodationReservationList> accommodationReservationList = accommodationService.reservationList();
		
		model.addAttribute("accommodationReservationList", accommodationReservationList);
		
		return "/admin/accommodation/reservation/accommodationReservationList";
	}
	
	/**
	 * 숙소 문의 목록 삭제
	 * */
	@PostMapping("/removeInquiry")
	public String removeInquiry(String accommodationQnaNumber) {
		
		accommodationService.removeInquiry(accommodationQnaNumber);
		
		System.out.println("숙소 문의목록 삭제 정보: " + accommodationQnaNumber);
		
		return "redirect:accommodationInquiryList";
	}
	
	/**
	 * 숙소 문의 목록/상세
	 */
	@GetMapping("/accommodationInquiryList")
	public String inquiryList(Model model) {
		List<AccommodationInquiry> accommodationInquiryList = accommodationService.inquiryList();
		model.addAttribute("accommodationInquiryList", accommodationInquiryList);
		
		return "/admin/accommodation/inquiry/accommodationInquiryList";
	}
}
