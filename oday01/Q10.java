package oday01;

import java.util.Scanner;

public class Q10 { //page35

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���.");
		
		int n = sc.nextInt();
		int ori_number = n;
		
		int cnt = 0; //������ 10�� �ݺ��� Ƚ���� ���ϴ� ����
		
		while(n > 0) {
//			n = n / 10;
			n /=10;
			cnt++;
		}
		
		System.out.println("�Է��� ���ڴ� " + ori_number);
		System.out.println(cnt + "�ڸ��� ���� �����Դϴ�");
		
	}

}
