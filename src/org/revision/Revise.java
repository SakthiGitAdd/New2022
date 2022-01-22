package org.revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revise {
    private static WebElement findElement;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramu\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();		
	/*	List<WebElement> framecount = driver.findElements(By.tagName("frame"));
		int size = framecount.size();
		System.out.println(size);
        driver.switchTo().frame(0);  
		WebElement username = driver.findElement(By.name("fldLoginUserId"));
		username.sendKeys("kaithamalai");  */
		
    /*	List<WebElement> name = driver.findElements(By.tagName("frame"));
		int size = name.size();
		System.out.println(size);
		driver.switchTo().frame("login_page");
		WebElement username = driver.findElement(By.name("fldLoginUserId"));
		username.sendKeys("parvathi"); */
		
	/*	List<WebElement> name = driver.findElements(By.tagName("frame"));
		int size = name.size();
		System.out.println(size);
		 WebElement refname = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(refname);
		WebElement username = driver.findElement(By.name("fldLoginUserId"));
		username.sendKeys("milton"); */ 
		
		List<WebElement> name = driver.findElements(By.tagName("frame"));
		int size = name.size();
		System.out.println(size);
	/*	WebElement refname = driver.findElement(By.xpath("//frame[@noresize='true']"));
		driver.switchTo().frame(refname);
		WebElement username = driver.findElement(By.name("fldLoginUserId"));
		username.sendKeys("Dinesh"); */
		
		WebElement frameref = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frameref);
		WebElement login = driver.findElement(By.name("fldLoginUserId"));
		login.sendKeys("Dinesh");
		WebElement btnclk = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		btnclk.click(); 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}	   
	}
   
		
	
	

