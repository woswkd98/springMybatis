package Member.model;

import org.springframework.stereotype.Component;

@Component("memberVO")
public class MemberVO {
	String name;
	int age;
	public MemberVO() {}
	public MemberVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
