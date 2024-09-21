package FiveTranStudy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i = 0 ; i < 10 ; i ++) {
			final int taskId = i;
			executor.submit(() -> {
				System.out.println("The value of i over here is :: " + taskId + " and the thread name over here is :: " + Thread.currentThread().getName());
			});
		}
		executor.shutdown();
	}
}
