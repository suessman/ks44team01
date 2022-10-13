package anypet.ks44team01.dto;

public class AccommodationPaymentCancel {
		
	private String accomodationPaymentCancelCode;
	private String accomodationPaymentNumber;
	private String id;
	private String accomodationPaymentCancelDatetime;
	private String accomodationPaymentCancelReason;
	private String accomodationPaymentCancelApproval;
	private String accomodationPaymentCancelApprovalDatetime;
	
	private AccommodationPayment accommodationPayment;
	private AccommodationReservationList accommodationReservationList;
	
	public String getAccomodationPaymentCancelCode() {
		return accomodationPaymentCancelCode;
	}
	public void setAccomodationPaymentCancelCode(String accomodationPaymentCancelCode) {
		this.accomodationPaymentCancelCode = accomodationPaymentCancelCode;
	}
	public String getAccomodationPaymentNumber() {
		return accomodationPaymentNumber;
	}
	public void setAccomodationPaymentNumber(String accomodationPaymentNumber) {
		this.accomodationPaymentNumber = accomodationPaymentNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccomodationPaymentCancelDatetime() {
		return accomodationPaymentCancelDatetime;
	}
	public void setAccomodationPaymentCancelDatetime(String accomodationPaymentCancelDatetime) {
		this.accomodationPaymentCancelDatetime = accomodationPaymentCancelDatetime;
	}
	public String getAccomodationPaymentCancelReason() {
		return accomodationPaymentCancelReason;
	}
	public void setAccomodationPaymentCancelReason(String accomodationPaymentCancelReason) {
		this.accomodationPaymentCancelReason = accomodationPaymentCancelReason;
	}
	public String getAccomodationPaymentCancelApproval() {
		return accomodationPaymentCancelApproval;
	}
	public void setAccomodationPaymentCancelApproval(String accomodationPaymentCancelApproval) {
		this.accomodationPaymentCancelApproval = accomodationPaymentCancelApproval;
	}
	public String getAccomodationPaymentCancelApprovalDatetime() {
		return accomodationPaymentCancelApprovalDatetime;
	}
	public void setAccomodationPaymentCancelApprovalDatetime(String accomodationPaymentCancelApprovalDatetime) {
		this.accomodationPaymentCancelApprovalDatetime = accomodationPaymentCancelApprovalDatetime;
	}
	public AccommodationPayment getAccommodationPayment() {
		return accommodationPayment;
	}
	public void setAccommodationPayment(AccommodationPayment accommodationPayment) {
		this.accommodationPayment = accommodationPayment;
	}
	public AccommodationReservationList getAccommodationReservationList() {
		return accommodationReservationList;
	}
	public void setAccommodationReservationList(AccommodationReservationList accommodationReservationList) {
		this.accommodationReservationList = accommodationReservationList;
	}
	@Override
	public String toString() {
		return "AccommodationPaymentCancel [accomodationPaymentCancelCode=" + accomodationPaymentCancelCode
				+ ", accomodationPaymentNumber=" + accomodationPaymentNumber + ", id=" + id
				+ ", accomodationPaymentCancelDatetime=" + accomodationPaymentCancelDatetime
				+ ", accomodationPaymentCancelReason=" + accomodationPaymentCancelReason
				+ ", accomodationPaymentCancelApproval=" + accomodationPaymentCancelApproval
				+ ", accomodationPaymentCancelApprovalDatetime=" + accomodationPaymentCancelApprovalDatetime
				+ ", accommodationPayment=" + accommodationPayment + ", accommodationReservationList="
				+ accommodationReservationList + "]";
	}
	
}
