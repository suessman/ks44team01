package anypet.ks44team01.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import anypet.ks44team01.dto.Member;

@Mapper
public interface MemberMapper {
	//회원목록 조회
	public List<Member> getMemberList();
	//특정회원 조회
	public Member getMemberInfoById(String memberId);
	//특정 회원 정보 수정
	public Member modifyMember(String memberId);
	
	
}
