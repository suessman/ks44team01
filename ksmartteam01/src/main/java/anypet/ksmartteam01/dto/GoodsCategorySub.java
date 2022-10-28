package anypet.ksmartteam01.dto;

public class GoodsCategorySub {
	
	private String categoryCodeSub;
	private String categoryCode;
	private String categorySubName;
	private String categorySubId;
	private int registrationDate;
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
	public String getCategorySubName() {
		return categorySubName;
	}
	public void setCategorySubName(String categorySubName) {
		this.categorySubName = categorySubName;
	}
	public String getCategorySubId() {
		return categorySubId;
	}
	public void setCategorySubId(String categorySubId) {
		this.categorySubId = categorySubId;
	}
	public int getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(int registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public String toString() {
		return "GoodsCategorySub [categoryCodeSub=" + categoryCodeSub + ", categoryCode=" + categoryCode
				+ ", categorySubName=" + categorySubName + ", categorySubId=" + categorySubId + ", registrationDate="
				+ registrationDate + "]";
	}

	
	
	
}
