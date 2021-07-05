package mav.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webpage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Balu\\\\workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php ");
		WebElement fName = driver.findElement(By.name("firstName"));
		fName.sendKeys("Monish");
		String strFname = fName.getAttribute("value");
		System.out.println(strFname);
		
		WebElement lName = driver.findElement(By.name("lastName"));
		lName.sendKeys("Balu");
		
		String strLname = lName.getAttribute("value");
		System.out.println(strLname);
		
		WebElement Phn = driver.findElement(By.name("phone"));
		Phn.sendKeys("9876543210");
		String phn1 = Phn.getAttribute("value");
		System.out.println(phn1);
		
		WebElement Add = driver.findElement(By.name("address1"));
		Add.sendKeys("394,4th street");
		String Add1 = Add.getAttribute("value");
		System.out.println(Add1);
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Sydney");
		String City = city.getAttribute("value");
		System.out.println(City);
		
		
		WebElement country = driver.findElement(By.name("country"));
		Select S = new Select(country);
		S.selectByVisibleText("AUSTRALIA");
				
		WebElement uName = driver.findElement(By.xpath("//input[@name='email']"));
		uName.sendKeys("monish");
		String uName1 = uName.getAttribute("value");
		System.out.println(uName1);
				
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("Abc123");
		String pwd1 = pwd.getAttribute("value");
		System.out.println(pwd1);
		
		WebElement cPwd = driver.findElement(By.name("confirmPassword"));
		cPwd.sendKeys("Abc123");
		String cPwd1 = cPwd.getAttribute("value");
		System.out.println(cPwd1);
				
		driver.findElement(By.name("submit")).click();	
	}

}


