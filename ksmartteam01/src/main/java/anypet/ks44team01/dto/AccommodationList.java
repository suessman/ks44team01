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
	
	private AccommodationCategory accommodationCategoryDto;
	
	
	public AccommodationCategory getAccommodationCategoryDto() {
		return accommodationCategoryDto;
	}
	public void setAccommodationCategoryDto(AccommodationCategory accommodationCategoryDto) {
		this.accommodationCategoryDto = accommodationCategoryDto;
	}
	
	
	private Region regionDto;	
	
	public Region getRegionDto() {
		return regionDto;
	}
	public void setRegionDto(Region regionDto) {
		this.regionDto = regionDto;
	}
	
	private CompanyMember companyMemberDto;
	
	
	public CompanyMember getCompanyMemberDto() {
		return companyMemberDto;
	}
	public void setCompanyMemberDto(CompanyMember companyMemberDto) {
		this.companyMemberDto = companyMemberDto;
	}
	
	private AccommodationOption accommodationOptionDto;	
	
	

	public AccommodationOption getAccommodationOptionDto() {
		return accommodationOptionDto;
	}
	public void setAccommodationOptionDto(AccommodationOption accommodationOptionDto) {
		this.accommodationOptionDto = accommodationOptionDto;
	}


	private AccommodationSpecialPrice accommodationSpecialPriceDto;	
	

	public AccommodationSpecialPrice getAccommodationSpecialPriceDto() {
		return accommodationSpecialPriceDto;
	}
	public void setAccommodationSpecialPriceDto(AccommodationSpecialPrice accommodationSpecialPriceDto) {
		this.accommodationSpecialPriceDto = accommodationSpecialPriceDto;
	}
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
				+ ", accommodationCategoryDto=" + accommodationCategoryDto + ", getAccommodationCategoryDto()="
				+ getAccommodationCategoryDto() + ", getAccommodationDetailCode()=" + getAccommodationDetailCode()
				+ ", getAccommodationCategoryCode()=" + getAccommodationCategoryCode()
				+ ", getAccommodationRegionCode()=" + getAccommodationRegionCode() + ", getCompanyMemberCode()="
				+ getCompanyMemberCode() + ", getMemberId()=" + getMemberId() + ", getCheckInOut()=" + getCheckInOut()
				+ ", getParking()=" + getParking() + ", getRegistrationDateTime()=" + getRegistrationDateTime()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
