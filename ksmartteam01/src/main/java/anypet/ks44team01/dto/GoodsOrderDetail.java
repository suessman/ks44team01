package anypet.ks44team01.dto;

public class GoodsOrderDetail {
	
	private String orderDetail;
	private String goodsCode;
	private String categoryCodeSub;
	private String id;
	private String orderQuantity;
	private String orderPrice;
	private String goodsOrderCode;
	private String orderRegisterTime;
	private String registrationDatetime;
	
	public String getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}
	public String getGoodsCode() {
		return goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}
	public String getCategoryCodeSub() {
		return categoryCodeSub;
	}
	public void setCategoryCodeSub(String categoryCodeSub) {
		this.categoryCodeSub = categoryCodeSub;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(String orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public String getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getGoodsOrderCode() {
		return goodsOrderCode;
	}
	public void setGoodsOrderCode(String goodsOrderCode) {
		this.goodsOrderCode = goodsOrderCode;
	}
	
	public String getOrderRegisterTime() {
		return orderRegisterTime;
	}
	public void setOrderRegisterTime(String orderRegisterTime) {
		this.orderRegisterTime = orderRegisterTime;
	}
	public String getRegistrationDatetime() {
		return registrationDatetime;
	}
	public void setRegistrationDatetime(String registrationDatetime) {
		this.registrationDatetime = registrationDatetime;
	}
	
	@Override
	public String toString() {
		return "GoodsOrderDetail [orderDetail=" + orderDetail + ", goodsCode=" + goodsCode + ", categoryCodeSub="
				+ categoryCodeSub + ", id=" + id + ", orderQuantity=" + orderQuantity + ", orderPrice=" + orderPrice
				+ ", goodsOrderCode=" + goodsOrderCode + ", orderRegisterTime=" + orderRegisterTime
				+ ", registrationDatetime=" + registrationDatetime + "]";
	}
}
