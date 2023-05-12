public class MemberDTO {
	private String name;
	private int age;
	private String phone;
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public void SetAge(int age) {
		this.age = age;
	}
	
	public void SetPhone(String phone) {
		this.phone = phone;
	}
	
	public String GetName() {
		return name;
	}
	
	public int GetAge() {
		return age;
	}
	
	public String GetPhone() {
		return phone;
	}

}
