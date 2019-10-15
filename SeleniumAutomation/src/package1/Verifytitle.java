package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitle {

	@SuppressWarnings("hiding")
	public static <WebElement> void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://paytm.com/");
		//driver.findElement(By.xpath("//*[@class='_3thc'and@data-reactid='68']")).click();
		//Thread.sleep(1000);
		//driver.getCurrentUrl();
		//Thread.sleep(1000);
		//driver.close();
		/*String d = driver.getTitle();
		System.out.println(d);
		driver.get("https://www.flipkart.com/");
		String f= driver.getTitle();
		System.out.println(f);
		driver.close();*/
		driver.get("https://www.google.com/");
		org.openqa.selenium.WebElement search=driver.findElementByXPath("//input[@class='gLFyf gsfi\']");
		
		
		search.sendKeys("mom");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		
		search.sendKeys("mom");
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		System.out.println("hi");
		System.out.println("how are you");
		/*System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElementByPartialLinkText("Images").click();;
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		driver.navigate().back();*/
		//System.out.println("title of the page:"+driver.getCurrentUrl());
		driver.quit();
		/*if(driver.getTitle().matches(f));
		System.out.println("Success");
		
		//verify that we are now back on Facebook's homepage		
		if (driver.getTitle().equals("Facebook - log in or sign up")) {							
        System.out.println("We are back at Facebook's homepage");					
    } else {			
        System.out.println("We are NOT in Facebook's homepage");					
        
        }	driver.close();	
*/
		/*driver.get("https://paytm.com/");
		List<org.openqa.selenium.WebElement> elements = driver.findElements(By.cssSelector("a[href='https://paytm.com/recharge']"));
	    System.out.println("Number of elements:" +elements.size());*/
	}

}
