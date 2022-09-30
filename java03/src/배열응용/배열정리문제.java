package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// p.59
		// 1
		Scanner sc = new Scanner(System.in);

		int[] s = new int[5]; // {10,20,30,40,50}

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("숫자입력 > ");
			s[i] = sc.nextInt();
			sum = s[0] + s[2];
		}
		System.out.println(sum);

		System.out.println();

		// 2
		int[] t = new int[3]; // {"자바","스프링","JSP"}

		for (int i2 = 0; i2 < 3; i2++) {
			System.out.println("스트링입력 > ");
			t[i2] = sc.nextInt();
		}
		System.out.println(t[0] + "보다는 " + t[1]);

	}

}
