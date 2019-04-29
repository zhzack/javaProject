
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
		System.out.println(this.name+"所在的部门为："+this.dept.getname()+",拥有经费："+this.dept.getfee());
	}

	public static void main(String[] args) {
		Dept dept = new Dept("开发部", 20000);
		Employee emp = new Employee("jack");
		emp.setDept(dept);
		emp.showInfo();
	}
}
