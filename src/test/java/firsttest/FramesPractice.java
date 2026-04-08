package firsttest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().frame("frame1");
		WebElement Header = driver.findElement(By.tagName("h1"));
		System.out.println(Header.getText());
		
		//driver.switchTo().frame("frame2");
		//WebElement Header1 = driver.findElement(By.id("sampleHeading"));
		//System.out.println(Header1.getText());
		

	}

}
