package anypet.ks44team01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {
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

}
