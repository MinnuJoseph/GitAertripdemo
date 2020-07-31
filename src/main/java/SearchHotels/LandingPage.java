package SearchHotels;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	 
	By ClickHotelTab=By.id("hotels-module");
	By CityName=By.xpath("//*[@id='autocomplete-js']");
	By ClickToDateTab=By.cssSelector(".retuning-cal > div:nth-child(1) > input:nth-child(1)");
	By SelectDate=By.xpath("/html/body/div/div[9]/table/tbody/tr/td[3]/table/tbody[2]/tr[5]/td[2]/a/span");
	By GuestTab= By.xpath("//*[@id='guests']");
	By ClickChild=By.xpath("//i[@class='icon icon_children']");
	By Addchild= By.xpath("//div[@class='css-addRooms addRooms addRooms-js']");
	//By PopUp=By.xpath("/html/body/div[4]/div[2]/div/div/div/span/div/div[6]/div/div/button");
	By Search=By.xpath("//button[@id='searchHotelButton']");
	
	
	public WebElement ClickHotelTab()
	{
		return driver.findElement(ClickHotelTab);
	}
	
	public WebElement CityName()
	{
		return driver.findElement(CityName);
	}
	
	
	public WebElement ClickToDateTab()
	{
		return driver.findElement(ClickToDateTab);
	}
	public WebElement SelectDate()
	{
		return driver.findElement(SelectDate);
	}
	
	public WebElement GuestTab()
	{
		return driver.findElement(GuestTab);
	}
	public List<WebElement> ClickChildsize()
	{
		return driver.findElements(ClickChild);
		
	}
	public WebElement Addchild()
	{
		return driver.findElement(Addchild);
	}
	

	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	
	
}
