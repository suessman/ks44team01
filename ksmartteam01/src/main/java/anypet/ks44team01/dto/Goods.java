package anypet.ks44team01.dto;

public class Goods {
	
	private String id;
	private String goods_name;
	private String category_code_sub;
	private String goods_resgister_time;
	private String goods_image;
	private int goods_price;
	public String getId() {
		return id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getCategory_code_sub() {
		return category_code_sub;
	}
	public void setCategory_code_sub(String category_code_sub) {
		this.category_code_sub = category_code_sub;
	}
	public String getGoods_resgister_time() {
		return goods_resgister_time;
	}
	public void setGoods_resgister_time(String goods_resgister_time) {
		this.goods_resgister_time = goods_resgister_time;
	}
	public String getGoods_image() {
		return goods_image;
	}
	public void setGoods_image(String goods_image) {
		this.goods_image = goods_image;
	}
	public int getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(int goods_price) {
		this.goods_price = goods_price;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "GoodsList [id=" + id + ", goods_name=" + goods_name + ", category_code_sub=" + category_code_sub
				+ ", goods_resgister_time=" + goods_resgister_time + ", goods_image=" + goods_image + ", goods_price="
				+ goods_price + "]";
	}
	
	
	
}
