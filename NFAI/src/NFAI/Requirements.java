package NFAI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Requirements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div[1]/div[1]/span/a")).click();
        /*Thread.sleep(1000);
		WebElement main = driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[3]/div[1]/a"));
		WebElement sub = driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[4]/div[3]/div[2]/span[1]/span"));
		WebElement subsub = driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[4]/div[3]/div[3]/div[1]/div[1]/div/a[2]/span[1]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(main).moveToElement(sub).click(subsub).build().perform();
		*/
	
	}
}
