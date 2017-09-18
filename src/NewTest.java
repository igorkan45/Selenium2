package by.htp.googletest;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.testng.annotations.Test;

public class NewTest {

	@Test
	public void testLogin() {

		System.setProperty("webdriver.chrome.driver", "C:/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.mail.ru");

		WebElement login = driver.findElement(By.id("mailbox__login"));
		login.click();
		login.sendKeys("tathtp");

		WebElement psswd = driver.findElement(By.id("mailbox__password"));
		psswd.click();
		psswd.sendKeys("Klopik123");

		WebElement submit = driver.findElement(By.id("mailbox__auth__button"));
		submit.click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement logout = driver.findElement(By.id("PH_logoutLink"));

		assertTrue(logout.isDisplayed());

	}
}
