package anypet.ks44team01.dto;
// 상품 목록
public class GoodsList {
	private String goodsCode;
	private String goodsId;
	private String goodsName;
	private String categoryCode;
	private String categoryCodeSub;
	private String goodsResgisterTime;
	private String goodsImage;
	private int goodsPrice;
	private String goodsQuantiy;
	private String goodsContents;
	
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryCodeSub() {
		return categoryCodeSub;
	}
	public void setCategoryCodeSub(String categoryCodeSub) {
		this.categoryCodeSub = categoryCodeSub;
	}
	public String getGoodsResgisterTime() {
		return goodsResgisterTime;
	}
	public void setGoodsResgisterTime(String goodsResgisterTime) {
		this.goodsResgisterTime = goodsResgisterTime;
	}
	public String getGoodsImage() {
		return goodsImage;
	}
	public void setGoodsImage(String goodsImage) {
		this.goodsImage = goodsImage;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsQuantiy() {
		return goodsQuantiy;
	}
	public void setGoodsQuantiy(String goodsQuantiy) {
		this.goodsQuantiy = goodsQuantiy;
	}
	public String getGoodsContents() {
		return goodsContents;
	}
	public void setGoodsContents(String goodsContents) {
		this.goodsContents = goodsContents;
	}
	
	@Override
	public String toString() {
		return "GoodsList [goodsCode=" + goodsCode + ", goodsId=" + goodsId + ", goodsName=" + goodsName
				+ ", categoryCode=" + categoryCode + ", categoryCodeSub=" + categoryCodeSub + ", goodsResgisterTime="
				+ goodsResgisterTime + ", goodsImage=" + goodsImage + ", goodsPrice=" + goodsPrice + ", goodsQuantiy="
				+ goodsQuantiy + ", goodsContents=" + goodsContents + "]";
	}
	
	
	

	
	
	
	
}
