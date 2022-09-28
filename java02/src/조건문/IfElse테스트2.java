package 조건문;

public class IfElse테스트2 {

	public static void main(String[] args) {
		int jumsu = 88;
		// ctrl + shift + f: 코드정리
		// 변수 선언할 때, 변수기 생성.
		// result 안에는 쓰레기값이 들어있다.
		// 연산자도 안되고, 출력도 안된다.
		String result = ""; // 초기화
		// 변수를 선언할 때는 초기값을 넣자.
		// 조건이 맞으면 내용을 처리하고 break를 건다.
		// 아래의 조건을 실행하지 않는다.
		if (jumsu >= 90) {
			result = "A학점";
		} else if (jumsu >= 85 && jumsu < 90) {
			result = "B+학점";
		} else if (jumsu >= 80 && jumsu < 85) {
			result = "B-학점";
		} else if (jumsu >= 70) {
			result = "C학점";
		} else {
			result = "D학점";
		}

	}

}
