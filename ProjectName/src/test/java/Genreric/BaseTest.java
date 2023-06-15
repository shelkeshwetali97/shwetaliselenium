package Genreric;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IConstant{
	public WebDriver driver;
	@BeforeClass
	public void launchBroswer()  {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ITO));
		driver.get(URL);

	}
	@AfterClass
	public void closeBroswer() {
		driver.quit();

	}
}