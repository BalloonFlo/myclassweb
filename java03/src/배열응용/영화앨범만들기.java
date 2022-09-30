package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class 영화앨범만들기 {
	
	//전체 영역에서 특정한 변수를 사용하려면 class 아래에 선언해야 한다.
	static int start = 2; //전역변수

	public static void main(String[] args) {
		//p.104
		// 영화제목
		String[] title = { "공조2", "정직한 후보2", "인생은 아름다워", "모가디슈", "비상선언" };
		// 포스터파일(파일이름)
		String[] img = { "공조.png", "정직한후보.png", "인생은 아름다워.png", "모가디슈.png", "비상선언.png" };
		// 평점
		double[] score = { 8.03, 7.85, 8.87, 8.67, 6.46 };
		
		JFrame f = new JFrame();
		f.getContentPane().setForeground(new Color(238, 238, 238));
		f.getContentPane().setBackground(new Color(55, 55, 55));
		f.setBackground(new Color(55, 55, 55));
		f.setSize(340, 477);
		
		JLabel top = new JLabel("인생은 아름다워");
		top.setForeground(new Color(238, 238, 238));
		top.setBackground(new Color(55, 55, 55));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel under = new JLabel("8.87");
		under.setForeground(new Color(238, 238, 238));
		under.setBackground(new Color(55, 55, 55));
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 22));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JLabel center = new JLabel("");
		center.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JButton left = new JButton("<<");
		left.setFont(new Font("굴림", Font.BOLD, 15));
		f.getContentPane().add(left, BorderLayout.WEST);
			
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start > 0) {
					//<<버튼을 클릭했을 때 처리하고 싶은 내용이 있으면, actionPerformed()함수 안에 넣어주세요.
					//제목이 표시된 라벨에 제목을 변경해야함.
					start = start - 1; //1 = 2 - 1
					top.setText(title[start]); //title[1]
					under.setText(score[start]+"점");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "마지막 페이지 입니다.");
				}
			}
		});
		
		JButton right = new JButton(">>");
		right.setFont(new Font("굴림", Font.BOLD, 15));
		f.getContentPane().add(right, BorderLayout.EAST);

		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start > 0) {
					start++;
					top.setText(title[start]);	
					under.setText(score[start]+"점");
					
					//변경된 이미지 부품 다시 만들어야함.
					//가운데 라벨에 변경된 이미지 부품을 넣으세요.
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "마지막 페이지 입니다.");
				}

			}
		});
		


		f.setVisible(true);
		

	}

}
