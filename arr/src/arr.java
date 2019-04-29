import java.util.Random;
import java.util.Arrays;
public class arr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		arr = new int[10];
		for (int a = 0; a < arr.length; a++) {
			Random rd = new Random();
			int number = rd.nextInt(33) + 1;
			arr[a] = number;
		}
		printArray a1 = new printArray();
		a1.printarray(arr);
		a1.printMax(arr);
		a1.sort(arr);
		a1.Sum(arr);
	}

}

class printArray {

	void printarray(int arr[]) {
		for (int a = 0; a < arr.length; a++) {
			System.out.print("-" + arr[a]);
		}

	}

	void printMax(int arr[])// 遍历数组
	{
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("\n" + "最大数为：" + max);
	}

	void sort(int arr[])// 数组排序
	{
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr.length; b++) {
				if (arr[a] < arr[b]) {
					int temp;
					temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;

				}

			}

		}
		System.out.println("最大数为：" + arr[arr.length - 1]);
		System.out.println("第二大数为：" + arr[arr.length - 2]);
	}

	void Sum(int arr[]) {
		int sum = 0;
		for (int a = 0; a < arr.length; a++) {
			int index = 0;
			for (int b = 0; a < arr.length; b++) {

				if (arr[a] == arr[b]) {
					index++;

				}

			}
			if (index == 0) {
				sum = arr[a];
			}
		}
		System.out.print("从未重复的数的和" + sum);
	}
}