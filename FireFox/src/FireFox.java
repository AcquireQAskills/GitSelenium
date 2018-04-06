import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox 

{
	WebDriver FF;
	   @Test
		public void url()
		{
			System.setProperty("webdriver.gecko.driver","C:\\selenium software\\geckodriver.exe");
			WebDriver FF = new FirefoxDriver();
			
			FF.get("https://staging.open-sunbird.org/auth/realms/sunbird/protocol/openid-connect/auth?client_id=portal&state=52bed8b1-450d-4162-a10d-d292e26462af&redirect_uri=https%3A%2F%2Fstaging.open-sunbird.org%2Fprivate%2Findex%3Fauth_callback%3D1&scope=openid&response_type=code");
			
			System.out.println(FF.getTitle());
			
		}
	   
	   @Test
	   public void login()
	   {
		   
		  /* FF.findElement(By.id("username")).sendKeys("ntptest102");
		 //Chromd.findElement(By.xpath(".//*[@id='username']")).sendKeys("ntptest102");
		   FF.findElement(By.xpath(".//*[@id='password']")).sendKeys("password");
		   FF.findElement(By.xpath(".//*[@id='kc-login']")).click();*/
	   }

		
		

	}


