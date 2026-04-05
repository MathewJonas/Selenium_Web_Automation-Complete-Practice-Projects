package firsttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LauchEdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://simplilearn.com/");
		driver.manage().window().maximize();
		driver.close();

	}

}
