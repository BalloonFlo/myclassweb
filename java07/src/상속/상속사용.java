package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.gender = "남자";
		p.name = "클라크";
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 100;
		System.out.println(m);
		
		슈퍼맨 sMan = new 슈퍼맨();
		sMan.gender = "남자";
		sMan.name = "윌리엄";
		sMan.size = 200;
		System.out.println(sMan);
		
		원더우먼 wMan = new 원더우먼();
		wMan.gender = "여";
		wMan.name = "유리";
		wMan.size = 90;
		System.out.println(wMan);
		
		직원 worker = new 직원();
		worker.name = "가나다";
		worker.address = "대한민국";
		worker.salary = 10000;
		worker.rrn = 101001;
		System.out.println(worker);
		
		매니저 manager = new 매니저();
		manager.bonus = 2000;
	}

}
