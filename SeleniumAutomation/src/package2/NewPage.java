package package2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewPage {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//*[@class='_3thc'and@data-reactid='68']")).click();
		Thread.sleep(1000);
		driver.getCurrentUrl();
		Thread.sleep(1000);
		driver.close();
	
		
		driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("9003429271");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Airtel");
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Andhra Prdesh");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@data-reactid='209a'and@type='text']")).sendKeys("10");
		driver.close();
}
}