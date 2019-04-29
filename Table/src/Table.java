public class Table {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			for (int a = 1; a <= i; a++) {
				System.out.print("|" + i + "*" + a + "=" + i * a);

			}
			System.out.println("");
		}
	}
}
