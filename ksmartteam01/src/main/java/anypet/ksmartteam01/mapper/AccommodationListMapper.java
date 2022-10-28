package anypet.ksmartteam01.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import anypet.ksmartteam01.dto.AccommodationCategory;
import anypet.ksmartteam01.dto.AccommodationList;
import anypet.ksmartteam01.dto.CompanyMember;
import anypet.ksmartteam01.dto.Region;

@Mapper
public interface AccommodationListMapper {
	public List<AccommodationList> getAccommodationList();
	
	public int addAccommodation(AccommodationList accommodationList);
	
	//카테고리목록조회
	public List<AccommodationCategory> getCategoryList();
	
	//지역목록조회
	public List<Region> getRegionList();

	//특정 회원 정보 조회
	public AccommodationList getAccommodationInfoByCode(String accommodationDetailCode);
	
	//회원정보수정
	public int updateAccommodationList(AccommodationList accommodationList);

	//업체회원목록조회
	public List<CompanyMember> getCompanyMember();

	//숙소삭제
	public int deleteAccommodationList(String accommodationDetailCode);

}
