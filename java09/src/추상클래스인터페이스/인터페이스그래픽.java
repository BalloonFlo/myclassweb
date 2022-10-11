package 추상클래스인터페이스;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 인터페이스그래픽 {


	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 255));
		f.setSize(500, 600);

		f.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("버튼1을 클릭");
		JButton b2 = new JButton("버튼2를 클릭");
		
		버튼1처리클래스 act1 = new 버튼1처리클래스();
		버튼2처리클래스 act2 = new 버튼2처리클래스();
		
		b1.addActionListener(null);
		
		f.add(b1);
		f.add(b2);
		
		Font font = new Font("한초롬돋움", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		
		JTextArea area = new JTextArea(6, 10);
		area.setFont(font);
		f.add(area);
		
		area.setBackground(Color.CYAN);
		
		
		f.setVisible(true);
		
	}
}
