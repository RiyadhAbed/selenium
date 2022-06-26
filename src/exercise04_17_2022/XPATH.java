package exercise04_17_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//WebElement myAccount = driver.findElement(By.xpath("//button[@name='login']"));
		//myAccount.click();
		WebElement myAccount2 = driver.findElement(By.xpath("//a[text()='Create new account']"));
		myAccount2.click();
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		fName.sendKeys("Riyadh");
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lName.sendKeys("Abed");
		WebElement eMail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		eMail.sendKeys("JIM.AJEELE@GMAIL.COM");
		WebElement pasword = driver.findElement(By.xpath("//input[@data-type='password']"));
		pasword.sendKeys("12345@");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']//child::option[5]"));
		month.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
