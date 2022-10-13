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
	
	public List<Member> getMemberList(){
		List<Member> member = memberMapper.getMemberList();
		return member;
	}
	public Member getMemberInfoById(String memberId){
		Member member = memberMapper.getMemberInfoById(memberId);
		return member;
	}
	/*
	 * public void modifyMember(String memberId) {
	 * memberMapper.modifyMember(memberId);
	 * 
	 * }
	 */
}
