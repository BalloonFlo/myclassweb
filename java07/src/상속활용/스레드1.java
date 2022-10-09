package 상속활용;

import javax.swing.JOptionPane;

public class 스레드1 extends Thread {

	@Override
	public void run() {
		for (int i = 20; i >= 0; i--) {
			System.out.println("카운트: " + i);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (i == 0) {
			JOptionPane.showMessageDialog(null, "끝");
			
		}
		}
	
	}
	
}
