package anypet.ksmartteam01.dto;
// 상품 수정
public class GoodsModify {
	private String goods_name;
	private String category_name;
	private String category_code;
	private String goods_quantity;
	private String goods_price;
	
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getCategory_code() {
		return category_code;
	}
	public void setCategory_code(String category_code) {
		this.category_code = category_code;
	}
	public String getGoods_quantity() {
		return goods_quantity;
	}
	public void setGoods_quantity(String goods_quantity) {
		this.goods_quantity = goods_quantity;
	}
	public String getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(String goods_price) {
		this.goods_price = goods_price;
	}
	
	@Override
	public String toString() {
		return "GoodsDetail [goods_name=" + goods_name + ", category_name=" + category_name + ", category_code="
				+ category_code + ", goods_quantity=" + goods_quantity + ", goods_price=" + goods_price + "]";
	}
	
}
