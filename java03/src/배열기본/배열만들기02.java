package 배열기본;

import java.util.Iterator;

public class 배열만들기02 {
//02-02.
	public static void main(String[] args) {
		// p.29
		int[] num = new int[5];
		// num < {0, 0, 0, 0, 0}, length

		System.out.println("num의 주소 > " + num);
		// num은 참조형 변수(주소)

		// 값 대입, 위치값(index)를 이용
		num[0] = 100;
		num[1] = 200;

		// for-each: 하나씩 처음부터 뒤로가면서 꺼내오는 반복문
		// i는 int역할, 출력용
		for (int x : num) {
			System.out.println(x);
		}

		// c타입의 반복문(i는 index역할), 입/출력용
		for (int j = 0; j < num.length; j++) {

		}
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);

	}

}
