package FiveTranStudy;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
	private static final AtomicInteger atomicInt = new AtomicInteger(0);
	
	public static void main(String[] args) {
	
		System.out.println("The current value of atomicInt is  :: " + atomicInt.get());
		
		for(int i = 0 ; i < 5 ; i ++) { 
			Thread t1 = new Thread(() -> {
				for(int j = 0 ; j < 1000 ; j ++) {
					atomicInt.incrementAndGet();
			     }
				System.out.println("The new value of atomic Number is :: " + atomicInt.get());
		     });
			t1.start();
		}
		
		//System.out.println("The new value of atomic Number is :: " + atomicInt.get());
	}
}
