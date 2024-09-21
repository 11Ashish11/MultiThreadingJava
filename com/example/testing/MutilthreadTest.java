package com.example.testing;

import java.util.concurrent.Callable;

public class MutilthreadTest implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello from other thread");
		return null;
	}

}
