package anypet.ksmartteam01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/mypage")
public class UserMypageController {
	
	
	/**
	 * 문의내역 페이지
	 */
	@GetMapping("/inquiryList")
	public String inquiryList() {
		return "/user/mypage/inquiryList";
	}
	
	/**
	 * 숙소예약상세내역 페이지
	 */
	@GetMapping("/accommodationOrderListDetail")
	public String accommodationOrderListDetail() {
		return "/user/mypage/accommodationOrderListDetail";
	}
	
	/**
	 * 상품주문상세내역 페이지
	 */
	@GetMapping("/goodsOrderListDetail")
	public String goodsOrderListDetail() {
		return "/user/mypage/goodsOrderListDetail";
	}
	
	/**
	 * 상품주문목록 페이지
	 */
	@GetMapping("/orderList")
	public String orderList() {
		return "/user/mypage/orderList";
	}
	
	/**
	 * 회원정보 수정/탈퇴 페이지
	 */
	@GetMapping("/modifyMemberInformation")
	public String accommodationDetail() {
		return "/user/mypage/modifyMemberInformation";
	}
}
