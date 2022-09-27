package 연습;

public class 확인문제01 {

	public static void main(String[] args) {
		//1번 문제.
		char pw1 = 'p';
		char pw2 = 'q';
		if (pw1 == pw2) {
			System.out.println("PASS!");
		} else {
			System.out.println("재입력!");
		}
		
		//2번 문제.
		double change = 2.2;
		if (change > 2) {
			System.out.println("다이어트 성공!");
			
		//3번 문제.
		if (pw1 == pw2 && change > 2) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시 도전!");
		}
		//4번 문제.
		int a = 66;
		int m = 77;
		int i = 88;
		int k = 99;
		int add = a + m + i + k;
		//정수와 정수 계산은 무조건 정수이다.
		//계산결과가 실수가 나왔다하더라도 실수를 잘라서 정수로 만들어버린다.
		//double av = add / 4; (x) //82.0
		//둘 중 하나를 실수로 만들어라.
		double av = add / 4.0; //82.5
		System.out.println(av);
		
		//5번 문제.
		final double PI = 3.14; //변하지 않으니까 대문자, final
		//double p = 3.14;
		double r = 2.2;
		//double result = PI * r * r;
		//System.out.println(result);
		//System.out.println(PI * r * r);
		System.out.printf("%2f", PI * r * r);
		//다른 언어에 비해 연산자(기호) 수가 적다.
		//System.out.println(3 * 3); //함수를 사용한다.
		}
	}

}
