package 연습;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class 조건문확인문제 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 255));
		f.setSize(500,700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 25));
		lblNewLabel.setBounds(41, 98, 177, 50);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("먹고 싶은 음식");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.BOLD, 25));
		lblNewLabel_1.setBounds(41, 262, 177, 50);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setFont(new Font("나눔고딕", Font.BOLD, 25));
		lblNewLabel_2.setBounds(41, 431, 177, 50);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("수학 점수");
		lblNewLabel_2_1.setFont(new Font("나눔고딕", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(41, 491, 177, 50);
		f.getContentPane().add(lblNewLabel_2_1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 242, 254));
		t1.setBounds(212, 98, 234, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 242, 254));
		t2.setColumns(10);
		t2.setBounds(212, 262, 234, 50);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(new Color(255, 242, 254));
		t3.setColumns(10);
		t3.setBounds(212, 431, 234, 50);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(new Color(255, 242, 254));
		t4.setColumns(10);
		t4.setBounds(212, 491, 234, 50);
		f.getContentPane().add(t4);
		
		JButton b1 = new JButton("어디로 갈까?");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String r1 = t1.getText();
				if (r1.equals("아메리카노")) {
					JOptionPane.showMessageDialog(null, "카페 가세요.");
				} else {
					JOptionPane.showMessageDialog(null, "물 마시세요.");
				}
				
			}
		});
		b1.setForeground(new Color(255, 255, 255));
		b1.setBackground(new Color(128, 128, 191));
		b1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		b1.setBounds(281, 158, 165, 41);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("나의 내년 나이는?");
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String r2 = t2.getText();
				int age = Integer.parseInt(r2);
				int age2 = age + 1;
				JOptionPane.showMessageDialog(null, "내년 나이는 " + age2 + "입니다.");
			}
		});
		b2.setForeground(new Color(255, 255, 255));
		b2.setBackground(new Color(128, 128, 191));
		b2.setFont(new Font("나눔고딕", Font.BOLD, 20));
		b2.setBounds(232, 322, 214, 41);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("두 과목 점수의 평균은?");
				b3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String r3 = t3.getText();
						String r4 = t4.getText();
						int s1 = Integer.parseInt(r3);
						int s2 = Integer.parseInt(r4);
						
						double av = (s1 + s2) / 2.0;
						JOptionPane.showMessageDialog(f, av + "점");
			}
		});
		b3.setForeground(new Color(255, 255, 255));
		b3.setBackground(new Color(128, 128, 191));
		b3.setFont(new Font("나눔고딕", Font.BOLD, 20));
		b3.setBounds(200, 551, 246, 41);
		f.getContentPane().add(b3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\82105\\Downloads\\whale-g898bada46_640.jpg"));
		btnNewButton_2.setBounds(41, 21, 405, 50);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setIcon(new ImageIcon("C:\\Users\\82105\\Downloads\\whale-g898bada46_640.jpg"));
		btnNewButton_2_1.setBounds(41, 610, 405, 41);
		f.getContentPane().add(btnNewButton_2_1);
		f.setVisible(true);

			}
		}


