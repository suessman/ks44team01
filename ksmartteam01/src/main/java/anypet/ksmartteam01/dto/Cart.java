package anypet.ksmartteam01.dto;

public class Cart {

	private String cartListCode;
	private String Id;
	private String goodsCode;
	private String cartGoodsQuantity;
	private String cartTotalPrice;
	private String cartRegistrationDatetime;
	
	private Goods goodsDTO;

	public String getCartListCode() {
		return cartListCode;
	}

	public void setCartListCode(String cartListCode) {
		this.cartListCode = cartListCode;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getGoodsCode() {
		return goodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getCartGoodsQuantity() {
		return cartGoodsQuantity;
	}

	public void setCartGoodsQuantity(String cartGoodsQuantity) {
		this.cartGoodsQuantity = cartGoodsQuantity;
	}

	public String getCartTotalPrice() {
		return cartTotalPrice;
	}

	public void setCartTotalPrice(String cartTotalPrice) {
		this.cartTotalPrice = cartTotalPrice;
	}

	public String getCartRegistrationDatetime() {
		return cartRegistrationDatetime;
	}

	public void setCartRegistrationDatetime(String cartRegistrationDatetime) {
		this.cartRegistrationDatetime = cartRegistrationDatetime;
	}

	public Goods getGoodsDTO() {
		return goodsDTO;
	}

	public void setGoodsDTO(Goods goodsDTO) {
		this.goodsDTO = goodsDTO;
		
		
	}

	@Override
	public String toString() {
		return "Cart [cartListCode=" + cartListCode + ", Id=" + Id + ", goodsCode=" + goodsCode + ", cartGoodsQuantity="
				+ cartGoodsQuantity + ", cartTotalPrice=" + cartTotalPrice + ", cartRegistrationDatetime="
				+ cartRegistrationDatetime + ", goodsDTO=" + goodsDTO + "]";
	}
	
}