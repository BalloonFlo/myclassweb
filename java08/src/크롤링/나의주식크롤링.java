package 크롤링;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class 나의주식크롤링 {
	private static JTextField textField;
	static JTextArea textArea;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 255));
		f.setSize(500, 700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODE : ");
		lblNewLabel.setFont(new Font("한컴 고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(51, 256, 114, 59);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("한컴 고딕", Font.BOLD, 18));
		textField.setBounds(166, 268, 263, 36);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBackground(new Color(230, 230, 230));
		textArea.setForeground(new Color(0, 128, 255));
		textArea.setFont(new Font("한컴 고딕", Font.BOLD, 20));
		textArea.setBounds(51, 364, 378, 255);
		f.getContentPane().add(textArea);
		
		JButton btnNewButton_2 = new JButton("크롤링시작");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//입력한 code를 가지고 오기
				//textField에 입력한 것
				String code = textField.getText(); //035420
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver(code);
				textArea.setText(result);
				
			}
		});
		btnNewButton_2.setBackground(new Color(190, 190, 190));
		btnNewButton_2.setFont(new Font("한컴 고딕", Font.BOLD, 12));
		btnNewButton_2.setBounds(334, 316, 95, 23);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("LG전자");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("005930");
				textArea.setText(result);
				
			}
		});
		btnNewButton.setBackground(new Color(190, 190, 190));
		btnNewButton.setFont(new Font("한컴 고딕", Font.BOLD, 25));
		btnNewButton.setBounds(51, 47, 378, 46);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("삼성전자");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//code를 주면서, 크롤링해달라고 한다.
				//크롤링연습6의 naver(code)호출
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("066570");
				textArea.setText(result);
			}
		});
		btnNewButton_1.setBackground(new Color(190, 190, 190));
		btnNewButton_1.setFont(new Font("한컴 고딕", Font.BOLD, 25));
		btnNewButton_1.setBounds(51, 108, 378, 46);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("카카오");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("035720");
				textArea.setText(result);
			}
		});
		btnNewButton_1_1.setBackground(new Color(190, 190, 190));
		btnNewButton_1_1.setFont(new Font("한컴 고딕", Font.BOLD, 25));
		btnNewButton_1_1.setBounds(51, 172, 378, 46);
		f.getContentPane().add(btnNewButton_1_1);
		

		

		
		
		
		f.setVisible(true);
	}
}
