package mav.org;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\Balu\\\\workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit wait
		d.get("http://demo.automationtesting.in/Register.html");
		 d.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Monish");
		 WebDriverWait wait = new WebDriverWait(d,30);//explicit wait
		 FluentWait Wait = new FluentWait(d);//fluent wait
		 wait.withTimeout(500, TimeUnit.MILLISECONDS);
		 wait.pollingEvery(500, TimeUnit.MILLISECONDS);
		 Wait.ignoring(NoSuchElementException.class);
		 wait.until(ExpectedConditions.alertIsPresent());
      d.close();
      d.quit();
}

}
