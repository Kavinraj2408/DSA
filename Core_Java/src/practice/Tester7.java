package practice;

class validator{
	public int[] id = {101,102,103};
	
	public void validate(int j) {
		try {
			for(int i=0;i<=id.length;i++) {
				if(j == id[i]) {
					System.out.println("P");
				}
			}
		}finally {
			System.out.println("Q");
		}
	}
}

public class Tester7 {
	public static void main(String[] args) {
		validator v = new validator();
		try {
			v.validate(101);
			System.out.println("R");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("S");
		}finally {
			System.out.println("T");
		}
		
	}

}
