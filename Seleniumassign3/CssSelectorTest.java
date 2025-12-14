package Seleniumassign3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorTest {
  @Test
  public void f() {
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.cssSelector("#searchInput")).sendKeys("Laptop");
		driver.findElement(By.cssSelector(".sprite.svg-search-icon")).click();
  }
}
