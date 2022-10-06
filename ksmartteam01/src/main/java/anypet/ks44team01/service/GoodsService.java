package anypet.ks44team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ks44team01.dto.GoodsLargeCategory;
import anypet.ks44team01.mapper.GoodsMapper;

@Service
@Transactional
public class GoodsService {
	
	private final GoodsMapper goodsMapper;
	
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;

	}
	
	//상품대분류카테고리목록조회
	public List<GoodsLargeCategory> getGoodsList(){
		List<GoodsLargeCategory> goodsList = goodsMapper.getGoodsLargeCategoryList();
		return goodsList;
	}
}
