package AlertUsingJavaSeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertChecking {

	public static void  (String[] args) throws InterruptedException {

		String text = "Ismail";
		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);				
		
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);		
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(1000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}
