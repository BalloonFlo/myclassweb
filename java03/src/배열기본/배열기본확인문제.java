package 배열기본;

public class 배열기본확인문제 {
//03-02.
	public static void main(String[] args) {
		// p.40 > p.45
		// 1
		String[] travel = { "파리", "뉴욕", "런던", "벤쿠버", "도쿄" };
		// for-each: 자동으로 index를 하나씩 옮겨가면서 반복적으로 꺼내와서 임시변수에 넣어준다.
		for (String t : travel) {
			System.out.print(t + " ");
		}
		System.out.println();
		// for
		for (int i = 0; i < travel.length; i++) {
			System.out.print(travel[i] + " ");
		}

		// 2
		System.out.println();
		char[] color = { 'r', 'o', 'y', 'g', 'b' };
		for (char c : color) {
			System.out.println(c + " ");
		}
		System.out.println();
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i] + " ");
		}

		// 3
		System.out.println();
		double[] height = { 172.5, 168.2, 178.6, 154.7, 182.1 };
		for (double h : height) {
			System.out.println(h + " ");
		}
		System.out.println();
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i] + " ");
		}

	}

}
