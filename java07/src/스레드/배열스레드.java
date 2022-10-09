package 스레드;

public class 배열스레드 extends Thread {
	String[] s = {"커피", "물", "주스", "맥주", "와인"};
	@Override
	public void run() {
		for (int i = 0; i < s.length; i++) {
			System.out.println("음료이름: " + s[i]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
}
