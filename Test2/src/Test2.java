
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(3, 4);
		System.out.println(c1.toString() + "的模是" + c1.sqrt());
		Complex c2 = new Complex(6);
		System.out.println(c2.toString() + "的模是" + c2.sqrt());
		Complex c3 = c1.add(c2);
		System.out.println(c1.toString() + "+" + c2.toString() + "=" + c3.toString());
	}

}
