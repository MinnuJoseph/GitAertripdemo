package SearchHotels;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;





public class BookedHotelTest extends Base {
	
	//public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@Parameters({"url"})
	@Test
	public void initilize(String urlname) throws IOException, InterruptedException
	{
		driver=initilizedriver() ;
		driver.get(urlname);
		Thread.sleep(4000);
		LandingPage lp=new LandingPage(driver);
		lp.ClickHotelTab().click();
		Thread.sleep(5000);
		lp.CityName().click();
		lp.CityName().clear();
		lp.CityName().sendKeys("Toronto, Ontario, Canada");
		Thread.sleep(10000);
		lp.CityName().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		lp.ClickToDateTab().click();
		lp.SelectDate().click();
		lp.GuestTab().click();
		int count=lp.ClickChildsize().size();
		System.out.println("childcount"+count);
		for (int i=0;i<1;i++)
		{
			lp.ClickChildsize().get(i).click();
		}
		lp.Addchild().click();
		for (int i=4;i<5;i++)
		{
			lp.ClickChildsize().get(i).click();
		}
		lp.Search().click();
		HotelPage hp=new HotelPage(driver);
		Thread.sleep(10000);
		Assert.assertTrue(hp.ModifySearch().isDisplayed());
		Thread.sleep(10000);
		driver.manage().window().maximize();
		hp.ClickNearBy().click();
		int Nearbycount=hp.NearByCountsize().size();
		System.out.println("NearBy"+ Nearbycount);
		for(int j=2;j<Nearbycount;j++)
		{
			String st=hp.NearByCountsize().get(j).getText();
			System.out.println("NearBycount"+ Integer.parseInt(st));
		}
		int flag=hp.ClickHotelsize().size();
		System.out.println("NearByHotels"+ flag);
		Thread.sleep(4000);
		for(int a=0;a<flag;a++)
		{
			hp.ClickHotelsize().get(a).click();
			Thread.sleep(8000);
			int booknumber=hp.BookButtonsize().size();
			System.out.println("Book Buttons"+ booknumber);
			for(int k=0;k<booknumber;k++)
			{
				if(booknumber>1)
				{
				Thread.sleep(3000);	
				//Actions act=new Actions(driver);
				//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"index-page\"]/body/view/view/view[2]/div[2]/view/div[1]/div[2]/div[1]/div/div[3]/div[3]/div"))).sendKeys(Keys.PAGE_DOWN).build().perform();
				//hp.BookButton();
				//WebElement element = driver.findElement(By.xpath("//button[@class='button line bookingConfirmation-js']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();",hp.BookButton());
				Thread.sleep(10000);
				System.out.println("Hotel displayed");
				}
				else
				System.out.println("Only 1 Hotel room is avaliable");	
				break;
			}	
			break;
			
		}
		
	
	}
		
	@AfterTest	
	public void close()
	{
		driver.close();
		driver=null;
	}

	}


