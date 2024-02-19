package core_java;

enum Enum{
	Running, Failed, Success, Pending;
}

public class EnumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enum e = Enum.Failed;
		System.out.println(e);

		System.out.println(e.ordinal());
		
		Enum[] ee = Enum.values();
		
		for(Enum enu : ee) {
			System.out.println(enu + " : " + enu.ordinal());
			
		}
		switch(e){
		case Running : 
			System.out.println("All Good");
            break;
		case Failed:
			System.out.println("Try Again");
            break;
		case Pending:
			System.out.println("Please wait");
            break;
        default:
        	System.out.println("Done");
           
		}
	}

}
