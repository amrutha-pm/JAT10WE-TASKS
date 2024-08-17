package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Question1 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.35.0-win64.exe");
		WebDriver driver = new FirefoxDriver();
	

		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();

	  //  FirefoxOptions options = new FirefoxOptions();
	  //  driver = new FirefoxDriver(options);
	}

}