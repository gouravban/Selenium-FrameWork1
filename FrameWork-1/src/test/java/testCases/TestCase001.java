package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testBase.TestBase;

public class TestCase001 extends TestBase{
	
	@Test
	public void searchWord() throws InterruptedException {
		
		driver.findElement(By.id(OR.getProperty("searchTextBox_ID"))).sendKeys("meticulous");
		Thread.sleep(3000);
	
		driver.close();
	}

}
