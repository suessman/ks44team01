package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.goodsLargeCategory;

@Mapper
public interface GoodsMapper {

	public List<goodsLargeCategory> getGoodsLargeCategoryList();
}
