package testng.examples.threadpool.example;

import org.testng.annotations.Test;

public class ThreadPoolExample {
	@Test(threadPoolSize = 5000,invocationCount = 100000)
	public void f() {
		System.out.println("In test case 1");
		try {
			Thread.sleep(000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(threadPoolSize = 30,invocationCount = 100)
	public void g() {
		System.out.println("In test case 2");
		try {
			Thread.sleep(000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(threadPoolSize = 30,invocationCount = 1000)
	public void h() {
		System.out.println("In test case 3");
		try {
			Thread.sleep(000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
