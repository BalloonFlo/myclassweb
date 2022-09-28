package 연습;

public class 조건문확인문제 {

	public static void main(String[] args) {
		//1번문제.
		System.out.println("암호를 대시오.");
		String pw = "pass";
		String pw1 = "";
		
		if (pw.equals(pw1)) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
		
		//3번문제.
		System.out.println("당신이 먹고 싶은 점심 메뉴는?(짜장면, 라면, 회)");
		String text = "";
		
		if (text.equals("짜장면")) {
			System.out.println("중국집으로 가요.");
		} else if (text.equals("라면")) {
			System.out.println("분식집으로 가요.");
		} else if (text.equals("회")) {
			System.out.println("횟집으로 가요.");
		} else {
			System.out.println("그냥 안먹어요.");
		}
	}

}
