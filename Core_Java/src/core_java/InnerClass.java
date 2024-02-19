package core_java;

class C{
	private int num =10;
	public void show() {
		System.out.println("in a show");
	}
	
	class D{
		
		public void innerShow() {
			System.out.println("in a innerclass show method");
		}
		public int add(int b) {
			return  num + b ;
		}
	}
}

public class InnerClass {
	
	public static void main(String[] arrgs) {
		C obj = new C();
		obj.show();
		
		C.D obj1 = obj.new D();
//		C.D obj2 = new C.D();
		obj1.innerShow();
		System.out.println(obj1.add(12));
		
		C obj2 =  new C()
				{
			public void show() {  // anonymous inner class
				System.out.println("in a new show");
			}
			
				};
		obj2.show();
	}

}
