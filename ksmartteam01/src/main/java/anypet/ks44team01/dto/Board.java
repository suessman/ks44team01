package anypet.ks44team01.dto;

/*Data Transfer Object
 * 계층 간 데이터 교환을 위한 자바 빈즈이다
 * 데이터베이스 레코드의 데이터를 매핑하기 위한 데이터 객체
 * DTO는 보통 로직을 가지고 있지 않고 data와 그 data에 접근을 위한 getter, setter만 가지고 있다.
 * database에서 data를 얻어 service나 controller등으로 보낼 때 사용하는 객체
 * */
public class Board {
	
	private String boardCode;
	private String id;
	private String boardCategoryCode;
	private String boardTitle;
	private String boardContents;
	private String boardDatetime;
	private String boardImage;
	private int    boardHits;
	private BoardCategory boardCategory;
	
	public String getBoardCode() {
		return boardCode;
	}
	public void setBoardCode(String boardCode) {
		this.boardCode = boardCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBoardCategoryCode() {
		return boardCategoryCode;
	}
	public void setBoardCategoryCode(String boardCategoryCode) {
		this.boardCategoryCode = boardCategoryCode;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContents() {
		return boardContents;
	}
	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}
	public String getBoardDatetime() {
		return boardDatetime;
	}
	public void setBoardDatetime(String boardDatetime) {
		this.boardDatetime = boardDatetime;
	}
	public String getBoardImage() {
		return boardImage;
	}
	public void setBoardImage(String boardImage) {
		this.boardImage = boardImage;
	}
	public int getBoardHits() {
		return boardHits;
	}
	public void setBoardHits(int boardHits) {
		this.boardHits = boardHits;
	}
	public BoardCategory getBoardCategory() {
		return boardCategory;
	}
	public void setBoardCategory(BoardCategory boardCategory) {
		this.boardCategory = boardCategory;
	}
	
	@Override
	public String toString() {
		return "Board [boardCode=" + boardCode + ", id=" + id + ", boardCategoryCode=" + boardCategoryCode
				+ ", boardTitle=" + boardTitle + ", boardContents=" + boardContents + ", boardDatetime=" + boardDatetime
				+ ", boardImage=" + boardImage + ", boardHits=" + boardHits + ", boardCategory=" + boardCategory + "]";
	}
			
}
