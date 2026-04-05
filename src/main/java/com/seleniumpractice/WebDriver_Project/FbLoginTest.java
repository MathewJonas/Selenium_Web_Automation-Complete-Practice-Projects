package com.seleniumpractice.WebDriver_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement CreateAccountBtn = driver.findElement(By.xpath("//a[contains(@data-testid,'registration-form')]"));
		CreateAccountBtn.click();

		WebElement FirstName = driver.findElement(By.xpath("//input[@name=\'firstname\']"));
		FirstName.sendKeys("Mathew");

		WebElement LastName = driver.findElement(By.xpath("//input[@name=\'lastname\']"));
		LastName.sendKeys("Jonas");

		// Find the select tag locator
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));

		// create the object for Select class and pass the locator in the constructor
		Select ddDay = new Select(Day);
		ddDay.selectByVisibleText("15");

		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));

		Select ddMonth = new Select(Month);
		// ddMonth.selectByIndex(1);
		// ddMonth.selectByVisibleText("Feb");
		ddMonth.selectByValue("2");

		// WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select dYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		dYear.selectByValue("2001");

		//WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		//Male.click();
		

		// Dynamic way of writing xpath
		String Gender = "Male";
		String genXPATH = "//label[contains(text(),'" + Gender + "')]/input";
		
		WebElement GenderElement = driver.findElement(By.xpath(genXPATH));
		GenderElement.click();
		
		// Gender RAdio button
				WebElement Male = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
				Male.click();

	}

}
