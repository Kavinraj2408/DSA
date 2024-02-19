package core_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	char gender;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, char gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
}

class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Student o) {
		if(this.age > o.age) {
			return 1;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class ComparatorClass {

	public static void main(String[] args) {
		
		Comparator<Employee> com = (o1,o2) -> o1.getSalary()>o2.getSalary() ?  1 :  -1;	
		
		Employee emp = new Employee(1,"Kavi",'M',97000.0);
		Employee emp1 = new Employee(2, "Pavi", 'F', 130000.0);
		Employee emp2 = new Employee(3, "Jyo", 'F', 48500.0);
		Employee emp3 = new Employee(4, "Harsi", 'M', 63750.0);
		
		List<Employee> emps = new ArrayList<>();
		emps.add(emp);
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		
		Collections.sort(emps, com);
		int count =0;
		double totalSalary = 0 ;
		for(Employee e: emps) {
			totalSalary += e.getSalary();
			count++;
		}
		double avgSalary = totalSalary/4;
		
		List<Employee> list = emps.stream().filter(n->n.getGender() == 'F').collect(Collectors.toList());
		
		List<Employee> list1 = emps.stream().filter(n->n.getGender() == 'M').collect(Collectors.toList());
		
		List<Employee> list2 = emps.stream().filter(n -> n.getSalary() > avgSalary).collect(Collectors.toList());
		
		List<Double> list3 = emps.stream().filter(n -> n.getName() == "Kavi").map(n -> n.getSalary()).collect(Collectors.toList());
		
		List<String> list4 = emps.stream().filter(n -> n.getSalary() > avgSalary).map(n -> n.getName()).collect(Collectors.toList());
		
		list.forEach(l ->System.out.println(l));
		System.out.println("--------------------------");
		list1.forEach(l ->System.out.println(l));
		System.out.println("--------------------------");
		list2.forEach(l ->System.out.println(l));
		System.out.println("--------------------------");
		list3.forEach(l -> System.out.println(l));
		System.out.println("--------------------------");
		list4.forEach(l -> System.out.println(l));
		
//		for(Employee e: emps) {
//			System.out.println(e);
//		}
		
		System.out.println("-------------------------");

		System.out.println("-------------------------");
		
		List<Student> stud = new ArrayList<>();
		stud.add(new Student("Kavin",23));
		stud.add(new Student("Navin",19));
		stud.add(new Student("Pavi",20));
		stud.add(new Student("Jyo",17));
		
		Iterator<Student> iter = stud.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		System.out.println("-------------------------");
		
		//Stream
		
		
		Collections.sort(stud);
		
		stud.forEach(s -> System.out.println(s));
		for(Student s: stud) {
			System.out.println(s);
		}

	}

}
