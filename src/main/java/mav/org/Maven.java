package mav.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Balu\\workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://demo.automationtesting.in/Register.html");
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");

		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("(//span[text()='TECNO Spark 7T(Jewel Blue, 4GB RAM, 64GB Storage) 6000 mAh Battery| 48 MP AI Dual Rear Camera'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();

}
}
