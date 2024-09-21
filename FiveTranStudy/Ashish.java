package FiveTranStudy;

public class Ashish {
	public static void main(String[] args) throws InterruptedException {
//		ThreadClassDemo threadClassDemo = new ThreadClassDemo();
//		threadClassDemo.start();
//		System.out.println("I am printing something in this main thread " + Thread.currentThread().getName());
//		
		
		
		Thread thread = new Thread(() -> {
		    try {
		        while (!Thread.currentThread().isInterrupted()) {
		            System.out.println("Thread is running");
		            Thread.sleep(1000);
		        }
		    } catch (InterruptedException e) {
		        System.out.println("Thread was interrupted");
		    }
		});

		thread.start();
		Thread.sleep(5000); // Let the thread run for 5 seconds
		thread.interrupt(); // Interrupt the thread
	}
}
