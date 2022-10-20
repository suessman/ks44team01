package anypet.ks44team01.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.GoodsLargeCategory;
import anypet.ks44team01.dto.GoodsMediumCategory;
import anypet.ks44team01.dto.GoodsOrder;
import anypet.ks44team01.dto.GoodsOrderDetail;
import anypet.ks44team01.dto.Member;

@Mapper
public interface GoodsMapperOsj {
	
	//Mybatis 매핑XML에 기재된 SQL을 호출하기 위한 인터페이스이다. Mybatis3.0부터 생겼다.
	//Mapper -> dao 역할

	/*
	*database의 data에 접근하기 위한 객체 
	* 데이터베이스 접근을 하기 위한 로직과 비지니스 로직을 분리하기 위해 사용
	* 
	* */
	
	//사용자
	//상품 결제/주문정보 입력
	public int goodsPaymentInfoInsert(GoodsOrder goodsOrder);
	//상품 결제페이지 배송지 조회를 위한 특정회원 정보 조회
	public Member getMemberInfoById(String memberId);
	//상품 결제페이지 특정회원의 아이디와 주문 상세 조회
	public List<Map<String,Object>> getGoodsOrderDetailByIdAndDatetime(String memberId, String orderRegisterTime);
	//장바구니 조회
	public List<Map<String,Object>> getCartById(String memberId);
	//장바구니->주문상세에 입력
	public int goodsOrderDetailInsert(GoodsOrderDetail goodsOrderDetail);
	//장바구니 수량수정
	//public int modifyCartCount(GoodsOrderDetail goodsOrderDetail);
	
	//관리자 
	//상품대분류목록조회
	public List<GoodsLargeCategory> getGoodsLargeCategoryList();
	//상품대분류등록
	public int goodsLargeCategoryInsert(GoodsLargeCategory goodsLargeCategory);
	//상품대분류수정
	public int goodsLargeCategoryModify(GoodsLargeCategory goodsLargeCategory);
	//특정대분류정보조회
	public GoodsLargeCategory getLargeCategoryInfoByCategoryCode(String categoryCode);
	
	
	//상품중분류목록조회
	public List<GoodsMediumCategory> getGoodsMediumCategoryList();
	//상품중분류등록
	public int goodsMediumCategoryInsert(GoodsMediumCategory goodsMediumCategory);
	//상품중분류수정
	public int goodsMediumCategoryModify(GoodsMediumCategory goodsMediumCategory);
	//특정중분류정보조회
	public GoodsMediumCategory getMediumCategoryInfoByCategoryCodeSub(String categoryCodeSub);
}
