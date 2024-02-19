package core_java;

public class StringClassTest {
	
	public static void main(String[] args) {
		String str = StringClass.reverseString("SWETHA");
		
		if(str.equals("AHTEWS")) {
			System.out.println("Testcase passed");
		}else {
			System.out.println("Testcase Failed");
		}
	}
}
