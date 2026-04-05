package com.seleniumpractice.WebDriver_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Tag Locator
		WebElement Header = driver.findElement(By.tagName("h1"));
		String HeaderVal = Header.getText();
		System.out.println(HeaderVal);

		// link locator
		WebElement LoginLink = driver.findElement(By.linkText("Login"));
		LoginLink.click();

		// Class locator
		WebElement UserName = driver.findElement(By.className("email"));
		UserName.sendKeys("mathew@234.com");

		// id locator
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("maramax@123");

		// name locator
		WebElement name = driver.findElement(By.name("rememberMe"));
		name.click();

		WebElement LoginButton = driver.findElement(By.id("btn_login"));
		LoginButton.click();

		// printing error message

		WebElement Error = driver.findElement(By.id("error_msg"));
		String ErrorMsg = Error.getText();
		System.out.println("the error is message " + ErrorMsg);

		// Print the title
		String Title = driver.getTitle();
		System.out.println(Title);

		// Print the current url
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

		// Partial link text locator
		WebElement ForgotPwd = driver.findElement(By.partialLinkText("Forgot "));
		ForgotPwd.click();

	}

}
