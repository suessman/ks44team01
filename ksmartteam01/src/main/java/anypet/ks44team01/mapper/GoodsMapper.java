package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.GoodsCategory;
import anypet.ks44team01.dto.GoodsCategorySub;
import anypet.ks44team01.dto.GoodsInquiry;
import anypet.ks44team01.dto.GoodsList;

@Mapper
public interface GoodsMapper {

	
	
	//상품 목록 조회
	public List<GoodsList> getGoodsList();
	
	//상품 문의 목록
	public List<GoodsInquiry> getGoodsInquiryModify();
	
	//상품 대분류 목록
	public List<GoodsCategory> getGoodsCategory();
	
	//상품 중분류 목록
	public List<GoodsCategorySub> getGoodsCategorySub();

	public void goodsInsert(GoodsList goodsList);

	//상품 수정
	public int goodsModify(GoodsList goodsList);
	
	//특정 상품 조회
	public GoodsList getGoodsInfoByCode(String goodsCode);

	//상품 삭제
	public void goodsRemove(String goodsCode);
	
}
