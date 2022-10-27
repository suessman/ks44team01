package anypet.ksmartteam01.dto;

public class AccommodationCategory {
	
	private String accommodationCategoryCode;
	private String accommodationId;
	private String accommodationCategoryName;
	private String registrationDateTime;
	public String getAccommodationCategoryCode() {
		return accommodationCategoryCode;
	}
	public void setAccommodationCategoryCode(String accommodationCategoryCode) {
		this.accommodationCategoryCode = accommodationCategoryCode;
	}
	public String getAccommodationId() {
		return accommodationId;
	}
	public void setAccommodationId(String accommodationId) {
		this.accommodationId = accommodationId;
	}
	public String getAccommodationCategoryName() {
		return accommodationCategoryName;
	}
	public void setAccommodationCategoryName(String accommodationCategoryName) {
		this.accommodationCategoryName = accommodationCategoryName;
	}
	public String getRegistrationDateTime() {
		return registrationDateTime;
	}
	public void setRegistrationDateTime(String registrationDateTime) {
		this.registrationDateTime = registrationDateTime;
	}
	
	@Override
	public String toString() {
		return "Accommodation [accommodationCategoryCode=" + accommodationCategoryCode + ", accommodationId="
				+ accommodationId + ", accommodationCategoryName=" + accommodationCategoryName
				+ ", registrationDateTime=" + registrationDateTime + "]";
	}
	
	
	
}
