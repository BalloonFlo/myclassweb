package oday01;

public class Ex01 { //page43,44

	public static void main(String[] args) {
		
		boolean x= true, y = true;
		if (x && y) 
			System.out.println("��");
		else
			System.out.println("����");
		if (!(!x || !y))
			System.out.println("��");
		else
			System.out.println("����");
		
		boolean xx = false, yy = true;
		if (xx && yy) 
			System.out.println("��");
		else
			System.out.println("����");
		if (!(!xx || !yy))
			System.out.println("��");
		else
			System.out.println("����");
		
	}

}
