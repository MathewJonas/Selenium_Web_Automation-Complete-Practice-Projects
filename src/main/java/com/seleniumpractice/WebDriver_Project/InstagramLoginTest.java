package com.seleniumpractice.WebDriver_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("mathew-14");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("megh@n@");
		
		WebElement login = driver.findElement(By.xpath("//*[text()='Log in']"));
		login.click();
		
		WebElement createacc = driver.findElement(By.xpath("//span[text()='Create new account']"));
		createacc.click();
		
		WebElement CopyHeader = driver.findElement(By.xpath("//*[text()='Get started on Instagram']"));
		System.out.println(CopyHeader.getText());
		
		WebElement enterEmail = driver.findElement(By.xpath("//input[@id='_r_7_']"));
		enterEmail.sendKeys("8553750961");
		
		WebElement enterPass = driver.findElement(By.xpath("//input[@type='password']"));
		enterPass.sendKeys("Megh@13");
		

	}

}
