package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(1000); //Object <-자동형변환- Integer <-오토박싱- int
		list.add(189.1);
		list.add(false);
		list.add('남');
		System.out.println(list.size());
		
		//toString()
		System.out.println(list);
		int money = (int)list.get(0) + 2000;
		System.out.println("내 돈은 " + money);
		//int <-오토언박싱- Integer <-강제형변환- Object
		double height = (double)list.get(1) + 10;
		System.out.println("올해의 키는 " + height);
		boolean food = (boolean)list.get(2);
		if (food) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		char gender = (char)list.get(3);
		if (gender == '남') {
			System.out.println("주민번호 1, 3");
		} else {
			System.out.println("주민번호 2, 4");
		}
		
		
	}

}
