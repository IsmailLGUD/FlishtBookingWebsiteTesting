package FlishtBookingWebsiteTesting2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTestin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).isSelected());
		
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
		
		//count all checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}

