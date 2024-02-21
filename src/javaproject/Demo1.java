package javaproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) {
WebDriver driver =  new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=4398331867800852927&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9183906&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	
	WebElement samsung = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Pink']"));
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
 js.executeScript("arguments[0].scrollIntoView()", samsung);
	
	
	Actions a=new Actions(driver);
a.click(samsung).build().perform();

	
	}

}
