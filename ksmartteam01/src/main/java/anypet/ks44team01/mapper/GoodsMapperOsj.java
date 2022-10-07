package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.GoodsLargeCategory;
import anypet.ks44team01.dto.GoodsMediumCategory;

@Mapper
public interface GoodsMapperOsj {

	public List<GoodsLargeCategory> getGoodsLargeCategoryList();
	
	public List<GoodsMediumCategory> getGoodsMediumCategoryList();
}
