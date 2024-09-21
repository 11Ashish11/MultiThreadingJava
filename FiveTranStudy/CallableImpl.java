package FiveTranStudy;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<String> {
	@Override
	public String call() {
		String Ashish = new String("Ashish");
		return Ashish;
	}
}
