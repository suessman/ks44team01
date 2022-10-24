package anypet.ks44team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anypet.ks44team01.dto.Member;
import anypet.ks44team01.mapper.MemberMapper;

@Service
@Transactional
public class MemberService {
	private MemberMapper memberMapper;
	public MemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	//회원목록
	public List<Member> getMemberList(){
		List<Member> member = memberMapper.getMemberList();
		return member;
	}
	//회원정보
	public Member getMemberInfoById(String memberId){
		Member member = memberMapper.getMemberInfoById(memberId);
		return member;
	}
	//회원목록수정
	  public void modifyMember(Member member) {
	  
		  memberMapper.modifyMember(member);
	  }
	  public int removeMember(String member) {
		  int result = memberMapper.removeMember(member);
		  return result;
	  }

	/*
	 * public void modifyMember(Member member) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	
	 
}
