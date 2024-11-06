package seleniumPractice;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Simple {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0203nyarocmp41msru02ijf1fl7456000.node0");
		
		driver.findElement(By.xpath("//button[@role='button'][1]")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		
		
		

	}

}
