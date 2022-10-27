package anypet.ksmartteam01.dto;

public class GoodsOrder {

	private String goodsOrderCode;
	private String personalMemberCode;
	private String goodsOrderDatetime;
	private String goodsOrderAddress;
	private String getPhone;
	private String getName;
	private String etc;
	private String id;
	private int totalPrice;
	private int usingPoint;
	private int totalPaymentPrice;
	public String getGoodsOrderCode() {
		return goodsOrderCode;
	}
	public void setGoodsOrderCode(String goodsOrderCode) {
		this.goodsOrderCode = goodsOrderCode;
	}
	public String getPersonalMemberCode() {
		return personalMemberCode;
	}
	public void setPersonalMemberCode(String personalMemberCode) {
		this.personalMemberCode = personalMemberCode;
	}
	public String getGoodsOrderDatetime() {
		return goodsOrderDatetime;
	}
	public void setGoodsOrderDatetime(String goodsOrderDatetime) {
		this.goodsOrderDatetime = goodsOrderDatetime;
	}
	public String getGoodsOrderAddress() {
		return goodsOrderAddress;
	}
	public void setGoodsOrderAddress(String goodsOrderAddress) {
		this.goodsOrderAddress = goodsOrderAddress;
	}
	public String getGetPhone() {
		return getPhone;
	}
	public void setGetPhone(String getPhone) {
		this.getPhone = getPhone;
	}
	public String getGetName() {
		return getName;
	}
	public void setGetName(String getName) {
		this.getName = getName;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getUsingPoint() {
		return usingPoint;
	}
	public void setUsingPoint(int usingPoint) {
		this.usingPoint = usingPoint;
	}
	public int getTotalPaymentPrice() {
		return totalPaymentPrice;
	}
	public void setTotalPaymentPrice(int totalPaymentPrice) {
		this.totalPaymentPrice = totalPaymentPrice;
	}
	@Override
	public String toString() {
		return "GoodsOrder [goodsOrderCode=" + goodsOrderCode + ", personalMemberCode=" + personalMemberCode
				+ ", goodsOrderDatetime=" + goodsOrderDatetime + ", goodsOrderAddress=" + goodsOrderAddress
				+ ", getPhone=" + getPhone + ", getName=" + getName + ", etc=" + etc + ", id=" + id + ", totalPrice="
				+ totalPrice + ", usingPoint=" + usingPoint + ", totalPaymentPrice=" + totalPaymentPrice + "]";
	}
	
	
	
}