package 형변환;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 신호등 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.BLACK);
		f.setSize(500, 600);
		
		JButton red = new JButton("빨간불");
		red.setBounds(32, 90, 69, 23);
		JButton yellow = new JButton("노란불");
		yellow.setBounds(32, 229, 69, 23);
		JButton blue = new JButton("파란불");
		blue.setBounds(32, 392, 69, 23);
		f.getContentPane().setLayout(null);
		f.getContentPane().add(red);
		f.getContentPane().add(yellow);
		f.getContentPane().add(blue);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(283, 94, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		
		f.setVisible(true);

	}
}
