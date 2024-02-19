package core_java;

class One {
	int count ;
	public synchronized void increment() {
		count++;
	}
}

public class ThreadClass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		One one = new One();
		Runnable r1 = () ->
		{
			for(int i=0;i<1000;i++) {
				one.increment();
			}
		};
		
		Runnable r2 = () -> 
		{
			for(int i=0;i<1000;i++) {
				one.increment();
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();		
		t2.start();
		
		t1.join();
		t2.join();

		
		System.out.println(one.count);
	}

}
