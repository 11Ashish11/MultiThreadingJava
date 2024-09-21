package FiveTranStudy;

public class RunnableImpl implements Runnable {
	@Override
	public void run() {
		System.out.println("This is being printed from other thread");
		System.out.println("The name of the currentThread is  :: " + Thread.currentThread().getName());
	}
}
