package firsttest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement Source = driver.findElement(By.xpath("//div[@id = 'draggable']"));
		WebElement Target = driver.findElement(By.xpath("//p[text()='Drop Here']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(Source, Target).build().perform();

	}

}
