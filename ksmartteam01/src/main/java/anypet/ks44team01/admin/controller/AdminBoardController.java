package anypet.ks44team01.admin.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import anypet.ks44team01.dto.Board;
import anypet.ks44team01.dto.BoardCategory;
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
	 * 특정 게시물 상세 조회
	 * @param model
	 * @return
	 * */
	@GetMapping("/boardDetail")
	public String getBoardDetail(@RequestParam(value="boardCode", required = false) String boardCode
			  					 ,Model model) {
		Board boardDetail = boardService.getBoardDetailByCode(boardCode);
        
		log.info("게시판 상세 내용 ::: {}",boardDetail);
		model.addAttribute("title", "게시판 상세 내용");
		model.addAttribute("boardDetail", boardDetail);
		
		return "/admin/board/boardDetail";
	}
	
	/*
	 * 게시물 등록
	 * @param model
	 * @return
	 * */	
	@PostMapping("/addBoard")
	public String addBoard(Board board) {
		System.out.println("게시물 등록 정보: " + board);
		boardService.addBoard(board);
		
		return "redirect:boardList";
	}
	
	@GetMapping("/modifyBoard")
	public String modifyBoard() {
		return "/admin/board/modifyBoard";
	}
	
	@GetMapping("/deleteBoard")
	public String deleteBoard() {
		return "/admin/board/deleteBoard";
	}
	
	@GetMapping("/boardCategory")
	public String boardCategory() {
		return "/admin/board/boardCategory";
	}
	
	/*
	 * 게시판 카테고리 목록 조회
	 * @param model
	 * @return
	 * */
	@GetMapping("/boardCategoryList")
	public String getBoardCategoryList(Model model) {
		List<BoardCategory> boardCategoryList = boardService.getBoardCategoryList();		
		log.info("게시물 목록 ::: {}" , boardCategoryList);
		model.addAttribute("boardCategoryList", boardCategoryList);
		
		return "/admin/board/boardCategoryList";
	}
	
	/*
	 * 게시판 카테고리 등록
	 * @param model
	 * @return
	 * */
	@PostMapping("/addBoardCategory")
	public String addBoardCategory(BoardCategory boardCategory) {
		System.out.println("게시판 카테고리 등록 정보: " + boardCategory);
		boardService.addBoardCategory(boardCategory);
		
		return "redirect:boardCategoryList";
	}
	
	@GetMapping("/addBoardCategory")
	public String addBoardCategory(Model model) {
		List<BoardCategory> boardCategoryList = boardService.getBoardCategoryList();
		model.addAttribute("title", "게시판 카테고리 등록");
		model.addAttribute("boardCategoryList", boardCategoryList);
		
		return "/admin/board/addBoardCategory";
	}
	
	/*
	 * 게시판 카테고리 수정
	 * @param model
	 * @return
	 * */
	@PostMapping("/modifyBoardCategory")
	public String modifyBoardCategory(BoardCategory boardCategory) {
		System.out.println("게시판 카테고리 수정 정보: " + boardCategory);
		boardService.modifyBoardCategory(boardCategory);
		
		return "redirect:/admin/board/boardCategoryList";
	}

	@GetMapping("/modifyBoardCategory")
	public String modifyBoardCategory(@RequestParam(value="boardCategoryCode", required = false) String boardCategoryCode, Model model) {
		//특정 게시판 카테고리 정보
		BoardCategory boardCategoryInfo = boardService.getBoardCategoryInfo(boardCategoryCode);			
		List<BoardCategory> boardCategoryList = boardService.getBoardCategoryList();
		model.addAttribute("boardCategoryInfo", boardCategoryInfo);
		model.addAttribute("boardCategoryList", boardCategoryList);
		
		return "/admin/board/modifyBoardCategory";
	}
	
	/*
	 * 게시판 카테고리 삭제
	 * @param model
	 * @return
	 * */
	@GetMapping("/deleteBoardCategory")
	public String deleteBoardCategory(@RequestParam(value = "boardCategoryCode") String boardCategoryCode) {
		boardService.deleteBoardCategory(boardCategoryCode);
		
		return "redirect:/admin/board/boardCategoryList";
	}
}
