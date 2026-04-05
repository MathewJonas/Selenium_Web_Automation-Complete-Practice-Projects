package firsttest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//WebElement ele = driver.findElement(By.linkText("Images"));
		//ele.click();
		
		WebElement signin = driver.findElement(By.cssSelector("a[aria-label=\'Sign in\']"));
		signin.click();
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("jonasmathewxpath@gmail.com");
		
		//WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		//next.click();
		
		WebElement createNew = driver.findElement(By.xpath("//span[text()='Next']"));
		
		createNew.click();
		

	}

}
