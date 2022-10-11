package anypet.ks44team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import anypet.ks44team01.dto.Member;
import anypet.ks44team01.service.MemberService;

@Controller
@RequestMapping("/admin/member")
public class AdminMemberController {

	private MemberService memberService;
	public AdminMemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	
	@GetMapping("/getMemberList")
	public String getMemberList(Model model) {
		List<Member> member = memberService.getMemberList();
		model.addAttribute("member", member);
		return "admin/member/getMemberList";
	}
	@GetMapping("/searchMember")
	public String searchMember() {
		return "admin/member/searchMember";
	}
	
	
}
