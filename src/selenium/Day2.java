package selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		// WebDriver is an interface, we are using reference of WebDriver interface.
		// driver is a variable name/identifier.
		//new is a keyword and we can use it when we want to create an object of another class.
		// ChromeDriver(); is ChromeDriver class and we call the constructor of ChromeDriver class.
		
		WebDriver driver = new ChromeDriver();
		// if ChromeDriver () is a class, why we aren't using the following method to
		// create object if ChromeDriver () class.
		// THe reason that we don't using the following method to create object of ChromeDriver 
		// is because they are two method coming from SearchContext interface and then we will lose access
		// to all the methods that are coming from WebDriver() interface.
		// get URL is a method coming from WebDriver interface and once we pass a URL as a String 
		//and execute our code, it will lunch the URL for us.
		// when Learning Selenium ,there are a lot of methods callings that we would do, but that doesn't
		// mean we should learn how those methods are implemented in the classes.
		driver.get("https://www.facebook.com/");
		
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			




	}

}
