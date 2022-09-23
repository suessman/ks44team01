package anypet.ksmartteam01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/mypage")
public class UserMypageController {
	@GetMapping("/modifyMemberInformation")
	public String accommodationDetail() {
		return "/user/mypage/modifyMemberInformation";
	}
}
