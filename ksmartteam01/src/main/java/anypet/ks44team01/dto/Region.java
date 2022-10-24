package anypet.ks44team01.dto;

public class Region {
	
	private String regionCode;
	private String regionId;
	private String regionName;
	private String registrationDateTime;
	public String getRegionCode() {
		return regionCode;
	}
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getRegistrationDateTime() {
		return registrationDateTime;
	}
	public void setRegistrationDateTime(String registrationDateTime) {
		this.registrationDateTime = registrationDateTime;
	}
	@Override
	public String toString() {
		return "region [regionCode=" + regionCode + ", regionId=" + regionId + ", regionName=" + regionName
				+ ", registrationDateTime=" + registrationDateTime + ", getRegionCode()=" + getRegionCode()
				+ ", getRegionId()=" + getRegionId() + ", getRegionName()=" + getRegionName()
				+ ", getRegistrationDateTime()=" + getRegistrationDateTime() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
