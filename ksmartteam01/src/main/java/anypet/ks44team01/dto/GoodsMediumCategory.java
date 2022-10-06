package anypet.ks44team01.dto;

public class GoodsMediumCategory {

	private String categoryCodeSub;
	private String categoryCode;
	private String Id;
	private String categoryName;
	private String registrationDatetime;
	
	public String getCategoryCodeSub() {
		return categoryCodeSub;
	}
	public void setCategoryCodeSub(String categoryCodeSub) {
		this.categoryCodeSub = categoryCodeSub;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getRegistrationDatetime() {
		return registrationDatetime;
	}
	public void setRegistrationDatetime(String registrationDatetime) {
		this.registrationDatetime = registrationDatetime;
	}
	@Override
	public String toString() {
		return "GoodsMediumCategory [categoryCodeSub=" + categoryCodeSub + ", categoryCode=" + categoryCode + ", Id="
				+ Id + ", categoryName=" + categoryName + ", registrationDatetime=" + registrationDatetime + "]";
	}
	
	
	
}