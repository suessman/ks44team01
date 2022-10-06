package anypet.ks44team01.dto;

public class GoodsLargeCategory {

	private String categoryCode;
	private String categoryName;
	private String registrationDatetime;
	

	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
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
		return "goodsLargeCategory [categoryCode=" + categoryCode + ", categoryName=" + categoryName
				+ ", registrationDatetime=" + registrationDatetime + "]";
	}
}
