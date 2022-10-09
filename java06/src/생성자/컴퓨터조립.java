package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(10000, "APLLE", 30);
		컴퓨터 com2 = new 컴퓨터(20000, "BANANA", 20);
		//com1은 주소가 들어있다.
		//컴퓨터 클래스에 toString()을 메서드를 생성해주면
		System.out.println(com1);
		System.out.println(com2);
	}

}
