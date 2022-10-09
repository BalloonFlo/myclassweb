package 추상클래스인터페이스;

public class AppleComputer implements Computer_interface {

	@Override
	public void 디자인이예쁘다() {
		System.out.println("빨간색으로 디자인이 예쁘다.");
	}

	@Override
	public void 소리가잘들린다() {
		System.out.println("소리가 웅장하게 잘 들린다.");

	}

	@Override
	public void 눈이안아프다() {
		System.out.println("오래 사용해도 눈이 안 아프다.");

	}

}
