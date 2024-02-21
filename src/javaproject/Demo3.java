package javaproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	String basewindow = driver.getWindowHandle();	
		
	driver.findElement(By.id("selenium143")).click();
	Set<String> newwindows = driver.getWindowHandles();
	/*Iterator<String> itr = newwindows.iterator();
   while(itr.hasNext()) {
	String window = itr.next();
	driver.switchTo().window(window);
	if(!driver.getWindowHandle().equals(basewindow)) {
System.out.println(driver.getTitle());
driver.close();
	}
}*/
	
for(String windowid:newwindows) {
	if(!windowid.equals(basewindow)) {
		driver.switchTo().window(windowid);
		System.out.println(driver.getTitle());
		driver.close();
	}
	
}
	
	
	
	
	
	}
	

}
