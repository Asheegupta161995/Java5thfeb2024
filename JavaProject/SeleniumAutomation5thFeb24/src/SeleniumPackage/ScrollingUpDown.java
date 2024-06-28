package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUpDown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHEE\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		
		//Syntax to scroll
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
	//1st way: Using pixels
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,450)");
		
        Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-250)");
		
	//2nd way: Till web element not found		
	
		WebElement demo = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		
	    js.executeScript("arguments[0].scrollIntoView();", demo);
		
    //3rd way: Scroll to the bottom of the page
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  	}

}
