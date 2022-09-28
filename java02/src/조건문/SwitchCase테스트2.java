package 조건문;

import java.util.Date;

import javax.xml.crypto.Data;

public class SwitchCase테스트2 {

	public static void main(String[] args) {
		//빨간 밑줄 클릭하고, f2 ==> fix도움말
		Date name = new Date();
		int month = date.getMonth() + 1;
		int day = date.getDay(); //요일
		//0이 일요일. 1이 월요일. 6이 토요일.
		switch (day) {
		case 0: case 6:
			System.out.println("놀자.");
			break;

		default: //else. 1~5
			System.out.println("자바 공부하러 가자.");
			break;
		}
		
		//계절을 판별해보세요. => 슬랙 x
		//247~248. 1번, 3번 => 슬랙에 올리기
	}

}
