package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHEE\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@data-testId='open-registration-form-button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();

	}

}
