package anypet.ks44team01.dto;

public class AccommodationInquiry {

	private String companyName;
	private String inquiryId;
	private String titleName;
	private String datetime;
	private String answerId;
	private String answerDatetime;
	private String contents;
	private String answer;
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
	
	@Override
	public String toString() {
		return "AccommodationInquiry [companyName=" + companyName + ", inquiryId=" + inquiryId + ", titleName="
				+ titleName + ", datetime=" + datetime + ", answerId=" + answerId + ", answerDatetime=" + answerDatetime
				+ ", contents=" + contents + ", answer=" + answer + "]";
	}
	
	
	
	
}
