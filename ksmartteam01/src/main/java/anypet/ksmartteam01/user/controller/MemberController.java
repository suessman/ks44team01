package anypet.ksmartteam01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class MemberController {
	@GetMapping("/login")
	public String login() {
		return "/member/login";
	}	
/*	@GetMapping("/addMember")
	public String addMember() {
		return "/member/addMember";
	}
 */
}
