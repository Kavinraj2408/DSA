package core_java;
class KavinException extends Exception{
	
	public KavinException(String str) {
		super(str);
	}
}

public class ExceptionClass {
	public static void main(String[] args) {
		int i=10;
		int j=0;
		try {
			j=10/i;
			throw new KavinException("I think you are heading to a wrong path :(");
			
		}
		catch(KavinException e) {
			System.out.println("You are just waking up Kavin :(" + e);
		}
		catch(Exception e) {
			System.out.println("Something went wrong .. " + e);
		}finally {
			System.out.println("at the end :)");
		}
	}
	

}
