package practice;

class Employee{
	public String name;
	public char gender;
	public double salary;
	public Employee(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
}

public class Tester4 {
	public static void main(String[] args) {
		Employee e1 = new Employee("alex", 'M');
		Employee e2 = new Employee("Robert");
		System.out.println(e2.name + " : " + e2.gender + " : " + e1.name);
	}

}
