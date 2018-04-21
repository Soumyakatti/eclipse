package ca;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashboardNewtasks {
	
	WebDriver driver;

	@BeforeTest 
	public void login() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:19536");
	//Username
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div[2]/div/input")).sendKeys("audit@thulasiandco.com");

	//Password
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div[3]/div/input")).sendKeys("admin");

	//Sign in
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div[4]/div[2]/button")).click();
		Thread.sleep(1000);
	}


	@Test(priority=1)
	public void new_task() throws InterruptedException {
		driver.findElement(By.xpath("html/body/section[2]/div/div[2]/a[1]/div/div")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void view() throws InterruptedException	{
	//Click on view	
		driver.findElement(By.xpath("html/body/section[2]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/span[1]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/section[2]/div/div[3]/div/div/div[1]/a")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=3)
	public void edit() throws InterruptedException{
	//Click on edit
		driver.findElement(By.xpath("html/body/section[2]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[9]/span[1]/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/section[2]/div/div[4]/div/div/div[1]/a")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=4)
	public void sliders() throws InterruptedException{	
	//Clicking on Sliders
		driver.findElement(By.xpath("html/body/section[2]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[3]/div[2]/div/ul/li[3]/a")).click();
		Thread.sleep(1000);
	}
	
	@Test(priority=5)
	public void select() throws InterruptedException{
	//selecting 25	
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(100,0)");
		Select num = new Select(driver.findElement(By.xpath("html/body/section[2]/div/div[2]/div/div/div/div/div[2]/div[2]/div/div[1]/div[1]/div/label/select")));
		num.selectByVisibleText("25");
		Thread.sleep(1000);
	}
	@Test(priority=6)
	public void scroll() throws InterruptedException{
	//scroll down and check the 25
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(5000);
	}
		
	@Test(priority=7)
	public void backdashboard() throws InterruptedException{
	//back to dashboard
		driver.findElement(By.xpath("html/body/section[1]/aside[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(5000);
	}
	
	

	@AfterTest
	public void logout() {
		driver.findElement(By.xpath("html/body/section[1]/aside[1]/div[2]/ul/li[9]/a/span")).click();
	}
  
}
