package 상속;

public class 우먼 extends 사람 {

	String gender;
	String name;
	int size;
	
	public void 달리다() {
		System.out.println("빨리 달리다.");
	}

	@Override
	public String toString() {
		return "우먼 [gender=" + gender + ", name=" + name + ", size=" + size + "]";
	}
	
	
}
