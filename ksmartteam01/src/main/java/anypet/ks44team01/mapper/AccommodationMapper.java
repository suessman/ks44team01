package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.AccommodationCategory;



@Mapper
public interface AccommodationMapper{

	public List<AccommodationCategory> getAccommodationCategoryList();
}
