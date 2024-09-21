package FiveTranStudy;

public class RaceConditionDemo {
	private static int count = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() -> {
			for(int i = 0 ; i < 10000 ; i ++) count++;
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0 ; i < 100000 ; i ++) count++;
		});
		
		t1.start();
		t2.start();
		
		System.out.println("The current value of count is " + count);
		t1.join();
		t2.join();
		
		System.out.println("After both thread completion the value of count is " + count);
		
	}
}
