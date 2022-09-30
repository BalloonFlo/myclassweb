package 배열기본;

public class 배열기초확인문제 {
//03-01.
	public static void main(String[] args) {
		// p.38
		// 1
		int[] s = new int[5];
		// 2
		System.out.println(s.length);
		// 3
		s[0] = 100;
		System.out.println(s[0]);
		// 4
		s[s.length - 1] = 500;
		System.out.println(s[s.length - 1]);
		// 5
		s[2] = 200;
		System.out.println(s[2]);
		// 6
		System.out.println(s);
		// 7
		for (int i : s) {
			System.out.println(i);
		}

	}

}
