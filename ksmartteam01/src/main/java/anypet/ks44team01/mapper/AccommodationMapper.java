package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.AccommodationDetail;
import anypet.ks44team01.dto.AccommodationInquiry;
import anypet.ks44team01.dto.AccommodationPayment;
import anypet.ks44team01.dto.AccommodationPaymentCancel;
import anypet.ks44team01.dto.AccommodationReservationList;
import anypet.ks44team01.dto.Member;



@Mapper
public interface AccommodationMapper{
	

	//숙소 예약내역 삭제
	public int removeReservationList(AccommodationReservationList accommodationReservationCode);
	
	//숙소 관리자 결제 취소 -> accomodationPaymentCode
	public int adminPaymentCancel(AccommodationPaymentCancel accommodationPaymentCancel);
	
	//숙소 결제취소 승인
	public int updatePaymentCancel(AccommodationPaymentCancel accommodationPaymentCancelCode);
	
	//숙소정보 조회
	public AccommodationDetail getAccommodationDetailInfo(String goodsAccommodationOptionCode);
	
	//예약자 조회
	public Member getReservaionMemberInfo(String memberId);
	
	//특정 결제내역 조회 
	public AccommodationPayment getAccommodationPayment(String accommodationReservationCode);

	//예약 목록
	public List<AccommodationReservationList> reservationList();
	
	//문의목록 수정
	public int modifyInquiry(AccommodationInquiry accommodationInquiry);
	
	//문의목록 답변 조회
	public AccommodationInquiry inquiryAnswerSelect(String accommodationQnaNumber);
	
	//문의 목록 삭제
	public int removeInquiry(String accommodationQnaNumber);
	
	//문의 목록
	public List<AccommodationInquiry> inquiryList();
	
	//특정 카테고리 조회
	public AccommodationCategory getCategoryInfo(String accommodationCategoryCode);
	
	//카테고리 삭제
	public int removeCategory(String accommodationCategoryCode);
	
	//카테고리 수정
	public int updateCategory(AccommodationCategory accommodationCategory);

	//카테고리 등록
	public int insertCategory(AccommodationCategory accommodationCategory);
	
	//카테고리 목록
	public List<AccommodationCategory> categoryList();
}
