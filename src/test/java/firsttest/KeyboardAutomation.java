package firsttest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardAutomation {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement Query = driver.findElement(By.name("q"));

        Query.sendKeys("Mathew");

        Thread.sleep(2000);

        Query.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));

        Thread.sleep(2000);

        Query.sendKeys("Mathew Jonas");

        Thread.sleep(3000);

        driver.quit();

	}

}
