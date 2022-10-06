package anypet.ks44team01.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.mapper.AccommodationMapper;

@Service
@Transactional
public class AccommodationService {

	private AccommodationMapper accommodationMapper;
	
	public AccommodationService(AccommodationMapper accommodationMapper) {
		this.accommodationMapper = accommodationMapper;
	}
	
	@PostConstruct
	public void accommodationService() {
		System.out.println("accommodationService bean 생성");
	}
	
	public List<AccommodationCategory> getAccomodationCategoryList(){
		
		List<AccommodationCategory> accommodationCategoryList = accommodationMapper.getAccommodationCategoryList();
		
		return accommodationCategoryList;
	}
	
}
