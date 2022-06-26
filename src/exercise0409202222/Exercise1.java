package exercise0409202222;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.get("https://www.amazon.com/");
		driver.get("https://www.google.com/");

		//TO MAKZEMISE THE SIZE OF THE PAGE WHEN WE OPEN IT.
		driver.manage().window().maximize();
		// pageLoadTimeout will wait for the page to load.
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		// implicitlyWait wait will be there for the entire execution
		// it will wait for all elements to be loaded entirely befor executing next
		// step, this wait will be there until the browser is open.
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		 // How to call the Element using x path with use the text of the element.
//		   // for create new account  bottom
//	   WebElement text = driver.findElement(By.xpath("//a[text()='Create new account']"));	
//	   // How to call the Element using x path with use the text of the element.
//	   // for log in bottom
//	   WebElement text2 = driver.findElement(By.xpath("//button[text()='Log In']"));
//	    // locating an element using id.
//	   // WebElement element1 = driver.findElement(By.id("u_0_d_nb"));
//	    
//	    // locating an element using id.
//        WebElement element2 = driver.findElement(By.name("login"));
//        element2.click();
//	    text2.click();
//	    
//       System.out.println(text.getText());
//        text.click();
		//locating an element using classname
		Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.className
				("MV3Tnb"));
	     System.out.println(element3.getText());
	
	
	

	}

}
