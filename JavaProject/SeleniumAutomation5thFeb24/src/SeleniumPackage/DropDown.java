package SeleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASHEE\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-testId='open-registration-form-button']")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> listdriver = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		listdriver.get(0).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Size of Month List" + " " + listdriver.size());
	
		listdriver.get(3).click();
		
		List<WebElement> birthname = driver.findElements(By.xpath("//select[@name='birthday_day']/option"));

		birthname.get(3).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Size of Birth Day List" + " " + birthname.size());
		
		List<WebElement> listyear = driver.findElements(By.xpath("//select[@name='birthday_year']/option"));

		listyear.get(11).click();
		
		System.out.println("Size of Year List" + " " + listyear.size());
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}

}
