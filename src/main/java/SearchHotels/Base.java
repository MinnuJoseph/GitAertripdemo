package SearchHotels;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initilizedriver() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		driver=new ChromeDriver();
		
		/*prop=new Properties(); 
		//System.getProperty("user.dir")
		FileInputStream fps=new FileInputStream("C:\\Users\\minnu\\AERTRIPPROJECT\\src\\main\\java\\SearchHotels\\datadriven.properties");
		//FileInputStream fps=new FileInputStream("C:\\Automation projects\\Interview Question\\AERTRIP WITH MAVEN AND CUCUMBER\\AERTRIPPROJECT\\src\main\\java\\SearchHotels\\datadriven.properties");
		//FileInputStream fps=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Academy\\datadriven.properties");
		prop.load(fps);
		String brwsr=prop.getProperty("browser");
		//String brwsr=System.getProperty("browser");
		if(brwsr.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		//	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\java\\Academy\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(brwsr.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(brwsr.equals("InternetExplorer"))
		{
			System.setProperty("webdriver.internet.driver", "C:\\work\\Internetdriver.exe");
			driver=new InternetExplorerDriver();
		}*/
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
		
	}

	
	

}
