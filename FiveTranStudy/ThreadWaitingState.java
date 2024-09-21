package FiveTranStudy;

public class ThreadWaitingState {
	public static void main(String[] args) throws InterruptedException {
		Object o = new Object();
		
		Thread t1 = new Thread(() -> {
			synchronized (o) {
				System.out.println("Currently t1 is running !!!");
				try {
					// Important -- this Object that has wait here ---- 
					o.wait(); // Also here O is released now
					// Now t1 is in waiting state and it will wait
					// till it recevies notify() from any other thread
					
					System.out.println("Now the thread t1 is running again");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				System.out.println("Now th thread t1 has completed");
			}
		});
		
		Thread t2 = new Thread(() -> {
			synchronized (o) {
				System.out.println("Currently in thread t2");
				o.notify();
				System.out.println("O has notified the other thread");
			}
		});
		
		t1.start();
		Thread.sleep(2000);
		t2.start();
	}
}
