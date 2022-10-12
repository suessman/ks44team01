package anypet.ks44team01.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.AccommodationList;
import anypet.ks44team01.dto.CompanyMember;
import anypet.ks44team01.dto.Region;

@Mapper
public interface AccommodationListMapper {
	public List<AccommodationList> getAccommodationList();
	
	public int addAccommodation(AccommodationList accommodationList);
	
	//카테고리목록조회
	public List<AccommodationCategory> getCategoryList();
	
	//지역목록조회
	public List<Region> getRegionList();
	
	//업체회원목록조회
	public List<CompanyMember> getCompanyMember();
}
