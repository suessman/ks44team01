package anypet.ks44team01.dto;

public class GoodsCategory {
	
	private String categoryCode;
	private String categoryName;
	private String categoryId;
	private int registrationDate;
	
	private GoodsCategorySub GoodsCategorySubDto;
	
	
	public GoodsCategorySub getGoodsCategorySubDto() {
		return GoodsCategorySubDto;
	}
	public void setGoodsCategorySubDto(GoodsCategorySub goodsCategorySubDto) {
		GoodsCategorySubDto = goodsCategorySubDto;
	}
	
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
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public int getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(int registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public String toString() {
		return "GoodsCategory [categoryCode=" + categoryCode + ", categoryName=" + categoryName + ", categoryId="
				+ categoryId + ", registrationDate=" + registrationDate + "]";
	}
	
	
}
