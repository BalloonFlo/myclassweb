package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		//입력
		String agency = JOptionPane.showInputDialog("통신사를 입력하세요.");
		String tel = JOptionPane.showInputDialog("전화번호를 입력해주세요.");
		String user = JOptionPane.showInputDialog("가입자 이름을 입력해주세요.");
		
		
		//String agency = "skt";
		//String tel = "010-1111-2222";
		//String user = "홍길동";
		
		JOptionPane.showMessageDialog(null, user + "님은 " + agency + "에 " + tel + "로 가입되셨습니다.");
	}

}
