package oday01;

import java.util.Scanner;

public class BasicEx01 { //page13, 21

	public static void main(String[] args) {
		
		int max = -999999;
		int mini = 999999;
		int mid;
		
		System.out.println("�� ������ �ִ밪�� ���մϴ�");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a�� ��");
		int a = sc.nextInt();
		System.out.println("b�� ��");
		int b = sc.nextInt();
		System.out.println("c�� ��");
		int c = sc.nextInt();
		
		if(max < a) max = a;
		if(max < b) max = b;
		if(max < c) max = c;

		if(mini > a) mini = a;
		if(mini > b) mini = b;
		if(mini > c) mini = c;
		
		System.out.println("�ִ밪�� " + max + "�Դϴ�");
		System.out.println("�ּҰ��� " + mini + "�Դϴ�");
		
		if(a >= b)
			if(b >= c)
				mid = b;
			else if(a <= c)
				mid = a;
			else
				mid = c;
		else if(a > c)
			mid = a;
		else if(b > c)
			mid = c;
		else
			mid = b;
		System.out.println("�߾Ӱ��� " + mid + "�Դϴ�");
				
	}	

}
