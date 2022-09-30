package 배열응용;

import java.util.Scanner;

public class 배열넣기확인문제 {

	public static void main(String[] args) {
		//p.80
		//1. 작년에 가고 싶었던 곳 세 곳을 받아 넣으세요.
		//제주도, 양양, 속초
		//2. 올해에 가고 싶었던 곳 세 곳을 받아 넣으세요.
		//제주도, 부산, 울산
		//우선순위에 따라 작년과 올해 가고 싶은 곳이 동일한 곳은 몇 곳인가?
				
		String[] year1 = {"제주도", "양양", "속초"};
		String[] year2 = {"제주도", "부산", "울산"};
		
		System.out.println("순위\t작년\t올해");
		System.out.println("------------------------");
		for (int i = 0; i < year2.length; i++) {
			System.out.println(i + 1 + "\t" + year1[i] + "\t" + year2[i]);
		}
		
		int count = 0;
		for (int i = 0; i < year2.length; i++) {
			if (year1[i].equals(year2[i])) {
				count++;
			}
		}
		System.out.println("------------------------");
		System.out.println("우선순위가 동일한 곳은 " + count + "곳입니다.");
		
		System.out.println();
		System.out.println();
		
		//강사님 답안지.
		String[] year11 = new String[3]; //작년
		String[] year22 = new String[3]; //올해
		
		//3번 입력해서, 각 배열에 넣어주세요.
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < year22.length; i++) {
			System.out.print("작년에 가고싶은 여행지 순위> ");
			year11[i] = sc.next();
		}
		
		for (int i = 0; i < year22.length; i++) {
			System.out.print("올해 가고싶은 여행지 순위> ");
			year22[i] = sc.next();
		}
		
		int count2 = 0;
		//3번 반복해라.
		for (int i = 0; i < year22.length; i++) {
			if (year11[i].equals(year22[i])) {
				count2++;
			}
		}
		
		System.out.println("전체 동일한 여행지수> " + count2);
		
	}

}
