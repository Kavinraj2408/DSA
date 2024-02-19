package practice;

public class Tester2 {
	public static void main(String[] args) {
		String s1 = "warner";
		String s2 = new String("WARNER");
		s2.toLowerCase();
		if(s1 == s2) {
			System.out.println(s1);
		}else if(s1.equals(s2)) {
			System.out.println(s2);
		}else {
			System.out.println("Welcome");
		}
	}

}
