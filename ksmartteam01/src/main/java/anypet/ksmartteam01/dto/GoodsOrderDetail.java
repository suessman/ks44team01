package anypet.ksmartteam01.dto;

public class GoodsOrderDetail {
	
	private String orderDetailNumber;
	private String goodsCode;
	private String categoryCodeSub;
	private String id;
	private String orderQuantity;
	private String orderPrice;
	private String goodsOrderCode;
	private String orderRegisterTime;
	private String registrationDatetime;
	
	private Goods goodsDto;
	

	public String getOrderDetail() {
		return orderDetailNumber;
	}

	public void setOrderDetail(String orderDetail) {
		this.orderDetailNumber = orderDetail;
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

	public Goods getGoodsDto() {
		return goodsDto;
	}

	public void setGoodsDto(Goods goodsDto) {
		this.goodsDto = goodsDto;
	}

	@Override
	public String toString() {
		return "GoodsOrderDetail [orderDetailNumber=" + orderDetailNumber + ", goodsCode=" + goodsCode + ", categoryCodeSub="
				+ categoryCodeSub + ", id=" + id + ", orderQuantity=" + orderQuantity + ", orderPrice=" + orderPrice
				+ ", goodsOrderCode=" + goodsOrderCode + ", orderRegisterTime=" + orderRegisterTime
				+ ", registrationDatetime=" + registrationDatetime + ", goodsDto=" + goodsDto + "]";
	}
	

}
