package FiveTranStudy;

public class ThreadBlockedState {
	public static void main(String[] args) throws InterruptedException {
		Object o = new Object();
		
		Thread t1 = new Thread(() -> {
			synchronized (o) {
				
				try {
					System.out.println("Here the thread 1 is still running");
					Thread.sleep(6000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Now the thread 1 execution has finished ");
			}
		});
		
		Thread t2 = new Thread(() -> {
			System.out.println("Here the thread t2 is waiting !!!!!!");
			// Now currently the thread 2 is in blocked state because t1 still has the lock of O
			synchronized (o) {
				System.out.println("Thread 2 is operational now");
			}
		});
		
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}
}
