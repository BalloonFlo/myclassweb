package oday01;

public class ArrayEx01_1 {

	public static void main(String[] args) {
		
		//����1. 1���� �迭�� ������ �Է��ϰ� ����ϱ�
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = 100 * i + 100;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		//���� for������ ����ϱ�
		for (int n : a) {
			System.out.print(n + ": �̰��� ����\t");
		}
		System.out.println();
		
		System.out.println("--------------------");
		//����2. 2���� �迭�� ������ �Է��ϰ� ����ϱ� 
		int[][] b = new int[2][3];
		int num = 100;
		int[] sum = new int[2];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = num;
				sum[i] += b[i][j];
				num -= 5;
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + "\t");
			}
			System.out.println(sum[i]);
		}
		//���� for������ ����ϱ�
		for (int[] bb : b) {
			for (int bbb : bb) {
				System.out.print(bbb + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("--------------------");
		//����3. 3���� �迭�� ������ �Է��ϰ� ����ϱ� 
		String[][][] c = {{{"a", "b"}, {"c", "d"}, {"e" ,"f"}},
						   {{"a", "b"}, {"c", "d"}, {"e" ,"f"}}
		};
		//for�� ���ڹ��� �̿��ؼ� ���
		//���� ���� ���, ���� ���� ���, ���� ���� ���
		System.out.println("���� ����: " + c.length);
		System.out.println("���� ����: " + c[0].length);
		System.out.println("���� ����: " + c[0][0].length);
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				for (int j2 = 0; j2 < c[i][j].length; j2++) {
					System.out.print(c[i][j][j2] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		//���� for������ ���
		for (String[][] cc : c) {
			for (String[] ccc : cc) {
				for (String cccc : ccc) {
					System.out.print(cccc + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
	}

}
