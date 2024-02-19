package core_java;

class A{
	public void show() {
		System.out.println("in a A show");
	}

}
class B extends A{
	
	public void show1() {
//		super.show();
		System.out.println("in a B show");
	}
	
}
public class WrapperClasses {

	public static void main(String[] args) throws ClassNotFoundException {
		A obj = new B();
		obj.show();
//		
//		obj = new B();
//		((B) obj).show1();
		
//	   Integer num = 127;
//		Integer num1 = 127;
//		System.out.println(num1.TYPE);
//		System.out.println(num == num1);
//		
//		num=128;
//		num1=128;
//		System.out.println(num1.TYPE);
//		System.out.println(num == num1);
	}

}
