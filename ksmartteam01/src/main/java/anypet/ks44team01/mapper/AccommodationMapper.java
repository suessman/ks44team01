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
	
	//숙소정보 조회
	public AccommodationDetail getAccommodationDetailInfo(String goodsAccommodationOptionCode);
	
	//예약자 조회
	public Member getReservaionMemberInfo(String memberId);
	
	//특정 결제내역 조회 
	public AccommodationPayment getAccommodationPayment(String accommodationReservationCode);

	//예약 목록
	public List<AccommodationReservationList> getAccommodationReservationList();
	
	//문의 목록
	public List<AccommodationInquiry> getAccommodationInquiryList();
	
	//특정 카테고리 조회
	public AccommodationCategory getCategoryInfo(String accommodationCategoryCode);
	
	//카테고리 삭제
	public int deleteAccommodationCategory(String accommodationCategoryCode);
	
	//카테고리 수정
	public int modifyAccommodationCategory(AccommodationCategory accommodationCategory);

	//카테고리 등록
	public int addAccommodationCategory(AccommodationCategory accommodationCategory);
	
	//카테고리 목록
	public List<AccommodationCategory> getAccommodationCategoryList();
}
