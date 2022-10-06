package anypet.ks44team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ks44team01.dto.AccommodationList;
import anypet.ks44team01.mapper.AccommodationListMapper;

@Service
@Transactional
public class AccommodationListService {
	private AccommodationListMapper accommodationListMapper;
	public AccommodationListService(AccommodationListMapper accommodationListMapper) {
		this.accommodationListMapper = accommodationListMapper;
	}
	
	public List<AccommodationList> getAccommodationList(){
		List<AccommodationList> accommodationList = accommodationListMapper.getAccommodationList();
		return accommodationList;
	}
}
