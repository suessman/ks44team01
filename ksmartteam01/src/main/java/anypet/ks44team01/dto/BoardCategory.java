package anypet.ks44team01.dto;

/*Data Transfer Object
 * 계층 간 데이터 교환을 위한 자바 빈즈이다
 * 데이터베이스 레코드의 데이터를 매핑하기 위한 데이터 객체
 * DTO는 보통 로직을 가지고 있지 않고 data와 그 data에 접근을 위한 getter, setter만 가지고 있다.
 * database에서 data를 얻어 service나 controller등으로 보낼 때 사용하는 객체
 * */
public class BoardCategory {
	
	private String boardCategoryCode;
	private String id;
	private String boardCategoryName;
	private String registrationDatetime;
	
	public String getBoardCategoryCode() {
		return boardCategoryCode;
	}
	public void setBoardCategoryCode(String boardCategoryCode) {
		this.boardCategoryCode = boardCategoryCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBoardCategoryName() {
		return boardCategoryName;
	}
	public void setBoardCategoryName(String boardCategoryName) {
		this.boardCategoryName = boardCategoryName;
	}
	public String getRegistrationDatetime() {
		return registrationDatetime;
	}
	public void setRegistrationDatetime(String registrationDatetime) {
		this.registrationDatetime = registrationDatetime;
	}
	
	@Override
	public String toString() {
		return "BoardCategory [boardCategoryCode=" + boardCategoryCode + ", id=" + id + ", boardCategoryName="
				+ boardCategoryName + ", registrationDatetime=" + registrationDatetime + "]";
	}
					
}
