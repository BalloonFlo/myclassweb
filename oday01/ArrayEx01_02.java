package oday01;

import java.util.Scanner;

public class ArrayEx01_02 {

	public static void main(String[] args) {
		
		String[][] s = new String[10][2];
		
		s[0][0] = "0397134";
		s[0][1] = "��ȿ��";
		s[1][0] = "0465345";
		s[1][1] = "������";
		s[2][0] = "0427214";
		s[2][1] = "������";
		s[3][0] = "0487342";
		s[3][1] = "�迵��";
		s[4][0] = "0512478";
		s[4][1] = "�迹��";
		
		//Ű����� �Է� �޾Ƽ� �ֱ�
		//����ִ� �ε��� 5�� ���ؼ� ���⿡ �ֱ�
		int i = 0, j = 0;
		boolean flag = false;
		for (; i < s.length; i++) {
			if (s[i][0] == null) {
				break;
			}
		}
//		System.out.println(i + " ");
//		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("�й�: ");
//		s[i-1][0] = sc.next();
//		System.out.print("�̸�: ");
//		s[i-1][1] = sc.next();
		
		for (String[] ss : s) {
			for (String sss : ss) {
				System.out.print(sss + "\t");
			}
			System.out.println();
		}
		
		//�迵�̸� �����غ��ÿ�.
		//1) �迵�� ã��. 2) �迵�̰� ��� �ִ� �迭�� ���� null�� �ٲپ��ֱ�.
//		String deleteName = "�迵��";
//		int k = 0;
//		for (; k < s.length; k++) {
//			if (s[k][1].equals(deleteName)) {
//				break;
//			}
//		}
//		System.out.println(s[k][1] + " " + k);
//		s[k][0] = null;
//		s[k][1] = null;
//		System.out.println("-----------���� �� ��� -----------");
//		for (String[] ss : s) {
//			for (String sss : ss) {
//				System.out.print(sss + "\t");
//			}
//			System.out.println();
//		}
		
		//�迹���� �츮 ������ �˻��� ����
		//�츮���̸� �й��� �̸��� ����� �ְ� �ƴϸ� �츮���� �ƴմϴٶ�� ����ϱ�
		String searchName = "�迹��";
		int n = 0;
		boolean searchFlag = false;
		try {
			for (; n < s.length; n++) {
				if (s[n][1].equals(searchName)) {
					searchFlag = true;
					break;
				}
			}
		} catch (NullPointerException e) {
			if (!searchFlag) {
				System.out.println(s[n][0] + " " + s[n][1]);
			} else {
				System.out.println("�츮 ���� �ƴմϴ�.");
			}
		}
	}

}
