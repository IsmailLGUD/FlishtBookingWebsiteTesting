package FlishtBookingWebsiteTesting2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CurrencyStaticDropdownTesting{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=currency+converter&oq=currency+converter&aqs=chrome..69i57j0i512l9.6678j1j9&sourceid=chrome&ie=UTF-8");
		
//		driver.findElement(By.cssSelector("input[type$='text']")).sendKeys("currency converter");
//		driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc'] input[name='btnK']")).click();
		
		WebElement staticDropdown = driver.findElement(By.cssSelector("select[class$='l84FKc R9zNe vk_bk Uekwlc']"));
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(1);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	}

}
