package org.thread;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Task1 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rojashree\\eclipse-workspace\\Info\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 driver.get("https://www.facebook.com");
			 driver.manage().window().maximize();
			 WebElement btnLogin=driver.findElement(By.xpath("(//a[@href='#'])[2]"));
			 btnLogin.click();
			 Thread.sleep(3000);
			 WebElement txtuserName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			 txtuserName.sendKeys("Greens");
			 
			 }



}
