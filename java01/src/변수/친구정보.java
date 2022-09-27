package 변수;

import javax.swing.JFrame;

public class 친구정보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 22;
		double height = 162.1;
		char gender = '여';
		
		System.out.println("나이는 " + age + "살입니다.");
		System.out.println("키는 " + height + "cm입니다.");
		System.out.println("성별은 " + gender + "자입니다.");
		
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setVisible(true);
	}

}
