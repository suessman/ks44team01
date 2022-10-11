package anypet.ks44team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.AccommodationList;
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
	
	public List<AccommodationCategory> getCategoryList(){
		List<AccommodationCategory> accommodationCategory = accommodationListMapper.getCategoryList();
		return accommodationCategory;
	}
	
	public List<Region> getRegionList(){
		List<Region> region = accommodationListMapper.getRegionList();
		return region;
	}
	
	//숙소등록
	public void addAccommodation(AccommodationList accommodationList) {
		int result = accommodationListMapper.addAccommodation(accommodationList);
		System.out.println("회원가입 결과:" + result);
	}
}
