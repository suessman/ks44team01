package anypet.ks44team01.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ks44team01.mapper.GoodsMapper;

@Service
@Transactional
public class GoodsService {
	
	private final GoodsMapper goodsMapper;
	public GoodsService(GoodsMapper goodsMapper) {
		this.goodsMapper = goodsMapper;

	}
}
