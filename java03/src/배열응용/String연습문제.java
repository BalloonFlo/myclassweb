package 배열응용;

public class String연습문제 {
//ppt 124
	public static void main(String[] args) {

		String s1 = "011-245-1234 ";
		String s = s1.trim(); // 공백제거

		String first = s.substring(0, 3); // 011
		String second = s.substring(4, 7); // 245
		System.out.println(first + " " + second);

		// 3. 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 Apple.
		switch (first) {
		case "011":
			System.out.println("SK");
			break;

		case "019":
			System.out.println("LG");
			break;

		default:
			System.out.println("Apple");
			break;
		}

		// 4-1. 두번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰.
		if (second.length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

		// 5. 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호, 아니면 유효하지 않은 번호.
		if (s.length() >= 10) {
			System.out.println("유효한 전화번호.");
		} else {
			System.out.println("유효하지 않은 전화번호.");
		}

		// ppt 119 참고.
		String s2 = "감자, 고구마, 양파";
		String[] s3 = s2.split(","); // {"감자", "고구마", "양파"}
		// "," 기준으로해서 String 배열을 만들어준다.
		System.out.println(s3[0]);

		// 4-2. 두번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰.
		String[] s4 = s.split("-"); // {"011", "245", "1234"}
		if (s4[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

		// equals()

	}

}
