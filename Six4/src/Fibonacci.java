
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

	static int index() {// 判别储放数列的实际大小，返回当前数列索引

		for (int i = 2; i < b.length; i++) {

			if (b[i] == 0) {
				return i;
			}

		}
		return 2;// 数组默认大小为二，而索引为二时指向数组中第三个数字，因此for循环从2开始遍历，查询第 i 个数等于零

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
//		System.out.println("请输入您要求的斐波那契数列（一百以内）");
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		int f = sc.nextInt();
//		test2(f);
//		for (int i = 0; i < f; i++) {
//
//			System.out.println("第" + i + "位：" + b[i]);
//		}
		for (int i = 0; i < 46; i++) {
			System.out.println("第" + i + "位：" + test1(i));
		}
	}

}
