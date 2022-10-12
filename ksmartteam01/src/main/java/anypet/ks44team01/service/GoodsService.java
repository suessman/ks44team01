package anypet.ks44team01.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import anypet.ks44team01.dto.GoodsList;
import anypet.ks44team01.dto.GoodsCategory;
import anypet.ks44team01.dto.GoodsCategorySub;
import anypet.ks44team01.dto.GoodsInquiry;
import anypet.ks44team01.mapper.GoodsMapper;

@Service
@Transactional
public class GoodsService {
	
	
	public static final Logger log = LoggerFactory.getLogger(GoodsService.class);

	@Autowired
	private final GoodsMapper goodsMapper;
	
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;

	}
	

	//상품목록조회
	public List<GoodsList> getGoodsList(){
		List<GoodsList> goodsList = goodsMapper.getGoodsList();
		return goodsList;
	}
	
	//상품문의목록
	public List<GoodsInquiry> getGoodsInquiryModify(){
		List<GoodsInquiry> GoodsInquiryModify = goodsMapper.getGoodsInquiryModify();
		return GoodsInquiryModify;
	}
	
	//카테고리 대분류 조회
	public List<GoodsCategory> getGoodsCategory(){
		List<GoodsCategory> goodsCategory = goodsMapper.getGoodsCategory();
		return goodsCategory;
	}
	
	//카테고리 대분류 조회
	public List<GoodsCategorySub> getGoodsCategorySub(){
		List<GoodsCategorySub> goodsCategorySub = goodsMapper.getGoodsCategorySub();
		return goodsCategorySub;
	}

	//상품등록	
	public void goodsInsert(GoodsList goodsList) {
		log.info("상품등록 전 goodsList ::: {}" , goodsList);		
		goodsMapper.goodsInsert(goodsList);
		log.info("상품등록 후 goodsList ::: {}" , goodsList);
		
	}
	
	 //특정상품 조회
	public GoodsList getGoodsInfoByCode(String goodsCode) {
		GoodsList goodsList = goodsMapper.getGoodsInfoByCode(goodsCode);
		return goodsList; 
	}
		
	
	//상품 수정
	public void goodsModify(GoodsList goodsList) {
		goodsMapper.goodsModify(goodsList);
	}
	
	
}
