import java.util.Scanner;

public class NumGame {

	/**
	 * @param args
	 */
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����һ��һ��һ��֮�����������²������");
		int realNum = (int) (Math.random() * 100) + 1;
		int yourGuess = 0;
		scanner = new Scanner(System.in);
		yourGuess = scanner.nextInt();
		while (realNum != yourGuess) {
			if (realNum < yourGuess) {
				System.out.println("�´��ˣ���������Ĳ²⣺");
				yourGuess = scanner.nextInt();

			} else if (realNum > yourGuess) {
				System.out.println("��С�ˣ���������Ĳ²⣺");
				yourGuess = scanner.nextInt();

			}
		}
		// if (realNum == yourGuess) {
		// System.out.println("�¶���");
		// }
		System.out.println("�¶���");

	}

}
