package firsttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(System.getProperty("java.version"));

		WebDriver driver = new ChromeDriver();
		driver.get("https://simplilearn.com/");
		driver.manage().window().maximize();
		driver.close();
		

	}

}
