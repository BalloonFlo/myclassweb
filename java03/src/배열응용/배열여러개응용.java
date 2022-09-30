package 배열응용;

public class 배열여러개응용 {

	public static void main(String[] args) {
		
		//배열 여러개를 응용해서 다양한 타입의 데이터를 넣어보자.
		String[] 식구 = {"아버지", "어머니", "나"};
		int[] 나이 = {54, 50, 20};
		double[] 키 = {177.7, 161.5, 165.2};
		
		//나에 대한 정보만 프린트해보세요.
		//index 2번에 나에 대한 정보가 들어있음.
		System.out.println("식구\t나이\t키");
		System.out.println();

		for (int i = 0; i < 키.length; i++) {
			System.out.println(식구[i] + "\t" + 나이[i] + "\t" + 키[i]);
		}
		
		System.out.println();
		System.out.println(식구[2] + "\t" + 나이[2] + "\t" + 키[2]);
		
		
	}

}
