package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.AccommodationInquiry;



@Mapper
public interface AccommodationMapper{
	
	//문의 목록
	public List<AccommodationInquiry> getAccommodationInquiryList();
	
	//카테고리 목록
	public List<AccommodationCategory> getAccommodationCategoryList();
}
