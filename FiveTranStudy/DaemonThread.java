package FiveTranStudy;

public class DaemonThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			System.out.println("This is being printed from other thread");
			System.out.println("The thread name over here is " + Thread.currentThread().getName());
		});
		t1.start();
		System.out.println("The thread name over here is " + Thread.currentThread().getName());
		System.out.println("This is being printed from the main thread");
		
	}
}
