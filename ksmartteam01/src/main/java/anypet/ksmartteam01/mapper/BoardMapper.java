package anypet.ksmartteam01.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import anypet.ksmartteam01.dto.Board;
import anypet.ksmartteam01.dto.BoardCategory;

// Mybatis 매핑XML에 기재된 SQL을 호출하기 위한 인터페이스이다. Mybatis3.0부터 생겼다.
// Mapper -> dao 역할

/*
*database의 data에 접근하기 위한 객체 
* 데이터베이스 접근을 하기 위한 로직과 비지니스 로직을 분리하기 위해 사용
* */
@Mapper
public interface BoardMapper {
	// 게시물 목록 조회
	public List<Board> getBoardList();
	
	// 특정 게시물 상세 조회
	public Board getBoardDetailByCode(String boardCode);
			
	// 게시물 등록
	public int addBoard(Board board);

	// 게시물 수정
	
	// 게시물 삭제
	public void deleteBoard(String boardCode);
	
	// 특정 게시물 카테고리 조회
	public BoardCategory getBoardCategoryInfo(String boardCategoryCode);
	
	// 게시물 카테고리 목록 조회
	public List<BoardCategory> getBoardCategoryList();
	
	// 게시물 카테고리 등록
	public int addBoardCategory(BoardCategory boardCategory);
	
	// 게시물 카테고리 수정
	public int modifyBoardCategory(BoardCategory boardCategory);
	
	// 게시물 카테고리 삭제	
	public void deleteBoardCategory(String boardCategoryCode);

}
