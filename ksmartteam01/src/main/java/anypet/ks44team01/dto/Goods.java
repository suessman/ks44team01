package anypet.ks44team01.dto;

public class Goods {

	private String goodsCode;
	private String companyMemberCode;
	private String categoryCodeSub;
	private String Id;
	private String goodsName;
	private int goodsPrice;
	private String goodsImage;
	private String goodsQuantity;
	private String registrationDatetime;
	private String goodsContents;
	
	
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getCompanyMemberCode() {
		return companyMemberCode;
	}
	public void setCompanyMemberCode(String companyMemberCode) {
		this.companyMemberCode = companyMemberCode;
	}
	public String getCategoryCodeSub() {
		return categoryCodeSub;
	}
	public void setCategoryCodeSub(String categoryCodeSub) {
		this.categoryCodeSub = categoryCodeSub;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}
	public String getGoodsQuantity() {
		return goodsQuantity;
	}
	public void setGoodsQuantity(String goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	public String getRegistrationDatetime() {
		return registrationDatetime;
	}
	public void setRegistrationDatetime(String registrationDatetime) {
		this.registrationDatetime = registrationDatetime;
	}
	public String getGoodsContents() {
		return goodsContents;
	}
	public void setGoodsContents(String goodsContents) {
		this.goodsContents = goodsContents;
	}
	@Override
	public String toString() {
		return "Goods [goodsCode=" + goodsCode + ", companyMemberCode=" + companyMemberCode + ", categoryCodeSub="
				+ categoryCodeSub + ", Id=" + Id + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice
				+ ", goodsImage=" + goodsImage + ", goodsQuantity=" + goodsQuantity + ", registrationDatetime="
				+ registrationDatetime + ", goodsContents=" + goodsContents + "]";
	}
	
	
}