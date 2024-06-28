package SeleniumPackage;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestNG5 {
	
	@Test
	public void z() {
		AssertJUnit.assertTrue(3>12);
		System.out.println("Hello z test case");
	}

	@Test(dependsOnMethods = "z")
	public void b() {
		System.out.println("Hello b test case");
	}

}
