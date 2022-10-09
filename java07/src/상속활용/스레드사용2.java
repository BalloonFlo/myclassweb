package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.jws.Oneway;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드사용2 extends JFrame {
	
	JLabel count, image;
	스레드1 count2;
	스레드2 image2;
	static 스레드사용2 f;
	
	
	public 스레드사용2 () {
		getContentPane().setBackground(Color.cyan);
		setSize(500, 500);
		count = new JLabel("카운트");
		image = new JLabel("이미지");
		Font font = new Font("맑은 고딕", Font.BOLD, 15);
		count.setFont(font);
		image.setFont(font);
		add(count, BorderLayout.CENTER);
		add(image, BorderLayout.AFTER_LAST_LINE);
		setVisible(true);
		count2 = new 스레드1();
		count2.start();
		image2 = new 스레드2();
		image2.start();
		
	}
	
	public static void main(String[] args) {
		f = new 스레드사용2();
		

	}
	public class 스레드1 extends Thread {

		@Override
		public void run() {
			for (int i = 20; i >= 0; i--) {
//				System.out.println("카운트: " + i);
				count.setText("카운트: " + i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i == 0) {
				JOptionPane.showMessageDialog(null, "끝");
				image2.stop();
			}
			}
		
		}
	}
		
		public class 스레드2 extends Thread {

			@Override //표시 @ == annotation(어노테이션, 표시)
			public void run() {
				String[] list = {"3.png","4.png"};
				for (int i = 0; i < list.length; i++) {
//					System.out.println("이미지 >> " + list[i]);
//					image.setText("이미지 >> " + list[i]);
					ImageIcon icon = new ImageIcon(list[i]);
					image.setIcon(icon);
				//cpu가 한꺼번에 너무 많이 실행해버려서, 다른 스레드랑 동시에 처리되는 것처럼 보이지 않는다.
				//cpu 1초씩 쉬었다가 실행시켜줘라고 설정
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				} //밀리세컨즈 1000 == 1초
				//자바프로그램에서 외부자원(db, cpu, network, file)을 연결할 때는 그런 상황이 발생했을 때 어떻게 할지를 반드시 써주어야 한다.
				//예외처리
				}
			}
			
		}
	}
