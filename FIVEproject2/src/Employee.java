
public class Employee {
	private String name;
	private Dept dept;

	public Employee(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public void showInfo() {
		System.out.println(this.name+"���ڵĲ���Ϊ��"+this.dept.getname()+",ӵ�о��ѣ�"+this.dept.getfee());
	}

	public static void main(String[] args) {
		Dept dept = new Dept("������", 20000);
		Employee emp = new Employee("jack");
		emp.setDept(dept);
		emp.showInfo();
	}
}
