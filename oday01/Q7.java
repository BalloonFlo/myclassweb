package oday01;

import java.util.Scanner;

public class Q7 { //page31

	public static void main(String[] args) { //page31
		
		Scanner sc = new Scanner(System.in);

		System.out.println("1���� n������ ���� ���� ���մϴ�.");
		
		System.out.println("n��");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		
		System.out.println("1~" + n + "������ ���� " + sum + "�Դϴ�");
		
		double sum2 = 0;
		sum2 = (1 + n) * (n/2.0);
		
		System.out.println("1~" + n + "������ ���� " + (int)sum2 + "�Դϴ�");
		
	}

}
