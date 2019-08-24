package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.TestBase;

public class TestCase001 extends TestBase{
	
	@Test
	public void sortableTest() throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("sortable_xpath"))).click();
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("sortable_xpath"))));
	
		driver.close();
	}


}
