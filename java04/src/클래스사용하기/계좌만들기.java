package 클래스사용하기;

import 클래스만들기.계좌;

//ppt 41
public class 계좌만들기 {

	public static void main(String[] args) {
		계좌 user1 = new 계좌();
		
		user1.이름 = "홍길동";
		user1.계좌이름 = "튼튼적금";
		user1.금액 = 1000; 
		
		user1.통장확인하다();

		계좌 user2 = new 계좌();
		
		user2.이름 = "박길동";
		user2.계좌이름 = "튼튼적금";
		user2.금액 = 2000; 
		
		user2.통장확인하다();
		
		계좌 user3 = new 계좌();
		
		user3.이름 = "홍기사";
		user3.계좌이름 = "다음적금";
		user3.금액 = 3000; 
		
		user3.통장확인하다();
		
		
	}

}
