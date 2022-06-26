package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		// either way we can use but in the second way we need 
		//to be sure that is the driver in folder C because 
		//if the driver is not in the driver C the code will not be working.
		// get URL is a method coming from webDriver interface and when we pass
				 //a URL as Stringand execute our code , it will lunch the URL for us.
				 // When we should learn how those methods are implemented in the class.
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\17035\\eclipse-"
				//+ "workspace\\selenium\\Driver2\\chromedriver.exe");
       // line 21 will maximize the window(active browser opened by  selenium)
		// and this will enable the script to interact will all visible elements
		//on the page.
		System.setProperty("webdriver.chrome.driver",".\\driver2\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 WebElement text = driver.findElement(By.xpath("//a[text()='create new account']"));
		 System.out.println(text.getText());
		 text.click();
	}

}
