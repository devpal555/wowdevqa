import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUIElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aa.com/");
		
		
		
		System.out.println(driver.findElement(By.id("aa-returningFrom")).isEnabled());
		driver.findElement(By.xpath("//*[@id=\"bookingCheckboxContainer\"]/div[1]/div[2]/label/span[1]")).click();
		System.out.println(driver.findElement(By.id("aa-returningFrom")).isDisplayed());
		Thread.sleep(800);
		driver.close();
		/*Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		Thread.sleep(800);
		driver.close();*/
	}

}
