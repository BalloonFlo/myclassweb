package 상속;

public class 원더우먼 extends 우먼 {
	
	String gender;
	String name;
	int size;
	
	public void 날아다니다() {
		System.out.println("하늘을 날다.");
	}

	@Override
	public String toString() {
		return "원더우먼 [gender=" + gender + ", name=" + name + ", size=" + size + "]";
	}
	
	

}
