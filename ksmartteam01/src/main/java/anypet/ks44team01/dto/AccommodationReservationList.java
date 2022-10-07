package anypet.ks44team01.dto;

public class AccommodationReservationList {
	
	private String accommodationReservationCode;
	private String id;
	private String name;
	private String accommodationOption;
	private String reservationDatetime;
	private String checkinDatetime;
	private String checkoutDatetime;
	private int totalNumber;
	private String accommodationPaymentCode;
	private int paymentAmount;
	private int usingPoint;
	private int totalPaymentPrice;
	private String paymentTerm;
	private String paymnetBank;
	private String paymentDate;
	private String companyName;
	public String getAccommodationReservationCode() {
		return accommodationReservationCode;
	}
	public void setAccommodationReservationCode(String accommodationReservationCode) {
		this.accommodationReservationCode = accommodationReservationCode;
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
	public String getAccommodationPaymentCode() {
		return accommodationPaymentCode;
	}
	public void setAccommodationPaymentCode(String accommodationPaymentCode) {
		this.accommodationPaymentCode = accommodationPaymentCode;
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
	public String getPaymentTerm() {
		return paymentTerm;
	}
	public void setPaymentTerm(String paymentTerm) {
		this.paymentTerm = paymentTerm;
	}
	public String getPaymnetBank() {
		return paymnetBank;
	}
	public void setPaymnetBank(String paymnetBank) {
		this.paymnetBank = paymnetBank;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "AccommodationReservationList [accommodationReservationCode=" + accommodationReservationCode + ", id="
				+ id + ", name=" + name + ", accommodationOption=" + accommodationOption + ", reservationDatetime="
				+ reservationDatetime + ", checkinDatetime=" + checkinDatetime + ", checkoutDatetime="
				+ checkoutDatetime + ", totalNumber=" + totalNumber + ", accommodationPaymentCode="
				+ accommodationPaymentCode + ", paymentAmount=" + paymentAmount + ", usingPoint=" + usingPoint
				+ ", totalPaymentPrice=" + totalPaymentPrice + ", paymentTerm=" + paymentTerm + ", paymnetBank="
				+ paymnetBank + ", paymentDate=" + paymentDate + ", companyName=" + companyName + "]";
	}
	
	
	
	
	
}
