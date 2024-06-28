package SeleniumPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG1 {

	@Test
	public void Test2() {
		System.out.println("Hello Test Case2");
	}
	
	@BeforeSuite
	public void Test3() {
		System.out.println("Hello Test Case3");
	}
	@AfterMethod
	public void Test4() {
		System.out.println("Hello Test Case4");
	}
	@BeforeClass
	public void Test5() {
		System.out.println("Hello Test Case5");
	}
	@AfterTest
	public void Test6() {
		System.out.println("Hello Test Case6");
	}
	@AfterClass
	public void Test7() {
		System.out.println("Hello Test Case7");
	}
	@BeforeMethod
	public void Test8() {
		System.out.println("Hello Test Case8");
	}
	@AfterSuite
	public void Test9() {
		System.out.println("Hello Test Case9");
	}
}
