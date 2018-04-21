package ca;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	private WebDriver driver;

	@BeforeTest 
	public void login() {
		driver = new FirefoxDriver();
		driver.get("http://localhost:19536");
	}

	@Test
	public void f() {

	   //Username
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div[2]/div/input")).sendKeys("audit@thulasiandco.com");

	   //Password
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div[3]/div/input")).sendKeys("admin");

	  //Sign in
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/form/div[4]/div[2]/button")).click();

	}
	
	@AfterTest
	public void logout() {
		driver.findElement(By.xpath("html/body/section[1]/aside[1]/div[2]/ul/li[9]/a/span")).click();
	}
	
}
