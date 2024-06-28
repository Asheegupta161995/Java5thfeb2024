package SeleniumPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHEE\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,300)");
		
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
	
		Thread.sleep(2000);
		
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		Iterator<String> abc = allWindow.iterator();
		String win1 = abc.next();
		String win2 = abc.next();
		
		driver.switchTo().window(win1);
		System.out.println("Parent window ID "+win1);
		
		driver.switchTo().window(win2);
		System.out.println("Parent window ID "+win2);
		
		driver.close();
		driver.quit();
		
	}

}
