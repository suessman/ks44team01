package anypet.ks44team01.dto;

/*Data Transfer Object
 * 계층 간 데이터 교환을 위한 자바 빈즈이다
 * 데이터베이스 레코드의 데이터를 매핑하기 위한 데이터 객체
 * DTO는 보통 로직을 가지고 있지 않고 data와 그 data에 접근을 위한 getter, setter만 가지고 있다.
 * database에서 data를 얻어 service나 controller등으로 보낼 때 사용하는 객체
 * */
public class Board {
	
	private String board_code;
	private String id;
	private String board_category_code;
	private String board_title;
	private String board_contents;
	private String board_datetime;
	private String board_image;
	private int board_hits;
	
	public String getBoard_code() {
		return board_code;
	}
	public void setBoard_code(String board_code) {
		this.board_code = board_code;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBoard_category_code() {
		return board_category_code;
	}
	public void setBoard_category_code(String board_category_code) {
		this.board_category_code = board_category_code;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_contents() {
		return board_contents;
	}
	public void setBoard_contents(String board_contents) {
		this.board_contents = board_contents;
	}
	public String getBoard_datetime() {
		return board_datetime;
	}
	public void setBoard_datetime(String board_datetime) {
		this.board_datetime = board_datetime;
	}
	public String getBoard_image() {
		return board_image;
	}
	public void setBoard_image(String board_image) {
		this.board_image = board_image;
	}
	public int getBoard_hits() {
		return board_hits;
	}
	public void setBoard_hits(int board_hits) {
		this.board_hits = board_hits;
	}
	
	@Override
	public String toString() {
		return "Board [board_code=" + board_code + ", id=" + id + ", board_category_code=" + board_category_code
				+ ", board_title=" + board_title + ", board_contents=" + board_contents + ", board_datetime="
				+ board_datetime + ", board_image=" + board_image + ", board_hits=" + board_hits + "]";
	}
		
}
