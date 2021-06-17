import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEndAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edreams.net/");
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[@id=\"didomi-notice-agree-button\"]/span")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[@id=\"react-app\"]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div/div[2]/label/div/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"react-app\"]/div/div/div[1]/div/div[2]/div/div[2]/div/div/div[1]/div/div/input")).sendKeys("Las Vegas");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"react-app\"]/div/div/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div/input")).sendKeys("Denver");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"react-app\"]/div/div/div[1]/div/div[2]/div/div[2]/div/div/div[3]/div/div[1]/input")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[@id=\"react-app\"]/div/div/div[1]/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div[6]/div[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"flight_type_search_manager\"]/div/div[2]/label/span/span")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[@id=\"react-app\"]/div/div/div[1]/div/div[2]/div/div[3]/div[2]/button")).click();
		Thread.sleep(1000);
		
	}

}
