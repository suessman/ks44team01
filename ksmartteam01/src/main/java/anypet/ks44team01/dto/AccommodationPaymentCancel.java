package anypet.ks44team01.dto;

public class AccommodationPaymentCancel {
		
	private String accommodationPaymentCancelCode;
	private String accommodationPaymentCode;
	private String id;
	private String accommodationPaymentCancelDatetime;
	private String accommodationPaymentCancelReason;
	private String accommodationPaymentCancelApproval;
	private String accommodationPaymentCancelApprovalDatetime;

	private AccommodationPayment accommodationPayment;
	private AccommodationReservationList accommodationReservationList;
	public String getAccommodationPaymentCancelCode() {
		return accommodationPaymentCancelCode;
	}
	public void setAccommodationPaymentCancelCode(String accommodationPaymentCancelCode) {
		this.accommodationPaymentCancelCode = accommodationPaymentCancelCode;
	}
	public String getAccommodationPaymentCode() {
		return accommodationPaymentCode;
	}
	public void setAccommodationPaymentCode(String accommodationPaymentCode) {
		this.accommodationPaymentCode = accommodationPaymentCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccommodationPaymentCancelDatetime() {
		return accommodationPaymentCancelDatetime;
	}
	public void setAccommodationPaymentCancelDatetime(String accommodationPaymentCancelDatetime) {
		this.accommodationPaymentCancelDatetime = accommodationPaymentCancelDatetime;
	}
	public String getAccommodationPaymentCancelReason() {
		return accommodationPaymentCancelReason;
	}
	public void setAccommodationPaymentCancelReason(String accommodationPaymentCancelReason) {
		this.accommodationPaymentCancelReason = accommodationPaymentCancelReason;
	}
	public String getAccommodationPaymentCancelApproval() {
		return accommodationPaymentCancelApproval;
	}
	public void setAccommodationPaymentCancelApproval(String accommodationPaymentCancelApproval) {
		this.accommodationPaymentCancelApproval = accommodationPaymentCancelApproval;
	}
	public String getAccommodationPaymentCancelApprovalDatetime() {
		return accommodationPaymentCancelApprovalDatetime;
	}
	public void setAccommodationPaymentCancelApprovalDatetime(String accommodationPaymentCancelApprovalDatetime) {
		this.accommodationPaymentCancelApprovalDatetime = accommodationPaymentCancelApprovalDatetime;
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
		return "AccommodationPaymentCancel [accommodationPaymentCancelCode=" + accommodationPaymentCancelCode
				+ ", accommodationPaymentCode=" + accommodationPaymentCode + ", id=" + id
				+ ", accommodationPaymentCancelDatetime=" + accommodationPaymentCancelDatetime
				+ ", accommodationPaymentCancelReason=" + accommodationPaymentCancelReason
				+ ", accommodationPaymentCancelApproval=" + accommodationPaymentCancelApproval
				+ ", accommodationPaymentCancelApprovalDatetime=" + accommodationPaymentCancelApprovalDatetime
				+ ", accommodationPayment=" + accommodationPayment + ", accommodationReservationList="
				+ accommodationReservationList + "]";
	}
	
	
	
}
