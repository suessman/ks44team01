package anypet.ksmartteam01.dto;

public class AccommodationOption {
	private String goodsAccommodationOptionCode;
	private String accommodationDetailCode;
	private String accommodationOption;
	private String totalRoomQuantity;
	private String roomQuantity;
	private String standardNumber;
	private String maximumAvailableNumber;
	private int roomPrice;
	private int roomPriceWeekend;
	public String getGoodsAccommodationOptionCode() {
		return goodsAccommodationOptionCode;
	}
	public void setGoodsAccommodationOptionCode(String goodsAccommodationOptionCode) {
		this.goodsAccommodationOptionCode = goodsAccommodationOptionCode;
	}
	public String getAccommodationDetailCode() {
		return accommodationDetailCode;
	}
	public void setAccommodationDetailCode(String accommodationDetailCode) {
		this.accommodationDetailCode = accommodationDetailCode;
	}
	public String getAccommodationOption() {
		return accommodationOption;
	}
	public void setAccommodationOption(String accommodationOption) {
		this.accommodationOption = accommodationOption;
	}
	public String getTotalRoomQuantity() {
		return totalRoomQuantity;
	}
	public void setTotalRoomQuantity(String totalRoomQuantity) {
		this.totalRoomQuantity = totalRoomQuantity;
	}
	public String getRoomQuantity() {
		return roomQuantity;
	}
	public void setRoomQuantity(String roomQuantity) {
		this.roomQuantity = roomQuantity;
	}
	public String getStandardNumber() {
		return standardNumber;
	}
	public void setStandardNumber(String standardNumber) {
		this.standardNumber = standardNumber;
	}
	public String getMaximumAvailableNumber() {
		return maximumAvailableNumber;
	}
	public void setMaximumAvailableNumber(String maximumAvailableNumber) {
		this.maximumAvailableNumber = maximumAvailableNumber;
	}
	public int getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}
	public int getRoomPriceWeekend() {
		return roomPriceWeekend;
	}
	public void setRoomPriceWeekend(int roomPriceWeekend) {
		this.roomPriceWeekend = roomPriceWeekend;
	}
	@Override
	public String toString() {
		return "AccommodationOption [goodsAccommodationOptionCode=" + goodsAccommodationOptionCode
				+ ", accommodationDetailCode=" + accommodationDetailCode + ", accommodationOption="
				+ accommodationOption + ", totalRoomQuantity=" + totalRoomQuantity + ", roomQuantity=" + roomQuantity
				+ ", standardNumber=" + standardNumber + ", maximumAvailableNumber=" + maximumAvailableNumber
				+ ", roomPrice=" + roomPrice + ", roomPriceWeekend=" + roomPriceWeekend
				+ ", getGoodsAccommodationOptionCode()=" + getGoodsAccommodationOptionCode()
				+ ", getAccommodationDetailCode()=" + getAccommodationDetailCode() + ", getAccommodationOption()="
				+ getAccommodationOption() + ", getTotalRoomQuantity()=" + getTotalRoomQuantity()
				+ ", getRoomQuantity()=" + getRoomQuantity() + ", getStandardNumber()=" + getStandardNumber()
				+ ", getMaximumAvailableNumber()=" + getMaximumAvailableNumber() + ", getRoomPrice()=" + getRoomPrice()
				+ ", getRoomPriceWeekend()=" + getRoomPriceWeekend() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
