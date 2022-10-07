package anypet.ks44team01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import anypet.ks44team01.dto.GoodsList;
import anypet.ks44team01.dto.GoodsInquiry;
import anypet.ks44team01.mapper.GoodsMapper;


@Service
@Transactional
public class GoodsService {
	
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
}
