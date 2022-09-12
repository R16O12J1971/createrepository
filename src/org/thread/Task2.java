package org.thread;

	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Task2 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rojashree\\eclipse-workspace\\Info\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.get("https://www.instagram.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(3000);
			 WebElement txtusername=driver.findElement(By.name("username"));
			 txtusername.sendKeys("roja@gmail.com");
			 
			 WebElement txtpassword=driver.findElement(By.name("password"));
			 txtpassword.sendKeys("456@5678");

	    }
	} 



