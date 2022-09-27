package 연습;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자 1");
		lblNewLabel.setForeground(new Color(64, 0, 128));
		lblNewLabel.setFont(new Font("달서힐링체Bold", Font.BOLD, 30));
		lblNewLabel.setBounds(37, 152, 107, 73);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자 2");
		lblNewLabel_1.setForeground(new Color(64, 0, 128));
		lblNewLabel_1.setFont(new Font("달서힐링체Bold", Font.BOLD, 30));
		lblNewLabel_1.setBounds(37, 226, 107, 73);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(238, 221, 255));
		t1.setBounds(180, 167, 268, 52);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(238, 221, 255));
		t2.setColumns(10);
		t2.setBounds(180, 241, 268, 52);
		f.getContentPane().add(t2);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			//버튼을 클릭했을 때 actionPerformed()함수가 사용하도록 규칙이 설정되어있음.
			public void actionPerformed(ActionEvent e) {
				//plus버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다.
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				//1. 두수를 가지고 오세요.(String)
				String n1 = t1.getText(); //"100"
				String n2 = t2.getText(); //"200"
				
				//2. 숫자로 변경해서 정수변수에 넣어주세요.
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				//3. 결과출력
				//JOptionPane.showMessageDialog(f, n11 + n22);
				f.setTitle("더한 결과는 " + (n11 + n22));
				t1.setText("");
				t2.setText("");
				t1.setBackground(Color.magenta);
				t1.setForeground(Color.pink);
			}
		});
		plus.setFont(new Font("굴림", Font.BOLD, 30));
		plus.setBackground(new Color(217, 179, 255));
		plus.setBounds(37, 309, 69, 61);
		f.getContentPane().add(plus);

		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		minus.setFont(new Font("굴림", Font.BOLD, 30));
		minus.setBackground(new Color(217, 179, 255));
		minus.setBounds(156, 309, 69, 61);
		f.getContentPane().add(minus);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\82105\\Downloads\\whale-g898bada46_640.jpg"));
		btnNewButton_2.setBounds(37, 10, 411, 138);
		f.getContentPane().add(btnNewButton_2);
		
		JButton div = new JButton("/");
		div.setFont(new Font("달서힐링체Bold", Font.BOLD, 30));
		div.setBackground(new Color(217, 179, 255));
		div.setBounds(379, 310, 69, 61);
		f.getContentPane().add(div);
		
		JButton mul = new JButton("*");
		mul.setFont(new Font("굴림", Font.BOLD, 30));
		mul.setBackground(new Color(217, 179, 255));
		mul.setBounds(266, 309, 69, 61);
		f.getContentPane().add(mul);
		
		f.setVisible(true);

	}
}
