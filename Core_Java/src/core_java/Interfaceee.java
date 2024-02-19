package core_java;

@FunctionalInterface
interface Interfacee {
	
	int num = 100;
	String name = "Kavin";
	
	void show(int i);
	
	static int add(int c) {
		return num + c ;
	}

}
class Z implements Interfacee{
	 public void show(int b) {
		System.out.println("in a show");
	}
}
public class Interfaceee{
	public static void main(String[] args) {
		Interfacee obj = new Z();
		
		obj.show(1);
		System.out.println(Interfacee.add(14));
		
		Interfacee in = (int a) -> System.out.print("lambda expression");
		in.show(1);
		
	}
}
