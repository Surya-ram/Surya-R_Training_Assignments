package Seleniumassign1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigatecommandsTest {
  @Test
  public void Performnavigate() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.navigate().to("https://www.youtube.com/");
	  Thread.sleep(2000);
	  driver.navigate().forward();
	  
	  driver.navigate().to("https://open.spotify.com/");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  

	  driver.navigate().to("https://www.youtube.com/");
	  Thread.sleep(2000);
	  driver.navigate().forward();
	  
	  driver.navigate().refresh();
	  
  }
}
