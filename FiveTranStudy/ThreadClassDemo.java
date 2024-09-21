package FiveTranStudy;

public class ThreadClassDemo extends Thread {
	@Override
	public void run() {
		System.out.println("I am doing some operation in this thread");
		System.out.println("The current thread name is ::" + Thread.currentThread().getName());
	}
}
