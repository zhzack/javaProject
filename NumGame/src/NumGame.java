import java.util.Scanner;

public class NumGame {

	/**
	 * @param args
	 */
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("给你一个一到一百之间的整数，请猜测这个数");
		int realNum = (int) (Math.random() * 100) + 1;
		int yourGuess = 0;
		scanner = new Scanner(System.in);
		yourGuess = scanner.nextInt();
		while (realNum != yourGuess) {
			if (realNum < yourGuess) {
				System.out.println("猜大了，再输入你的猜测：");
				yourGuess = scanner.nextInt();

			} else if (realNum > yourGuess) {
				System.out.println("猜小了，再输入你的猜测：");
				yourGuess = scanner.nextInt();

			}
		}
		// if (realNum == yourGuess) {
		// System.out.println("猜对了");
		// }
		System.out.println("猜对了");

	}

}
