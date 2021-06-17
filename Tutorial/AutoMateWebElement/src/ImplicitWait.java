import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.findElement(By.xpath("//*[@id=\'package-origin-hp-package\']")).sendKeys("NYC");
		driver.findElement(By.xpath("//*[@id=\'package-origin-hp-package\']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\'package-destination-hp-package\']")).sendKeys("Tor");
		driver.findElement(By.xpath("//*[@id=\'package-destination-hp-package\']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\"package-departing-hp-package\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\'search-button-hp-package\']")).click();
		
	}

}
