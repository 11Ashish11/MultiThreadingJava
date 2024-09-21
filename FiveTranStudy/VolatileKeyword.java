package FiveTranStudy;

public class VolatileKeyword {
	private volatile static boolean flag = true;
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			if(flag) {
				System.out.println("The flag is currently true and so this is printed here");
			}
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			flag = false;
		});
		
		
		Thread t2 = new Thread(() -> {
			while(flag) {
				// doing nothing till the flag is true
			}
			System.out.println("Reached at this part because the flag is false now");
		});
		
		t1.start();
		t2.start();
		
		//t1.join();
		//t2.join();
	}
}
