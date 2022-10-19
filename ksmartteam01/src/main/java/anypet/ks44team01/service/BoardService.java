package anypet.ks44team01.service;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ks44team01.dto.Board;
import anypet.ks44team01.dto.BoardCategory;
import anypet.ks44team01.mapper.BoardMapper;

@Service
@Transactional
public class BoardService {

	// 의존성 주입
	private BoardMapper boardMapper;

	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	
	@PostConstruct
	public void boardService() {
		System.out.println("boardService bean 생성");
	}

	// 기능 구현은 메소드 단위로 이루어지기 때문에 하나라도 잘못되면 롤백하기 위해 서비스에 트랜잭션 어노테이션 작성
	// 게시물 목록 조회
	public List<Board> getBoardList() {
		List<Board> boardList = boardMapper.getBoardList();
		return boardList;
	}
	
	// 특정 게시물 상세 조회
	public Board getBoardDetailByCode(String boardCode) {
		Board board = boardMapper.getBoardDetailByCode(boardCode);
		return board;
	}
	
	// 게시물 등록
	public void addBoard(Board board) {		
		boardMapper.addBoard(board);	
		System.out.println("게시판 카테고리 등록 : " + board);
	}
		
	// 게시물 수정
	
	// 게시물 삭제	
	public void deleteBoard(String boardCode) {				
		boardMapper.deleteBoard(boardCode);
	}
	
	// 특정 게시판 카테고리 조회
	public BoardCategory getBoardCategoryInfo(String boardCategoryCode) {	
		BoardCategory boardCategory = boardMapper.getBoardCategoryInfo(boardCategoryCode);	
		return boardCategory;
	}
	
	// 게시판 카테고리 목록 조회
	public List<BoardCategory> getBoardCategoryList() {
		List<BoardCategory> boardCategoryList = boardMapper.getBoardCategoryList();
		return boardCategoryList;
	}
		
	// 게시판 카테고리 등록
	public void addBoardCategory(BoardCategory boardCategory) {		
		boardMapper.addBoardCategory(boardCategory);	
		System.out.println("게시판 카테고리 등록 : " + boardCategory);
	}
	
	// 게시판 카테고리 수정
	public void modifyBoardCategory(BoardCategory boardCategory) {				
		boardMapper.modifyBoardCategory(boardCategory);		
		System.out.println("게시판 카테고리 수정 : " + boardCategory);
	}
		
	// 게시판 카테고리 삭제
	public void deleteBoardCategory(String boardCategoryCode) {				
		boardMapper.deleteBoardCategory(boardCategoryCode);
	}
}
