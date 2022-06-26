package exercise04_17_2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.costco.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        WebElement register = driver.findElement(By.xpath("//a[@id='header_sign_in']"));
        register.click();
        Thread.sleep(2000);
        WebElement createAccount = driver.findElement(By.xpath("//a[@id = 'createAccount']"));
        createAccount.click();
        Thread.sleep(3000);
        WebElement EmailAdress = driver.findElement(By.xpath("//input[@id='email']"));
        EmailAdress.sendKeys("a1a1a1a7.8aa@gmail.com");
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.xpath("//input[@id='newPassword']"));
        password.sendKeys("Alajeele@12344");
        WebElement password1 = driver.findElement(By.xpath("//input[@id='reenterPassword']"));
        password1.sendKeys("Alajeele@12344");
        Thread.sleep(3000);
        WebElement buttom = driver.findElement(By.xpath("//input[@id='sendMeEmail_']"));
        buttom.click();
        Thread.sleep(3000);
        WebElement continueButton = driver.findElement(By.xpath("//button[@id='continue']"));
		continueButton.click();
        
	}

}
