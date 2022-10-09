package 상속활용;

public class 스레드2 extends Thread {

	@Override
	public void run() {
		String[] list = {"01.png", "02.png"};
		for (int i = 0; i < list.length; i++) {
			System.out.println("이미지: " + list[i]);
			
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
