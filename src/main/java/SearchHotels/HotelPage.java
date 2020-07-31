package SearchHotels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HotelPage {


	public WebDriver driver;
	
	public HotelPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By ModifySearch=By.xpath("//label[@class='css-modify-hotel-search']");
	By ClickNearBy=By.cssSelector(".nearby-tab-js");
	By NearByCount=By.xpath("//span[@class='count']");
	By ClickHotel=By.xpath("//div[@data-range='nearby']");
	By BookButton=By.xpath("//button[@class='button line bookingConfirmation-js']");
	
	public WebElement ModifySearch()
	{
		return driver.findElement(ModifySearch);
	}
	public WebElement ClickNearBy()
	{
		return driver.findElement(ClickNearBy);
	}
	
	public List<WebElement> NearByCountsize()
	{
		return driver.findElements(NearByCount);
		
	}
	
	public List<WebElement> ClickHotelsize()
	{
		return driver.findElements(ClickHotel);
		
	}
	
	public List<WebElement> BookButtonsize()
	{
		return driver.findElements(BookButton);
		
	}
	public WebElement BookButton()
	{
		return driver.findElement(BookButton);
	}
	
	
}


