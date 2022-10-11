package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.GoodsLargeCategory;
import anypet.ks44team01.dto.GoodsMediumCategory;

@Mapper
public interface GoodsMapperOsj {
	
	//Mybatis 매핑XML에 기재된 SQL을 호출하기 위한 인터페이스이다. Mybatis3.0부터 생겼다.
	//Mapper -> dao 역할

	/*
	*database의 data에 접근하기 위한 객체 
	* 데이터베이스 접근을 하기 위한 로직과 비지니스 로직을 분리하기 위해 사용
	* 
	* */

	//상품대분류목록조회
	public List<GoodsLargeCategory> getGoodsLargeCategoryList();
	//상품대분류등록
	public int goodsLargeCategoryInsert(GoodsLargeCategory goodsLargeCategory);
	
	//상품중분류목록조회
	public List<GoodsMediumCategory> getGoodsMediumCategoryList();
	//상품중분류등록
	public int goodsMediumCategoryInsert(GoodsMediumCategory goodsMediumCategory);
}
