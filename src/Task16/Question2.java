package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Downloads\\drive.geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		if (driver.getTitle().equals("STORE")) {
			System.out.println("Page landed on correct website");

		} else {
			System.out.println("Page not landed on correct website");

		}
		Thread.sleep(2000);

		driver.close();

	}
}