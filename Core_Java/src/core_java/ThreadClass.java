package core_java;


class Thread1 implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("------");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class Thread2 implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Kavin");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadClass {
	
	public static void main(String[] args) throws Exception {
		Thread1 obj = new Thread1();
		
		Thread2 obj1 = new Thread2();
		
		Runnable obj2 = () -> 
			{
				for(int i=0;i<5;i++) {
					System.out.println("Swetha");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		Thread t3 = new Thread(obj2);
		
		t1.start();
//		t1.join();
		t2.start();
		t3.start();
	}
}
