package anypet.ks44team01.dto;

public class AccommodationSpecialPrice {
	private String accommodationSpecialPriceCode;
	private String accommodationDetailCode;
	private String goodsAccommodationOptionCode;
	private String accommodationSpecialPriceStartDatetime;
	private String accommodationSpecialPriceEndDatetime;
	private int accommodationSpecialPrice;
	public String getAccommodationSpecialPriceCode() {
		return accommodationSpecialPriceCode;
	}
	public void setAccommodationSpecialPriceCode(String accommodationSpecialPriceCode) {
		this.accommodationSpecialPriceCode = accommodationSpecialPriceCode;
	}
	public String getAccommodationDetailCode() {
		return accommodationDetailCode;
	}
	public void setAccommodationDetailCode(String accommodationDetailCode) {
		this.accommodationDetailCode = accommodationDetailCode;
	}
	public String getGoodsAccommodationOptionCode() {
		return goodsAccommodationOptionCode;
	}
	public void setGoodsAccommodationOptionCode(String goodsAccommodationOptionCode) {
		this.goodsAccommodationOptionCode = goodsAccommodationOptionCode;
	}
	public String getAccommodationSpecialPriceStartDatetime() {
		return accommodationSpecialPriceStartDatetime;
	}
	public void setAccommodationSpecialPriceStartDatetime(String accommodationSpecialPriceStartDatetime) {
		this.accommodationSpecialPriceStartDatetime = accommodationSpecialPriceStartDatetime;
	}
	public String getAccommodationSpecialPriceEndDatetime() {
		return accommodationSpecialPriceEndDatetime;
	}
	public void setAccommodationSpecialPriceEndDatetime(String accommodationSpecialPriceEndDatetime) {
		this.accommodationSpecialPriceEndDatetime = accommodationSpecialPriceEndDatetime;
	}
	public int getAccommodationSpecialPrice() {
		return accommodationSpecialPrice;
	}
	public void setAccommodationSpecialPrice(int accommodationSpecialPrice) {
		this.accommodationSpecialPrice = accommodationSpecialPrice;
	}
	@Override
	public String toString() {
		return "AccommodationSpecialPrice [accommodationSpecialPriceCode=" + accommodationSpecialPriceCode
				+ ", accommodationDetailCode=" + accommodationDetailCode + ", goodsAccommodationOptionCode="
				+ goodsAccommodationOptionCode + ", accommodationSpecialPriceStartDatetime="
				+ accommodationSpecialPriceStartDatetime + ", accommodationSpecialPriceEndDatetime="
				+ accommodationSpecialPriceEndDatetime + ", accommodationSpecialPrice=" + accommodationSpecialPrice
				+ ", getAccommodationSpecialPriceCode()=" + getAccommodationSpecialPriceCode()
				+ ", getAccommodationDetailCode()=" + getAccommodationDetailCode()
				+ ", getGoodsAccommodationOptionCode()=" + getGoodsAccommodationOptionCode()
				+ ", getAccommodationSpecialPriceStartDatetime()=" + getAccommodationSpecialPriceStartDatetime()
				+ ", getAccommodationSpecialPriceEndDatetime()=" + getAccommodationSpecialPriceEndDatetime()
				+ ", getAccommodationSpecialPrice()=" + getAccommodationSpecialPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}	
}
