package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHEE\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		JavascriptExecutor js = (JavascriptExecutor) driver;		
		Thread.sleep(2000);		
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement button1 = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		Actions act = new Actions(driver);
		act.contextClick(button1).perform();
		
		WebElement button2 = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions act1 = new Actions(driver);
		act1.doubleClick(button2).perform();
	

	}

}
