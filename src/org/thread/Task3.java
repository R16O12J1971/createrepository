package org.thread;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Task3 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Rojashree\\eclipse-workspace\\Info\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.greenstech.in/selenium-course-content.html");
			driver.manage().window().maximize();
			
			WebElement btnLogin = driver.findElement(By.xpath("//a[@id='overview-tab']"));
			btnLogin.click();
			Thread.sleep(3000);
			 WebElement txtLogin=driver.findElement(By.xpath("//p[contains(text(),'In this best')]"));
			 String text = txtLogin.getText();
			 System.out.println(text);

			 

		}

		}



