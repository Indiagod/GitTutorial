import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {
 
	static WebDriver driver;
	@Test
	public void testApp()
	{
	System.setProperty("webdriver.chrome.driver", "//Users//PrabhuRamasamy//Desktop//Tekarchworks//drivers//chromedriver");	
	driver=new ChromeDriver();
	driver.get("https://google.com/");	
	
	System.out.println("Google Home Page displayed !!!");

	}
}
