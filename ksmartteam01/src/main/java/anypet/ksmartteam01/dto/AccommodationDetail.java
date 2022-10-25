package anypet.ksmartteam01.dto;

public class AccommodationDetail {
	
	private String accomodationDetailCode;
	private String goodsAccommodationOptionCode;
	private String regionCode;
	private String companyMemberCode;
	private String id;
	private String checkInout;
	private String parking;
	private String registrationDatetime;
	
	private AccommodationOption accommodationOption;
	private AccommodationCategory accommodationCategory;
	private CompanyMember companyMember;
	private Region region;
	
	public AccommodationOption getAccommodationOption() {
		return accommodationOption;
	}
	public void setAccommodationOption(AccommodationOption accommodationOption) {
		this.accommodationOption = accommodationOption;
	}
	public AccommodationCategory getAccommodationCategory() {
		return accommodationCategory;
	}
	public void setAccommodationCategory(AccommodationCategory accommodationCategory) {
		this.accommodationCategory = accommodationCategory;
	}
	public CompanyMember getCompanyMember() {
		return companyMember;
	}
	public void setCompanyMember(CompanyMember companyMember) {
		this.companyMember = companyMember;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	
	public String getAccomodationDetailCode() {
		return accomodationDetailCode;
	}
	public void setAccomodationDetailCode(String accomodationDetailCode) {
		this.accomodationDetailCode = accomodationDetailCode;
	}
	public String getGoodsAccommodationOptionCode() {
		return goodsAccommodationOptionCode;
	}
	public void setGoodsAccommodationOptionCode(String goodsAccommodationOptionCode) {
		this.goodsAccommodationOptionCode = goodsAccommodationOptionCode;
	}
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getCompanyMemberCode() {
		return companyMemberCode;
	}
	public void setCompanyMemberCode(String companyMemberCode) {
		this.companyMemberCode = companyMemberCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCheckInout() {
		return checkInout;
	}
	public void setCheckInout(String checkInout) {
		this.checkInout = checkInout;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getRegistrationDatetime() {
		return registrationDatetime;
	}
	public void setRegistrationDatetime(String registrationDatetime) {
		this.registrationDatetime = registrationDatetime;
	}
	@Override
	public String toString() {
		return "AccommodationDetail [accomodationDetailCode=" + accomodationDetailCode
				+ ", goodsAccommodationOptionCode=" + goodsAccommodationOptionCode + ", regionCode=" + regionCode
				+ ", companyMemberCode=" + companyMemberCode + ", id=" + id + ", checkInout=" + checkInout
				+ ", parking=" + parking + ", registrationDatetime=" + registrationDatetime + ", accommodationOption="
				+ accommodationOption + ", accommodationCategory=" + accommodationCategory + ", companyMember="
				+ companyMember + ", region=" + region + "]";
	}
	
}
