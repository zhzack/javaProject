
import java.util.Scanner;


public class Fibonacci {
	static int[] b = new int[100];

	static int test3(int a,int b,int c)  {
		if (a == 0) {
			return 0;
		} else if (a == 1) {
			return 1;
		} else {
			
			return test1(a - 2) + test1(a - 1);
		}
	}
	static int test2(int a) {
		b[0] = 0;
		b[1] = 1;
		if (a < index()) {
			return b[a];
		} else {
			b[index()] = b[index() - 1] + b[index() - 2];

			if (index() - 1 == a) {
				return b[index() - 1];
			} else {
				return test2(a);
			}
		}

	}

	static int index() {// �б𴢷����е�ʵ�ʴ�С�����ص�ǰ��������

		for (int i = 2; i < b.length; i++) {

			if (b[i] == 0) {
				return i;
			}

		}
		return 2;// ����Ĭ�ϴ�СΪ����������Ϊ��ʱָ�������е��������֣����forѭ����2��ʼ��������ѯ�� i ����������

	}

	static int test1(int a) {
		if (a == 0) {
			return 0;
		} else if (a == 1) {
			return 1;
		} else {
			System.out.println(test1(a - 2) + test1(a - 1));
			return test1(a - 2) + test1(a - 1);
		}

	}

	public static void main(String[] args) {
//		System.out.println("��������Ҫ���쳲��������У�һ�����ڣ�");
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		int f = sc.nextInt();
//		test2(f);
//		for (int i = 0; i < f; i++) {
//
//			System.out.println("��" + i + "λ��" + b[i]);
//		}
		for (int i = 0; i < 46; i++) {
			System.out.println("��" + i + "λ��" + test1(i));
		}
	}

}
