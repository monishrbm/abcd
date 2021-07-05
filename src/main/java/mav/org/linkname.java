package mav.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkname {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Balu\\\\workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
	List<WebElement> link = driver.findElements(By.tagName("a"));
	for (WebElement lnk : link) {
		String attribute = lnk.getAttribute("href");
		System.out.println(attribute);
	
	}

	}
}
