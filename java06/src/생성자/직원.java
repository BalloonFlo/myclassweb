package 생성자;

public class 직원 {
	String name;
	int age;
	char gender;
	static int count;
	static int total_age;

	public 직원(String name, int age, char gender) {
		count++;
		total_age += age;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public static double getAvg() {
		return total_age / count;
	}
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
