
public class Person {
	private String name;
	private int age;
	private String cardNo;

	public Person() {

	}

	public Person(String name, int age, String cardNo) {
		this.age = age;
		this.cardNo = cardNo;
		this.name = name;

	}

	public void run() {
		System.out.println(name + "is running");
	}
	
	public static void main(String[] args) {
		Student sun=new Student("jack",2,"110");
		sun.run();
	}
}
