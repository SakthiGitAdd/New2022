 package org.revision;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;
import com.sun.org.apache.bcel.internal.generic.Select;

public class Revision {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramu\\eclipse-workspace\\Selinium\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		// Launch , Locators 
		driver.get("http://203.197.139.23:8080/ICall/Account/Login");  
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("loginusername"));
		username.sendKeys("87458"); 
		WebElement password = driver.findElement(By.id("loginpassword"));
		password.sendKeys("Leka@123");
		WebElement login = driver.findElement(By.id("btnlogin"));
		login.click(); 
		String title = driver.getTitle();
		System.out.println(title); 
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl); 
		Thread.sleep(3000);  
		driver.quit();   
		//**************************************
		// x path based on index 
//		driver.get("http://52.172.191.179/iCall_Metropolis_CRM_web/");
//		driver.manage().window().maximize();
//		WebElement username = driver.findElement(By.xpath("(//input[@class='input-material'])[1]"));
//		username.sendKeys("7092101640");
//		WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
//		password.sendKeys("Priya@143");
//		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
//		login.click();
		//**************************************
		// text 
//        driver.get("https://www.metropolisindia.com/findcenter");
//        driver.manage().window().maximize();
//        WebElement textvalue = driver.findElement(By.xpath("//*[text()='New No. 197, Old No. 88, Ttk Road, Alwarpet, Chennai - 600018']"));
//        String text = textvalue.getText();	
//        System.out.println(text); 
//        //Contains using text
//        WebElement containstext = driver.findElement(By.xpath("(//*[contains(text(),'Center')])[3]"));
//        String Ctext = containstext.getText();
//        System.out.println(Ctext);
//        //Contains using Attribute
//		  WebElement containsattribute = driver.findElement(By.xpath("(//*[contains(@class,'title')])[9]"));
//		  String cattribute = containsattribute.getText();
//		  System.out.println(cattribute);
		
//		//**************************************
		// contains using text and attribute (2 program)
//       driver.get("https://www.cakecraftworld.co.uk/");
//       WebElement containstext = driver.findElement(By.xpath("//h1[contains(text(),'Decorating')]"));
//       String ctext = containstext.getText();
//       System.out.println(ctext);
//       WebElement containsattrribute = driver.findElement(By.xpath("//div[contains(@class,'page-intro')]"));
//       String cattribute = containsattrribute.getText();
//       System.out.println(cattribute);
//		// contains using text and attribute (3 program)
		//driver.get("https://www.facebook.com/");
//		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
//		String text2 = text.getText();
//		System.out.println(text2);
//		WebElement contains = driver.findElement(By.xpath("//h2[contains(@class,'_8eso')]"));
//		String text3 = contains.getText();
//		System.out.println(text3);
//		*****************************************
	    // Debug
//    	driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("sakthi@gmail.com");  
//		WebElement password = driver.findElement(By.id("pass"));
//    	password.sendKeys("123456");
//	    WebElement login = driver.findElement(By.name("login"));
//		login.click(); 
		
		//      *********************************************
//		Navigator command 
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.youtube.com/");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh(); 
		//Actions 
		// 1  Move to Element 
//		driver.get("http://www.greenstech.in/selenium-course-content.html");
//		driver.manage().window().maximize();
//		WebElement course = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
//		Actions mousecourse =new Actions(driver);
//		mousecourse.moveToElement(course).perform();
//		WebElement master = driver.findElement(By.xpath("//span[text()='Master Program (8)']"));
//		mousecourse.moveToElement(master).perform();
		// 2 Drag and Drop
//		driver.get("http://demo.guru99.com/test/drag_drop.html");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		WebElement source = driver.findElement(By.id("credit2"));
//		WebElement desc = driver.findElement(By.id("bank"));
//		Thread.sleep(3000);
//		WebElement Source1 = driver.findElement(By.id("credit1"));
//		WebElement desc2 = driver.findElement(By.id("loan"));
//		Thread.sleep(2000);
//		Actions act = new Actions(driver);
//		act.dragAndDrop(source, desc).perform();
//		act.dragAndDrop(Source1, desc2).perform();
//		// 3 right Click
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		WebElement username  = driver.findElement(By.id("email"));
//		username.sendKeys("sakthi12345");
//		Actions act = new Actions(driver);
//		act.doubleClick(username).perform();
//		act.contextClick(username).perform();
//		Thread.sleep(2000);
		// Robot KeyPress and Release 
//		Robot k = new Robot ();
//	    k.keyPress(KeyEvent.VK_DOWN);
//	    k.keyRelease(KeyEvent.VK_DOWN);
//	    Thread.sleep(2000);
//	    k.keyPress(KeyEvent.VK_ENTER);
//	    k.keyRelease(KeyEvent.VK_ENTER);
//	    Thread.sleep(2000);
//	    k.keyPress(KeyEvent.VK_ENTER);
//	    k.keyRelease(KeyEvent.VK_ENTER); 
		////
//        for (int i = 0; i < 2; i++) {
//        	k.keyPress(KeyEvent.VK_DOWN);
//        	k.keyRelease(KeyEvent.VK_DOWN);	
//		}
//        Thread.sleep(5000);
//        k.keyPress(KeyEvent.VK_ENTER);
//        k.keyRelease(KeyEvent.VK_ENTER);
//        Thread.sleep(2000);
//        k.keyPress(KeyEvent.VK_CONTROL);
//        k.keyPress(KeyEvent.VK_V); 
//        k.keyRelease(KeyEvent.VK_CONTROL);
//        k.keyRelease(KeyEvent.VK_V); 
    	//	----Alert-------
//		driver.get("http://demo.automationtesting.in/Alerts.html");
//		driver.manage().window().maximize();
//		// to do simple alert
//		WebElement simple = driver.findElement(By.xpath("//*[@onclick='alertbox()']"));
//		simple.click();
//		Thread.sleep(1000);
//		org.openqa.selenium.Alert simplealert = driver.switchTo().alert();
//		simplealert.accept();
//////		// to do confirm alert
//		WebElement confirm = driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']"));
//		confirm.click();
//		Thread.sleep(5000);
//		WebElement confirmclick = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
//		confirmclick.click();
//    	Thread.sleep(5000);
//		org.openqa.selenium.Alert handleconfirm = driver.switchTo().alert();
//		handleconfirm.accept();
//////		// to do prompt alert 
//		WebElement prompt = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
//		prompt.click();
//		Thread.sleep(5000);
//		WebElement promptclick = driver.findElement(By.xpath("//*[@class='btn btn-info']"));
//		promptclick.click();
//		Thread.sleep(2000);
//		org.openqa.selenium.Alert handleprompt = driver.switchTo().alert();
//	    handleprompt.sendKeys("sakthi venkatesh kumaran");
//		handleprompt.accept();
//		WebElement txt = driver.findElement(By.id("demo1"));
//		String string1 = txt.getText();
//		System.out.println(string1);

//		------------------------------------------
//		 driver.get("https://www.amazon.in/"); 
//		 driver.manage().window().maximize();
//		 
//		 WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
//		 element.sendKeys("iphone",Keys.ENTER);
//
//		 Actions actions = new Actions(driver); 
		 
		 
		 
       
        
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	
	}
}
