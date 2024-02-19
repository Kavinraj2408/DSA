package practice;

class emp{
	private int id;
	private static int counter = 1000;
	
	public emp() {
		id = ++counter;
	}
	public int getId() {
		return id;
	}
	public static int getCounter() {
		return counter;
	}
}

public class Tester6 {
	public static void main(String[] args) {
		emp e1 = new emp();
		emp e2 = new emp();
		emp e3 = new emp();
		
		display(e1);
		display(e2);
		display(e3);
	}
	
	public static void display(emp e) {
		System.out.println(e.getId()+ " " +emp.getCounter());
	}

}
