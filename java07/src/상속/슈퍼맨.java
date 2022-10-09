package 상속;

public class 슈퍼맨 extends 맨 {
	//멤버변수 3개
	//멤버메서드 3개 --> 4개
	String gender;
	String name;
	int size;
	
	public void 날아다니다() {
		System.out.println("하늘을 날다.");
	}

	@Override
	public String toString() {
		return "슈퍼맨 [gender=" + gender + ", name=" + name + ", size=" + size + "]";
	}
	
	
}
