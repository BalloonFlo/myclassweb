package 연습;

import java.util.Scanner;

import javax.sound.sampled.Line;

public class 기본데이터확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나의 이름은? ");
		String name = sc.next();
		
		System.out.println("나의 키는? ");
		double tall = sc.nextDouble();

		System.out.println("나의 몸무게는? ");
		double weight = sc.nextDouble();
		
		System.out.println("나는 저녁을 먹었나요?(true/faulse) ");
		boolean answer = sc.nextBoolean();
		
		sc.nextLine();
		System.out.println("나의 좌우명은? ");
		String text = sc.nextLine(); //한줄.
		
		System.out.println("-------------");
		
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 내년 키는 " + (tall + 11) + "입니다.");
		System.out.println("내 내년 몸무게는 " + (weight - 10) + "입니다.");
		System.out.println("나는 저녁을 " + answer + "했습니다.");
		System.out.println("나의 좌우명은 " + text + "입니다.");
	}

}
