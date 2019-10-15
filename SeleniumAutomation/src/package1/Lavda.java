package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lavda {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://www.google.com");
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[ @id='u_0_j']")).sendKeys("meow");
		/*WebElement username = driver.findElement(By.xpath("//*[@type='email']")); 
	    WebElement password = driver.findElement(By.xpath("//*[@type='password' and @class='inputtext']"));
	    WebElement Login = driver.findElement(By.cssSelector(".uiButton"));
	    username.sendKeys("spmishra1006@yahoo.com");
	    password.sendKeys("1ms11ml054");
	    Login.click();*/
		
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[ @id='u_0_l']")).sendKeys("mishra");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[ @id='u_0_o']")).sendKeys("mishrababykharus@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[ @id='u_0_r']")).sendKeys("mishrababykharus@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[ @id='u_0_v']")).sendKeys("mthakharap");
	    Thread.sleep(1000);
	    //driver.findElementById("day").click();
	    Select day = new Select(driver.findElementById("day"));
	    day.selectByVisibleText("3");
	    day.selectByIndex(3);
	    Thread.sleep(1000);
	    Select month = new Select(driver.findElementById("month"));
	    month.selectByVisibleText("May");
	    month.selectByIndex(5);
	    Thread.sleep(1000);
	    Select year = new Select(driver.findElementById("year"));
	    year.selectByVisibleText("1994");
	    year.selectByIndex(25);
	    Thread.sleep(1000);
	    WebElement sex = driver.findElement(By.xpath("//*[@id='u_0_a']")); 
	    sex.click();
	    Thread.sleep(1000);
	   driver.findElementByXPath("//*[ @name='websubmit']").click();
	   Thread.sleep(1000);
	   driver.close();
	   

	}

}
