package 생성자;

public class 나의일지 {

	public static void main(String[] args) {
		//변수는 선언된 위치를 포함한 괄호안에서만 사용 가능하다.
		//day1, day2, day3는 메서드 안에서만 쓸 수 있다.
		//main안에서만 쓸 수 있는 지역변수(local변수)
		//지역변수 <--> 전역변수
		//지역변수는 자동초기화x
		//지역변수는 프로그래머가 초기화시켜야 한다.
		Day day1 = new Day("자바공부", 10, "강남역");
		System.out.println(day1); //주소대신 toString이 찍힌다.
		System.out.println(Day.count); //static
		System.out.println("전체 시간> " + Day.total_time + "시간");
		
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(day2); 
		System.out.println(Day.count);
		System.out.println("전체 시간> " + Day.total_time + "시간");
		
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(day3); 
		System.out.println(Day.count);
		System.out.println("전체 시간> " + Day.total_time + "시간");
		System.out.println("평균 시간> " + Day.getAvg() + "시간");
		
		
	}

}
