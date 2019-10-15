
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;


public class New {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {

	
	ChromeDriver driver = new ChromeDriver();

	driver.get("http://demo.guru99.com/popup.php");
	driver.findElement(By.xpath("//*[@href='../articles_popup.php']")).click();
	String parentwindow= driver.getWindowHandle();
	Set<String> a=driver.getWindowHandles();
	Iterator<String> i =a.iterator();
	
		while(i.hasNext())
		{
			String childwindow=i.next();
			if(!parentwindow.equalsIgnoreCase(childwindow));
			driver.switchTo().window(childwindow);
			driver.findElement(By.name("emailid")).sendKeys("mickeymouse@gmail.com");
            
            driver.findElement(By.name("btnLogin")).click();		
            
driver.close();
			driver.switchTo().window(parentwindow);
	
	/*driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys("mickeymouse@gmail.com");
	Thread.sleep(200);
	driver.findElementByCssSelector("input[name=btnLogin]").click();
	//---Alert msg---
	/*driver.findElement(By.xpath("//*[@name='cusid']")).sendKeys("loki");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@name='submit']")).click();
	Thread.sleep(1000);
	Alert Alert= driver.switchTo().alert();
	String alertmesg=driver.switchTo().alert().getText();
	Thread.sleep(200);
	System.out.println(alertmesg);
	Thread.sleep(500);
	Alert.accept();
	Thread.sleep(500);*/
		}}}
