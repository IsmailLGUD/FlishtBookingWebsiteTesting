package FlightBookingWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2End {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@value='DEL'] ")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();//Some Clients don't like to use index
		
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();//parent-child xpath
		
		
		
		//driver.findElement(By.className("ui-datepicker-trigger")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			System.out.println("It's enabled!!");
			Assert.assertTrue(true);
			
		}	else {
			
			Assert.assertTrue(false);
			
		}
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		
		List <WebElement> options = (driver.findElements(By.cssSelector("li[class='ui-menu-item'] a")));

		for (WebElement option :options) {
			if(option.getText().equalsIgnoreCase("India")) {
				System.out.println(option.getText());
				option.click();
			}
		}
		
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//can be done by both by for or while loop
		
		/*int i =1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}*/
		
		
		
		for (int i=1; i<5; i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		
		
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);//selecting option through index
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
//		dropdown.selectByValue("INR");
//		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		//driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
