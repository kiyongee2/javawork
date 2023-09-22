package collection.member;

//VO(Value Object) - 자료형으로 사용
public class Member {
	//필드
	private int memberId;   //회원 아이디
	private String memberName; //회원 이름
	
	//생성자
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	//메서드(getter/setter)
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public int getMemberid() {
		return memberId;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return memberName;
	}

	@Override
	public String toString() {
		return memberId + ":" + memberName;
	}
}
