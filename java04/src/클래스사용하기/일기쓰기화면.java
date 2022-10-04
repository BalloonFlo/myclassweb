package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기쓰기화면 {
	//멤버변수
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	
	//멤버메서드
	public void open() {
//	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(227, 227, 255));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("오늘 날짜");
		lblNewLabel_1.setBackground(new Color(128, 128, 255));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(60, 10, 104, 55);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("오늘 제목");
		lblNewLabel_1_1.setBackground(new Color(128, 128, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(60, 94, 104, 55);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBounds(176, 17, 275, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(176, 101, 275, 40);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("오늘 내용");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBackground(new Color(128, 128, 255));
		lblNewLabel_1_1_1.setBounds(60, 185, 104, 55);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(176, 192, 275, 201);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tt1 = t1.getText();
				String tt2 = t2.getText();
				String tt3 = t3.getText();

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
				} catch (Exception e1) {
					System.out.println("파일 저장 중 에러가 발생하였습니다.");
				}
				JOptionPane.showMessageDialog(f, "저장되었습니다.");
			}
		});
		btnNewButton.setBackground(new Color(179, 179, 255));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 12));
		btnNewButton.setBounds(310, 420, 141, 31);
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);

	}
}
