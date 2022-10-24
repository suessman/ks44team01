package anypet.ks44team01.dto;

public class AccommodationPayment {

	private String accommodationPaymentCode;
	private String accommodationReservationCode;
	private String personalMemberCode;
	private String id;
	private String accommodationPaymentTerm;
	private String accommodationPaymentDate;
	private String accommodationMothlyPayment;
	private String accommodationPaymentBank;
	private int purchasedPoint;
	
	private AccommodationReservationList accommodationReservationList;
	
	public AccommodationReservationList getAccommodationReservationList() {
		return accommodationReservationList;
	}
	public void setAccommodationReservationList(AccommodationReservationList accommodationReservationList) {
		this.accommodationReservationList = accommodationReservationList;
	}
	public String getaccommodationPaymentCode() {
		return accommodationPaymentCode;
	}
	public void setaccommodationPaymentCode(String accommodationPaymentCode) {
		this.accommodationPaymentCode = accommodationPaymentCode;
	}
	public String getaccommodationReservationCode() {
		return accommodationReservationCode;
	}
	public void setaccommodationReservationCode(String accommodationReservationCode) {
		this.accommodationReservationCode = accommodationReservationCode;
	}
	public String getPersonalMemberCode() {
		return personalMemberCode;
	}
	public void setPersonalMemberCode(String personalMemberCode) {
		this.personalMemberCode = personalMemberCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getaccommodationPaymentTerm() {
		return accommodationPaymentTerm;
	}
	public void setaccommodationPaymentTerm(String accommodationPaymentTerm) {
		this.accommodationPaymentTerm = accommodationPaymentTerm;
	}
	public String getaccommodationPaymentDate() {
		return accommodationPaymentDate;
	}
	public void setaccommodationPaymentDate(String accommodationPaymentDate) {
		this.accommodationPaymentDate = accommodationPaymentDate;
	}
	public String getaccommodationMothlyPayment() {
		return accommodationMothlyPayment;
	}
	public void setaccommodationMothlyPayment(String accommodationMothlyPayment) {
		this.accommodationMothlyPayment = accommodationMothlyPayment;
	}
	public String getaccommodationPaymentBank() {
		return accommodationPaymentBank;
	}
	public void setaccommodationPaymentBank(String accommodationPaymentBank) {
		this.accommodationPaymentBank = accommodationPaymentBank;
	}
	public int getPurchasedPoint() {
		return purchasedPoint;
	}
	public void setPurchasedPoint(int purchasedPoint) {
		this.purchasedPoint = purchasedPoint;
	}
	
	@Override
	public String toString() {
		return "AccommodationPayment [accommodationPaymentCode=" + accommodationPaymentCode
				+ ", accommodationReservationCode=" + accommodationReservationCode + ", personalMemberCode="
				+ personalMemberCode + ", id=" + id + ", accommodationPaymentTerm=" + accommodationPaymentTerm
				+ ", accommodationPaymentDate=" + accommodationPaymentDate + ", accommodationMothlyPayment="
				+ accommodationMothlyPayment + ", accommodationPaymentBank=" + accommodationPaymentBank
				+ ", purchasedPoint=" + purchasedPoint + ", accommodationReservationList="
				+ accommodationReservationList + "]";
	}
	
}
