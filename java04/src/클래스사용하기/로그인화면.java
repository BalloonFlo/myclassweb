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
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(227, 227, 255));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(128, 128, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\82105\\Downloads\\다이어리.png"));
		lblNewLabel.setBounds(12, 10, 460, 120);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBackground(new Color(128, 128, 255));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(63, 176, 104, 55);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setBackground(new Color(128, 128, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(63, 260, 104, 55);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBounds(179, 183, 275, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(179, 267, 275, 40);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				//id = "root", pw = "1234"이면 일기쓰는 화면을 띄우고 아니면 JOtionPane으로 "입력값이 달라서 로그인실패입니다."
				if(t11.equals("root") && t22.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 되었습니다.");
					//일기쓰기화면창을 띄워라.
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
				} else {
					JOptionPane.showMessageDialog(f, "다시 로그인해주세요.");
				}

			}
		});
		btnNewButton.setBackground(new Color(227, 227, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\82105\\Downloads\\iloveimg-resized (1)\\checkmark-ga2c570e4b_640.png"));
		btnNewButton.setBounds(298, 390, 60, 60);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//t1, t2의 글자를 지워지는 것처럼 공백을 넣으세요.
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setBackground(new Color(227, 227, 255));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\82105\\Downloads\\iloveimg-resized (1)\\panel-g8506d30de_640.png"));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(394, 390, 60, 60);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);

	}
}
