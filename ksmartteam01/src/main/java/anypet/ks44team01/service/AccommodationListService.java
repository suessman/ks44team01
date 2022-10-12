package anypet.ks44team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.AccommodationList;
import anypet.ks44team01.dto.CompanyMember;
import anypet.ks44team01.dto.Region;
import anypet.ks44team01.mapper.AccommodationListMapper;


@Service
@Transactional
public class AccommodationListService {
	private AccommodationListMapper accommodationListMapper;
	public AccommodationListService(AccommodationListMapper accommodationListMapper) {
		this.accommodationListMapper = accommodationListMapper;
	}
	
	//숙소목록
	public List<AccommodationList> getAccommodationList(){
		List<AccommodationList> accommodationList = accommodationListMapper.getAccommodationList();
		return accommodationList;
	}
	
	//카테고리목록조회
	public List<AccommodationCategory> getCategoryList(){
		List<AccommodationCategory> accommodationCategory = accommodationListMapper.getCategoryList();
		return accommodationCategory;
	}
	
	//지역목록조회
	public List<Region> getRegionList(){
		List<Region> region = accommodationListMapper.getRegionList();
		return region;
	}
	
	
	//업체회원조회
	public List<CompanyMember> getCompanyMember(){
		List<CompanyMember> companyMember = accommodationListMapper.getCompanyMember();
		
		return companyMember;
	}	
	
	
	//숙소등록
	public void addAccommodation(AccommodationList accommodationList) {
		accommodationListMapper.addAccommodation(accommodationList);	
	}
	
	//특정숙소의 정보 조회
	public AccommodationList getAccommodationInfoByCode(String accommodationDetailCode) {
		AccommodationList accommodationListInfo = accommodationListMapper.getAccommodationInfoByCode(accommodationDetailCode);
		return accommodationListInfo;
	}
	
	//숙소수정
	public void updateAccommodationList(AccommodationList accommodationList) {
		accommodationListMapper.updateAccommodationList(accommodationList);
	}
	
}
