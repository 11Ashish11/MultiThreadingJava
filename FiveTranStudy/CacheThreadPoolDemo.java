package FiveTranStudy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService threadpool = Executors.newCachedThreadPool();
		
		for(int i = 0 ; i < 2000 ; i ++) {
			final int taskId = i;
			threadpool.submit(() -> {
				System.out.println("The current i is " + taskId + " and the thread name over here is " + Thread.currentThread().getName());
			});
		}
		threadpool.shutdown();
	}
}
