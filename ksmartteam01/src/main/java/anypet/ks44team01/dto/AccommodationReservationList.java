package anypet.ks44team01.dto;

public class AccommodationReservationList {
	
	private String accommodationReservationCode;
	private String accommodationDetailCode;
	private String goodsAccommodationOptionCode;
	private String id;
	private String name;
	private String accommodationOption;
	private String reservationDatetime;
	private String checkinDatetime;
	private String checkoutDatetime;
	private int totalNumber;
	private int paymentAmount;
	private int usingPoint;
	private int totalPaymentPrice;
	private String accommodationPaymentCode;
	public String getAccommodationReservationCode() {
		return accommodationReservationCode;
	}
	public void setAccommodationReservationCode(String accommodationReservationCode) {
		this.accommodationReservationCode = accommodationReservationCode;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccommodationOption() {
		return accommodationOption;
	}
	public void setAccommodationOption(String accommodationOption) {
		this.accommodationOption = accommodationOption;
	}
	public String getReservationDatetime() {
		return reservationDatetime;
	}
	public void setReservationDatetime(String reservationDatetime) {
		this.reservationDatetime = reservationDatetime;
	}
	public String getCheckinDatetime() {
		return checkinDatetime;
	}
	public void setCheckinDatetime(String checkinDatetime) {
		this.checkinDatetime = checkinDatetime;
	}
	public String getCheckoutDatetime() {
		return checkoutDatetime;
	}
	public void setCheckoutDatetime(String checkoutDatetime) {
		this.checkoutDatetime = checkoutDatetime;
	}
	public int getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
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
	public String getAccommodationPaymentCode() {
		return accommodationPaymentCode;
	}
	public void setAccommodationPaymentCode(String accommodationPaymentCode) {
		this.accommodationPaymentCode = accommodationPaymentCode;
	}
	@Override
	public String toString() {
		return "AccommodationReservationList [accommodationReservationCode=" + accommodationReservationCode
				+ ", accommodationDetailCode=" + accommodationDetailCode + ", goodsAccommodationOptionCode="
				+ goodsAccommodationOptionCode + ", id=" + id + ", name=" + name + ", accommodationOption="
				+ accommodationOption + ", reservationDatetime=" + reservationDatetime + ", checkinDatetime="
				+ checkinDatetime + ", checkoutDatetime=" + checkoutDatetime + ", totalNumber=" + totalNumber
				+ ", paymentAmount=" + paymentAmount + ", usingPoint=" + usingPoint + ", totalPaymentPrice="
				+ totalPaymentPrice + ", accommodationPaymentCode=" + accommodationPaymentCode + "]";
	}
	
	
	
	

}
