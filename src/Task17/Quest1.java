package Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class Quest1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.35.0-win-aarch64");

		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.35.0-win-aarch64"); // This is the location where
																							// you have installed
																							// Firefox on your machine

		WebDriver driver = new FirefoxDriver(options);

		//WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.snapdeal.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.className("accountInner"));
		Actions action = new Actions(driver);
		action.moveToElement(link).build().perform();
		driver.findElement(By.xpath("//a[text()='login']")).click();
		// driver.findElement(By.className("newUserRegister")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("userName")).sendKeys("Test@gmail.com");
		driver.findElement(By.id("checkUser")).click();
		Thread.sleep(2000);
		System.out.println("Logged in succesfully");
		driver.close();
	}

}