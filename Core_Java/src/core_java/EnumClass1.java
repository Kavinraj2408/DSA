package core_java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;

enum Laptop implements Serializable{
	Macbook(2000),Yoga(1000), Probook;
	
	private int price;
	
	Laptop(int price) {
		this.price = price;
	}
	
	Laptop(){
		price = 3000;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class EnumClass1 {
	

	public static void main(String[] args) {
	
		Laptop[] lap =Laptop.values();
	
		for(Laptop l : lap) {
			System.out.println(l + " : " + l.getPrice());
		}
	}
	
	Laptop lap1 = Laptop.Macbook;
	
	File file  = new File("xyz.txt");
	
//	FileOutputStream fos = new FileOutputStream(file);
	 

}
