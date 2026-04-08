package firsttest;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement tabBtn = driver.findElement(By.xpath("//button[@id='tabButton']"));
		tabBtn.click();

		// converting set to list

		List<String> AllWin = new ArrayList<>(driver.getWindowHandles());

		String Parent = AllWin.get(0);
		String Child = AllWin.get(1);

		// switching to the new window using the below method
		driver.switchTo().window(Child);
		WebElement Header = driver.findElement(By.tagName("h1"));
		System.out.println(Header.getText());

		driver.close();
		driver.switchTo().window(Parent);

		WebElement Windowbtn = driver.findElement(By.xpath("//button[@id='windowButton']"));
		Windowbtn.click();

		ArrayList<String> newWind = new ArrayList<>(driver.getWindowHandles());

		Parent = newWind.get(0);
		Child = newWind.get(1);

		driver.switchTo().window(Child);
		WebElement Header1 = driver.findElement(By.tagName("h1"));
		System.out.println(Header1.getText());

		driver.close();
		driver.switchTo().window(Parent);

	}

}
