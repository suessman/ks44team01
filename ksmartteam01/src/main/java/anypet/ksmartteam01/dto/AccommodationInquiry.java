package anypet.ksmartteam01.dto;

public class AccommodationInquiry {

	private String accommodationQnaNumber;
	private String companyName;
	private String inquiryId;
	private String titleName;
	private String datetime;
	private String answerId;
	private String answerDatetime;
	private String contents;
	private String answer;
	private String accommodationQnaSecret;
	private String accommodationQnaSecretPassword;
	public String getAccommodationQnaNumber() {
		return accommodationQnaNumber;
	}
	public void setAccommodationQnaNumber(String accommodationQnaNumber) {
		this.accommodationQnaNumber = accommodationQnaNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getInquiryId() {
		return inquiryId;
	}
	public void setInquiryId(String inquiryId) {
		this.inquiryId = inquiryId;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getAnswerId() {
		return answerId;
	}
	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	public String getAnswerDatetime() {
		return answerDatetime;
	}
	public void setAnswerDatetime(String answerDatetime) {
		this.answerDatetime = answerDatetime;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAccommodationQnaSecret() {
		return accommodationQnaSecret;
	}
	public void setAccommodationQnaSecret(String accommodationQnaSecret) {
		this.accommodationQnaSecret = accommodationQnaSecret;
	}
	public String getAccommodationQnaSecretPassword() {
		return accommodationQnaSecretPassword;
	}
	public void setAccommodationQnaSecretPassword(String accommodationQnaSecretPassword) {
		this.accommodationQnaSecretPassword = accommodationQnaSecretPassword;
	}
	
	@Override
	public String toString() {
		return "AccommodationInquiry [accommodationQnaNumber=" + accommodationQnaNumber + ", companyName=" + companyName
				+ ", inquiryId=" + inquiryId + ", titleName=" + titleName + ", datetime=" + datetime + ", answerId="
				+ answerId + ", answerDatetime=" + answerDatetime + ", contents=" + contents + ", answer=" + answer
				+ ", accommodationQnaSecret=" + accommodationQnaSecret + ", accommodationQnaSecretPassword="
				+ accommodationQnaSecretPassword + "]";
	}
	
}
