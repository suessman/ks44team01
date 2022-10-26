package anypet.ksmartteam01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import anypet.ksmartteam01.dto.Member;
import anypet.ksmartteam01.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	private MemberService memberService;
	
	public MemberController() {
		this.memberService = memberService;
	}
	@GetMapping("/login")
	public String login() {
		return "/user/member/login";
	}	
	@GetMapping("/addMember")
	public String addMember() {
		return "/user/member/addMember";
	}
	@GetMapping("/searchId")
	public String searchId() {
		return "/user/member/searchId";
	}
	@GetMapping("/searchPw")
	public String searchPw() {
		return "/user/member/searchPw";
	}
	@PostMapping
	public String addMember(Member member) {
		memberService.addMember(member);
		return "redirect:/";
	}

}
