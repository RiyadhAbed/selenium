package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class AlertwithonlyOKButton {

	public static void main(String[] args) throws InterruptedException {
  
//		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Thread.sleep(3000);
//		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
//		driver.switchTo().frame(iframe1);
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//
//
//
//		Alert alert = driver.switchTo().alert();
//	    alert.accept();
//		alert.dismiss();
//		//below line of code will bring you back to the main web page content and you will be
//		//able to exist the frame and enter the main content of the web page and perform the rest
//		//of you actions on the main content
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("runbtn")).click();

 
	    
//		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		//if the alert/popup is asking for authentication, we can provide the authentication
//		//in the same line below:
//		//right after (https://) we can provide the username
//		//add colon (:) and then provide the password
//		//then use the (@) and then provide the URL
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
//	    
//	    
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement uiText = driver.findElement(By.tagName("h2"));
		String actualText = uiText.getText();
		String expectedText = "Connect with friends and the world around you on Facebook222.";
		Assert.assertEquals(expectedText, actualText);
  
		
		 
		
		try {
			Thread.sleep(3000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
			}
		driver.close();
		}
		
		
		
		
		
		
	}


		
	


