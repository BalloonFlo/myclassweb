package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 중국집주문화면 {
	static int count; //int count = 0;와 동일하다. 전역변수는 자동 초기화
	static final int PRICE = 5000; //상수는 final을 붙여서 변경불가능으로 설정한다.
	
	private static JTextField t1;
	static JLabel result;
	static int 짬뽕count = 0;
	static int 우동count = 0;
	static int 짜장count = 0;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("음식점 주문 화면");
		f.getContentPane().setBackground(new Color(128, 255, 0));
		f.setSize(800, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("개수: ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(535, 35, 61, 24);
		f.getContentPane().add(lblNewLabel);

		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 0));
		t1.setBounds(607, 35, 138, 24);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel center = new JLabel("");
		//라벨에 이미지를 변경하고 싶으면, 이미지부품을 만들고, 라벨에 아이콘을 세팅한다.
		ImageIcon img = new ImageIcon("짜장면.jpg");
		center.setIcon(img); //주소
//		Font font = new Font("굴림", Font.BOLD, 20);
//		center.setFont(font);
		center.setBounds(107, 69, 638, 316);
		f.getContentPane().add(center);
		
		JLabel result = new JLabel("결제금액: ");
		result.setFont(new Font("굴림", Font.BOLD, 15));
		result.setForeground(new Color(255, 0, 0));
		result.setBounds(107, 395, 349, 24);
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("\uC9EC\uBF55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//주문량을 현재 카운트에 하나 플러스
				count++;// count = count + 1, 증감연산자
				//t1에 현재 주문량을 변경
				t1.setText(count + "개");
				//center라벨에 있는 이미지 변경
				//이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("짬뽕.jpg");
				center.setIcon(icon);
				//result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton.setBackground(new Color(255, 128, 255));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton.setBounds(12, 10, 97, 51);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC6B0\uB3D9");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//주문량을 현재 카운트에 하나 플러스
				count++;// count = count + 1, 증감연산자
				//t1에 현재 주문량을 변경
				t1.setText(count + "개");
				//center라벨에 있는 이미지 변경
				//이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("우동.jpg");
				center.setIcon(icon);
				//result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 64));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton_1.setBounds(121, 10, 97, 51);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC9DC\uC7A5");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//주문량을 현재 카운트에 하나 플러스
				count++;// count = count + 1, 증감연산자
				//t1에 현재 주문량을 변경
				t1.setText(count + "개");
				//center라벨에 있는 이미지 변경
				//이미지아이콘 부품을 만들어, center라벨에 셋팅한다.
				ImageIcon icon = new ImageIcon("짜장면.jpg");
				center.setIcon(icon);
				//result라벨에 있는 결제금액 변경
				result.setText("결제금액: " + count * PRICE + "원");
			}
		});
		btnNewButton_2.setBackground(new Color(128, 255, 255));
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 15));
		btnNewButton_2.setBounds(230, 10, 97, 51);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
