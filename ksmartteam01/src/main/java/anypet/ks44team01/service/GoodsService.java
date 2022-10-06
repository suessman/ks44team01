package anypet.ks44team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import anypet.ks44team01.dto.Goods;
import anypet.ks44team01.mapper.GoodsMapper;


@Service
@Transactional
public class GoodsService {
	
	private final GoodsMapper goodsMapper;
	
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;

	}
	

	//상품목록조회
	public List<Goods> getGoodsList(){
		List<Goods> goods = goodsMapper.getGoodsList();
		return goods;
	}
}
