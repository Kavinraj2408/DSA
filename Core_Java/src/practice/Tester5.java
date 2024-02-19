package practice;

public class Tester5 {
	public static void main(String[] args) {
		int n1=2, n2 = 20;
		do {
			n2 = n2/n1;
			if(n1>n2)
				break;
			n2--;
		}while(++n1<5);
		
		System.out.println("num1 " + n1 + " num2 "+n2);
	}

}
