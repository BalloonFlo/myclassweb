package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;

public class 나의두번째윈도우 {

	public static void main(String[] args) {
		//jframe, 크기정하고, 보여라. ==> windowbuilder로!
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("EF_다이어리", Font.BOLD, 20));
		lblNewLabel.setBounds(62, 101, 37, 51);
		f.getContentPane().add(lblNewLabel);
		f.setVisible(true);


	}

}
