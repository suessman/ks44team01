package anypet.ks44team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/member")
public class AdminMemberController {

	@GetMapping("/getMemberList")
	public String getMemberList() {
		return "admin/member/getMemberList";
	}
	@GetMapping("/searchMember")
	public String searchMember() {
		return "admin/member/searchMember";
	}
	
	
}
