package exercise0409202222;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverNMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		// get(URL)THIS WILL LAUNCH THE BROWSER FOR AS //
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//getCurrentUrl(); this method will get us the url for the 
	    //website that is lanuch by selenium.
	    System.out.println(driver.getCurrentUrl());
	    //get title:this method will print the title to us in the console 
	    System.out.println(driver.getTitle());
	    //getPageSource() 
	    //System.out.println(driver.getPageSource());
	    //Close method : will close the current window
	    //driver.close();
		//Quit method : will close all of the windows opened by Selenium. 
       // driver.quit();
	    //navigate method it used if we need to oper more than one URL
	    Thread.sleep(2000);
	    driver.navigate().to("https://www.google.com/");
	    Thread.sleep(2000);
	    //navigate().back method to open two URL facebook and google
	    //it will open facebook than google
	    driver.navigate().back();
	    Thread.sleep(2000);
	    //navigate().back method to open two URL facebook and google
	    //it will open facebook than google than will forward to facebook
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    ////navigate().back method to open two URL facebook and google
	    //it will open facebook than google than will forward to facebook and
	    //refresh the page agine
        driver.navigate().refresh();
	    Thread.sleep(2000);
	    driver.close();
	}

}
