package exercise0409202222;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    //WebDriverElement 
	    // Clear & click we practice it yesterday
	    //getAttribut method to pass the name or propertyname and
	    //it will get the attribut for as 
	    WebElement element1 = driver.findElement(By.name("login"));
	    System.out.println(element1.getAttribute("login"));
	    WebElement element2 = driver.findElement(By.linkText("Create new account"));
	    System.out.println(element2.getAttribute("role"));
        //getCssValue will get us the Css value of that element
	    //cascading style Sheets
	    System.out.println(element2.getCssValue("background-color"));
	    System.out.println(element2.getCssValue("width"));
	    //getlocation it will give as the location in UR 
	    System.out.println(element2.getLocation());
	    //get rectangle will give as the height and weight and X & Y
	    Rectangle rect = element2.getRect();
	    System.out.println("Height:="+rect.getHeight());
	    System.out.println("width:="+rect.getWidth());
	    System.out.println("X:="+rect.getX());
	    System.out.println("Y:="+ rect.getY());
	    Thread.sleep(2000);
	    driver.close();
	    
	
	
	
	
	
	
	
	
	}

}
