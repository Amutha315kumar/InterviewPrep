package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload 
{
@Test(invocationCount = 2, invocationTimeOut = 30000)
	public void fileUpload() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Normal fileupload
		//WebElement upload = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt89_input']")); 
		
		//Upload only pictures
		WebElement upload = driver.findElement(By.xpath("//input[@id='j_idt97:j_idt98_input']"));
		
		Thread.sleep(2000);
		upload.sendKeys("D:\\Amutha - Test Leaf\\SampleImage.jpg");
		Thread.sleep(5000);
		driver.close();
	}
	
	
}
