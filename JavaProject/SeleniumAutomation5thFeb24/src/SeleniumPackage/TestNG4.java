package SeleniumPackage;

import org.testng.annotations.Test;

public class TestNG4 {
	
	@Test
	public void a() {
		System.out.println("Hello a test case");
	}

	@Test(enabled=false)
	public void b() {
		System.out.println("Hello b test case");
	}

	@Test(enabled=true)
	public void c() {
		System.out.println("Hello c test case");
	}

	@Test(invocationCount=4)
	public void d() {
		System.out.println("Hello d test case");
	}
}
