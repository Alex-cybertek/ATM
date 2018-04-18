package runnerPackage;




import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@CucumberOptions (features= {"features"}, glue = {"stepDefinitionPackage"})
public class ATM_runner extends AbstractTestNGCucumberTests {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){		 
		WebDriverManager.chromedriver().setup();		  
		driver=new ChromeDriver();	
	}
	
	

  @AfterTest
	public void tearDown(){
	driver.quit();

}

}