package SeleniumPackage;

import org.testng.annotations.Test;

public class TestNG3 {
	
	@Test(priority=-1)
	public void a() {
		System.out.println("Hello a test case");
	}

	@Test(priority=2)
	public void b() {
		System.out.println("Hello b test case");
	}

	@Test(priority=0)
	public void c() {
		System.out.println("Hello c test case");
	}

	@Test(priority=1)
	public void d() {
		System.out.println("Hello d test case");
	}

}
