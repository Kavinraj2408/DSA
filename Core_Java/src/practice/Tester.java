package practice;

class Calculator{
	public int num1=10;
	public float num2=20;
	public double sum;
	public double product;
	
	public double add(int num1,int num2) {
		double sum = this.num1 + this.num2;
		System.out.println(sum);
		return sum;
	}
	public double multiply(int num1,int num2) {
		double sum = this.add(num1, num2);
		double product = this.sum * this.num1;
		System.out.println(product);
		return (int) product;
	}
	
}
public class Tester {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.multiply(10, 5));
	}

}
