package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHEE\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,300)");
		
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(2000);
	
		driver.switchTo().alert().accept();
	
		System.out.println("Alert is accepted");
		
	
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		System.out.println("Alert is dismissed");
		

	}

}
