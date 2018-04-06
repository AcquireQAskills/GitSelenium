
import org.openqa.*;

import org.openqa.grid.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FF7pm 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium software\\geckodriver.exe");
		
		WebDriver FF = new FirefoxDriver();
		
		FF.get("https://www.facebook.com/");
		
		FF.findElement(By.xpath(".//*[@id='email']")).sendKeys("test@gmail.com");
		//FF.findElement(By.id("pass")).sendKeys("testqa");
		
		FF.findElement(By.xpath(".//*[@id='pass']")).sendKeys("pass");
		
		//FF.findElement(By.className("inputtext")).sendKeys("testqa");
		
		FF.findElement(By.xpath(".//*[@id='loginbutton']")).click();

		
		
	}

}
