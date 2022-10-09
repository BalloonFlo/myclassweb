package 클래스사용하기;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class 파일다루기 {

	public static void main(String[] args) {
		String tt1 = JOptionPane.showInputDialog("오늘 날짜");
		String tt2 = JOptionPane.showInputDialog("오늘 제목");
		String tt3 = JOptionPane.showInputDialog("오늘 내용");

		// 자바프로그램 밖에 있는 자원들(네트워크, db프로그램, 파일, etc)을 연결할 때는 프로그램이 실행되지 못하는 위험한 상황으로 인식해서
		// 반드시 위험한 상황이 발생하면 어떻게 처리할지를 명시해주어야 한다.
		try {
			// file.txt와 자바프로그램 간 스트림(강물, 통로)를 만들어라.
			FileWriter file = new FileWriter(tt1 + ".text");
			// 스트림을 통해서 데이터를 보내라.
			file.write(tt1 + "\n"); // \n이면 엔터를 넣어준다.
			file.write(tt2 + "\n");
			file.write(tt3 + "\n");
			// 스트림이 닫힐 때 데이터를 다 보냈다고 인식.
			file.close();
		} catch (Exception e) {
			System.out.println("파일 저장 중 에러가 발생하였습니다.");
		}
	}

}
