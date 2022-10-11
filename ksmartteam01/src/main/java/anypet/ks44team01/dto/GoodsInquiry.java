package anypet.ks44team01.dto;
// 상품 문의 목록
public class GoodsInquiry {
	private String goodsQnaNumber;
	private String goodsCode;
	private String goodsInquiryId;
	private String goodsName;
	private String goodsQnaDatetime;
	private String goodsQnaTitle;
	private String goodsQnaContents;
	private String goodsQnaAnswer;
	private String goodsQnaSecretPassword;
	
	private GoodsList goodsInfo;
	
	public GoodsList getGoodsInfo() {
		return goodsInfo;
	}
	public void setGoodsInfo(GoodsList goodsInfo) {
		this.goodsInfo = goodsInfo;
	}
	
	public String getGoodsQnaNumber() {
		return goodsQnaNumber;
	}
	public void setGoodsQnaNumber(String goodsQnaNumber) {
		this.goodsQnaNumber = goodsQnaNumber;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getGoodsInquiryId() {
		return goodsInquiryId;
	}
	public void setGoodsInquiryId(String goodsInquiryId) {
		this.goodsInquiryId = goodsInquiryId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsQnaDatetime() {
		return goodsQnaDatetime;
	}
	public void setGoodsQnaDatetime(String goodsQnaDatetime) {
		this.goodsQnaDatetime = goodsQnaDatetime;
	}
	public String getGoodsQnaTitle() {
		return goodsQnaTitle;
	}
	public void setGoodsQnaTitle(String goodsQnaTitle) {
		this.goodsQnaTitle = goodsQnaTitle;
	}
	public String getGoodsQnaContents() {
		return goodsQnaContents;
	}
	public void setGoodsQnaContents(String goodsQnaContents) {
		this.goodsQnaContents = goodsQnaContents;
	}
	public String getGoodsQnaAnswer() {
		return goodsQnaAnswer;
	}
	public void setGoodsQnaAnswer(String goodsQnaAnswer) {
		this.goodsQnaAnswer = goodsQnaAnswer;
	}
	public String getGoodsQnaSecretPassword() {
		return goodsQnaSecretPassword;
	}
	public void setGoodsQnaSecretPassword(String goodsQnaSecretPassword) {
		this.goodsQnaSecretPassword = goodsQnaSecretPassword;
	}
	
	@Override
	public String toString() {
		return "GoodsInquiry [goodsQnaNumber=" + goodsQnaNumber + ", goodsCode=" + goodsCode + ", goodsInquiryId="
				+ goodsInquiryId + ", goodsName=" + goodsName + ", goodsQnaDatetime=" + goodsQnaDatetime
				+ ", goodsQnaTitle=" + goodsQnaTitle + ", goodsQnaContents=" + goodsQnaContents + ", goodsQnaAnswer="
				+ goodsQnaAnswer + ", goodsQnaSecretPassword=" + goodsQnaSecretPassword + "]";
	}
	
	
	
	
	
	
	
	
}
