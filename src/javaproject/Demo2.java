package javaproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {

	public static void main(String[] args) {
		waitingUntilElement();

	}

public static void waitingUntilElement() {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/");
	WebElement dropDown = driver.findElement(By.className("dropbtn"));
	dropDown.click();
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart"))).click();
driver.navigate().back();

driver.findElement(By.xpath("//button[text()='Check this']")).click();
WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(10));
wait2.until(ExpectedConditions.elementToBeClickable(By.id("dte"))).click();
}

}
