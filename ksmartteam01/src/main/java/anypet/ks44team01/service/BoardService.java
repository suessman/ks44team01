package anypet.ks44team01.service;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import anypet.ks44team01.dto.Board;
import anypet.ks44team01.mapper.BoardMapper;

@Service
@Transactional
public class BoardService {
	
	// 의존성 주입
	private BoardMapper boardMapper;
	public BoardService(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	
	// 기능 구현은 메소드 단위로 이루어지기 때문에 하나라도 잘못되면 롤백하기 위해 서비스에 트랜잭션 어노테이션 작성
	// 게시물 목록 조회
	public List<Board> getBoardList(){
		List<Board> boardList = boardMapper.getBoardList();
		
	/*
	 * if(boardList != null) { //향상된 for문 for(데이터타입 : 배열) for(Board board :
	 * boardList) { String boardCategoryCode = board.getBoard_category_code();
	 * if(boardCategoryCode == "bcc01") { board.setBoard_category_code("공지사항");
	 * }else if(boardCategoryCode == "bcc02") {
	 * board.setBoard_category_code("정보공유"); }else if(boardCategoryCode == "bcc03")
	 * { board.setBoard_category_code("자유"); }else {
	 * board.setBoard_category_code("기타"); } } } System.out.println(boardList);
	 */
		return boardList;
	}
	
	// 게시물 열람
	public List<Board> readBoard(){
		List<Board> boardList = boardMapper.readBoard();
		return boardList;
	}
		
	@PostConstruct
	public void boardService() {
		System.out.println("boardService bean 생성");
	}
					
}
