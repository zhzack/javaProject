
public class Student extends Person {
	public Student(String name, int age, String cardNo) {
		super(name, age, cardNo);
	}

	public void run() {
			super.run();
			System.out.println("����ִ�������run����");
	}
}
