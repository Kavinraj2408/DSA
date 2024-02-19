package practice;

class Address{
	private int zip;
	public Address(int zip) {
		this.zip = zip;
	}
	
	public int getZip() {
		return zip;
	}
}
class Cust{
	public Address add;
	public String name;
	
	public Cust(String name, int z) {
		this.name = name;
		add = new Address(z);
	}
}
public class Tester9 {
	public static void main(String[] args) {
		
		Cust c = new Cust("same", 1001);
		System.out.println(c.add.getZip());
		
	}

}
