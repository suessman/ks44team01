package anypet.ks44team01.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/board")

public class AdminBoardController {
	
	@GetMapping("/boardList")
	public String boardList() {
		return "/admin/board/boardList";
	}
	
	@GetMapping("/addBoard")
	public String addBoard() {
		return "/admin/board/addBoard";
	}
	
	@GetMapping("/readBoard")
	public String readBoard() {
		return "/admin/board/readBoard";
	}
	
	@GetMapping("/modifyBoard")
	public String modifyBoard() {
		return "/admin/board/modifyBoard";
	}
	
}
