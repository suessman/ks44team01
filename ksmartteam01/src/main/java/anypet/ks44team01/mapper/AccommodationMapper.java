package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.AccommodationDetail;
import anypet.ks44team01.dto.AccommodationInquiry;
import anypet.ks44team01.dto.AccommodationPayment;
import anypet.ks44team01.dto.AccommodationReservationList;
import anypet.ks44team01.dto.Member;



@Mapper
public interface AccommodationMapper{
	
	//1)숙소 결제취소내역 삭제
	public int removePaymentCancel(String accommodationPaymentCode);
	//2)숙소 리뷰내역 삭제
	public int removeReview(String accommodationPaymentCode);
	//3)숙소 결제내역 삭제
	public int removeAccommodationPayment(String accommodationPaymentCode);
	//4)숙소 예약내역 삭제
	public int removeReservation(String accommodationReservationCode);
	
	//숙소정보 조회
	public AccommodationDetail getAccommodationDetailInfo(String goodsAccommodationOptionCode);
	
	//예약자 조회
	public Member getReservaionMemberInfo(String memberId);
	
	//특정 결제내역 조회 
	public AccommodationPayment getAccommodationPayment(String accommodationReservationCode);

	//예약 목록
	public List<AccommodationReservationList> reservationList();
	
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
