public class SetterGetterTest {
	public static void main(String[] args) {
		MemberDTO member = new MemberDTO();
			
		member.SetName("한종호");
		member.SetAge(44);
		member.SetPhone("010-6399-9899");
		
		System.out.println(member.GetName() + "\t" + member.GetAge() + "\t" + member.GetPhone());
	}

}
