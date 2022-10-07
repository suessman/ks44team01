package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.AccommodationInquiry;
import anypet.ks44team01.dto.AccommodationReservationList;



@Mapper
public interface AccommodationMapper{
	
	//예약 목록
	public List<AccommodationReservationList> getAccommodationReservationList();
	
	//문의 목록
	public List<AccommodationInquiry> getAccommodationInquiryList();
	
	//카테고리 목록
	public List<AccommodationCategory> getAccommodationCategoryList();
}
