package 복습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		//입력
		String com = JOptionPane.showInputDialog("통신사");
		String tel = JOptionPane.showInputDialog("전화번호");
		String name = JOptionPane.showInputDialog("이름");
		//처리. +결합연산자인 경우 하나라도 String이면 결과도 String
		String total = name + "님은 " + com + "에 " + tel;
		//출력
		JOptionPane.showMessageDialog(null, total + "로 가입되었습니다.");
	}

}

//기본 데이터: 정수, 실수, 문자1, 논리
//int x = 100;
//String name = "홍길동";
//참조 데이터: 부품, 배열, String
//=> 부품을 사용하는 방법
//1) 대문자로 바로 쓰는 경우
//2) new 새로 만들어 쓰는 경우
