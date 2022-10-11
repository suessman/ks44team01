package anypet.ks44team01.dto;
// 상품 문의 목록
public class GoodsInquiry {
	private String goodsQnaNumber;
	private String goodsCode;
	private String GoodsInquiryId;
	private String goodsQnaDatetime;
	private String goodsQnaTitle;
	private String goodsQnaContents;
	private String goodsQnaAnswer;
	private String goodsQnaSecretPassword;
	
	
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
		return GoodsInquiryId;
	}


	public void setGoodsInquiryId(String goodsInquiryId) {
		GoodsInquiryId = goodsInquiryId;
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
		return "GoodsInquiry [goodsQnaNumber=" + goodsQnaNumber + ", goodsCode=" + goodsCode + ", GoodsInquiryId="
				+ GoodsInquiryId + ", goodsQnaDatetime=" + goodsQnaDatetime + ", goodsQnaTitle=" + goodsQnaTitle
				+ ", goodsQnaContents=" + goodsQnaContents + ", goodsQnaAnswer=" + goodsQnaAnswer + ", goodsQnaSecretPassword="
				+ goodsQnaSecretPassword + "]";
	}
	
	
	
	
}
