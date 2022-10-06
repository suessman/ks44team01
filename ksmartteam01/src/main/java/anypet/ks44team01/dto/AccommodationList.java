package anypet.ks44team01.dto;

public class AccommodationList {
	private String accommodationDetailCode;
	private String accommodationCategoryCode;
	private String accommodationRegionCode;
	private String companyMemberCode;
	private String memberId;
	private String checkInOut;
	private String parking;
	private String registrationDateTime;
	public String getAccommodationDetailCode() {
		return accommodationDetailCode;
	}
	public void setAccommodationDetailCode(String accommodationDetailCode) {
		this.accommodationDetailCode = accommodationDetailCode;
	}
	public String getAccommodationCategoryCode() {
		return accommodationCategoryCode;
	}
	public void setAccommodationCategoryCode(String accommodationCategoryCode) {
		this.accommodationCategoryCode = accommodationCategoryCode;
	}
	public String getAccommodationRegionCode() {
		return accommodationRegionCode;
	}
	public void setAccommodationRegionCode(String accommodationRegionCode) {
		this.accommodationRegionCode = accommodationRegionCode;
	}
	public String getCompanyMemberCode() {
		return companyMemberCode;
	}
	public void setCompanyMemberCode(String companyMemberCode) {
		this.companyMemberCode = companyMemberCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getCheckInOut() {
		return checkInOut;
	}
	public void setCheckInOut(String checkInOut) {
		this.checkInOut = checkInOut;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getRegistrationDateTime() {
		return registrationDateTime;
	}
	public void setRegistrationDateTime(String registrationDateTime) {
		this.registrationDateTime = registrationDateTime;
	}
	@Override
	public String toString() {
		return "AccommodationList [accommodationDetailCode=" + accommodationDetailCode + ", accommodationCategoryCode="
				+ accommodationCategoryCode + ", accommodationRegionCode=" + accommodationRegionCode
				+ ", companyMemberCode=" + companyMemberCode + ", memberId=" + memberId + ", checkInOut=" + checkInOut
				+ ", parking=" + parking + ", registrationDateTime=" + registrationDateTime
				+ ", getAccommodationDetailCode()=" + getAccommodationDetailCode() + ", getAccommodationCategoryCode()="
				+ getAccommodationCategoryCode() + ", getAccommodationRegionCode()=" + getAccommodationRegionCode()
				+ ", getCompanyMemberCode()=" + getCompanyMemberCode() + ", getMemberId()=" + getMemberId()
				+ ", getCheckInOut()=" + getCheckInOut() + ", getParking()=" + getParking()
				+ ", getRegistrationDateTime()=" + getRegistrationDateTime() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
