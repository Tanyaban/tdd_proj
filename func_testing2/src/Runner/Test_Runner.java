package Runner;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Test_Runner {
	WebDriver driver;
	  @Test
	  public void test() throws InterruptedException {
		  //driver.findElement(By.xpath("//*[@name='uname']")).sendKeys("admin");
		  System.out.println(driver.getTitle());
		  
	  }
	  @BeforeTest
	  public void beforeTest() throws InterruptedException {
		  //System.setProperty("webdriver.gecko.driver","E:/source/geckodriver.exe");
		  System.out.println("helllooooo");
		  System.setProperty("webdriver.gecko.driver","gecko/geckodriver");
		  driver=new FirefoxDriver();
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  //sThread.sleep(5000);
	  }

	  @AfterTest
	  public void afterTest() {
		 
		 System.out.println("Running1");
		 //driver.close();
	  
}

}
