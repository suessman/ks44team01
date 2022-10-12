package anypet.ks44team01.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import anypet.ks44team01.dto.Member;
import anypet.ks44team01.service.MemberService;

@Controller
@RequestMapping("/admin/member")
public class AdminMemberController {

	private MemberService memberService;
	public AdminMemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	//전체 회원 조회
	@GetMapping("/getMemberList")
	public String getMemberList(Model model) {
		List<Member> member = memberService.getMemberList();
		model.addAttribute("member", member);
		return "admin/member/getMemberList";
	}
	//특정 회원 조회
	@GetMapping("/searchMember")
	public String searchMember(Model model
							  ,@RequestParam(value="memberId") String memberId) {
		Member member = memberService.getMemberInfoById(memberId);
		model.addAttribute("member", member);
		return "admin/member/searchMember";
	}
	//특정 회원 정보 수정
	@PostMapping
	public String modifyMember(Model model
							  ,@RequestParam(value="memberId")String memberId) {
		memberService.modifyMember(memberId);
		return "redirect:/admin/member/searchMember";
	}
	
	
}
