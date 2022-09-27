package 변수;

public class 기본데이터 {

	public static void main(String[] args) {
		// 정수, 실수, 문자1, 논리
		// ram에 넣어보자.
		int age = 100; //정수(4, 21억)
		double height = 122.2; //실수(8)
		char gender = '남'; //문자1(2) =>''(싱글따옴표)
		boolean food = true; //논리(1) => true(1)/false(0)
		
		//기본데이터는 아닌데, 사람이 기본데이터처럼 너무 많이 써서
		// 사용도 기본데이터처럼 할 수 있는 특별한 부품. String
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 키는 " + height);
		System.out.println("나의 성별은 " + gender);
		System.out.println("내가 밥을 먹있는지 여부 " + food);
	}

}
