package FiveTranStudy;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<String> value = executor.submit(new CallableImpl());
		
		String ans = value.get();
		System.out.println("The answer that we got here is :: " + ans);
		
		
		Callable<String> c1 = () -> {
			String currvalue = "New Value";
			return currvalue;
		};
		
        Future<String> future1 = executor.submit(c1);
        String ans2 = future1.get();
        System.out.println(ans2);
        
		
	}
}
