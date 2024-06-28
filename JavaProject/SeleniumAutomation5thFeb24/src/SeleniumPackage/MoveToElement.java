package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHEE\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sellglobal.ebay.in/seller-center/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        
        Thread.sleep(1000);
        WebElement PF = driver.findElement(By.linkText("Payments & Fees"));
        Actions act = new Actions(driver);
        act.moveToElement(PF).perform();
        
        Thread.sleep(1000);
        WebElement S = driver.findElement(By.linkText("Shipping"));
        Actions act1 = new Actions(driver);
        act.moveToElement(S).perform();
        
        
	}

}
