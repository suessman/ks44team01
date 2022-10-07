package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.GoodsInquiry;
import anypet.ks44team01.dto.GoodsList;

@Mapper
public interface GoodsMapper {

	
	
	//상품 목록 조회
	public List<GoodsList> getGoodsList();
	
	//상품 문의 목록
	public List<GoodsInquiry> getGoodsInquiryModify();
}
