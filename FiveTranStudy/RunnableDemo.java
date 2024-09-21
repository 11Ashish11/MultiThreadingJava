package FiveTranStudy;

public class RunnableDemo {
	public static void main(String[] args) {
		RunnableImpl runnableImpl = new RunnableImpl();
		Thread t1 = new Thread(runnableImpl);
		t1.start();
		
		Thread t2 = new Thread(new RunnableImpl());
		t2.start();
	}
}
