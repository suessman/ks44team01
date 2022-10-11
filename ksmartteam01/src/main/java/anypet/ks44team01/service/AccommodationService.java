package anypet.ks44team01.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ks44team01.dto.AccommodationCategory;
import anypet.ks44team01.dto.AccommodationInquiry;
import anypet.ks44team01.dto.AccommodationPayment;
import anypet.ks44team01.dto.AccommodationReservationList;
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
	
	
	//특정 결제내역 조회 
	public AccommodationPayment getAccommodationPayment(String accommodationReservationCode) {
	 
		AccommodationPayment accommodationPayment = accommodationMapper.getAccommodationPayment(accommodationReservationCode);
	 
		return accommodationPayment; 
	}
	
	
	//예약내역 목록
	public List<AccommodationReservationList> getAccommodationReservationList(){
		
		List<AccommodationReservationList> accommodationReservationList = accommodationMapper.getAccommodationReservationList();
		
		return accommodationReservationList;
	}

	//문의 목록
	public List<AccommodationInquiry> getAccommodationInquiryList(){
		
		List<AccommodationInquiry> accommodationInquiryList = accommodationMapper.getAccommodationInquiryList();
		
		return accommodationInquiryList;
		
	}
	
	//특정 카테고리 조회
	public AccommodationCategory getCategoryInfo(String accommodationCategoryCode) {
		
		AccommodationCategory accommodationCategory = accommodationMapper.getCategoryInfo(accommodationCategoryCode);
		
		return accommodationCategory;	
	}
	
	//카테고리 삭제
	public int deleteAccommodationCategory(String accommodationCategoryCode) {
		
		int result = accommodationMapper.deleteAccommodationCategory(accommodationCategoryCode);
		
		return result;
	}
	
	//카테고리 수정
	public void modifyAccommodationCategory(AccommodationCategory accommodationCategory) {
		
		accommodationMapper.modifyAccommodationCategory(accommodationCategory);
		
		System.out.println("카테고리 수정: " + accommodationCategory);
	}
	
	//카테고리 등록
	public void addAccommodationCategory(AccommodationCategory accommodationCategory){
		
		accommodationMapper.addAccommodationCategory(accommodationCategory);
		
		System.out.println("카테고리 등록: " + accommodationCategory);
	}
	
	//카테고리 목록
	public List<AccommodationCategory> getAccomodationCategoryList(){
		
		List<AccommodationCategory> accommodationCategoryList = accommodationMapper.getAccommodationCategoryList();
		
		return accommodationCategoryList;
	}
	
}
