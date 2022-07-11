package FlishtBookingWebsiteTesting2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownTesting {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//DropDown with select tag
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(3);
		System.out.println("selected : " + dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		dropdown.selectByIndex(2);
		System.out.println("selected : " + dropdown.getFirstSelectedOption().getText());

		dropdown.selectByValue("INR");
		System.out.println("selected : " + dropdown.getFirstSelectedOption().getText());


	}

}
