package seleniumPractice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownload 
{
@Test
	public void download() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\ChromeSetup.exe");

    // Set custom download directory path
    String downloadFilepath = "D:\\Amutha - Test Leaf";
    Map<String, Object> prefs = new HashMap<String, Object>();
    prefs.put("download.default_directory", downloadFilepath);
    prefs.put("download.prompt_for_download", false);  // Disables prompt to save
    prefs.put("download.directory_upgrade", true);     // Enables directory change

    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("prefs", prefs);
	
	
	
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.leafground.com/file.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	
	
	
	//just to download the file - default stored in downloads folder
	driver.findElement(By.xpath("//span[text()='Download']")).click();
	Thread.sleep(3000);
	driver.close();
	}
}	
