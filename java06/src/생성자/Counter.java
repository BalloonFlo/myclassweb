package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {
	
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(64, 128, 128));
		f.setSize(300, 300);
		f.getContentPane().setLayout(null);
		
		JLabel result = new JLabel("0");
		result.setForeground(new Color(255, 255, 255));
		result.setBackground(new Color(255, 255, 255));
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setFont(new Font("궁서", Font.BOLD, 95));
		result.setBounds(12, 10, 260, 167);
		f.getContentPane().add(result);
		
		JButton b1 = new JButton("+ 1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				result.setText(count + "");
			}
		});
		b1.setBackground(new Color(153, 204, 204));
		b1.setFont(new Font("굴림", Font.BOLD, 15));
		b1.setBounds(12, 228, 70, 23);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("초기화");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result.setText("0");
			}
		});
			
		b2.setBackground(new Color(153, 204, 204));
		b2.setFont(new Font("굴림", Font.BOLD, 15));
		b2.setBounds(94, 228, 96, 23);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("- 1");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				result.setText(count + "");
			}
		});
		b3.setForeground(new Color(0, 0, 0));
		b3.setBackground(new Color(153, 204, 204));
		b3.setFont(new Font("굴림", Font.BOLD, 15));
		b3.setBounds(202, 228, 70, 23);
		f.getContentPane().add(b3);
		
		f.setVisible(true);
		
		
	}
}
