package anypet.ks44team01.dto;

public class GoodsMediumCategory {

	private String categoryCodeSub;
	private String categoryCode;
	private String Id;
	private String categoryNameSub;
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
	public String getCategoryNameSub() {
		return categoryNameSub;
	}
	public void setCategoryNameSub(String categoryNameSub) {
		this.categoryNameSub = categoryNameSub;
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
				+ Id + ", categoryNameSub=" + categoryNameSub + ", registrationDatetime=" + registrationDatetime + "]";
	}
	
}