public class SetterGetterTest {
	public static void main(String[] args) {
		MemberDTO member = new MemberDTO();
			
		member.SetName("한호호호");
		member.SetAge(44);
		member.SetPhone("010-1111-1111");
		
		System.out.println(member.GetName() + "\t" + member.GetAge() + "\t" + member.GetPhone());
	}

}
