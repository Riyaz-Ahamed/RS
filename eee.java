package Testing.seleniumstart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FifthclassTestNG extends SecondClass{
	
	@Test(priority=0)
	@Override
	public void condition() throws IOException {
		// TODO Auto-generated method stub
		super.condition();
	}
	@Test(priority=1)
public void google()
{
	driver.manage().window().maximize();
	driver.get(ps.getProperty("gmail_login"));
	WebElement username=driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
	username.sendKeys(ps.getProperty("mailid"));
	
	WebElement nextbutton=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	nextbutton.click();
	
	WebElement pass=driver.findElement(By.xpath("(//input[contains(@jsname,'YPqjbf')])[1]"));
	pass.sendKeys(ps.getProperty("mailpassword"));
	
	WebElement nextpass=driver.findElement(By.xpath("//span[text()='Next']"));
	nextpass.click();
}


}
//new world