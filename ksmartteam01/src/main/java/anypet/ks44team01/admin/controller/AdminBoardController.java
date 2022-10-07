package anypet.ks44team01.admin.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import anypet.ks44team01.dto.Board;
import anypet.ks44team01.service.BoardService;

@Controller
@RequestMapping("/admin/board")
public class AdminBoardController {
	
	private static final Logger log = LoggerFactory.getLogger(AdminBoardController.class);

	// 의존성 주입
	private BoardService boardService;
	public AdminBoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@PostConstruct
	public void adminBoardControllerInit() {
		log.info("adminBoardController 생성");
	}
	
	/*
	 * 게시물 목록 조회
	 * @param model
	 * @return
	 * */
	@GetMapping("/boardList")
	public String getBoardList(Model model) {
		List<Board> boardList = boardService.getBoardList();		
		log.info("게시물 목록 ::: {}" , boardList);
		model.addAttribute("boardList", boardList);
		return "/admin/board/boardList";
	}
	
	/*
	 * 게시물 열람
	 * @param model
	 * @return
	 * */
	@GetMapping("/readBoard")
	public String readBoard(Model model) {
		List<Board> readBoard = boardService.getBoardList();
		log.info("게시물 목록 ::: {}" , readBoard);
		
		return "/admin/board/readBoard";
	}
	
	@GetMapping("/addBoard")
	public String addBoard() {
		return "/admin/board/addBoard";
	}
	
	
	@GetMapping("/modifyBoard")
	public String modifyBoard() {
		return "/admin/board/modifyBoard";
	}
	
	@GetMapping("/boardCategory")
	public String boardCategory() {
		return "/admin/board/boardCategory";
	}
	
}
