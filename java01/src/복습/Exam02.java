package 복습;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		//입력
		String height = JOptionPane.showInputDialog("키입력");
		//처리
		double height2 = Double.parseDouble(height); //실수
		//자바는 연산시 연산하는 데이터 중 하나라도 실수이면 결과는 무조건 실수이다.
		double result = (height2 - 100) * 0.9;
		//출력
		JOptionPane.showMessageDialog(null, "적정 몸무게는 " + result);
	}

}
