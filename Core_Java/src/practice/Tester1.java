package practice;

public class Tester1 {
	public static void main(String[] args) {
		int n1 = -20;
		int n2 = -30;
		int n3 = 10;
		int n4 = -40;
		
		if(n1+n2 > n4) {
			System.out.println("in if");
		}
		else {
			if(n2/n1 > 0) {
				System.out.println("in else - if");
				if(n1<n2 || n4 % n3 ==0) {
					System.out.println(3);
				}
			}
		}
	}

}
