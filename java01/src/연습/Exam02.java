package 연습;

public class Exam02 {

	public static void main(String[] args) {
		//키 199.9일 때 적정 몸무게를 구해주세요.
		//(키 - 100) * 0.9
		//Double.parseDouble() 사용
		
		String height = "199.9";
		
		double height1 = Double.parseDouble(height);
		
		double weight = (height1-100)*0.9;
		
		System.out.println("적정 몸무게는 " + weight);

	}

}
